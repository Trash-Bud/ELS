# ELS Project

- Joana Teixeira Mesquita up201907878
- Joaquim Monteiro up201905257
- Pedro Gonçalo Correia up201905348

For this project, you need to [install Gradle](https://gradle.org/install/)

## Compile and Running

To compile and install the program, run ``gradle installDist``. This will compile your classes and create a launcher script in the folder ``build/install/els2023-1/bin``. For convenience, there are two script files, one for Windows (``els2023-1.bat``) and another for Linux (``els2023-1``), in the root of the repository, that call these scripts.

After compilation, tests will be automatically executed, if any test fails, the build stops. If you want to ignore the tests and build the program even if some tests fail, execute Gradle with flags "-x test".

When creating a Java executable, it is necessary to specify which class that contains a ``main()`` method should be entry point of the application. This can be configured in the Gradle script with the property ``mainClassName``, which by default has the value ``pt.up.fe.els2023.Main``.

## Test

### Unit Tests

To test the program, run ``gradle test``. This will execute the build, and run the JUnit tests in the ``test`` folder. If you want to see output printed during the tests, use the flag ``-i`` (i.e., ``gradle test -i``).
You can also see a test report by opening ``build/reports/tests/test/index.html``.

Unit tests are in the ``test/pt.up.fe.els2023`` package.

### Config Manual Tests

The test files in ``test/config`` configuration files for testing. You can execute the program passing those configuration files and then check the results manually.
To run the program using a config file use the `-c` flag.

### Internal DSL Manual Tests

The test files in ``test/internal_dsl`` are manual tests for the internal DSL.
They are not unit tests, because they are not automated.
Each has a ``main()`` method that can be executed to execute the file. The results can then be manually checked.

### Data

The data in ``test/data`` aids tests (both unit and manual). Includes css files, table source files, and assignment-specific files.

## Checkpoint 1

- \[33%] Joana Teixeira Mesquita up201907878
- \[33%] Joaquim Monteiro up201905257
- \[33%] Pedro Gonçalo Correia up201905348

[Click here to access this checkpoint's slides.](https://docs.google.com/presentation/d/1k2ZYd6tHufn4eRzuC2O2qIBgV4vtctDE30UIC1OqshU/edit?usp=sharing)

In this checkpoint, the following requirements from the given use case were identified and implemented:
- Extract data from sources (YAML, JSON, CSV, etc.) (files, folders, etc.)
- Query for one or more specific items (e.g. ‘params’)
- Include filename as column
- Apply transformations (rename, reorder, etc.)
- Export table (CSV, etc.)

However, the chosen solution was designed so that the project could be used in different use-cases, such as different types of files, items to query, or table transformations.

It was also designed with ease of use in mind, with shortcuts (such as globs to facilitate when the number of files is huge; or pipelines; or intermediate table references). All these quality of life features are optional just to make some use-cases less painful, so they can be ignored by beginners when not needed.

The main class responsible for the logic of the program is ``TableExtractor``, which takes a ``Config`` as input and processes the tables and sources needed to produce the outputs.

The configuration file has four main fields:
- ``sources``: the source of the data, which can be a file, a folder, or a glob. If it is a folder, all files in the folder will be read.
- ``pipelines``: a reusable list of transformations that can be applied to a table.
- ``tables``: the tables to be generated, specified by the operations required to generate them.
- ``output``: the output file, where the tables will be written.

This separates the flow into three main phases: Extraction (of ``sources``), Processing (of ``tables`` with aid of ``pipelines``), and Export (to ``output``).

In the semantic model, configuration classes have their fields public. This is so that it can integrate with the JSON parser library being used.

### Sources

Declares the sources, each with a unique identifier. The params are:

- ``path``: the path to the source. Can be a file, a folder, or a glob. Each match becomes a row in the table.
- ``format``: the format of the source. Can be ``yaml``, ``json``, ``csv``, or ``auto``. Defaults to ``auto``, which guesses the format from the filename.
- ``query``: the items to query from the source. The query can find a nested item (e.g. ``params.name``, or ``elements.2.params``).
- ``store_filepath``: the name of the column that will store the file path. This is defined at the source level, because this is the only stage where filenames make sense (in later stages, tables are manipulated rather than sources).
- ``columns``: the columns to be included in the table (and their order). If not specified, all columns will be included. This could also be done via a transformation, but it is more intuitive for the user to explicitly specify what they want to extract at the extraction level.

### Pipelines

Declares the pipelines, each with a unique identifier. A pipeline is a list of transformations. Each transformation has a name and some parameters that depend on the transformation. Some available transformations are:
- ``add_column (column, value)``: adds a column with the given default value.
- ``remove_column (column)``: removes a column.
- ``rename_column (from, to)``: renames a column.
- ``select_column (columns)``: selects the given columns by the given order.

### Tables

Declares the tables, each with a unique identifier. Each table is specified by its operations, which are:
- ``selection (source)``: extracts the data from the given source.
- ``pipeline (pipeline, table)``: applies the given pipeline to the table.
- ``transforamtion (transformation, table)``: applies the given transformation to the table. This operation still exists so that beginners may ignore Pipelines if they don't understand them, or when just a single transformation is being used once so it may be inlined.
- ``combination (mode, tables...)``: combines the given tables into a single table. The mode may be disjunction (the columns have to appear in at least one table) or conjunction (the columns have to appear in all tables).

This approach causes nesting, which may hinder readability. However, there are some reasons this is preferred:
- The nesting can be reduced with pipelines, and also with intermediate tables;
- The nesting allows for more flexibility, allowing for more complex combination of operations and flows;
- In the future, when an external DSL is implemented, this issue can be addressed.

An intermediate table is when a table is declared, and then used in one or more other tables (by specifying its name). This may reduce duplication and improve readability, but it's optional, so beginners can ignore it.

Pipeline has been chosen to be a different operation from transformation (instead of being a subclass of transformation) for two reasons. First, to avoid pipelines being nested in the pipelines declaration (which cannot happen if they aren't themselves transformations). Second, although this could seem to make it simpler at first glance, it actually makes the logic to resolve the pipeline from its name much more complex, given that the Pipeline object in the semantic model will be stored as a generic Transformation.

In the semantic model, a decision was made that references to sources, pipelines and tables that are strings in the configuration will still be strings in the semantic model. ``TableProcessor`` is used to resolve these references, and the result is a ``Table`` object. This is done due to being easier to integrate with the JSON parser being used to parse the configuration file.

### Outputs

Declares the list of outputs. Each output has:
- ``table``: the name of the table to be exported.
- ``path``: the path of the output file.
- ``format``: the format of the output. Can be ``csv`` or ``auto``. Defaults to ``auto``, which guesses the format from the filename.

## Checkpoint 2

- \[33%] Joana Teixeira Mesquita up201907878
- \[33%] Joaquim Monteiro up201905257
- \[33%] Pedro Gonçalo Correia up201905348

[Click here to access this checkpoint's slides.](https://docs.google.com/presentation/d/1O-ImCA4C03-HZfsimEutosjuj6eEAiQhWHuRzrqCX-I/edit?usp=sharing)

In this checkpoint, in order to implement the use case given, the following had to be implemented:
- New table operation (merge)
- New output format (HTML)
- New input format (XML) with query capabilities
- New transformations (foldMax, appendPath, canonicalizePath, getNameFromPath)

With these new additions and previous features, it was possible to fulfill Bob's needs.

Besides the new input and output formats, the new transformations allowed to get the row of a table with the maximum value on a given column (foldMax) and to manipulate paths in order to get the folder name (appendPath, canonicalizePath, getNameFromPath).
The merge operator joined every table into a single table with a single row.

However, once again, the chosen solution was designed so that the project could be used in different use-cases.
In particular, we noted that, given Bob's current use case, it wouldn't be long until he had reports of different runs that he wanted to join in a single table with many rows.
Our solution also takes this possibility into account, by adding a groupBy feature similar to SQL's in the foldMax transformation, which only folds groups of rows with the same value on a given column.

We also took attention to the ease of use and readability, and tried to make a fluent internal DSL where it made sense.

### Code structure

A significant refactor from the previous checkpoint is the decoupling of the configuration file parsing from the semantic model.
In fact, our new structure includes three main packages:
- config (code relating to parsing the configuration file and producing a semantic model from it)
- dsl.internal (code relating to implementing the internal DSL and producing a semantic model from it)
- model (code relating to the semantic model itself)

While the first two each depend on the model, the model does not depend on any of the other packages.

The main representation of the semantic model is an ``Iterable<OutputProcessor>``, representing all the outputs to process. An instance of
``TableExtractor`` can be constructed from that representation, and then used to process all the outputs.
This class also includes static shortcut methods that process a config object (``Config``) or an internal DSL object (list of ``OutputBuilder``) directly (by converting them to the semantic model first), just for convenience.

### Model

The model is represented by an ``Iterable<OutputProcessor>``, where each processor is responsible for writing one table to one file.
Each ``OutputProcessor`` contains a ``TableWriter``, capable of writing a ``Table`` to a file, and a ``TableOperation``, capable of producing a ``Table``.

Some ``TableWriter``s may have additional format-specific parameters for customization. For example, ``HtmlTableWriter`` as a parameter that specifies the path to a css file.

There are five ``TableOperation``s. The first four are already known, although "CombineOperation" has been renamed to `AppendOperation` to make its purpose clearer.
The new one is ``MergeOperation``, which merges all the tables into a single table with a single row. While ``AppendOperation`` combines tables vertically, appending rows, ``MergeOperation`` combines tables horizontally, joining columns.
``MergeOperation`` also includes three modes, ``Exact``, ``Union`` and ``Intersection``. The first is the default and forces the tables to have a one-to-one correspondence of rows. The second will include unmatched rows with empty values. The third will only include rows that are present in all tables.

Just like in the previous checkpoint, ``TableOperation`` includes a cache of ``Table``s, so that the same table is not computed twice.

The four new transformations implemented are:
- ``FoldMaxTransformation``: folds a table into a single row, selecting the row where the value of a given column is the maximum value of that column in the table. Includes a ``groupBy`` parameter, which is a list of columns. If specified, the table is first grouped by the given column, and then the maximum value is computed for each group, resulting in one row per group.
- ``AppendPathTransformation``: appends a path-valued column with another path
- ``CanonicalizePathTransformation``: canonicalizes a path-valued column
- ``GetNameFromPathTransformation``: gets the name (last path component) of a path-valued column

The ``SelectionOperation`` requires a ``SourceProcessor``, which includes a ``SourceReader`` to read a file in a given format, the path to read, optionally the columns to include (and their order), and additional columns to insert metadata from the file.
Just like ``TableOperation``, ``SourceProcessor`` includes a cache of ``Tables`` for the same reason. Some ``SourceReader``s may have additional format-specific parameters. For example, ``XmlSourceReader`` has a ``query`` parameter, which is an XPath query to select the items to include in the table.
The ``JsonSourceReader`` and ``YamlSourceReader`` (which share their implementations through the abstract class ``GenericJsonReader``) also have a ``query`` parameter, which separates property and array index accesses with dots.
``SourceStoreMetadata`` includes fields which, when not null, specify the column to store metadata from the file in the table, such as the filepath. This is a change from the previous checkpoint, since the metadata fields are now encapsulated in their own class.

### Config

The configuration package includes classes with Jackson annotations, which are used to parse the configuration file into a semantic model.

We decided to include the ``Cfg`` prefix in some of the config classes to distinguish from analogous classes from other packages.
Even though they are in different packages, having different names makes it less problematic when the two classes appear in the same file, and makes the IDE experience more convenient.

Given that the configuration file for this checkpoint was optional and not the focus, we decided to put more attention in the other components of the project.

#### Changes from Assignment 1

The `combination` operation was renamed to `append` to make its purpose more clear and distinguish from the new `merge` operation.

The attribute `store_filename` was removed from the source definition, and replaced by a new `store_in_columns` object that can place more types of metadata in the table. For example:

```json
    "store_in_columns": {
        "path": "Path",
        "modification_date": "Date"
    }
```

In this example, the path of the file is stored in the "Path" column, and it's modification date is stored in the "Date" column.

### Internal DSL

The Internal DSL was designed with the fluent builder pattern in mind, as well as static methods.

Variadic methods exist for convenience reasons, but they are just shortcuts for calling ``List``-based methods.

Due to the decoupling of the dsl from the model, the classes may appear somewhat duplicated. Some cases even feature a Middle Man code smell,
with just a constructor and a method to construct another class with the same parameters. However, this is necessary
to simultaneously keep the decoupling of dependencies, the interfaces of abstract classes, and allow adding
configuration methods specific to that class in the future.

The structure for each component (output, source, table, transformation) is very similar:
- An abstract builder class representing that component and including the methods to configure what should be common to all subclasses.
- A class to aggregate static methods that build concrete classes of that component.
- Concrete classes for each type of this component, with a package-private constructor (so it can be accessed by the static methods but not by the end user) and additional configuration methods specific to that type. Configuration methods of the superclass are sometimes overridden just to make the return type more specific (for the fluent builder pattern), but still just calling the super method.

In the case of ``Output``, it builds an ``OutputBuilder`` for the specific format corresponding to the name of the function.
There is also ``Output.auto()`` which infers the format from the filename. In order to use format-specific configurations (such as css files in an ``HtmlOutputBuilder``),
the ``Output.auto()`` cannot be used. This could be changed in a future version, by including every possible configuration method in ``AutoOutputBuilder``, and only
applying them when it made sense, however we reached the conclusion that this extra complexity would not be worth it.
In fact, it would clutter the API of ``AutoOutputBuilder`` and include methods that could be wrong in certain contexts.
If the format-specific options are going to be used, this means that the format should be known, and therefore the specific builder should be used instead.

The reasoning in the previous paragraph can also be applied analogously to ``Source``. Moreover, the ``YamlSourceBuilder``, ``JsonSourceBuilder``, and ``XmlSourceBuilder`` all accept a ``query`` method, but the queries are written in the respective format,
as described in the Model section. There are two possible alternatives for this: one would be using the same query format for all files, and the other would be having different names for different formats.
While those possibilities would have the advantage of reducing possible mistakes due to mixing up the query formats,
we think that the first would not be suitable since the query format should be suited for the file format; the second
would make it less clear that those two methods are fundamentally the same concept, forcing the user to memorize different names
for the same thing in different formats. This means that it would only make sense to change the names if the users
actually mistook the query formats very frequently in the current approach, which we believe will not be the case, since the
user will be thinking in the format that they are using.

There can only be one ``query`` per source, to avoid issues of repeated columns in the same source, and of how to combine the queries. The same file with two
different queries is considered two different sources, which can then be combined with a ``merge`` or ``append``.

``SourceBuilder``s also include a ``store()`` method to store metadata from the file in a table column. The metadata to store is specified by the enumeration ``Metadata``.

The ``Table`` class includes static methods for some of the table operations. We decided not to include a ``transform`` static method,
because we think that a method chain better suits this operation (apply a transformation/pipeline on a table by chaining a ``transform`` method on the table). However, we did include ``merge`` and ``append`` static methods, because
even though they can also be chained, sometimes it is not clear that one table is more "important" than the others and in
those cases it is more intuitive to have a static method treating every table equally.

We decided not to include a chain method from sources to tables and from tables to outputs because we think that this way
is clearer. If a method chain existed, it would change the context from one component to a completely unrelated one, completely
changing the state and operations available. We consider that it is more intuitive to mark the different contexts by not having them
chained, and instead accepting a source as the argument of ``Table.from``, and a table operation as the argument of ``Output`` methods.

For transformations, besides the ``Transformation`` class for creating transformations, the ``Pipeline``'s static
methods can be used to create pipelines of transformations. Instead of a pipeline, the transform method could simply
accept a list/variadic of transformations, however we think that using a pipeline promotes a clearer code, encouraging the user
to group the transformations that are related to each other in a pipeline and separate them from the table operations.
In the future, we could also include ``Pipeline`` methods to add even more transformations to an existing pipeline (or merge pipelines),
however we don't think this would be useful for most cases, so for now we don't think that making the interface more complex is worth it.

To group the outputs without actually processing them, the ``Outputs`` class includes a ``compile`` method that accepts
``OutputBuilder``s and returns an ``Iterable<OutputProcessor>``. This is useful if the user wants to pass the model to another
function or part of the code, instead of processing the outputs immediately.

## Checkpoint 3

- \[33%] Joana Teixeira Mesquita up201907878
- \[33%] Joaquim Monteiro up201905257
- \[33%] Pedro Gonçalo Correia up201905348

[Click here to access this checkpoint's slides.](https://docs.google.com/presentation/d/1ZilRPt2vJxRgW5QPw6Nd7posHfaSAV6dohBlBFYkdyQ/edit?usp=sharing)

In this checkpoint, in order to implement the use case given, the following transformations had to be
implemented: FoldAverage, FoldSum, RenameRegex, Select, Sort, and SetValue.

With these new additions and previous features, it was possible to fulfill Cal's needs. We implicitly support types
due to the FoldAverage, FoldSum, and Sort operations: a column can be numeric (i.e. all values can be parsed as a
double-precision floating-point) or textual (otherwise).

Additionally, we added support for JSONPath queries and separated the fields for XPath, JSONPath and native queries.
We implemented an external DSL with Xtext for our project, which we designed to be easy to use and read. To keep concerns
separated, as we did in the previous Checkpoint, the external DSL creates a model, and the model doesn't depend on the
external DSL.

### Running

The use cases from the previous two assignments were also implemented as a `.te` file in the language of the external DSL.

To run the code of the respective assignment:
- **Assignment 1**: `gradle run --args="-i test/external_dsl/assignment1/AssignmentAdvanced.te"`
- **Assignment 2**: `gradle run --args="-i test/external_dsl/assignment2/AssignmentBasic.te"`
- **Assignment 3**: `gradle run --args="-i test/external_dsl/assignment3/AssignmentBasic.te"`

### New Transformations

#### Select and Sort

In order to be able to get the top 3 functions, like required, using a general solution that can be used in other use-cases,
we removed the FoldMax transformation in favor of the Select and Sort transformations. This is because the FoldMax operation
could only get the top 1 function, and the Select and Sort transformations can be more flexible when used together.

The sort transformation can sort by one or more columns in ascending or descending order. In case of multiple columns,
it prioritizes the columns that appear first in the list and only uses the following columns as a tie-breaker. The comparison
is done numerically if the column is numeric, and lexicographically otherwise.

The select transformation selects the top N rows of the table, with an optional offset. Similar to the removed transformation
FoldMax, it includes it can be grouped by a column, and the top N rows are selected for each group (a group is a set of rows
that have the same value in the column grouped by).

This means we can order the table by the time percentage in descending order, and then select:
- 1 row
- 1 row with offset 1
- 1 row with offset 2
Into three different tables. By grouping by folder, it handles every folder at once. We then rename their columns accordingly
and merge them together.

#### FoldAverage and FoldSum

In order to get the average and sum of the numeric columns, the FoldAverage and FoldSum transformations can be used.
They fold the entire table into one row (or one row per group, if grouped by a column), where the value of each numeric column
is the average or sum of the values of that column in the table/group, respectively. Other columns are left empty.

#### RenameRegex

Besides plainly renaming a column into another column, it is now also possible to rename a column using a regular expression.

The syntax is similar to Visual Studio Code's find and replace, where the first argument is the regular expression,
and the second argument can use capture groups from the regular expression. For example `(?!execution)` matches every
string that is not "execution", while `$0 (Dynamic)` captures the entire string and appends " (Dynamic)" to it. `$1`, `$2`, etc.
can be used to refer to capture groups.

#### SetValue

In order to name the average and sum rows of the table, an operation to set the value of a cell was added.

This operation accepts the value to be used and, optionally, the row and columns to set the value in. If the row isn't specified,
it is applied to all rows. If the column isn't specified, it is applied to all columns.

### Queries

We refactored the querying mechanism to make it more uniform and less confusing to the end user. Instead of having
a single query field, we now have three possibilities: ``xpathQuery``, ``jsonpathQuery`` and ``query``. Only one of them can be specified
at a time. While ``query`` is the favored one, which uses the syntax we defined as standard, the others are present for
users that are already familiar with XPath or JSONPath or need an obscure feature not supported by the native query mechanism.

#### Native Queries

This is the default querying mechanism, which uses the syntax we defined as standard and idiomatic in our DSL.

In this mechanism, the query is a list of property accesses separated by dots. Each property access can be a property name
or an array index. For example, `params.name` accesses the property `name` of the object `params`, while `elements.2.params`
accesses the property `params` of the third element of the array `elements`.

This mechanism could be extended in the future with more complex features, such as globs. However, we did not prioritize
such features as they weren't fundamental for the current use cases, and can be used with JSONPath or XPath if really needed.
Moreover, querying was not the  focus of this checkpoint.

#### JSONPath

JSONPath can only be used with JSON files. Its specification can be found [here](https://www.ietf.org/archive/id/draft-goessner-dispatch-jsonpath-00.html).

#### XPath

XPath can only be used with XML files. Its specification can be found [here](https://www.w3.org/TR/xpath-31/).

### External DSL

There are two types of statements in the DSL: assignments and export statements.

#### Assignment Statement

Assignments assign a pipeline or table to an identifier. They can be used to reuse pipelines and intermediate tables.

```
VARIABLE = (TABLE | PIPELINE);
```

A pipeline can be assigned like this:

```
examplePip = pipe [
    ...
];
```

Note the pipe keyword, followed by a list of transformations. A table can be assigned with any table operation, for example
the operation to import a source:

```
tableFromSrc = import from "example.json";
```

#### Export Statement

Export statements export a table to a file. Their syntax is as follows:

```
export TABLE to PATH [as FILEFORMAT];
```

Where TABLE can be an identifier to a table or a table operation inlined in the export statement; PATH is the path to the file
to be written; and FILEFORMAT is the format of the file to be written. If FILEFORMAT is not specified, it is inferred from the
file extension.

Some file formats have additional parameters that are specified as key-value pairs in curly braces. For example, the HTML format
has a ``css`` parameter that specifies the path to a CSS file to be used in the HTML file.

```
export myTable to "myTable.html" as html {
    css = "style.css",
};
```

#### Table Operations

A table can be created by importing from a source:

```
import [QUERY]
    from PATH [as FILEFORMAT]
    [store METADATA in COLUMN]*
    [select COLUMNS]
```

Where QUERY is the query to be used (in native query syntax) to extract data from the source; PATH is the path to the
file to be read; FILEFORMAT is the format of the file to be read, and if not specified is inferred from the file extension.
The ``store`` statements store metadata from the file into a column of the table, such as the filepath or the last modified date.
METADATA can be ``filepath`` or ``lastmodified``.
The ``select`` statement selects the columns to be included in the table, and their order. If not specified, all columns are included.
COLUMNS is a list enclosed by square brackets.

Some fileformats have additional parameters that are specified as key-value pairs in curly braces. For example, the JSON format
has a ``jsonpath`` parameter that specifies the JSONPath query to be used to extract data from the file. Note that this is
incompatible with the ``QUERY``, which is used for the native query syntax.

```
import
    from "example.json" as json {
        jsonpath = "$.elements[3].params",
    }
    store filepath in "file path"
    store lastmodified in "last modified"
    select ["name", "time", "file path", "last modified"]
```

A table can be also created by merging or appending other tables:

```
merge [union | intersection] TABLES
append [union | intersection] TABLES
```

Where TABLES is a list of tables to be merged or appended, enclosed by square brakets. If ``union`` nor ``intersection`` are specified, exact mode is
assumed. For example:

```
merge [
    table1,
    table2,
    (import from "example.json"),
]
```

Note that imports must have parenthesis when inlined in a table operation for better readability.

Finally, a table can be created by applying a pipeline or transformation to another table.

```
TABLE apply (TRANSFORMATION | PIPELINE)
```

For example:

```
initialTable apply myPipeline
initialTable apply pipe [ ... ]
unorderedTable apply (sort by "column")
```

Note that inlined transformations require parenthesis. This decision was made for better readability.

#### Transformations

The syntax of the transformations available in the DSL is as follows:

```
append path PATH at COLUMN
name of path at COLUMN
canonicalize path at COLUMN
fold average [group by COLUMN]
fold sum [group by COLUMN]
add COLUMN [with VALUE]
remove (COLUMN | COLUMNS)
select (COLUMN | COLUMNS)
rename [regex] COLUMN to COLUMN
round (COLUMN | COLUMNS) [digits DIGITS]
set VALUE [at COLUMN] [at ROW]
select AMOUNT [skip OFFSET] [group by COLUMN]
sort by (COLUMN | COLUMNS) [ascending | descending]
```

For example:

```
pipelineWithEveryTransformation = pipe [
    append path "../.." at "path column",
    canonicalize path at "path column",
    name of path at "path column",
    fold average group by "group",
    fold sum group by "group",
    add "ZeroColumn" with "0",
    remove ["ZeroColumn", "path column"],
    rename "group" to "class",
    rename regex "if (.*) then (.*)" to "$1 -> $2",
    select "OnlyColumnThatMatters",
    round "ugly numbers" digits 2,
    set "some value" at "A" at 1,
    select 1 skip 2 group by "group",
    sort by "score" ascending,
];
```

#### Limitations

Due to limitations of Xtext and the tradeoffs of time spent vs actual value added to the user, the following syntax features
are not supported:
- Redundant parenthesis (in particular, nested parenthesis) that don't make the code more readable, as they are not needed and are difficult to parse with Xtext taking recursion into account.
- Contextual keywords. They don't seem to be easily supported by Xtext. Unfortunately, this means a lot of keywords were reserved, for example due to the transformations. However, this won't affect the user if certain conventions for naming variables are followed (e.g. capitalize first or all letters; append a suffix for tables and another for pipes). These conventions might even have the bonus effect of making the code more easy to understand.
