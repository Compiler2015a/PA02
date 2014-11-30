package IC;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.Lexer;
import java_cup.runtime.Symbol;
import IC.AST.Program;
import IC.Parser.LibParser;
import IC.Parser.Parser;

public class Compiler {

	public static void main(String[] args) {

		if (args.length == 0 || args.length > 2) {
			System.err.println("Error: invalid arguments");
			System.exit(-1);
		}
		try {
			if(args[1].substring(0, 2).equals("-L")) { //if library required
				//parse library file
				FileReader libFile = new FileReader(args[1].substring(2));

				Lexer libScanner = new Lexer(libFile);
				LibParser libParser = new LibParser(libScanner);

				Symbol libParseSymbol = libParser.parse();
				Program libRoot = (Program) libParseSymbol.value;
			}

			//parse IC file
			FileReader icFile = new FileReader(args[0]);

			Lexer scanner = new Lexer(icFile);
			Parser parser = new Parser(scanner);

			Symbol parseSymbol = parser.parse();
			Program ICRoot = (Program) parseSymbol.value;


		} catch (FileNotFoundException e) {
			System.err.println(e.toString());
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
}
