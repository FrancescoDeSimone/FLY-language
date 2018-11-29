/**
 * generated by Xtext 2.15.0
 */
package org.xtext.fLY.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fLY.ArithmeticExpression;
import org.xtext.fLY.DatTableObject;
import org.xtext.fLY.FLYPackage;
import org.xtext.fLY.RangeLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dat Table Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fLY.impl.DatTableObjectImpl#getRange1 <em>Range1</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.DatTableObjectImpl#getRange1_t <em>Range1 t</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.DatTableObjectImpl#getRange2 <em>Range2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatTableObjectImpl extends ObjectLiteralImpl implements DatTableObject
{
  /**
   * The cached value of the '{@link #getRange1() <em>Range1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange1()
   * @generated
   * @ordered
   */
  protected RangeLiteral range1;

  /**
   * The cached value of the '{@link #getRange1_t() <em>Range1 t</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange1_t()
   * @generated
   * @ordered
   */
  protected ArithmeticExpression range1_t;

  /**
   * The cached value of the '{@link #getRange2() <em>Range2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange2()
   * @generated
   * @ordered
   */
  protected RangeLiteral range2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatTableObjectImpl()
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
    return FLYPackage.Literals.DAT_TABLE_OBJECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeLiteral getRange1()
  {
    return range1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange1(RangeLiteral newRange1, NotificationChain msgs)
  {
    RangeLiteral oldRange1 = range1;
    range1 = newRange1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE1, oldRange1, newRange1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange1(RangeLiteral newRange1)
  {
    if (newRange1 != range1)
    {
      NotificationChain msgs = null;
      if (range1 != null)
        msgs = ((InternalEObject)range1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE1, null, msgs);
      if (newRange1 != null)
        msgs = ((InternalEObject)newRange1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE1, null, msgs);
      msgs = basicSetRange1(newRange1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE1, newRange1, newRange1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticExpression getRange1_t()
  {
    return range1_t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange1_t(ArithmeticExpression newRange1_t, NotificationChain msgs)
  {
    ArithmeticExpression oldRange1_t = range1_t;
    range1_t = newRange1_t;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE1_T, oldRange1_t, newRange1_t);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange1_t(ArithmeticExpression newRange1_t)
  {
    if (newRange1_t != range1_t)
    {
      NotificationChain msgs = null;
      if (range1_t != null)
        msgs = ((InternalEObject)range1_t).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE1_T, null, msgs);
      if (newRange1_t != null)
        msgs = ((InternalEObject)newRange1_t).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE1_T, null, msgs);
      msgs = basicSetRange1_t(newRange1_t, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE1_T, newRange1_t, newRange1_t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeLiteral getRange2()
  {
    return range2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRange2(RangeLiteral newRange2, NotificationChain msgs)
  {
    RangeLiteral oldRange2 = range2;
    range2 = newRange2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE2, oldRange2, newRange2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange2(RangeLiteral newRange2)
  {
    if (newRange2 != range2)
    {
      NotificationChain msgs = null;
      if (range2 != null)
        msgs = ((InternalEObject)range2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE2, null, msgs);
      if (newRange2 != null)
        msgs = ((InternalEObject)newRange2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.DAT_TABLE_OBJECT__RANGE2, null, msgs);
      msgs = basicSetRange2(newRange2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.DAT_TABLE_OBJECT__RANGE2, newRange2, newRange2));
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
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1:
        return basicSetRange1(null, msgs);
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1_T:
        return basicSetRange1_t(null, msgs);
      case FLYPackage.DAT_TABLE_OBJECT__RANGE2:
        return basicSetRange2(null, msgs);
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
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1:
        return getRange1();
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1_T:
        return getRange1_t();
      case FLYPackage.DAT_TABLE_OBJECT__RANGE2:
        return getRange2();
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
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1:
        setRange1((RangeLiteral)newValue);
        return;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1_T:
        setRange1_t((ArithmeticExpression)newValue);
        return;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE2:
        setRange2((RangeLiteral)newValue);
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
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1:
        setRange1((RangeLiteral)null);
        return;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1_T:
        setRange1_t((ArithmeticExpression)null);
        return;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE2:
        setRange2((RangeLiteral)null);
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
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1:
        return range1 != null;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE1_T:
        return range1_t != null;
      case FLYPackage.DAT_TABLE_OBJECT__RANGE2:
        return range2 != null;
    }
    return super.eIsSet(featureID);
  }

} //DatTableObjectImpl
