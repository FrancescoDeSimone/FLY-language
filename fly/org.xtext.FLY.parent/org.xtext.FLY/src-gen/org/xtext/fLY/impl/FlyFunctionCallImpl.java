/**
 * generated by Xtext 2.15.0
 */
package org.xtext.fLY.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.fLY.EnvironmentDeclaration;
import org.xtext.fLY.FLYPackage;
import org.xtext.fLY.FlyFunctionCall;
import org.xtext.fLY.FunctionDefinition;
import org.xtext.fLY.FunctionInput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fly Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#isIsAsync <em>Is Async</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#isIs_then <em>Is then</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#getThen <em>Then</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#isIs_thenall <em>Is thenall</em>}</li>
 *   <li>{@link org.xtext.fLY.impl.FlyFunctionCallImpl#getThenall <em>Thenall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlyFunctionCallImpl extends ExpressionImpl implements FlyFunctionCall
{
  /**
   * The default value of the '{@link #isIsAsync() <em>Is Async</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsync()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ASYNC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAsync() <em>Is Async</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAsync()
   * @generated
   * @ordered
   */
  protected boolean isAsync = IS_ASYNC_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected FunctionDefinition target;

  /**
   * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInput()
   * @generated
   * @ordered
   */
  protected FunctionInput input;

  /**
   * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnvironment()
   * @generated
   * @ordered
   */
  protected EnvironmentDeclaration environment;

  /**
   * The default value of the '{@link #isIs_then() <em>Is then</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_then()
   * @generated
   * @ordered
   */
  protected static final boolean IS_THEN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_then() <em>Is then</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_then()
   * @generated
   * @ordered
   */
  protected boolean is_then = IS_THEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected FunctionDefinition then;

  /**
   * The default value of the '{@link #isIs_thenall() <em>Is thenall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_thenall()
   * @generated
   * @ordered
   */
  protected static final boolean IS_THENALL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIs_thenall() <em>Is thenall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIs_thenall()
   * @generated
   * @ordered
   */
  protected boolean is_thenall = IS_THENALL_EDEFAULT;

  /**
   * The cached value of the '{@link #getThenall() <em>Thenall</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenall()
   * @generated
   * @ordered
   */
  protected FunctionDefinition thenall;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlyFunctionCallImpl()
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
    return FLYPackage.Literals.FLY_FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAsync()
  {
    return isAsync;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAsync(boolean newIsAsync)
  {
    boolean oldIsAsync = isAsync;
    isAsync = newIsAsync;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__IS_ASYNC, oldIsAsync, isAsync));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (FunctionDefinition)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.FLY_FUNCTION_CALL__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(FunctionDefinition newTarget)
  {
    FunctionDefinition oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionInput getInput()
  {
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(FunctionInput newInput, NotificationChain msgs)
  {
    FunctionInput oldInput = input;
    input = newInput;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__INPUT, oldInput, newInput);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(FunctionInput newInput)
  {
    if (newInput != input)
    {
      NotificationChain msgs = null;
      if (input != null)
        msgs = ((InternalEObject)input).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FLYPackage.FLY_FUNCTION_CALL__INPUT, null, msgs);
      if (newInput != null)
        msgs = ((InternalEObject)newInput).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FLYPackage.FLY_FUNCTION_CALL__INPUT, null, msgs);
      msgs = basicSetInput(newInput, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__INPUT, newInput, newInput));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentDeclaration getEnvironment()
  {
    if (environment != null && environment.eIsProxy())
    {
      InternalEObject oldEnvironment = (InternalEObject)environment;
      environment = (EnvironmentDeclaration)eResolveProxy(oldEnvironment);
      if (environment != oldEnvironment)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT, oldEnvironment, environment));
      }
    }
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentDeclaration basicGetEnvironment()
  {
    return environment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnvironment(EnvironmentDeclaration newEnvironment)
  {
    EnvironmentDeclaration oldEnvironment = environment;
    environment = newEnvironment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT, oldEnvironment, environment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIs_then()
  {
    return is_then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs_then(boolean newIs_then)
  {
    boolean oldIs_then = is_then;
    is_then = newIs_then;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__IS_THEN, oldIs_then, is_then));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition getThen()
  {
    if (then != null && then.eIsProxy())
    {
      InternalEObject oldThen = (InternalEObject)then;
      then = (FunctionDefinition)eResolveProxy(oldThen);
      if (then != oldThen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.FLY_FUNCTION_CALL__THEN, oldThen, then));
      }
    }
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition basicGetThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(FunctionDefinition newThen)
  {
    FunctionDefinition oldThen = then;
    then = newThen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__THEN, oldThen, then));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIs_thenall()
  {
    return is_thenall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIs_thenall(boolean newIs_thenall)
  {
    boolean oldIs_thenall = is_thenall;
    is_thenall = newIs_thenall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__IS_THENALL, oldIs_thenall, is_thenall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition getThenall()
  {
    if (thenall != null && thenall.eIsProxy())
    {
      InternalEObject oldThenall = (InternalEObject)thenall;
      thenall = (FunctionDefinition)eResolveProxy(oldThenall);
      if (thenall != oldThenall)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FLYPackage.FLY_FUNCTION_CALL__THENALL, oldThenall, thenall));
      }
    }
    return thenall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition basicGetThenall()
  {
    return thenall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenall(FunctionDefinition newThenall)
  {
    FunctionDefinition oldThenall = thenall;
    thenall = newThenall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FLYPackage.FLY_FUNCTION_CALL__THENALL, oldThenall, thenall));
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
      case FLYPackage.FLY_FUNCTION_CALL__INPUT:
        return basicSetInput(null, msgs);
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
      case FLYPackage.FLY_FUNCTION_CALL__IS_ASYNC:
        return isIsAsync();
      case FLYPackage.FLY_FUNCTION_CALL__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case FLYPackage.FLY_FUNCTION_CALL__INPUT:
        return getInput();
      case FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT:
        if (resolve) return getEnvironment();
        return basicGetEnvironment();
      case FLYPackage.FLY_FUNCTION_CALL__IS_THEN:
        return isIs_then();
      case FLYPackage.FLY_FUNCTION_CALL__THEN:
        if (resolve) return getThen();
        return basicGetThen();
      case FLYPackage.FLY_FUNCTION_CALL__IS_THENALL:
        return isIs_thenall();
      case FLYPackage.FLY_FUNCTION_CALL__THENALL:
        if (resolve) return getThenall();
        return basicGetThenall();
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
      case FLYPackage.FLY_FUNCTION_CALL__IS_ASYNC:
        setIsAsync((Boolean)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__TARGET:
        setTarget((FunctionDefinition)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__INPUT:
        setInput((FunctionInput)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT:
        setEnvironment((EnvironmentDeclaration)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THEN:
        setIs_then((Boolean)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__THEN:
        setThen((FunctionDefinition)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THENALL:
        setIs_thenall((Boolean)newValue);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__THENALL:
        setThenall((FunctionDefinition)newValue);
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
      case FLYPackage.FLY_FUNCTION_CALL__IS_ASYNC:
        setIsAsync(IS_ASYNC_EDEFAULT);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__TARGET:
        setTarget((FunctionDefinition)null);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__INPUT:
        setInput((FunctionInput)null);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT:
        setEnvironment((EnvironmentDeclaration)null);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THEN:
        setIs_then(IS_THEN_EDEFAULT);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__THEN:
        setThen((FunctionDefinition)null);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THENALL:
        setIs_thenall(IS_THENALL_EDEFAULT);
        return;
      case FLYPackage.FLY_FUNCTION_CALL__THENALL:
        setThenall((FunctionDefinition)null);
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
      case FLYPackage.FLY_FUNCTION_CALL__IS_ASYNC:
        return isAsync != IS_ASYNC_EDEFAULT;
      case FLYPackage.FLY_FUNCTION_CALL__TARGET:
        return target != null;
      case FLYPackage.FLY_FUNCTION_CALL__INPUT:
        return input != null;
      case FLYPackage.FLY_FUNCTION_CALL__ENVIRONMENT:
        return environment != null;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THEN:
        return is_then != IS_THEN_EDEFAULT;
      case FLYPackage.FLY_FUNCTION_CALL__THEN:
        return then != null;
      case FLYPackage.FLY_FUNCTION_CALL__IS_THENALL:
        return is_thenall != IS_THENALL_EDEFAULT;
      case FLYPackage.FLY_FUNCTION_CALL__THENALL:
        return thenall != null;
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
    result.append(" (isAsync: ");
    result.append(isAsync);
    result.append(", is_then: ");
    result.append(is_then);
    result.append(", is_thenall: ");
    result.append(is_thenall);
    result.append(')');
    return result.toString();
  }

} //FlyFunctionCallImpl
