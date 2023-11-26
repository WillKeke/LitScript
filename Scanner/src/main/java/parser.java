/**
 * The parser class acts as a stand-in for a parser object, defining terminal symbols.
 * Each constant represents a unique token type or terminal symbol used by the scanner and parser.
 * The values are chosen to be above 256 to avoid conflicts with ASCII character codes,
 * ensuring distinct categorization for each token type.
 */

public class parser {
    // Constants representing different token types
    public final static short BREAK = 257; // 'break' keyword
    public final static short PUBLIC = 258; // 'public' keyword
    public final static short DOUBLE = 259; // 'double' keyword
    public final static short ELSE = 260; // 'else' keyword
    public final static short FOR = 261; // 'for' keyword
    public final static short IF = 262; // 'if' keyword
    public final static short INT = 263; // 'int' keyword
    public final static short RETURN = 264; // 'return' keyword
    public final static short VOID = 265; // 'void' keyword
    public final static short WHILE = 266; // 'while' keyword
    public final static short IDENTIFIER = 267; // Identifier token
    public final static short CLASSNAME = 268; // 'classname' token
    public final static short CLASS = 269; // 'class' keyword
    public final static short STATIC = 270; // 'static' keyword
    public final static short STRING = 273; // 'string' keyword
    public final static short BOOL = 274; // 'bool' keyword
    public final static short INTLIT = 275; // Integer literal
    public final static short DOUBLELIT = 276; // Double literal
    public final static short STRINGLIT = 277; // String literal
    public final static short BOOLLIT = 278; // Boolean literal (true/false)
    public final static short NULLVAL = 280; // 'null' value
    public final static short LESSTHANOREQUAL = 298; // '<=' operator
    public final static short GREATERTHANOREQUAL = 300; // '>=' operator
    public final static short ISEQUALTO = 301; // '==' operator
    public final static short NOTEQUALTO = 302; // '!=' operator
    public final static short LOGICALAND = 303; // '&&' operator
    public final static short LOGICALOR = 304; // '||' operator
    public final static short INCREMENT = 306; // '+=' operator
    public final static short DECREMENT = 307; // '-=' operator
    public final static short YYERRCODE = 256; // Error code constant
}
