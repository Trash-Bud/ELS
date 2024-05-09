package pt.up.fe.els2023.model.source;

import pt.up.fe.els2023.model.Table;
import pt.up.fe.els2023.model.source.reader.SourceReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.SystemUtils;

public class SourceProcessor {
    private Table cache;
    private final String path;
    private final SourceStoreMetadata metadata;
    private final List<String> columns;
    private final SourceReader reader;

    public SourceProcessor(String path, SourceStoreMetadata metadata, List<String> columns, SourceReader reader) {
        this.path = path;
        this.metadata = metadata;
        this.columns = columns;
        this.reader = reader;
        this.cache = null;
    }

    public Table cachedProcess() {
        if (cache == null) {
            cache = this.process();
        }
        return cache;
    }

    public Table process() {
        List<Table> tables = new ArrayList<>();

        try {
            for (var filepath: resolvePath(path)) {
                tables.add(this.processFile(filepath.toFile()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (this.columns == null) {
            return Table.combine(tables);
        } else {
            return Table.combine(this.columns, tables);
        }
    }

    private Table processFile(File file) throws IOException {
        var table = this.reader.read(file);
        this.metadata.store(file, table);
        return table;
    }

    private static List<Path> resolvePath(String path) throws IOException {
        if (path.contains("*")) {
            return resolveGlobPath(path);
        } else {
            File file = new File(path);
            if (!file.isDirectory()) {
                return List.of(file.toPath());
            }

            var subfiles = file.listFiles();
            List<Path> filePaths = new ArrayList<>();
            if (subfiles != null) {
                for (var subfile: subfiles) {
                    if (subfile.isFile()) {
                        filePaths.add(subfile.toPath());
                    }
                }
            }

            return filePaths;
        }
    }

    private static List<Path> resolveGlobPath(String pathWithGlob) throws IOException {
        String[] parts;
        if (SystemUtils.IS_OS_WINDOWS) {
            parts = pathWithGlob.split("[/\\\\]");
        } else {
            parts = pathWithGlob.split("/");
        }

        Path first;
        if (SystemUtils.IS_OS_WINDOWS && parts[0].contains("*")) {
            first = Paths.get(".");
        } else {
            first = Paths.get(parts[0] + "/");
        }

        List<String> partsList;
        if (!first.isAbsolute()) {
            first = Paths.get(".");
            partsList = Arrays.stream(parts).filter(p -> !p.isEmpty()).toList();
        } else {
            partsList = Arrays.stream(parts).skip(1).filter(p -> !p.isEmpty()).toList();
        }

        return resolveGlob(first, partsList);
    }

    private static List<Path> resolveGlob(Path path, List<String> parts) throws IOException {
        if (parts.isEmpty()) {
            return List.of(path);
        }
        var nextGlob = parts.getFirst();
        var nextParts = parts.stream().skip(1).toList();

        List<Path> collectedPaths = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, nextGlob)) {
            for (Path entry : stream) {
                collectedPaths.addAll(resolveGlob(entry, nextParts));
            }
        } catch (NotDirectoryException ignored) {

        }

        return collectedPaths;
    }
}
