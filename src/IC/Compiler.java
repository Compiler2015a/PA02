package IC;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.Symbol;
import IC.AST.Program;
import IC.Parser.Lexer;
import IC.Parser.Parser;
import IC.Parser.Library.LibParser;

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

				IC.Parser.Library.Lexer libScanner = new IC.Parser.Library.Lexer(libFile);
				LibParser libParser = new LibParser(libScanner);

				Symbol libParseSymbol = libParser.debug_parse();
				Program libRoot = (Program) libParseSymbol.value;
			}
			
			System.out.println("Done parsing library!");
			
			//parse IC file
			FileReader icFile = new FileReader(args[0]);

			Lexer scanner = new Lexer(icFile);
			Parser parser = new Parser(scanner);

			Symbol parseSymbol = parser.parse();
			Program ICRoot = (Program) parseSymbol.value;


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
