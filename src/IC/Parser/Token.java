package Parser;
import java_cup.runtime.Symbol;

public class Token extends Symbol {
	private int id, line, column;
	private Object value;
	
	public Token(int id, Object value, int line, int column) {
		super(id,null);
		this.id=id;
		this.value=value;
		this.line=line;
		this.column = column;
	}
	
	public int getId() {return id;};
	public Object getValue() {return value;};
	public int getLine() {return line;};
	public int getColumn() {return column;};

	public String getTag() {
		switch (sym) {
		
			case Parser.sym.ID:
				return "ID";
			case Parser.sym.CLASS_ID:
				return "CLASS_ID";
			case Parser.sym.INTEGER_LITERAL:
				return "INTEGER";
			case Parser.sym.STRING_LITERAL:
				return "STRING";
		}
		
		return value.toString();
	}
}