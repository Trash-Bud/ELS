/*
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pt.up.fe.els2023.ide.contentassist.antlr.internal.InternalDslParser;
import pt.up.fe.els2023.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(DslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, DslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAssignmentAccess().getExpressionAlternatives_2_0(), "rule__Assignment__ExpressionAlternatives_2_0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getOperationAlternatives_0_0(), "rule__CombinationOperations__OperationAlternatives_0_0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTypeAlternatives_1_0(), "rule__CombinationOperations__TypeAlternatives_1_0");
			builder.put(grammarAccess.getTableOperationsAccess().getOperationAlternatives_0_0(), "rule__TableOperations__OperationAlternatives_0_0");
			builder.put(grammarAccess.getSourceOperationAccess().getSourceAlternatives_0(), "rule__SourceOperation__SourceAlternatives_0");
			builder.put(grammarAccess.getPipelineTableOperationAccess().getPipelineAlternatives_0(), "rule__PipelineTableOperation__PipelineAlternatives_0");
			builder.put(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_0(), "rule__TransformOperation__OperationAlternatives_1_0");
			builder.put(grammarAccess.getInputTypeAccess().getAlternatives(), "rule__InputType__Alternatives");
			builder.put(grammarAccess.getOutputTypeAccess().getTypeAlternatives_0(), "rule__OutputType__TypeAlternatives_0");
			builder.put(grammarAccess.getMetaDataAccess().getMetadataAlternatives_0(), "rule__MetaData__MetadataAlternatives_0");
			builder.put(grammarAccess.getPathTransformationAccess().getOperationAlternatives_0_0(), "rule__PathTransformation__OperationAlternatives_0_0");
			builder.put(grammarAccess.getFoldTransformationAccess().getOperationAlternatives_0_0(), "rule__FoldTransformation__OperationAlternatives_0_0");
			builder.put(grammarAccess.getColumnTransformationAccess().getAlternatives(), "rule__ColumnTransformation__Alternatives");
			builder.put(grammarAccess.getCellTransformationAccess().getAlternatives(), "rule__CellTransformation__Alternatives");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getOrderAlternatives_7_0(), "rule__SortRowsTransformation__OrderAlternatives_7_0");
			builder.put(grammarAccess.getRowTransformationAccess().getAlternatives(), "rule__RowTransformation__Alternatives");
			builder.put(grammarAccess.getTransformationAccess().getAlternatives(), "rule__Transformation__Alternatives");
			builder.put(grammarAccess.getMyDslAccess().getGroup(), "rule__MyDsl__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getGroup(), "rule__CombinationOperations__Group__0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getGroup_4(), "rule__CombinationOperations__Group_4__0");
			builder.put(grammarAccess.getTableOperationsAccess().getGroup(), "rule__TableOperations__Group__0");
			builder.put(grammarAccess.getInlineSourceAccess().getGroup(), "rule__InlineSource__Group__0");
			builder.put(grammarAccess.getTransformationTableOperationAccess().getGroup(), "rule__TransformationTableOperation__Group__0");
			builder.put(grammarAccess.getInlinePipelineAccess().getGroup(), "rule__InlinePipeline__Group__0");
			builder.put(grammarAccess.getTransformOperationAccess().getGroup(), "rule__TransformOperation__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getXmlTypeAccess().getGroup(), "rule__XmlType__Group__0");
			builder.put(grammarAccess.getXmlTypeAccess().getGroup_2(), "rule__XmlType__Group_2__0");
			builder.put(grammarAccess.getJsonTypeAccess().getGroup(), "rule__JsonType__Group__0");
			builder.put(grammarAccess.getJsonTypeAccess().getGroup_2(), "rule__JsonType__Group_2__0");
			builder.put(grammarAccess.getYamlTypeAccess().getGroup(), "rule__YamlType__Group__0");
			builder.put(grammarAccess.getCsvTypeAccess().getGroup(), "rule__CsvType__Group__0");
			builder.put(grammarAccess.getAutoTypeAccess().getGroup(), "rule__AutoType__Group__0");
			builder.put(grammarAccess.getHtmlTypeAccess().getGroup(), "rule__HtmlType__Group__0");
			builder.put(grammarAccess.getHtmlTypeAccess().getGroup_2(), "rule__HtmlType__Group_2__0");
			builder.put(grammarAccess.getSourceStoreAccess().getGroup(), "rule__SourceStore__Group__0");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getGroup(), "rule__SourceCoumnSelect__Group__0");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getGroup_3(), "rule__SourceCoumnSelect__Group_3__0");
			builder.put(grammarAccess.getSourceAccess().getGroup(), "rule__Source__Group__0");
			builder.put(grammarAccess.getSourceAccess().getGroup_4(), "rule__Source__Group_4__0");
			builder.put(grammarAccess.getCanonicalizePathTransformationAccess().getGroup(), "rule__CanonicalizePathTransformation__Group__0");
			builder.put(grammarAccess.getGetPathTransformationAccess().getGroup(), "rule__GetPathTransformation__Group__0");
			builder.put(grammarAccess.getAppendPathTransformationAccess().getGroup(), "rule__AppendPathTransformation__Group__0");
			builder.put(grammarAccess.getPathTransformationAccess().getGroup(), "rule__PathTransformation__Group__0");
			builder.put(grammarAccess.getFoldAverageTranformationAccess().getGroup(), "rule__FoldAverageTranformation__Group__0");
			builder.put(grammarAccess.getFoldSumTranformationAccess().getGroup(), "rule__FoldSumTranformation__Group__0");
			builder.put(grammarAccess.getGroupByAccess().getGroup(), "rule__GroupBy__Group__0");
			builder.put(grammarAccess.getFoldTransformationAccess().getGroup(), "rule__FoldTransformation__Group__0");
			builder.put(grammarAccess.getAddColumnTransformationAccess().getGroup(), "rule__AddColumnTransformation__Group__0");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getGroup(), "rule__RemoveColumnTransformation__Group__0");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getGroup_3(), "rule__RemoveColumnTransformation__Group_3__0");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getGroup(), "rule__RenameColumnTransformation__Group__0");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getGroup(), "rule__SelectColumnTransformation__Group__0");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getGroup_3(), "rule__SelectColumnTransformation__Group_3__0");
			builder.put(grammarAccess.getRoundCellsTransformationAccess().getGroup(), "rule__RoundCellsTransformation__Group__0");
			builder.put(grammarAccess.getRoundCellsTransformationAccess().getGroup_3(), "rule__RoundCellsTransformation__Group_3__0");
			builder.put(grammarAccess.getSetCellsTransformationAccess().getGroup(), "rule__SetCellsTransformation__Group__0");
			builder.put(grammarAccess.getSetCellsTransformationAccess().getGroup_6(), "rule__SetCellsTransformation__Group_6__0");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getGroup(), "rule__SelectRowsTransformation__Group__0");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getGroup_2(), "rule__SelectRowsTransformation__Group_2__0");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getGroup_3(), "rule__SelectRowsTransformation__Group_3__0");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getGroup(), "rule__SortRowsTransformation__Group__0");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getGroup_4(), "rule__SortRowsTransformation__Group_4__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2(), "rule__Pipeline__Group_2__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_2_1(), "rule__Pipeline__Group_2_1__0");
			builder.put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
			builder.put(grammarAccess.getMyDslAccess().getAssignmentAssignment_0(), "rule__MyDsl__AssignmentAssignment_0");
			builder.put(grammarAccess.getMyDslAccess().getExportAssignment_1(), "rule__MyDsl__ExportAssignment_1");
			builder.put(grammarAccess.getAssignmentAccess().getNameAssignment_0(), "rule__Assignment__NameAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getExpressionAssignment_2(), "rule__Assignment__ExpressionAssignment_2");
			builder.put(grammarAccess.getCombinationOperationsAccess().getOperationAssignment_0(), "rule__CombinationOperations__OperationAssignment_0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTypeAssignment_1(), "rule__CombinationOperations__TypeAssignment_1");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_3(), "rule__CombinationOperations__TableOperationAssignment_3");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_4_1(), "rule__CombinationOperations__TableOperationAssignment_4_1");
			builder.put(grammarAccess.getTableOperationsAccess().getOperationAssignment_0(), "rule__TableOperations__OperationAssignment_0");
			builder.put(grammarAccess.getTableOperationsAccess().getTransformationsAssignment_1(), "rule__TableOperations__TransformationsAssignment_1");
			builder.put(grammarAccess.getSelectSourceAccess().getNameAssignment(), "rule__SelectSource__NameAssignment");
			builder.put(grammarAccess.getInlineSourceAccess().getSourceExprAssignment_1(), "rule__InlineSource__SourceExprAssignment_1");
			builder.put(grammarAccess.getSourceOperationAccess().getSourceAssignment(), "rule__SourceOperation__SourceAssignment");
			builder.put(grammarAccess.getTransformationTableOperationAccess().getTransformationAssignment_1(), "rule__TransformationTableOperation__TransformationAssignment_1");
			builder.put(grammarAccess.getSelectPipelineAccess().getNameAssignment(), "rule__SelectPipeline__NameAssignment");
			builder.put(grammarAccess.getInlinePipelineAccess().getPipelineExprAssignment_1(), "rule__InlinePipeline__PipelineExprAssignment_1");
			builder.put(grammarAccess.getPipelineTableOperationAccess().getPipelineAssignment(), "rule__PipelineTableOperation__PipelineAssignment");
			builder.put(grammarAccess.getTransformOperationAccess().getOperationAssignment_1(), "rule__TransformOperation__OperationAssignment_1");
			builder.put(grammarAccess.getTableAccess().getOperationAssignment_0(), "rule__Table__OperationAssignment_0");
			builder.put(grammarAccess.getXmlTypeAccess().getPathAssignment_2_3(), "rule__XmlType__PathAssignment_2_3");
			builder.put(grammarAccess.getJsonTypeAccess().getPathAssignment_2_3(), "rule__JsonType__PathAssignment_2_3");
			builder.put(grammarAccess.getHtmlTypeAccess().getCssPathAssignment_2_3(), "rule__HtmlType__CssPathAssignment_2_3");
			builder.put(grammarAccess.getOutputTypeAccess().getTypeAssignment(), "rule__OutputType__TypeAssignment");
			builder.put(grammarAccess.getMetaDataAccess().getMetadataAssignment(), "rule__MetaData__MetadataAssignment");
			builder.put(grammarAccess.getSourceStoreAccess().getMetadataAssignment_1(), "rule__SourceStore__MetadataAssignment_1");
			builder.put(grammarAccess.getSourceStoreAccess().getColumnAssignment_3(), "rule__SourceStore__ColumnAssignment_3");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_2(), "rule__SourceCoumnSelect__ColumnAssignment_2");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_3_1(), "rule__SourceCoumnSelect__ColumnAssignment_3_1");
			builder.put(grammarAccess.getSourceAccess().getQueryAssignment_1(), "rule__Source__QueryAssignment_1");
			builder.put(grammarAccess.getSourceAccess().getFilePathAssignment_3(), "rule__Source__FilePathAssignment_3");
			builder.put(grammarAccess.getSourceAccess().getInputTypeAssignment_4_1(), "rule__Source__InputTypeAssignment_4_1");
			builder.put(grammarAccess.getSourceAccess().getStoreAssignment_5(), "rule__Source__StoreAssignment_5");
			builder.put(grammarAccess.getSourceAccess().getSelectAssignment_6(), "rule__Source__SelectAssignment_6");
			builder.put(grammarAccess.getAppendPathTransformationAccess().getPathAssignment_2(), "rule__AppendPathTransformation__PathAssignment_2");
			builder.put(grammarAccess.getPathTransformationAccess().getOperationAssignment_0(), "rule__PathTransformation__OperationAssignment_0");
			builder.put(grammarAccess.getPathTransformationAccess().getColumnAssignment_2(), "rule__PathTransformation__ColumnAssignment_2");
			builder.put(grammarAccess.getGroupByAccess().getColumnAssignment_2(), "rule__GroupBy__ColumnAssignment_2");
			builder.put(grammarAccess.getFoldTransformationAccess().getOperationAssignment_0(), "rule__FoldTransformation__OperationAssignment_0");
			builder.put(grammarAccess.getFoldTransformationAccess().getGroupByAssignment_1(), "rule__FoldTransformation__GroupByAssignment_1");
			builder.put(grammarAccess.getAddColumnTransformationAccess().getColumnAssignment_1(), "rule__AddColumnTransformation__ColumnAssignment_1");
			builder.put(grammarAccess.getAddColumnTransformationAccess().getValueAssignment_3(), "rule__AddColumnTransformation__ValueAssignment_3");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_2(), "rule__RemoveColumnTransformation__ColumnAssignment_2");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_3_1(), "rule__RemoveColumnTransformation__ColumnAssignment_3_1");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getRegexAssignment_1(), "rule__RenameColumnTransformation__RegexAssignment_1");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_2(), "rule__RenameColumnTransformation__FromAssignment_2");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_4(), "rule__RenameColumnTransformation__ToAssignment_4");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_2(), "rule__SelectColumnTransformation__ColumnAssignment_2");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_3_1(), "rule__SelectColumnTransformation__ColumnAssignment_3_1");
			builder.put(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_2(), "rule__RoundCellsTransformation__ColumnsAssignment_2");
			builder.put(grammarAccess.getRoundCellsTransformationAccess().getColumnsAssignment_3_1(), "rule__RoundCellsTransformation__ColumnsAssignment_3_1");
			builder.put(grammarAccess.getRoundCellsTransformationAccess().getDigitsAssignment_7(), "rule__RoundCellsTransformation__DigitsAssignment_7");
			builder.put(grammarAccess.getSetCellsTransformationAccess().getValueAssignment_2(), "rule__SetCellsTransformation__ValueAssignment_2");
			builder.put(grammarAccess.getSetCellsTransformationAccess().getColumnAssignment_5(), "rule__SetCellsTransformation__ColumnAssignment_5");
			builder.put(grammarAccess.getSetCellsTransformationAccess().getRowAssignment_6_2(), "rule__SetCellsTransformation__RowAssignment_6_2");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getStartAssignment_1(), "rule__SelectRowsTransformation__StartAssignment_1");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getLengthAssignment_2_1(), "rule__SelectRowsTransformation__LengthAssignment_2_1");
			builder.put(grammarAccess.getSelectRowsTransformationAccess().getGroupByAssignment_3_1(), "rule__SelectRowsTransformation__GroupByAssignment_3_1");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_3(), "rule__SortRowsTransformation__ColumnsAssignment_3");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getColumnsAssignment_4_1(), "rule__SortRowsTransformation__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getSortRowsTransformationAccess().getOrderAssignment_7(), "rule__SortRowsTransformation__OrderAssignment_7");
			builder.put(grammarAccess.getPipelineAccess().getTransformationAssignment_2_0(), "rule__Pipeline__TransformationAssignment_2_0");
			builder.put(grammarAccess.getPipelineAccess().getTransformationAssignment_2_1_1(), "rule__Pipeline__TransformationAssignment_2_1_1");
			builder.put(grammarAccess.getExportAccess().getTableAssignment_1(), "rule__Export__TableAssignment_1");
			builder.put(grammarAccess.getExportAccess().getPathAssignment_3(), "rule__Export__PathAssignment_3");
			builder.put(grammarAccess.getExportAccess().getOutputAssignment_5(), "rule__Export__OutputAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private DslGrammarAccess grammarAccess;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
