/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MY_DSL: return createMyDsl();
      case MyDslPackage.COMBINATION_OPERATIONS: return createCombinationOperations();
      case MyDslPackage.TABLE_OPERATIONS: return createTableOperations();
      case MyDslPackage.SOURCE_OPERATION: return createSourceOperation();
      case MyDslPackage.TRANSFORMATION_TABLE_OPERATION: return createTransformationTableOperation();
      case MyDslPackage.PIPELINE_TABLE_OPERATION: return createPipelineTableOperation();
      case MyDslPackage.TRANSFORM_OPERATION: return createTransformOperation();
      case MyDslPackage.TABLE: return createTable();
      case MyDslPackage.XML_TYPE: return createXmlType();
      case MyDslPackage.JSON_TYPE: return createJsonType();
      case MyDslPackage.YAML_TYPE: return createYamlType();
      case MyDslPackage.CSV_TYPE: return createCsvType();
      case MyDslPackage.AUTO_TYPE: return createAutoType();
      case MyDslPackage.INPUT_TYPE: return createInputType();
      case MyDslPackage.HTML_TYPE: return createHtmlType();
      case MyDslPackage.OUTPUT_TYPE: return createOutputType();
      case MyDslPackage.META_DATA: return createMetaData();
      case MyDslPackage.SOURCE_STORE: return createSourceStore();
      case MyDslPackage.SOURCE_COUMN_SELECT: return createSourceCoumnSelect();
      case MyDslPackage.SOURCE: return createSource();
      case MyDslPackage.CANONICALIZE_PATH_TRANSFORMATION: return createCanonicalizePathTransformation();
      case MyDslPackage.GET_PATH_TRANSFORMATION: return createGetPathTransformation();
      case MyDslPackage.APPEND_PATH_TRANSFORMATION: return createAppendPathTransformation();
      case MyDslPackage.PATH_TRANSFORMATION: return createPathTransformation();
      case MyDslPackage.FOLD_MAX_TRANFORMATION: return createFoldMaxTranformation();
      case MyDslPackage.FOLD_AVERAGE_TRANFORMATION: return createFoldAverageTranformation();
      case MyDslPackage.FOLD_SUM_TRANFORMATION: return createFoldSumTranformation();
      case MyDslPackage.GROUP_BY: return createGroupBy();
      case MyDslPackage.FOLD_TRANSFORMATION: return createFoldTransformation();
      case MyDslPackage.ADD_COLUMN_TRANSFORMATION: return createAddColumnTransformation();
      case MyDslPackage.REMOVE_COLUMN_TRANSFORMATION: return createRemoveColumnTransformation();
      case MyDslPackage.RENAME_COLUMN_TRANSFORMATION: return createRenameColumnTransformation();
      case MyDslPackage.SELECT_COLUMN_TRANSFORMATION: return createSelectColumnTransformation();
      case MyDslPackage.COLUMN_TRANSFORMATION: return createColumnTransformation();
      case MyDslPackage.TRANSFORMATION: return createTransformation();
      case MyDslPackage.PIPELINE: return createPipeline();
      case MyDslPackage.EXPORT: return createExport();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDsl createMyDsl()
  {
    MyDslImpl myDsl = new MyDslImpl();
    return myDsl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CombinationOperations createCombinationOperations()
  {
    CombinationOperationsImpl combinationOperations = new CombinationOperationsImpl();
    return combinationOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TableOperations createTableOperations()
  {
    TableOperationsImpl tableOperations = new TableOperationsImpl();
    return tableOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SourceOperation createSourceOperation()
  {
    SourceOperationImpl sourceOperation = new SourceOperationImpl();
    return sourceOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransformationTableOperation createTransformationTableOperation()
  {
    TransformationTableOperationImpl transformationTableOperation = new TransformationTableOperationImpl();
    return transformationTableOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PipelineTableOperation createPipelineTableOperation()
  {
    PipelineTableOperationImpl pipelineTableOperation = new PipelineTableOperationImpl();
    return pipelineTableOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TransformOperation createTransformOperation()
  {
    TransformOperationImpl transformOperation = new TransformOperationImpl();
    return transformOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public XmlType createXmlType()
  {
    XmlTypeImpl xmlType = new XmlTypeImpl();
    return xmlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonType createJsonType()
  {
    JsonTypeImpl jsonType = new JsonTypeImpl();
    return jsonType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YamlType createYamlType()
  {
    YamlTypeImpl yamlType = new YamlTypeImpl();
    return yamlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CsvType createCsvType()
  {
    CsvTypeImpl csvType = new CsvTypeImpl();
    return csvType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AutoType createAutoType()
  {
    AutoTypeImpl autoType = new AutoTypeImpl();
    return autoType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InputType createInputType()
  {
    InputTypeImpl inputType = new InputTypeImpl();
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HtmlType createHtmlType()
  {
    HtmlTypeImpl htmlType = new HtmlTypeImpl();
    return htmlType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OutputType createOutputType()
  {
    OutputTypeImpl outputType = new OutputTypeImpl();
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MetaData createMetaData()
  {
    MetaDataImpl metaData = new MetaDataImpl();
    return metaData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SourceStore createSourceStore()
  {
    SourceStoreImpl sourceStore = new SourceStoreImpl();
    return sourceStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SourceCoumnSelect createSourceCoumnSelect()
  {
    SourceCoumnSelectImpl sourceCoumnSelect = new SourceCoumnSelectImpl();
    return sourceCoumnSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CanonicalizePathTransformation createCanonicalizePathTransformation()
  {
    CanonicalizePathTransformationImpl canonicalizePathTransformation = new CanonicalizePathTransformationImpl();
    return canonicalizePathTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetPathTransformation createGetPathTransformation()
  {
    GetPathTransformationImpl getPathTransformation = new GetPathTransformationImpl();
    return getPathTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AppendPathTransformation createAppendPathTransformation()
  {
    AppendPathTransformationImpl appendPathTransformation = new AppendPathTransformationImpl();
    return appendPathTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PathTransformation createPathTransformation()
  {
    PathTransformationImpl pathTransformation = new PathTransformationImpl();
    return pathTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FoldMaxTranformation createFoldMaxTranformation()
  {
    FoldMaxTranformationImpl foldMaxTranformation = new FoldMaxTranformationImpl();
    return foldMaxTranformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FoldAverageTranformation createFoldAverageTranformation()
  {
    FoldAverageTranformationImpl foldAverageTranformation = new FoldAverageTranformationImpl();
    return foldAverageTranformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FoldSumTranformation createFoldSumTranformation()
  {
    FoldSumTranformationImpl foldSumTranformation = new FoldSumTranformationImpl();
    return foldSumTranformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupBy createGroupBy()
  {
    GroupByImpl groupBy = new GroupByImpl();
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FoldTransformation createFoldTransformation()
  {
    FoldTransformationImpl foldTransformation = new FoldTransformationImpl();
    return foldTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddColumnTransformation createAddColumnTransformation()
  {
    AddColumnTransformationImpl addColumnTransformation = new AddColumnTransformationImpl();
    return addColumnTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveColumnTransformation createRemoveColumnTransformation()
  {
    RemoveColumnTransformationImpl removeColumnTransformation = new RemoveColumnTransformationImpl();
    return removeColumnTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RenameColumnTransformation createRenameColumnTransformation()
  {
    RenameColumnTransformationImpl renameColumnTransformation = new RenameColumnTransformationImpl();
    return renameColumnTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectColumnTransformation createSelectColumnTransformation()
  {
    SelectColumnTransformationImpl selectColumnTransformation = new SelectColumnTransformationImpl();
    return selectColumnTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnTransformation createColumnTransformation()
  {
    ColumnTransformationImpl columnTransformation = new ColumnTransformationImpl();
    return columnTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transformation createTransformation()
  {
    TransformationImpl transformation = new TransformationImpl();
    return transformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pipeline createPipeline()
  {
    PipelineImpl pipeline = new PipelineImpl();
    return pipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Export createExport()
  {
    ExportImpl export = new ExportImpl();
    return export;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl