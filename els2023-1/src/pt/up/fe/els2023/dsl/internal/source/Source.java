package pt.up.fe.els2023.dsl.internal.source;

public class Source {
    private Source() {}

    public static AutoSourceBuilder auto(String path) {
        return new AutoSourceBuilder(path);
    }

    public static CsvSourceBuilder csv(String path) {
        return new CsvSourceBuilder(path);
    }

    public static YamlSourceBuilder yaml(String path) {
        return new YamlSourceBuilder(path);
    }

    public static JsonSourceBuilder json(String path) {
        return new JsonSourceBuilder(path);
    }

    public static XmlSourceBuilder xml(String path) {
        return new XmlSourceBuilder(path);
    }
}
