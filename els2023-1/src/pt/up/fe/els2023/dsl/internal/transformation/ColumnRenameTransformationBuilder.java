package pt.up.fe.els2023.dsl.internal.transformation;

import pt.up.fe.els2023.model.transformation.column.RegexRenameColumnsTransformationApplier;
import pt.up.fe.els2023.model.transformation.column.RenameColumnTransformationApplier;
import pt.up.fe.els2023.model.transformation.TransformationApplier;

public final class ColumnRenameTransformationBuilder implements TransformationBuilder {
    private final String from;
    private final String to;
    private Mode mode;

    private enum Mode {
        Default,
        Regex
    }

    ColumnRenameTransformationBuilder(String from, String to) {
        this.from = from;
        this.to = to;
        this.mode = Mode.Default;
    }

    public ColumnRenameTransformationBuilder regex() {
        this.mode = Mode.Regex;
        return this;
    }

    @Override
    public TransformationApplier build() {
        if (mode == Mode.Default) {
            return new RenameColumnTransformationApplier(from, to);
        } else {
            return new RegexRenameColumnsTransformationApplier(from, to);
        }
    }
}
