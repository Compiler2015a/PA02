package IC.Parser;

import java_cup.runtime.*;
import IC.Parser.Token;
import IC.Parser.LexicalError;

%%
%public
%class Lexer
%type Token
%unicode
%cup
%line
%column
%{
  StringBuffer string = new StringBuffer();

  private Token token(int type, Object value) {
    return new Token(type, value, yyline+1, yycolumn+1);
  }
  
  private Token stringToken(int type, String value) {
	return new Token(type, value, yyline+1, yycolumn+2-value.length());
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

DecIntegerLiteral = 0+ | [1-9][0-9]*
%state STRING

%%
 /* keywords */
<YYINITIAL> "class"           	 { return token(sym.CLASS_KEYWORD, yytext()); }
<YYINITIAL> "extends"            { return token(sym.EXTENDS_KEYWORD, yytext()); }
<YYINITIAL> "static"           	 { return token(sym.STATIC_KEYWORD, yytext()); }
<YYINITIAL> "void"           	 { return token(sym.VOID_KEYWORD, yytext()); }
<YYINITIAL> "int"           	 { return token(sym.INT_KEYWORD, yytext()); }
<YYINITIAL> "boolean"            { return token(sym.BOOLEAN_KEYWORD, yytext()); }
<YYINITIAL> "string"           	 { return token(sym.STRING_KEYWORD, yytext()); }
<YYINITIAL> "return"             { return token(sym.RETURN_KEYWORD, yytext()); }
<YYINITIAL> "if"           	 	 { return token(sym.IF_KEYWORD, yytext()); }
<YYINITIAL> "else"           	 { return token(sym.ELSE_KEYWORD, yytext()); }
<YYINITIAL> "while"           	 { return token(sym.WHILE_KEYWORD, yytext()); }
<YYINITIAL> "break"           	 { return token(sym.BREAK_KEYWORD, yytext()); }
<YYINITIAL> "continue"           { return token(sym.CONTINUE_KEYWORD, yytext()); }
<YYINITIAL> "this"             	 { return token(sym.THIS_KEYWORD, yytext()); }
<YYINITIAL> "new"           	 { return token(sym.NEW_KEYWORD, yytext()); }
<YYINITIAL> "length"           	 { return token(sym.LENGTH_KEYWORD, yytext()); }

<YYINITIAL> ";"           		 { return token(sym.SEMICOLON, yytext()); }
<YYINITIAL> ","           		 { return token(sym.COMMA, yytext()); }

<YYINITIAL> {

  /* literals */
  {DecIntegerLiteral}            { return token(sym.INTEGER_LITERAL, yytext()); }
  "true"           				 { return token(sym.TRUE_LITERAL, yytext()); }
  "false"           			 { return token(sym.FALSE_LITERAL, yytext()); }
  "null"           				 { return token(sym.NULL_LITERAL, yytext()); }
  \"                             { string.setLength(0); string.append("\""); yybegin(STRING); }

  /* identifiers */ 
  {ClassIdentifier}              { return token(sym.CLASS_ID, yytext()); }	
  {Identifier}                   { return token(sym.ID, yytext()); }
 
  
  /* operators */
  "("							 { return token(sym.LP, yytext()); }
  ")"							 { return token(sym.RP, yytext()); }
  "["							 { return token(sym.LC, yytext()); }
  "]"							 { return token(sym.RC, yytext()); }
  "{"							 { return token(sym.LB, yytext()); }
  "}"							 { return token(sym.RB, yytext()); }
  "."							 { return token(sym.DOT, yytext()); }
  "!" 							 { return token(sym.EXCLAMATION_MARK, yytext()); }
  "+"                            { return token(sym.PLUS, yytext()); }
  "-"                            { return token(sym.MINUS, yytext()); }
  "*"                            { return token(sym.MULT, yytext()); }
  "/"                            { return token(sym.DIVIDE, yytext()); }
  "%"                            { return token(sym.REMINDER, yytext()); }
  "<"                            { return token(sym.SMALLER_OP, yytext()); }
  ">"                            { return token(sym.LARGER_OP, yytext()); }
  "<="                           { return token(sym.SMALLER_EQ_OP, yytext()); }
  ">="                           { return token(sym.LARGER_EQ_OP, yytext()); }
  "=="                           { return token(sym.EQUALS_OP, yytext()); }
  "!="                           { return token(sym.NOT_EQUALS_OP, yytext()); }
  "&&"                           { return token(sym.AND_OP, yytext()); }
  "||"                           { return token(sym.OR_OP, yytext()); }
  "="                            { return token(sym.ASSIGN, yytext()); }
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
                                   return stringToken(sym.STRING_LITERAL, 
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
	
<<EOF>> 	{ return token(sym.EOF, "EOF"); }