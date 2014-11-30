package Parser;

import java_cup.runtime.*;

%%
%public
%class Lexer
%unicode
%cup
%line
%column
%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline+1, yycolumn+1, value);
  }
  
  private Symbol stringSymbol(int type, String value) {
	return new Symbol(type, yyline+1, yycolumn+2-value.length(), value);
  }
  
%}
 LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

/* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
// Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Lowercase = [a-z]
Uppercase = [A-Z]
Letters = [A-Za-z] 

ClassIdentifier = {Uppercase}({Letters} | {DecIntegerLiteral} | _)*
Identifier = {Lowercase}({Letters} | {DecIntegerLiteral} | _)*

DecIntegerLiteral = 0 | [1-9][0-9]*
%state STRING

%%
 /* keywords */
<YYINITIAL> "class"           	 { return symbol(sym.CLASS_KEYWORD, yytext()); }
<YYINITIAL> "extends"            { return symbol(sym.EXTENDS_KEYWORD, yytext()); }
<YYINITIAL> "static"           	 { return symbol(sym.STATIC_KEYWORD, yytext()); }
<YYINITIAL> "void"           	 { return symbol(sym.VOID_KEYWORD, yytext()); }
<YYINITIAL> "int"           	 { return symbol(sym.INT_KEYWORD, yytext()); }
<YYINITIAL> "boolean"            { return symbol(sym.BOOLEAN_KEYWORD, yytext()); }
<YYINITIAL> "string"           	 { return symbol(sym.STRING_KEYWORD, yytext()); }
<YYINITIAL> "return"             { return symbol(sym.RETURN_KEYWORD, yytext()); }
<YYINITIAL> "if"           	 	 { return symbol(sym.IF_KEYWORD, yytext()); }
<YYINITIAL> "else"           	 { return symbol(sym.ELSE_KEYWORD, yytext()); }
<YYINITIAL> "while"           	 { return symbol(sym.WHILE_KEYWORD, yytext()); }
<YYINITIAL> "break"           	 { return symbol(sym.BREAK_KEYWORD, yytext()); }
<YYINITIAL> "continue"           { return symbol(sym.CONTINUE_KEYWORD, yytext()); }
<YYINITIAL> "this"             	 { return symbol(sym.THIS_KEYWORD, yytext()); }
<YYINITIAL> "new"           	 { return symbol(sym.NEW_KEYWORD, yytext()); }
<YYINITIAL> "length"           	 { return symbol(sym.LENGTH_KEYWORD, yytext()); }

<YYINITIAL> ";"           		 { return symbol(sym.SEMICOLON, yytext()); }
<YYINITIAL> ","           		 { return symbol(sym.COMMA, yytext()); }

<YYINITIAL> {

  /* literals */
  {DecIntegerLiteral}            { return symbol(sym.INTEGER_LITERAL, yytext()); }
  "true"           				 { return symbol(sym.TRUE_LITERAL, yytext()); }
  "false"           			 { return symbol(sym.FALSE_LITERAL, yytext()); }
  "null"           				 { return symbol(sym.NULL_LITERAL, yytext()); }
  \"                             { string.setLength(0); string.append("\""); yybegin(STRING); }

  /* identifiers */ 
  {ClassIdentifier}              { return symbol(sym.CLASS_ID, yytext()); }	
  {Identifier}                   { return symbol(sym.ID, yytext()); }
 
  
  /* operators */
  "("							 { return symbol(sym.LP, yytext()); }
  ")"							 { return symbol(sym.RP, yytext()); }
  "["							 { return symbol(sym.LC, yytext()); }
  "]"							 { return symbol(sym.RC, yytext()); }
  "{"							 { return symbol(sym.LB, yytext()); }
  "}"							 { return symbol(sym.RB, yytext()); }
  "."							 { return symbol(sym.DOT, yytext()); }
  "!" 							 { return symbol(sym.EXCLAMATION_MARK, yytext()); }
  "+"                            { return symbol(sym.PLUS, yytext()); }
  "-"                            { return symbol(sym.MINUS, yytext()); }
  "*"                            { return symbol(sym.MULT, yytext()); }
  "/"                            { return symbol(sym.DIVIDE, yytext()); }
  "%"                            { return symbol(sym.REMINDER, yytext()); }
  "<"                            { return symbol(sym.SMALLER_OP, yytext()); }
  ">"                            { return symbol(sym.LARGER_OP, yytext()); }
  "<="                           { return symbol(sym.SMALLER_EQ_OP, yytext()); }
  ">="                           { return symbol(sym.LARGER_EQ_OP, yytext()); }
  "=="                           { return symbol(sym.EQUALS_OP, yytext()); }
  "!="                           { return symbol(sym.NOT_EQUALS_OP, yytext()); }
  "&&"                           { return symbol(sym.AND_OP, yytext()); }
  "||"                           { return symbol(sym.OR_OP, yytext()); }
  "="                            { return symbol(sym.ASSIGN, yytext()); }
 }
 
 <YYINITIAL> {
  /* comments */
  {Comment}                      { /* ignore */ }
 
  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }
}

 <STRING> {
  \"                             { yybegin(YYINITIAL); 
								   string.append("\"");
                                   return stringSymbol(sym.STRING_LITERAL, 
                                   string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append("\\t"); }
  \\n                            { string.append("\\n"); }

  \\r                            { string.append("\\r"); }
  \\\"                           { string.append("\\\""); }
  \\                             { string.append('\\'); }
  
  \n							 { throw new LexicalError(yytext(), yyline+1, yycolumn+1); } /* unclosed literal string */ 
}


 /* error fallback */
	[^]                              { throw new LexicalError(yytext(), yyline+1, yycolumn+1); }