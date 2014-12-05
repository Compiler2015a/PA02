package IC.Parser;

import java.io.IOException;

public class SyntaxError extends GenericError 
{
	public SyntaxError(String token, int line , int column) 
	{
	    super("Syntax error", token, line, column);
	}
}
