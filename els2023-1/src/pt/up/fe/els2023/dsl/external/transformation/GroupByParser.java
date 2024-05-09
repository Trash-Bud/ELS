package pt.up.fe.els2023.dsl.external.transformation;

import pt.up.fe.els2023.externalDsl.GroupBy;
public class GroupByParser {

    public static String parse(GroupBy groupBy) {

        if (groupBy != null){
            return groupBy.getColumn();
        }else{
            return null;
        }
    }
}
