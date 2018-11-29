/**
 * generated by Xtext 2.15.0
 */
package org.xtext.fLY;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fLY.AtomicExpression#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fLY.FLYPackage#getAtomicExpression()
 * @model
 * @generated
 */
public interface AtomicExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference.
   * @see #setExpressions(BlockExpression)
   * @see org.xtext.fLY.FLYPackage#getAtomicExpression_Expressions()
   * @model containment="true"
   * @generated
   */
  BlockExpression getExpressions();

  /**
   * Sets the value of the '{@link org.xtext.fLY.AtomicExpression#getExpressions <em>Expressions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expressions</em>' containment reference.
   * @see #getExpressions()
   * @generated
   */
  void setExpressions(BlockExpression value);

} // AtomicExpression
