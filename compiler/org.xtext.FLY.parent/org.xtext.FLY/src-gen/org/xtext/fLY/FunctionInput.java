/**
 * generated by Xtext 2.16.0
 */
package org.xtext.fLY;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.fLY.FunctionInput#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.fLY.FunctionInput#isIs_for_index <em>Is for index</em>}</li>
 *   <li>{@link org.xtext.fLY.FunctionInput#getF_index <em>Findex</em>}</li>
 * </ul>
 *
 * @see org.xtext.fLY.FLYPackage#getFunctionInput()
 * @model
 * @generated
 */
public interface FunctionInput extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.fLY.ArithmeticExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.fLY.FLYPackage#getFunctionInput_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<ArithmeticExpression> getExpressions();

  /**
   * Returns the value of the '<em><b>Is for index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is for index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is for index</em>' attribute.
   * @see #setIs_for_index(boolean)
   * @see org.xtext.fLY.FLYPackage#getFunctionInput_Is_for_index()
   * @model
   * @generated
   */
  boolean isIs_for_index();

  /**
   * Sets the value of the '{@link org.xtext.fLY.FunctionInput#isIs_for_index <em>Is for index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is for index</em>' attribute.
   * @see #isIs_for_index()
   * @generated
   */
  void setIs_for_index(boolean value);

  /**
   * Returns the value of the '<em><b>Findex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Findex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Findex</em>' containment reference.
   * @see #setF_index(ArithmeticExpression)
   * @see org.xtext.fLY.FLYPackage#getFunctionInput_F_index()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpression getF_index();

  /**
   * Sets the value of the '{@link org.xtext.fLY.FunctionInput#getF_index <em>Findex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Findex</em>' containment reference.
   * @see #getF_index()
   * @generated
   */
  void setF_index(ArithmeticExpression value);

} // FunctionInput