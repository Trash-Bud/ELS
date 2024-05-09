/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Column Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.SelectColumnTransformation#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see pt.up.fe.els2023.dsl.DslPackage#getSelectColumnTransformation()
 * @model
 * @generated
 */
public interface SelectColumnTransformation extends ColumnTransformation
{
  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute list.
   * @see pt.up.fe.els2023.dsl.DslPackage#getSelectColumnTransformation_Column()
   * @model unique="false"
   * @generated
   */
  EList<String> getColumn();

} // SelectColumnTransformation
