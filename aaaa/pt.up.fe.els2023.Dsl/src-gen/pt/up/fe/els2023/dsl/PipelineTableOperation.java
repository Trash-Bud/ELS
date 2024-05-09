/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline Table Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.PipelineTableOperation#getPipeline <em>Pipeline</em>}</li>
 * </ul>
 *
 * @see pt.up.fe.els2023.dsl.DslPackage#getPipelineTableOperation()
 * @model
 * @generated
 */
public interface PipelineTableOperation extends EObject
{
  /**
   * Returns the value of the '<em><b>Pipeline</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pipeline</em>' containment reference.
   * @see #setPipeline(EObject)
   * @see pt.up.fe.els2023.dsl.DslPackage#getPipelineTableOperation_Pipeline()
   * @model containment="true"
   * @generated
   */
  EObject getPipeline();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.PipelineTableOperation#getPipeline <em>Pipeline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pipeline</em>' containment reference.
   * @see #getPipeline()
   * @generated
   */
  void setPipeline(EObject value);

} // PipelineTableOperation
