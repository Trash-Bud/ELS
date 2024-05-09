/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Dsl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Dsl</em>'.
   * @generated
   */
  MyDsl createMyDsl();

  /**
   * Returns a new object of class '<em>Combination Operations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combination Operations</em>'.
   * @generated
   */
  CombinationOperations createCombinationOperations();

  /**
   * Returns a new object of class '<em>Table Operations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Operations</em>'.
   * @generated
   */
  TableOperations createTableOperations();

  /**
   * Returns a new object of class '<em>Source Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Operation</em>'.
   * @generated
   */
  SourceOperation createSourceOperation();

  /**
   * Returns a new object of class '<em>Transformation Table Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation Table Operation</em>'.
   * @generated
   */
  TransformationTableOperation createTransformationTableOperation();

  /**
   * Returns a new object of class '<em>Pipeline Table Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pipeline Table Operation</em>'.
   * @generated
   */
  PipelineTableOperation createPipelineTableOperation();

  /**
   * Returns a new object of class '<em>Transform Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transform Operation</em>'.
   * @generated
   */
  TransformOperation createTransformOperation();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Xml Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xml Type</em>'.
   * @generated
   */
  XmlType createXmlType();

  /**
   * Returns a new object of class '<em>Json Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Type</em>'.
   * @generated
   */
  JsonType createJsonType();

  /**
   * Returns a new object of class '<em>Yaml Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yaml Type</em>'.
   * @generated
   */
  YamlType createYamlType();

  /**
   * Returns a new object of class '<em>Csv Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Csv Type</em>'.
   * @generated
   */
  CsvType createCsvType();

  /**
   * Returns a new object of class '<em>Auto Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auto Type</em>'.
   * @generated
   */
  AutoType createAutoType();

  /**
   * Returns a new object of class '<em>Input Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Type</em>'.
   * @generated
   */
  InputType createInputType();

  /**
   * Returns a new object of class '<em>Html Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Html Type</em>'.
   * @generated
   */
  HtmlType createHtmlType();

  /**
   * Returns a new object of class '<em>Output Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Type</em>'.
   * @generated
   */
  OutputType createOutputType();

  /**
   * Returns a new object of class '<em>Meta Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Data</em>'.
   * @generated
   */
  MetaData createMetaData();

  /**
   * Returns a new object of class '<em>Source Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Store</em>'.
   * @generated
   */
  SourceStore createSourceStore();

  /**
   * Returns a new object of class '<em>Source Coumn Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Coumn Select</em>'.
   * @generated
   */
  SourceCoumnSelect createSourceCoumnSelect();

  /**
   * Returns a new object of class '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source</em>'.
   * @generated
   */
  Source createSource();

  /**
   * Returns a new object of class '<em>Canonicalize Path Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Canonicalize Path Transformation</em>'.
   * @generated
   */
  CanonicalizePathTransformation createCanonicalizePathTransformation();

  /**
   * Returns a new object of class '<em>Get Path Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Path Transformation</em>'.
   * @generated
   */
  GetPathTransformation createGetPathTransformation();

  /**
   * Returns a new object of class '<em>Append Path Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Append Path Transformation</em>'.
   * @generated
   */
  AppendPathTransformation createAppendPathTransformation();

  /**
   * Returns a new object of class '<em>Path Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Transformation</em>'.
   * @generated
   */
  PathTransformation createPathTransformation();

  /**
   * Returns a new object of class '<em>Fold Max Tranformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fold Max Tranformation</em>'.
   * @generated
   */
  FoldMaxTranformation createFoldMaxTranformation();

  /**
   * Returns a new object of class '<em>Fold Average Tranformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fold Average Tranformation</em>'.
   * @generated
   */
  FoldAverageTranformation createFoldAverageTranformation();

  /**
   * Returns a new object of class '<em>Fold Sum Tranformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fold Sum Tranformation</em>'.
   * @generated
   */
  FoldSumTranformation createFoldSumTranformation();

  /**
   * Returns a new object of class '<em>Group By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group By</em>'.
   * @generated
   */
  GroupBy createGroupBy();

  /**
   * Returns a new object of class '<em>Fold Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fold Transformation</em>'.
   * @generated
   */
  FoldTransformation createFoldTransformation();

  /**
   * Returns a new object of class '<em>Add Column Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Add Column Transformation</em>'.
   * @generated
   */
  AddColumnTransformation createAddColumnTransformation();

  /**
   * Returns a new object of class '<em>Remove Column Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Column Transformation</em>'.
   * @generated
   */
  RemoveColumnTransformation createRemoveColumnTransformation();

  /**
   * Returns a new object of class '<em>Rename Column Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rename Column Transformation</em>'.
   * @generated
   */
  RenameColumnTransformation createRenameColumnTransformation();

  /**
   * Returns a new object of class '<em>Select Column Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Column Transformation</em>'.
   * @generated
   */
  SelectColumnTransformation createSelectColumnTransformation();

  /**
   * Returns a new object of class '<em>Column Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Transformation</em>'.
   * @generated
   */
  ColumnTransformation createColumnTransformation();

  /**
   * Returns a new object of class '<em>Transformation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transformation</em>'.
   * @generated
   */
  Transformation createTransformation();

  /**
   * Returns a new object of class '<em>Pipeline</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pipeline</em>'.
   * @generated
   */
  Pipeline createPipeline();

  /**
   * Returns a new object of class '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Export</em>'.
   * @generated
   */
  Export createExport();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
