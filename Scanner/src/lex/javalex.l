%%
%int
id=([a-zA-Z_][a-zA-Z0-9_]*)
%%
"/*"([^*]|"*"+[^/*])*"*"+"/" { j0.comment(); }
"//".*\r?\n                  { j0.comment(); }
[ \t\r\f]+                   { j0.whitespace(); }
\n                           { j0.newline(); }
"split"                { return j0.scan(parser.BREAK); }
"break"                { return j0.scan(parser.BREAK); }
"dub"                  { return j0.scan(parser.DOUBLE); }
"double"               { return j0.scan(parser.DOUBLE); } 
"otherwise"            { return j0.scan(parser.ELSE); }
"else"                 { return j0.scan(parser.ELSE); }
"cap"                  { return j0.scan(parser.BOOLLIT); }
"false"                  { return j0.scan(parser.BOOLLIT); }
"spin"                 { return j0.scan(parser.FOR); }
"for"                 { return j0.scan(parser.FOR); }
"if"                   { return j0.scan(parser.IF); }
"num"                  { return j0.scan(parser.INT); }
"int"                  { return j0.scan(parser.INT); }
"nada"                 { return j0.scan(parser.NULLVAL); }
"null"                 { return j0.scan(parser.NULLVAL); }
"public"               { return j0.scan(parser.PUBLIC); }
"spit"                 { return j0.scan(parser.RETURN); }
"return"                 { return j0.scan(parser.RETURN); }
"static"               { return j0.scan(parser.STATIC); }
"verse"               { return j0.scan(parser.STRING); }
"string"               { return j0.scan(parser.STRING); }
"nocap"                { return j0.scan(parser.BOOLLIT); }
"true"                { return j0.scan(parser.BOOLLIT); }
"bool"                 { return j0.scan(parser.BOOL); }
"empty"                { return j0.scan(parser.VOID); }
"void"                { return j0.scan(parser.VOID); }
"while"                { return j0.scan(parser.WHILE); }
"blueprint"            { return j0.scan(parser.CLASS); }
"class"            { return j0.scan(parser.CLASS); }
"("                    { return j0.scan(j0.ord("("));}
")"                    { return j0.scan(j0.ord(")"));}
"["                    { return j0.scan(j0.ord("["));}
"]"                    { return j0.scan(j0.ord("]"));}
"{"                    { return j0.scan(j0.ord("{"));}
"}"                    { return j0.scan(j0.ord("}"));}
";"                    { return j0.scan(j0.ord(";"));}
":"                    { return j0.scan(j0.ord(":"));}
"!"                    { return j0.scan(j0.ord("!"));}
"*"                    { return j0.scan(j0.ord("*"));}
"/"                    { return j0.scan(j0.ord("/"));}
"%"                    { return j0.scan(j0.ord("%"));}
"+"                    { return j0.scan(j0.ord("+"));}
"-"                    { return j0.scan(j0.ord("-"));}
"<"                    { return j0.scan(j0.ord("<"));}
"<="                   { return j0.scan(parser.LESSTHANOREQUAL);}
">"                    { return j0.scan(j0.ord(">"));}
">="                   { return j0.scan(parser.GREATERTHANOREQUAL);}
"=="                   { return j0.scan(parser.ISEQUALTO);}
"is"                   { return j0.scan(parser.ISEQUALTO);}
"equals"               { return j0.scan(parser.ISEQUALTO);}
"!="                   { return j0.scan(parser.NOTEQUALTO);}
"isnt"                 { return j0.scan(parser.NOTEQUALTO);}
"&&"                   { return j0.scan(parser.LOGICALAND);}
"and"                  { return j0.scan(parser.LOGICALAND);}
"||"                   { return j0.scan(parser.LOGICALOR);}
"or"                   { return j0.scan(parser.LOGICALOR);}
"="                    { return j0.scan(j0.ord("=")); }
"+="                   { return j0.scan(parser.INCREMENT); }
"-="                   { return j0.scan(parser.DECREMENT); }
","                    { return j0.scan(j0.ord(",")); }
"."                    { return j0.scan(j0.ord(".")); }
{id}                   { return j0.scan(parser.IDENTIFIER); }
[0-9]+                 { return j0.scan(parser.INTLIT); }
[0-9]*"."[0-9]*([eE][+-]?[0-9]+)? { return j0.scan(parser.DOUBLELIT); }
([0-9]+)([eE][+-]?([0-9]+))  { return j0.scan(parser.DOUBLELIT); }
\"[^\"]*\"     { return j0.scan(parser.STRINGLIT); }
.              { j0.lexErr("unrecognized character"); }
