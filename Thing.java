class BookGenerator extends AbstractGenerator {

        def compile(Model m) '''[
            «FOR b : m.books SEPARATOR ','»
                { 
                    «b.compile»
                }
            «ENDFOR»
		]'''

        def compile(Book b) ''' 
            «IF b.name != null»
                "title": "«b.name»"
				«IF b.chapters.size > 0»,"chapters": [
					«FOR c : b.chapters SEPARATOR ','»
						{
							«c.compile»
						}
					«ENDFOR»
				]
				«ENDIF»
            «ENDIF»
        '''

        def compile(Chapter c) ''' 
            «IF c.name != null»
                "name": "«c.name»",
                "pages": «c.pageNo»
            «ENDIF»
        '''

        override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
            for (m : input.allContents.toIterable.filter(Model)) {
                fsa.generateFile(
                    "result.book",
                    m.compile)
            }
        }

    }