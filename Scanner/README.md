# Understanding and Using the 'Scanner' Directory in the 'LitScript' Project

## Overview of the 'Scanner' Directory

The `Scanner` directory of your `LitScript` project is structured to facilitate the development and testing of a lexical scanner, a tool that analyzes text (like code) and breaks it into meaningful parts (tokens).

### Directory Structure

```
LitScript/
└── Scanner/
    ├── src/
    │   ├── main/
    │   │   ├── java/
    │   │   │   ├── j0.java        # Main class for scanner operations
    │   │   │   ├── parser.java    # Helper class with token type definitions
    │   │   │   ├── token.java     # Class defining a token's structure
    │   │   │   └── Yylex.java     # Scanner class generated by JFlex
    │   ├── lex/
    │   │   └── javalex.l          # JFlex specification file
    ├── examples/
    │   └── sample.java            # Sample Java file for testing the scanner
    └── out/
        ├── j0.class              # Compiled bytecode of j0.java
        ├── parser.class          # Compiled bytecode of parser.java
        ├── token.class           # Compiled bytecode of token.java
        └── Yylex.class           # Compiled bytecode of Yylex.java
```

## Step 1: Generating the Yylex.java File

- **Location**: Navigate to the `Scanner/src/lex` directory.
- **Command**: Use JFlex to generate the `Yylex.java` file from your lex specification (`javalex.l`).
- **Shell Command**:

  ```shell
  cd LitScript/Scanner/src/lex
  jflex javalex.l
  ```

  This command will generate `Yylex.java` in the `Scanner/src/main/java` directory.

## Step 2: Compiling Java Source Files to Create Class Files

- **Location**: Navigate to the `Scanner/src/main/java` directory.
- **Command**: Compile the Java files to create the `.class` files in the `Scanner/out` directory.
- **Shell Command**:

  ```shell
  cd LitScript/Scanner/src/main/java
  javac -d ../../out j0.java parser.java token.java Yylex.java
  ```

  This command compiles all Java files and places the resulting `.class` files in the `Scanner/out` directory.

## Step 3: Running the Scanner with a Sample File

- **Location**: Navigate to the `Scanner/out` directory where the `.class` files are located.
- **Command**: Run the `j0` class with `sample.java` as input to see the token output.
- **Shell Command**:

  ```shell
  cd LitScript/Scanner/out
  java j0 ../examples/sample.java
  ```

  This command executes the `j0` class, which uses the scanner to process the `sample.java` file and outputs the tokens identified by the scanner.

## Conclusion

By following these steps, you can generate, compile, and run a scanner for your `LitScript` project. This scanner will analyze the provided Java-like input (`sample.java`) and output the tokens it recognizes based on the rules defined in your JFlex specification (`javalex.l`).
