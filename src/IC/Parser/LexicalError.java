package IC.Parser;

import java.io.IOException;

public class LexicalError extends GenericError
{
    public LexicalError(String token, int line , int column) {
    	super("Lexical error", token, line, column);
    }   
}