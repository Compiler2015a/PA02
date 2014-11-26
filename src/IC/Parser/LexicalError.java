package Parser;

import java.io.IOException;

public class LexicalError extends IOException
{
    public LexicalError(String token, int line , int column) {
    	this.token = token;
    	this.line = line;
    	this.column = column;
    }
    
    public String getToken() {
    	return this.token;
    }
    
    public int getLine() {
    	return this.line;
    }
    
    public int getColumn() {
    	return this.column;
    }
    
    public String toString() {
    	return ""+this.line+":"+this.column+" Lexical error: "+this.token;
    }
    
    private String token;
    private int line;
    private int column;
}

