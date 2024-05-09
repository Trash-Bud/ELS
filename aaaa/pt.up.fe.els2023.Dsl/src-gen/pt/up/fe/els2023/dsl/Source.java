/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.Source#getQuery <em>Query</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Source#getFilePath <em>File Path</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Source#getInputType <em>Input Type</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Source#getStore <em>Store</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.Source#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see pt.up.fe.els2023.dsl.DslPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject
{
  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see pt.up.fe.els2023.dsl.DslPackage#getSource_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Source#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

  /**
   * Returns the value of the '<em><b>File Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Path</em>' attribute.
   * @see #setFilePath(String)
   * @see pt.up.fe.els2023.dsl.DslPackage#getSource_FilePath()
   * @model
   * @generated
   */
  String getFilePath();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Source#getFilePath <em>File Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Path</em>' attribute.
   * @see #getFilePath()
   * @generated
   */
  void setFilePath(String value);

  /**
   * Returns the value of the '<em><b>Input Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type</em>' containment reference.
   * @see #setInputType(InputType)
   * @see pt.up.fe.els2023.dsl.DslPackage#getSource_InputType()
   * @model containment="true"
   * @generated
   */
  InputType getInputType();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Source#getInputType <em>Input Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' containment reference.
   * @see #getInputType()
   * @generated
   */
  void setInputType(InputType value);

  /**
   * Returns the value of the '<em><b>Store</b></em>' containment reference list.
   * The list contents are of type {@link pt.up.fe.els2023.dsl.SourceStore}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store</em>' containment reference list.
   * @see pt.up.fe.els2023.dsl.DslPackage#getSource_Store()
   * @model containment="true"
   * @generated
   */
  EList<SourceStore> getStore();

  /**
   * Returns the value of the '<em><b>Select</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select</em>' containment reference.
   * @see #setSelect(SourceCoumnSelect)
   * @see pt.up.fe.els2023.dsl.DslPackage#getSource_Select()
   * @model containment="true"
   * @generated
   */
  SourceCoumnSelect getSelect();

  /**
   * Sets the value of the '{@link pt.up.fe.els2023.dsl.Source#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SourceCoumnSelect value);

} // Source