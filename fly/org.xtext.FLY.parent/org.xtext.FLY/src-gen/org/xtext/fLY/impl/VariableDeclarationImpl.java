/**
 * generated by Xtext 2.15.0
 */
package org.xtext.fLY.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fLY.FLYPackage;
import org.xtext.fLY.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fLY.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.VariableDeclarationImpl#getTypeobject <em>Typeobject</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.VariableDeclarationImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDeclarationImpl extends ExpressionImpl implements VariableDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTypeobject() <em>Typeobject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeobject()
   * @generated
   * @ordered
   */
  protected static final String TYPEOBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeobject() <em>Typeobject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeobject()
   * @generated
   * @ordered
   */
  protected String typeobject = TYPEOBJECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EObject right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDeclarationImpl()
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
    return FLYPackage.Literals.VARIABLE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeobject()
  {
    return typeobject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeobject(String newTypeobject)
  {
    String oldTypeobject = typeobject;
    typeobject = newTypeobject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_DECLARATION__TYPEOBJECT, oldTypeobject, typeobject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(EObject newRight, NotificationChain msgs)
  {
    EObject oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_DECLARATION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EObject newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.VARIABLE_DECLARATION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.VARIABLE_DECLARATION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_DECLARATION__RIGHT, newRight, newRight));
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
      case FLYPackage.VARIABLE_DECLARATION__RIGHT:
        return basicSetRight(null, msgs);
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
      case FLYPackage.VARIABLE_DECLARATION__NAME:
        return getName();
      case FLYPackage.VARIABLE_DECLARATION__TYPEOBJECT:
        return getTypeobject();
      case FLYPackage.VARIABLE_DECLARATION__RIGHT:
        return getRight();
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
      case FLYPackage.VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case FLYPackage.VARIABLE_DECLARATION__TYPEOBJECT:
        setTypeobject((String)newValue);
        return;
      case FLYPackage.VARIABLE_DECLARATION__RIGHT:
        setRight((EObject)newValue);
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
      case FLYPackage.VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FLYPackage.VARIABLE_DECLARATION__TYPEOBJECT:
        setTypeobject(TYPEOBJECT_EDEFAULT);
        return;
      case FLYPackage.VARIABLE_DECLARATION__RIGHT:
        setRight((EObject)null);
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
      case FLYPackage.VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FLYPackage.VARIABLE_DECLARATION__TYPEOBJECT:
        return TYPEOBJECT_EDEFAULT == null ? typeobject != null : !TYPEOBJECT_EDEFAULT.equals(typeobject);
      case FLYPackage.VARIABLE_DECLARATION__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", typeobject: ");
    result.append(typeobject);
    result.append(')');
    return result.toString();
  }

} //VariableDeclarationImpl
