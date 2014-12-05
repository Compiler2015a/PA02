package IC.Parser;

import java.io.IOException;

public class GenericError extends IOException
{	
	 private String errType;
	 private String token;
     private int line;
     private int column;
    
	 public GenericError(String errType , String token, int line , int column) {
		 	this.errType = errType;
		 	this.token = token;
	    	this.line = line;
	    	this.column = column;
	    }
	    
	 	public String getErrType() {
	    	return this.errType;
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
	    	return ""+this.line+":"+this.column+" "+this.errType+": "+this.token;
	    }

}
