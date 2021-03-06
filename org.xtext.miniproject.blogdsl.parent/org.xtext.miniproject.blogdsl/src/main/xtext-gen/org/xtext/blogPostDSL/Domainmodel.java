/**
 * generated by Xtext 2.10.0
 */
package org.xtext.blogPostDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.blogPostDSL.Domainmodel#getTagImport <em>Tag Import</em>}</li>
 *   <li>{@link org.xtext.blogPostDSL.Domainmodel#getItemElement <em>Item Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.blogPostDSL.BlogPostDSLPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
	 * Returns the value of the '<em><b>Tag Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag Import</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Import</em>' containment reference.
	 * @see #setTagImport(TagImport)
	 * @see org.xtext.blogPostDSL.BlogPostDSLPackage#getDomainmodel_TagImport()
	 * @model containment="true"
	 * @generated
	 */
  TagImport getTagImport();

  /**
	 * Sets the value of the '{@link org.xtext.blogPostDSL.Domainmodel#getTagImport <em>Tag Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Import</em>' containment reference.
	 * @see #getTagImport()
	 * @generated
	 */
  void setTagImport(TagImport value);

  /**
	 * Returns the value of the '<em><b>Item Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Element</em>' containment reference.
	 * @see #setItemElement(ItemElement)
	 * @see org.xtext.blogPostDSL.BlogPostDSLPackage#getDomainmodel_ItemElement()
	 * @model containment="true"
	 * @generated
	 */
  ItemElement getItemElement();

  /**
	 * Sets the value of the '{@link org.xtext.blogPostDSL.Domainmodel#getItemElement <em>Item Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Element</em>' containment reference.
	 * @see #getItemElement()
	 * @generated
	 */
  void setItemElement(ItemElement value);

} // Domainmodel
