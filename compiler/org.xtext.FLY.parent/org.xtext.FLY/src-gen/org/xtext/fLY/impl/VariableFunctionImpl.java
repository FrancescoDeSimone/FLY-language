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
import org.xtext.fLY.FLYPackage;
import org.xtext.fLY.VariableDeclaration;
import org.xtext.fLY.VariableFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fLY.impl.VariableFunctionImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.VariableFunctionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.VariableFunctionImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.VariableFunctionImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableFunctionImpl extends ExpressionImpl implements VariableFunction
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
  protected VariableDeclaration target;

  /**
   * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected String feature = FEATURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<ArithmeticExpression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableFunctionImpl()
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
    return FLYPackage.Literals.VARIABLE_FUNCTION;
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
      values = new EObjectContainmentEList<ArrayValue>(ArrayValue.class, this, FLYPackage.VARIABLE_FUNCTION__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (VariableDeclaration)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.VARIABLE_FUNCTION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(VariableDeclaration newTarget)
  {
    VariableDeclaration oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_FUNCTION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(String newFeature)
  {
    String oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.VARIABLE_FUNCTION__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArithmeticExpression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<ArithmeticExpression>(ArithmeticExpression.class, this, FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS);
    }
    return expressions;
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
      case FLYPackage.VARIABLE_FUNCTION__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case FLYPackage.VARIABLE_FUNCTION__VALUES:
        return getValues();
      case FLYPackage.VARIABLE_FUNCTION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case FLYPackage.VARIABLE_FUNCTION__FEATURE:
        return getFeature();
      case FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS:
        return getExpressions();
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
      case FLYPackage.VARIABLE_FUNCTION__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends ArrayValue>)newValue);
        return;
      case FLYPackage.VARIABLE_FUNCTION__TARGET:
        setTarget((VariableDeclaration)newValue);
        return;
      case FLYPackage.VARIABLE_FUNCTION__FEATURE:
        setFeature((String)newValue);
        return;
      case FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends ArithmeticExpression>)newValue);
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
      case FLYPackage.VARIABLE_FUNCTION__VALUES:
        getValues().clear();
        return;
      case FLYPackage.VARIABLE_FUNCTION__TARGET:
        setTarget((VariableDeclaration)null);
        return;
      case FLYPackage.VARIABLE_FUNCTION__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS:
        getExpressions().clear();
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
      case FLYPackage.VARIABLE_FUNCTION__VALUES:
        return values != null && !values.isEmpty();
      case FLYPackage.VARIABLE_FUNCTION__TARGET:
        return target != null;
      case FLYPackage.VARIABLE_FUNCTION__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case FLYPackage.VARIABLE_FUNCTION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
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
        case FLYPackage.VARIABLE_FUNCTION__VALUES: return FLYPackage.ARRAY_VALUE__VALUES;
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
        case FLYPackage.ARRAY_VALUE__VALUES: return FLYPackage.VARIABLE_FUNCTION__VALUES;
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
    result.append(" (feature: ");
    result.append(feature);
    result.append(')');
    return result.toString();
  }

} //VariableFunctionImpl