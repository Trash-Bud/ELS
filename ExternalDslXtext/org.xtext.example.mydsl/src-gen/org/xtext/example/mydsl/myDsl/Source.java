/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getQuery <em>Query</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getFilePath <em>File Path</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getInputType <em>Input Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getStore <em>Store</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Source#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource()
 * @model
 * @generated
 */
public interface Source extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Source#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Source#getQuery <em>Query</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_FilePath()
   * @model
   * @generated
   */
  String getFilePath();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Source#getFilePath <em>File Path</em>}' attribute.
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_InputType()
   * @model containment="true"
   * @generated
   */
  InputType getInputType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Source#getInputType <em>Input Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type</em>' containment reference.
   * @see #getInputType()
   * @generated
   */
  void setInputType(InputType value);

  /**
   * Returns the value of the '<em><b>Store</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.SourceStore}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Store</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_Store()
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
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getSource_Select()
   * @model containment="true"
   * @generated
   */
  SourceCoumnSelect getSelect();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Source#getSelect <em>Select</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Select</em>' containment reference.
   * @see #getSelect()
   * @generated
   */
  void setSelect(SourceCoumnSelect value);

} // Source