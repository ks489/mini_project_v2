/**
 * generated by Xtext 2.10.0
 */
package org.xtext.blogPostDSL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.blogPostDSL.BlogPostDSLPackage;
import org.xtext.blogPostDSL.ElementDeclaration;
import org.xtext.blogPostDSL.ItemElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.blogPostDSL.impl.ItemElementImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemElementImpl extends MinimalEObjectImpl.Container implements ItemElement
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected ElementDeclaration declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BlogPostDSLPackage.Literals.ITEM_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementDeclaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(ElementDeclaration newDeclaration, NotificationChain msgs)
  {
    ElementDeclaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(ElementDeclaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION:
        return basicSetDeclaration(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION:
        return getDeclaration();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION:
        setDeclaration((ElementDeclaration)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION:
        setDeclaration((ElementDeclaration)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BlogPostDSLPackage.ITEM_ELEMENT__DECLARATION:
        return declaration != null;
    }
    return super.eIsSet(featureID);
  }

} //ItemElementImpl
