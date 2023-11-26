/* Overview:
 * The j0 class is the main class for a lexical scanner generated using JFlex for a language like Jzero.
 * This class is responsible for initializing the scanner, processing the input file, and handling tokens.
 * It includes methods for error handling, token processing, and other utilities.
 */

import java.io.FileReader; // Importing FileReader for reading input files

public class j0 {
   static Yylex lex; // Static scanner instance
   public static int yylineno; // Public static variable to keep track of the current line number
   public static token yylval; // Public static variable to hold the current token

   // Main method: Entry point of the scanner
   public static void main(String argv[]) throws Exception {
      lex = new Yylex(new FileReader(argv[0])); // Initializing the scanner with the input file
      yylineno = 1; // Starting line number at 1
      int i; // Variable to hold the token type returned by yylex()
      while ((i=lex.yylex()) != Yylex.YYEOF) { // Looping until the end of file
         System.out.println("token " + i + ": " + yytext()); // Printing each token and its text
      }
   }

   // Method to get the text of the current token
   public static String yytext() {
      return lex.yytext();
   }

   // Method for error handling: prints error message and exits
   public static void lexErr(String s) {
      System.err.println(s + ": line " + yylineno + ": " + yytext());
      System.exit(1);
   }

   // Method for scanning: creates a new token and returns the token category
   public static int scan(int cat) {
      yylval = new token(cat, yytext(), yylineno);
      return cat;
   }

   // Method to handle newlines: increments the line number
   public static void newline() {
      yylineno++;
   }

   // Method for handling whitespace: currently empty, can be expanded as needed
   public static void whitespace() {
   }

   // Method for handling comments: currently empty, can be expanded as needed
   public static void comment() {
   }

   // Utility method to convert a string to its corresponding ASCII value
   public static short ord(String s) { return (short)(s.charAt(0)); }
}
