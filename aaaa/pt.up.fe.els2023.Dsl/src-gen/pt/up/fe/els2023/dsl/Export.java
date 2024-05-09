/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.Export#getTable <em>Table</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Export#getPath <em>Path</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Export#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see pt.up.fe.els2023.dsl.DslPackage#getExport()
 * @model
 * @generated
 */
public interface Export extends EObject
{
  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(String)
   * @see pt.up.fe.els2023.dsl.DslPackage#getExport_Table()
   * @model
   * @generated
   */
  String getTable();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Export#getTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #getTable()
   * @generated
   */
  void setTable(String value);

  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see pt.up.fe.els2023.dsl.DslPackage#getExport_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Export#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(OutputType)
   * @see pt.up.fe.els2023.dsl.DslPackage#getExport_Output()
   * @model containment="true"
   * @generated
   */
  OutputType getOutput();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Export#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(OutputType value);

} // Export
