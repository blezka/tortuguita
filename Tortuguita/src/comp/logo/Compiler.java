package comp.logo;

import comp.logo.parser.*;
import comp.logo.lexer.*;
import comp.logo.node.*;
import java.io.*;

public class Compiler {

	public static String Compile(String instructions) {
		String output = "";
        try {
//            System.out.println("Se esta haciendo el analisis lexico y semantico =)");


            // Create a Parser instance.
            Parser p =
                    new Parser(
                    new Lexer(
                    new PushbackReader(
                    new StringReader(instructions), 1024)));


            // Parse the input.
            Start tree = p.parse();
            output += tree;


            // Apply the translation.
            tree.apply(new Translation());
        } catch (Exception e) {
			output += "\n\rError: " + instructions ;
            output += e.getMessage();
        }
		return output;
    }
}
