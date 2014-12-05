package IC;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.Symbol;
import IC.AST.PrettyPrinter;
import IC.AST.Program;
import IC.Parser.Lexer;
import IC.Parser.LexicalError;
import IC.Parser.LibLexer;
import IC.Parser.LibParser;
import IC.Parser.Parser;
import IC.Parser.SyntaxError;;

public class Compiler {

	public static void main(String[] args) {

		if (args.length == 0 || args.length > 2) {
			System.err.println("Error: invalid arguments");
			System.exit(-1);
		}
		try {
			if(args.length == 2 && args[1].substring(0, 2).equals("-L")) { //if library required
				//parse library file
				FileReader libFile = new FileReader(args[1].substring(2));

				LibLexer libScanner = new LibLexer(libFile);
				LibParser libParser = new LibParser(libScanner);

				Symbol libParseSymbol = libParser.parse();
				Program libRoot = (Program) libParseSymbol.value;
				
				
//				// Pretty-print the program to System.out
				PrettyPrinter printer = new PrettyPrinter(args[1].substring(2));
				System.out.println(printer.visit(libRoot));
				
			}
			

			
			//parse IC file
			FileReader icFile = new FileReader(args[0]);

			Lexer scanner = new Lexer(icFile);
			Parser parser = new Parser(scanner);

			Symbol parseSymbol = parser.parse();
			Program ICRoot = (Program) parseSymbol.value;
	//		 Pretty-print the program to System.out
			PrettyPrinter printer = new PrettyPrinter(args[0]);
			System.out.println(printer.visit(ICRoot));

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (LexicalError e) {
			new LexicalError(e.getMessage(), e.getLine(), e.getColumn()).toString();
		} catch (SyntaxError e) {
			if (e.getLine() > 0)
				new SyntaxError(e.getMessage(), e.getLine(), e.getColumn()).toString();
            else
                System.out.println("at end of input : syntax error; " + e.getMessage());
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
}
