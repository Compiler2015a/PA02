
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20140808 (SVN rev 54)
//----------------------------------------------------

package IC.Parser;

import IC.Parser.Token;
import java_cup.runtime.*;
import IC.AST.*;
import java.util.List;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20140808 (SVN rev 54) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class LibParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Libsym.class;
}

  /** Default constructor. */
  public LibParser() {super();}

  /** Constructor which sets the default scanner. */
  public LibParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public LibParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\023\000\002\002\003\000\002\002\004\000\002\003" +
    "\007\000\002\005\004\000\002\005\002\000\002\004\011" +
    "\000\002\013\003\000\002\013\003\000\002\012\005\000" +
    "\002\012\003\000\002\012\003\000\002\012\003\000\002" +
    "\012\003\000\002\006\002\000\002\006\003\000\002\007" +
    "\004\000\002\010\002\000\002\010\005\000\002\011\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\004\011\006\001\002\000\004\002\043\001" +
    "\002\000\004\002\001\001\002\000\004\013\007\001\002" +
    "\000\004\017\010\001\002\000\006\014\ufffd\020\ufffd\001" +
    "\002\000\006\014\012\020\013\001\002\000\014\004\023" +
    "\005\015\006\016\007\017\012\020\001\002\000\004\002" +
    "\uffff\001\002\000\006\014\ufffe\020\ufffe\001\002\000\006" +
    "\010\ufff8\021\ufff8\001\002\000\006\010\ufff7\021\ufff7\001" +
    "\002\000\006\010\ufff6\021\ufff6\001\002\000\006\010\ufff5" +
    "\021\ufff5\001\002\000\006\010\ufffa\021\035\001\002\000" +
    "\004\010\024\001\002\000\004\010\ufffb\001\002\000\004" +
    "\015\025\001\002\000\014\005\015\006\016\007\017\012" +
    "\020\016\ufff4\001\002\000\004\016\ufff3\001\002\000\006" +
    "\016\ufff1\023\037\001\002\000\006\010\034\021\035\001" +
    "\002\000\004\016\032\001\002\000\004\024\033\001\002" +
    "\000\006\014\ufffc\020\ufffc\001\002\000\006\016\uffef\023" +
    "\uffef\001\002\000\004\022\036\001\002\000\006\010\ufff9" +
    "\021\ufff9\001\002\000\012\005\015\006\016\007\017\012" +
    "\020\001\002\000\004\016\ufff2\001\002\000\006\016\ufff1" +
    "\023\037\001\002\000\004\016\ufff0\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\006\002\003\003\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\005\010\001\001\000\004\004\013\001\001\000" +
    "\006\012\020\013\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\006\030\007" +
    "\025\011\026\012\027\001\001\000\002\001\001\000\004" +
    "\010\037\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\011\040\012\027\001" +
    "\001\000\002\001\001\000\004\010\041\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$LibParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$LibParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$LibParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 	
	return lexer.next_token();
	
    }


	/** Causes the parsr to print every token it reads.
	 * This is useful for debugging.
	 */
	public boolean printTokens;
	
	private LibLexer lexer;
	private int arrayDimentionCounter = 0;
	
	public LibParser(LibLexer lexer) {
		super(lexer);
		this.lexer = lexer;
	}
	
		public void syntax_error(Symbol s)
	{
        StringBuilder sb = new StringBuilder();
        Token token = (Token)s;
        sb.append("expected ");
        
        if (s.right > 0) {
            boolean isFirst = true;
            expected_token_ids();
            expected_token_ids();
            for (Integer expected : expected_token_ids()) {
                if (!isFirst)
                    sb.append(" or ");
                else
                    isFirst = false;

                sb.append('\'');
                sb.append(sym.terminalNames[expected]);
                sb.append('\'');
            }
        } else {
            sb.append("end of input");
        }
        if (token == null)
        {
            //throw new SyntaxError(sb.toString(), 0, 0);
        	 System.out.println("0:0 : Syntax error; " + sb.toString());
        } else {
            sb.append(", but found \'");
            sb.append(token.getTag());
            sb.append('\''); 
            //throw new SyntaxError(sb.toString(), token.getLine(), token.getColumn());
            System.out.println("" +token.getLine()+":"+token.getColumn()+" : Syntax error; " + sb.toString());
        }
	}
	
	public void report_error(String message, Object info)
	{
	
	}
	
	public void unrecovered_syntax_error(Symbol cur_token)
	{
	
	}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$LibParser$actions {
  private final LibParser parser;

  /** Constructor */
  CUP$LibParser$actions(LibParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$LibParser$do_action_part00000000(
    int                        CUP$LibParser$act_num,
    java_cup.runtime.lr_parser CUP$LibParser$parser,
    java.util.Stack            CUP$LibParser$stack,
    int                        CUP$LibParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$LibParser$result;

      /* select the action based on the action number */
      switch (CUP$LibParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // program ::= libic 
            {
              Program RESULT =null;
		int libleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int libright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		ICClass lib = (ICClass)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 List<ICClass> list = new ArrayList<ICClass>(); list.add(lib); RESULT = new Program(list); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		RESULT = start_val;
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$LibParser$parser.done_parsing();
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // libic ::= CLASS_KEYWORD LIBRARY_KEYWORD LB libmethod_list RB 
            {
              ICClass RESULT =null;
		int ckleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).left;
		int ckright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).right;
		Object ck = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).value;
		int cidleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-3)).left;
		int cidright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-3)).right;
		Object cid = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-3)).value;
		int mlleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int mlright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		List<Method> ml = (List<Method>)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		 RESULT = new ICClass(ckleft, cid.toString(), new ArrayList<Field>(),
			ml); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("libic",1, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // libmethod_list ::= libmethod_list libmethod 
            {
              List<Method> RESULT =null;
		int mlleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int mlright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		List<Method> ml = (List<Method>)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		LibraryMethod m = (LibraryMethod)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 ml.add(m); RESULT = ml; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("libmethod_list",3, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // libmethod_list ::= 
            {
              List<Method> RESULT =null;
		 RESULT = new ArrayList<Method>(); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("libmethod_list",3, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // libmethod ::= STATIC_KEYWORD method_type ID LP formal_list_inter RP SEMICOLON 
            {
              LibraryMethod RESULT =null;
		int mtleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-5)).left;
		int mtright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-5)).right;
		Type mt = (Type)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-5)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-4)).value;
		int flleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).left;
		int flright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).right;
		List<Formal> fl = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).value;
		 RESULT = new LibraryMethod(mt, id.toString(), fl); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("libmethod",2, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-6)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // method_type ::= VOID_KEYWORD 
            {
              Type RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new PrimitiveType(vleft, IC.DataTypes.VOID); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("method_type",9, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // method_type ::= type 
            {
              Type RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = t; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("method_type",9, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // type ::= type LC RC 
            {
              Type RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)).value;
		 t.incrementDimension(); RESULT = t; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // type ::= INT_KEYWORD 
            {
              Type RESULT =null;
		int intKeyleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int intKeyright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object intKey = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new PrimitiveType(intKeyleft, IC.DataTypes.INT); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // type ::= BOOLEAN_KEYWORD 
            {
              Type RESULT =null;
		int boolKeyleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int boolKeyright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object boolKey = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new PrimitiveType(boolKeyleft, IC.DataTypes.BOOLEAN); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type ::= STRING_KEYWORD 
            {
              Type RESULT =null;
		int strKeyleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int strKeyright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object strKey = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new PrimitiveType(strKeyleft, IC.DataTypes.STRING); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // type ::= CLASS_ID 
            {
              Type RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new UserType(cleft, c.toString()); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("type",8, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // formal_list_inter ::= 
            {
              List<Formal> RESULT =null;
		 RESULT = new ArrayList<Formal>(); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("formal_list_inter",4, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // formal_list_inter ::= formal_list 
            {
              List<Formal> RESULT =null;
		int flleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int flright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		List<Formal> fl = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT =  fl; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("formal_list_inter",4, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // formal_list ::= formal extra_formals 
            {
              List<Formal> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		int efleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int efright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		List<Formal> ef = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 ef.add(0, f); RESULT = ef; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("formal_list",5, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // extra_formals ::= 
            {
              List<Formal> RESULT =null;
		 RESULT = new ArrayList<Formal>(); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("extra_formals",6, ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // extra_formals ::= COMMA formal extra_formals 
            {
              List<Formal> RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		Formal f = (Formal)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		int efleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int efright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		List<Formal> ef = (List<Formal>)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 ef.add(0, f); RESULT = ef; 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("extra_formals",6, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-2)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // formal ::= type ID 
            {
              Formal RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).right;
		Type t = (Type)((java_cup.runtime.Symbol) CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)).value;
		int fNameleft = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).left;
		int fNameright = ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()).right;
		Object fName = (Object)((java_cup.runtime.Symbol) CUP$LibParser$stack.peek()).value;
		 RESULT = new Formal(t, fName.toString()); 
              CUP$LibParser$result = parser.getSymbolFactory().newSymbol("formal",7, ((java_cup.runtime.Symbol)CUP$LibParser$stack.elementAt(CUP$LibParser$top-1)), ((java_cup.runtime.Symbol)CUP$LibParser$stack.peek()), RESULT);
            }
          return CUP$LibParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$LibParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$LibParser$do_action(
    int                        CUP$LibParser$act_num,
    java_cup.runtime.lr_parser CUP$LibParser$parser,
    java.util.Stack            CUP$LibParser$stack,
    int                        CUP$LibParser$top)
    throws java.lang.Exception
    {
              return CUP$LibParser$do_action_part00000000(
                               CUP$LibParser$act_num,
                               CUP$LibParser$parser,
                               CUP$LibParser$stack,
                               CUP$LibParser$top);
    }
}

}
