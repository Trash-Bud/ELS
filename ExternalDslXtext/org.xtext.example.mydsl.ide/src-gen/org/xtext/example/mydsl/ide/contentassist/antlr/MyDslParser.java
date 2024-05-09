/*
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getCombinationOperationsAccess().getOperationAlternatives_0_0(), "rule__CombinationOperations__OperationAlternatives_0_0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTypeAlternatives_1_0(), "rule__CombinationOperations__TypeAlternatives_1_0");
			builder.put(grammarAccess.getTableOperationsAccess().getAlternatives(), "rule__TableOperations__Alternatives");
			builder.put(grammarAccess.getTransformOperationAccess().getOperationAlternatives_1_1_0(), "rule__TransformOperation__OperationAlternatives_1_1_0");
			builder.put(grammarAccess.getInputTypeAccess().getAlternatives(), "rule__InputType__Alternatives");
			builder.put(grammarAccess.getOutputTypeAccess().getTypeAlternatives_0(), "rule__OutputType__TypeAlternatives_0");
			builder.put(grammarAccess.getMetaDataAccess().getMetadataAlternatives_0(), "rule__MetaData__MetadataAlternatives_0");
			builder.put(grammarAccess.getPathTransformationAccess().getOperationAlternatives_2_0(), "rule__PathTransformation__OperationAlternatives_2_0");
			builder.put(grammarAccess.getFoldTransformationAccess().getOperationAlternatives_0_0(), "rule__FoldTransformation__OperationAlternatives_0_0");
			builder.put(grammarAccess.getColumnTransformationAccess().getAlternatives(), "rule__ColumnTransformation__Alternatives");
			builder.put(grammarAccess.getTransformationAccess().getAlternatives(), "rule__Transformation__Alternatives");
			builder.put(grammarAccess.getMyDslAccess().getGroup(), "rule__MyDsl__Group__0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getGroup(), "rule__CombinationOperations__Group__0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getGroup_4(), "rule__CombinationOperations__Group_4__0");
			builder.put(grammarAccess.getTransformationTableOperationAccess().getGroup(), "rule__TransformationTableOperation__Group__0");
			builder.put(grammarAccess.getTransformOperationAccess().getGroup(), "rule__TransformOperation__Group__0");
			builder.put(grammarAccess.getTransformOperationAccess().getGroup_1(), "rule__TransformOperation__Group_1__0");
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
			builder.put(grammarAccess.getSourceAccess().getGroup_6(), "rule__Source__Group_6__0");
			builder.put(grammarAccess.getCanonicalizePathTransformationAccess().getGroup(), "rule__CanonicalizePathTransformation__Group__0");
			builder.put(grammarAccess.getGetPathTransformationAccess().getGroup(), "rule__GetPathTransformation__Group__0");
			builder.put(grammarAccess.getAppendPathTransformationAccess().getGroup(), "rule__AppendPathTransformation__Group__0");
			builder.put(grammarAccess.getPathTransformationAccess().getGroup(), "rule__PathTransformation__Group__0");
			builder.put(grammarAccess.getFoldMaxTranformationAccess().getGroup(), "rule__FoldMaxTranformation__Group__0");
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
			builder.put(grammarAccess.getPipelineAccess().getGroup(), "rule__Pipeline__Group__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_4(), "rule__Pipeline__Group_4__0");
			builder.put(grammarAccess.getPipelineAccess().getGroup_4_1(), "rule__Pipeline__Group_4_1__0");
			builder.put(grammarAccess.getExportAccess().getGroup(), "rule__Export__Group__0");
			builder.put(grammarAccess.getMyDslAccess().getPipelinesAssignment_0(), "rule__MyDsl__PipelinesAssignment_0");
			builder.put(grammarAccess.getMyDslAccess().getSourcesAssignment_1(), "rule__MyDsl__SourcesAssignment_1");
			builder.put(grammarAccess.getMyDslAccess().getTablesAssignment_2(), "rule__MyDsl__TablesAssignment_2");
			builder.put(grammarAccess.getMyDslAccess().getExportAssignment_3(), "rule__MyDsl__ExportAssignment_3");
			builder.put(grammarAccess.getCombinationOperationsAccess().getOperationAssignment_0(), "rule__CombinationOperations__OperationAssignment_0");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTypeAssignment_1(), "rule__CombinationOperations__TypeAssignment_1");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_3(), "rule__CombinationOperations__TableOperationAssignment_3");
			builder.put(grammarAccess.getCombinationOperationsAccess().getTableOperationAssignment_4_1(), "rule__CombinationOperations__TableOperationAssignment_4_1");
			builder.put(grammarAccess.getSourceOperationAccess().getSourceAssignment(), "rule__SourceOperation__SourceAssignment");
			builder.put(grammarAccess.getTransformationTableOperationAccess().getTransformationAssignment_1(), "rule__TransformationTableOperation__TransformationAssignment_1");
			builder.put(grammarAccess.getPipelineTableOperationAccess().getPipelineAssignment(), "rule__PipelineTableOperation__PipelineAssignment");
			builder.put(grammarAccess.getTransformOperationAccess().getSourceAssignment_0(), "rule__TransformOperation__SourceAssignment_0");
			builder.put(grammarAccess.getTransformOperationAccess().getOperationAssignment_1_1(), "rule__TransformOperation__OperationAssignment_1_1");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_0(), "rule__Table__NameAssignment_0");
			builder.put(grammarAccess.getTableAccess().getOperationAssignment_2(), "rule__Table__OperationAssignment_2");
			builder.put(grammarAccess.getXmlTypeAccess().getPathAssignment_2_3(), "rule__XmlType__PathAssignment_2_3");
			builder.put(grammarAccess.getJsonTypeAccess().getPathAssignment_2_3(), "rule__JsonType__PathAssignment_2_3");
			builder.put(grammarAccess.getHtmlTypeAccess().getCssPathAssignment_2_3(), "rule__HtmlType__CssPathAssignment_2_3");
			builder.put(grammarAccess.getOutputTypeAccess().getTypeAssignment(), "rule__OutputType__TypeAssignment");
			builder.put(grammarAccess.getMetaDataAccess().getMetadataAssignment(), "rule__MetaData__MetadataAssignment");
			builder.put(grammarAccess.getSourceStoreAccess().getMetadataAssignment_1(), "rule__SourceStore__MetadataAssignment_1");
			builder.put(grammarAccess.getSourceStoreAccess().getColumnAssignment_3(), "rule__SourceStore__ColumnAssignment_3");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_2(), "rule__SourceCoumnSelect__ColumnAssignment_2");
			builder.put(grammarAccess.getSourceCoumnSelectAccess().getColumnAssignment_3_1(), "rule__SourceCoumnSelect__ColumnAssignment_3_1");
			builder.put(grammarAccess.getSourceAccess().getNameAssignment_0(), "rule__Source__NameAssignment_0");
			builder.put(grammarAccess.getSourceAccess().getQueryAssignment_3(), "rule__Source__QueryAssignment_3");
			builder.put(grammarAccess.getSourceAccess().getFilePathAssignment_5(), "rule__Source__FilePathAssignment_5");
			builder.put(grammarAccess.getSourceAccess().getInputTypeAssignment_6_1(), "rule__Source__InputTypeAssignment_6_1");
			builder.put(grammarAccess.getSourceAccess().getStoreAssignment_7(), "rule__Source__StoreAssignment_7");
			builder.put(grammarAccess.getSourceAccess().getSelectAssignment_8(), "rule__Source__SelectAssignment_8");
			builder.put(grammarAccess.getAppendPathTransformationAccess().getPathAssignment_2(), "rule__AppendPathTransformation__PathAssignment_2");
			builder.put(grammarAccess.getPathTransformationAccess().getColumnAssignment_1(), "rule__PathTransformation__ColumnAssignment_1");
			builder.put(grammarAccess.getPathTransformationAccess().getOperationAssignment_2(), "rule__PathTransformation__OperationAssignment_2");
			builder.put(grammarAccess.getFoldMaxTranformationAccess().getColumnAssignment_1(), "rule__FoldMaxTranformation__ColumnAssignment_1");
			builder.put(grammarAccess.getGroupByAccess().getColumnAssignment_2(), "rule__GroupBy__ColumnAssignment_2");
			builder.put(grammarAccess.getFoldTransformationAccess().getOperationAssignment_0(), "rule__FoldTransformation__OperationAssignment_0");
			builder.put(grammarAccess.getFoldTransformationAccess().getGroupByAssignment_1(), "rule__FoldTransformation__GroupByAssignment_1");
			builder.put(grammarAccess.getAddColumnTransformationAccess().getColumnAssignment_1(), "rule__AddColumnTransformation__ColumnAssignment_1");
			builder.put(grammarAccess.getAddColumnTransformationAccess().getValueAssignment_3(), "rule__AddColumnTransformation__ValueAssignment_3");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_2(), "rule__RemoveColumnTransformation__ColumnAssignment_2");
			builder.put(grammarAccess.getRemoveColumnTransformationAccess().getColumnAssignment_3_1(), "rule__RemoveColumnTransformation__ColumnAssignment_3_1");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getFromAssignment_1(), "rule__RenameColumnTransformation__FromAssignment_1");
			builder.put(grammarAccess.getRenameColumnTransformationAccess().getToAssignment_3(), "rule__RenameColumnTransformation__ToAssignment_3");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_2(), "rule__SelectColumnTransformation__ColumnAssignment_2");
			builder.put(grammarAccess.getSelectColumnTransformationAccess().getColumnAssignment_3_1(), "rule__SelectColumnTransformation__ColumnAssignment_3_1");
			builder.put(grammarAccess.getPipelineAccess().getNameAssignment_0(), "rule__Pipeline__NameAssignment_0");
			builder.put(grammarAccess.getPipelineAccess().getTransformationAssignment_4_0(), "rule__Pipeline__TransformationAssignment_4_0");
			builder.put(grammarAccess.getPipelineAccess().getTransformationAssignment_4_1_1(), "rule__Pipeline__TransformationAssignment_4_1_1");
			builder.put(grammarAccess.getExportAccess().getTableAssignment_1(), "rule__Export__TableAssignment_1");
			builder.put(grammarAccess.getExportAccess().getPathAssignment_3(), "rule__Export__PathAssignment_3");
			builder.put(grammarAccess.getExportAccess().getOutputAssignment_5(), "rule__Export__OutputAssignment_5");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
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

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
