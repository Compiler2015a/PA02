package IC.Parser;
public class sym {
	
	public static final int EOF=0;
	public static final int ID=1;
	public static final int CLASS_ID=2;
	public static final int SEMICOLON=3; // ';'
	public static final int COMMA=4; // ','
	
	// Keywords
	public static final int CLASS_KEYWORD=101;
	public static final int EXTENDS_KEYWORD=102;
	public static final int STATIC_KEYWORD=103;
	public static final int VOID_KEYWORD=104;
	public static final int INT_KEYWORD=105;
	public static final int BOOLEAN_KEYWORD=106;
	public static final int STRING_KEYWORD=107;
	public static final int RETURN_KEYWORD=108;
	public static final int IF_KEYWORD=109;
	public static final int ELSE_KEYWORD=110;
	public static final int WHILE_KEYWORD=111;
	public static final int BREAK_KEYWORD=112;
	public static final int CONTINUE_KEYWORD=113;
	public static final int THIS_KEYWORD=114;
	public static final int NEW_KEYWORD=115;
	public static final int LENGTH_KEYWORD=116;

	
	// Literals
	public static final int TRUE_LITERAL=201;
	public static final int FALSE_LITERAL=202;
	public static final int NULL_LITERAL=203;
	public static final int INTEGER_LITERAL=204;
	public static final int STRING_LITERAL=205;

	// Operators
	public static final int LP=301;		// '('
	public static final int RP=302; 	// ')'
	public static final int LC=303; 	// '['
	public static final int RC=304; 	// ']'
	public static final int LB=305; 	// '{'
	public static final int RB=306; 	// '}'
	public static final int DOT=307; 	// '.'
	public static final int EXCLAMATION_MARK=308; // '!'
	public static final int PLUS=309; // '+'
	public static final int MINUS=310; // '-'
	public static final int MULT=311; // '*'
	public static final int DEVIDE=312; // '/'
	public static final int REMINDER=313; // '%'
	public static final int SMALLER_OP=314; // '<'
	public static final int LARGER_OP=315; // '>'
	public static final int SMALLER_EQ_OP=316; // "<="
	public static final int LARGER_EQ_OP=317; // ">="
	public static final int EQUALS_OP=318; // "=="
	public static final int NOT_EQUALS_OP=319; // "!="
	public static final int AND_OP=320; // "&&"
	public static final int OR_OP=321; // "||"
	public static final int ASSIGN=322; // '='
	//....add more....

}