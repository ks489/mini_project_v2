/**
 * generated by Xtext 2.10.0
 */
package org.xtext.blogPostDSL.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.blogPostDSL.BlogPostDSLFactory;
import org.xtext.blogPostDSL.Domainmodel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainmodelTest extends TestCase {

	/**
	 * The fixture for this Domainmodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Domainmodel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DomainmodelTest.class);
	}

	/**
	 * Constructs a new Domainmodel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainmodelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Domainmodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Domainmodel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Domainmodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Domainmodel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BlogPostDSLFactory.eINSTANCE.createDomainmodel());
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

} //DomainmodelTest