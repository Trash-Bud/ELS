/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.Pipeline#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see pt.up.fe.els2023.dsl.DslPackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject
{
  /**
   * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
   * The list contents are of type {@link pt.up.fe.els2023.dsl.Transformation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' containment reference list.
   * @see pt.up.fe.els2023.dsl.DslPackage#getPipeline_Transformation()
   * @model containment="true"
   * @generated
   */
  EList<Transformation> getTransformation();

} // Pipeline