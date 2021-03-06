/**
 * generated by Xtext 2.10.0
 */
package org.xtext.blogPostDSL.tests;

import junit.textui.TestRunner;

import org.xtext.blogPostDSL.BlogPostDSLFactory;
import org.xtext.blogPostDSL.Title;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TitleTest extends ElementDeclarationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TitleTest.class);
	}

	/**
	 * Constructs a new Title test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Title test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Title getFixture() {
		return (Title)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlogPostDSLFactory.eINSTANCE.createTitle());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TitleTest
