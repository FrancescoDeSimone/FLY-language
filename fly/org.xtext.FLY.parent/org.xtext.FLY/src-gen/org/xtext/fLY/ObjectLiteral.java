/**
 * generated by Xtext 2.15.0
 */
package org.xtext.fLY;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.fLY.ObjectLiteral#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.fLY.FLYPackage#getObjectLiteral()
 * @model
 * @generated
 */
public interface ObjectLiteral extends ArithmeticExpression
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(VariableDeclaration)
   * @see org.xtext.fLY.FLYPackage#getObjectLiteral_Name()
   * @model
   * @generated
   */
  VariableDeclaration getName();

  /**
   * Sets the value of the '{@link org.xtext.fLY.ObjectLiteral#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(VariableDeclaration value);

} // ObjectLiteral
