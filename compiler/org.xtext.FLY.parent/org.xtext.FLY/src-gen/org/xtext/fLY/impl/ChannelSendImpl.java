/**
 * generated by Xtext 2.16.0
 */
package org.xtext.fLY.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.fLY.ArithmeticExpression;
import org.xtext.fLY.ArrayValue;
import org.xtext.fLY.ChannelDeclaration;
import org.xtext.fLY.ChannelSend;
import org.xtext.fLY.FLYPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fLY.impl.ChannelSendImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.ChannelSendImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.ChannelSendImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelSendImpl extends ExpressionImpl implements ChannelSend
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<ArrayValue> values;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ChannelDeclaration target;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected ArithmeticExpression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChannelSendImpl()
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
    return FLYPackage.Literals.CHANNEL_SEND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArrayValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<ArrayValue>(ArrayValue.class, this, FLYPackage.CHANNEL_SEND__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDeclaration getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (ChannelDeclaration)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.CHANNEL_SEND__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelDeclaration basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ChannelDeclaration newTarget)
  {
    ChannelDeclaration oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.CHANNEL_SEND__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(ArithmeticExpression newExpression, NotificationChain msgs)
  {
    ArithmeticExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.CHANNEL_SEND__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(ArithmeticExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.CHANNEL_SEND__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.CHANNEL_SEND__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.CHANNEL_SEND__EXPRESSION, newExpression, newExpression));
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
      case FLYPackage.CHANNEL_SEND__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case FLYPackage.CHANNEL_SEND__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case FLYPackage.CHANNEL_SEND__VALUES:
        return getValues();
      case FLYPackage.CHANNEL_SEND__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case FLYPackage.CHANNEL_SEND__EXPRESSION:
        return getExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FLYPackage.CHANNEL_SEND__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ArrayValue>)newValue);
        return;
      case FLYPackage.CHANNEL_SEND__TARGET:
        setTarget((ChannelDeclaration)newValue);
        return;
      case FLYPackage.CHANNEL_SEND__EXPRESSION:
        setExpression((ArithmeticExpression)newValue);
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
      case FLYPackage.CHANNEL_SEND__VALUES:
        getValues().clear();
        return;
      case FLYPackage.CHANNEL_SEND__TARGET:
        setTarget((ChannelDeclaration)null);
        return;
      case FLYPackage.CHANNEL_SEND__EXPRESSION:
        setExpression((ArithmeticExpression)null);
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
      case FLYPackage.CHANNEL_SEND__VALUES:
        return values != null && !values.isEmpty();
      case FLYPackage.CHANNEL_SEND__TARGET:
        return target != null;
      case FLYPackage.CHANNEL_SEND__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ArrayValue.class)
    {
      switch (derivedFeatureID)
      {
        case FLYPackage.CHANNEL_SEND__VALUES: return FLYPackage.ARRAY_VALUE__VALUES;
        default: return -1;
      }
    }
    if (baseClass == ArithmeticExpression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ArrayValue.class)
    {
      switch (baseFeatureID)
      {
        case FLYPackage.ARRAY_VALUE__VALUES: return FLYPackage.CHANNEL_SEND__VALUES;
        default: return -1;
      }
    }
    if (baseClass == ArithmeticExpression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ChannelSendImpl