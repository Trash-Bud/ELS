package pt.up.fe.els2023.model.transformation.column;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public class RegexRenameColumnsTransformationApplier implements TransformationApplier {
    private final String regex;
    private final String replacement;

    public RegexRenameColumnsTransformationApplier(String regex, String replacement) {
        this.regex = regex;
        this.replacement = replacement;
    }

    @Override
    public void apply(Table table) {
        table.renameColumns(regex, replacement);
    }
}
