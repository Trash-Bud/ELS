/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.up.fe.els2023.dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DslFactory init()
  {
    try
    {
      DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
      if (theDslFactory != null)
      {
        return theDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DslFactoryImpl()
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
      case DslPackage.MY_DSL: return createMyDsl();
      case DslPackage.ASSIGNMENT: return createAssignment();
      case DslPackage.COMBINATION_OPERATIONS: return createCombinationOperations();
      case DslPackage.TABLE_OPERATIONS: return createTableOperations();
      case DslPackage.SELECT_SOURCE: return createSelectSource();
      case DslPackage.INLINE_SOURCE: return createInlineSource();
      case DslPackage.SOURCE_OPERATION: return createSourceOperation();
      case DslPackage.TRANSFORMATION_TABLE_OPERATION: return createTransformationTableOperation();
      case DslPackage.SELECT_PIPELINE: return createSelectPipeline();
      case DslPackage.INLINE_PIPELINE: return createInlinePipeline();
      case DslPackage.PIPELINE_TABLE_OPERATION: return createPipelineTableOperation();
      case DslPackage.TRANSFORM_OPERATION: return createTransformOperation();
      case DslPackage.TABLE: return createTable();
      case DslPackage.XML_TYPE: return createXmlType();
      case DslPackage.JSON_TYPE: return createJsonType();
      case DslPackage.YAML_TYPE: return createYamlType();
      case DslPackage.CSV_TYPE: return createCsvType();
      case DslPackage.AUTO_TYPE: return createAutoType();
      case DslPackage.INPUT_TYPE: return createInputType();
      case DslPackage.HTML_TYPE: return createHtmlType();
      case DslPackage.OUTPUT_TYPE: return createOutputType();
      case DslPackage.META_DATA: return createMetaData();
      case DslPackage.SOURCE_STORE: return createSourceStore();
      case DslPackage.SOURCE_COUMN_SELECT: return createSourceCoumnSelect();
      case DslPackage.SOURCE: return createSource();
      case DslPackage.CANONICALIZE_PATH_TRANSFORMATION: return createCanonicalizePathTransformation();
      case DslPackage.GET_PATH_TRANSFORMATION: return createGetPathTransformation();
      case DslPackage.APPEND_PATH_TRANSFORMATION: return createAppendPathTransformation();
      case DslPackage.PATH_TRANSFORMATION: return createPathTransformation();
      case DslPackage.FOLD_AVERAGE_TRANFORMATION: return createFoldAverageTranformation();
      case DslPackage.FOLD_SUM_TRANFORMATION: return createFoldSumTranformation();
      case DslPackage.GROUP_BY: return createGroupBy();
      case DslPackage.FOLD_TRANSFORMATION: return createFoldTransformation();
      case DslPackage.ADD_COLUMN_TRANSFORMATION: return createAddColumnTransformation();
      case DslPackage.REMOVE_COLUMN_TRANSFORMATION: return createRemoveColumnTransformation();
      case DslPackage.RENAME_COLUMN_TRANSFORMATION: return createRenameColumnTransformation();
      case DslPackage.SELECT_COLUMN_TRANSFORMATION: return createSelectColumnTransformation();
      case DslPackage.COLUMN_TRANSFORMATION: return createColumnTransformation();
      case DslPackage.ROUND_CELLS_TRANSFORMATION: return createRoundCellsTransformation();
      case DslPackage.SET_CELLS_TRANSFORMATION: return createSetCellsTransformation();
      case DslPackage.CELL_TRANSFORMATION: return createCellTransformation();
      case DslPackage.SELECT_ROWS_TRANSFORMATION: return createSelectRowsTransformation();
      case DslPackage.SORT_ROWS_TRANSFORMATION: return createSortRowsTransformation();
      case DslPackage.ROW_TRANSFORMATION: return createRowTransformation();
      case DslPackage.TRANSFORMATION: return createTransformation();
      case DslPackage.PIPELINE: return createPipeline();
      case DslPackage.EXPORT: return createExport();
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
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
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
  public SelectSource createSelectSource()
  {
    SelectSourceImpl selectSource = new SelectSourceImpl();
    return selectSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InlineSource createInlineSource()
  {
    InlineSourceImpl inlineSource = new InlineSourceImpl();
    return inlineSource;
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
  public SelectPipeline createSelectPipeline()
  {
    SelectPipelineImpl selectPipeline = new SelectPipelineImpl();
    return selectPipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InlinePipeline createInlinePipeline()
  {
    InlinePipelineImpl inlinePipeline = new InlinePipelineImpl();
    return inlinePipeline;
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
  public RoundCellsTransformation createRoundCellsTransformation()
  {
    RoundCellsTransformationImpl roundCellsTransformation = new RoundCellsTransformationImpl();
    return roundCellsTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SetCellsTransformation createSetCellsTransformation()
  {
    SetCellsTransformationImpl setCellsTransformation = new SetCellsTransformationImpl();
    return setCellsTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CellTransformation createCellTransformation()
  {
    CellTransformationImpl cellTransformation = new CellTransformationImpl();
    return cellTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectRowsTransformation createSelectRowsTransformation()
  {
    SelectRowsTransformationImpl selectRowsTransformation = new SelectRowsTransformationImpl();
    return selectRowsTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SortRowsTransformation createSortRowsTransformation()
  {
    SortRowsTransformationImpl sortRowsTransformation = new SortRowsTransformationImpl();
    return sortRowsTransformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RowTransformation createRowTransformation()
  {
    RowTransformationImpl rowTransformation = new RowTransformationImpl();
    return rowTransformation;
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
  public DslPackage getDslPackage()
  {
    return (DslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DslPackage getPackage()
  {
    return DslPackage.eINSTANCE;
  }

} //DslFactoryImpl
