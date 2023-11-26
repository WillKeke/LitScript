/**
 * The token class represents a single token identified by the scanner.
 * It holds information about the token's category, text, and line number.
 *
 * Fields:
 *   - cat (int): The category of the token, corresponding to specific token types.
 *   - text (String): The actual text of the token as found in the input.
 *   - lineno (int): The line number in the input where the token was found.
 *
 * Constructor:
 *   - Initializes a token with a given category, text, and line number.
 */
public class token {
    public int cat;    // Token category (type)
    public String text; // Text of the token
    public int lineno; // Line number where the token is found

    // Constructor to initialize a token object
    public token(int c, String s, int l) {
        cat = c; // Assign the category
        text = s; // Assign the text
        lineno = l; // Assign the line number
    }
}
