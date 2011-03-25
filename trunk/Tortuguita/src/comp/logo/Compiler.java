package comp.logo;

import comp.logo.parser.*;
import comp.logo.lexer.*;
import comp.logo.node.*;
import java.io.*;

public class Compiler {

	public static void main(String[] arguments) {
        try {
            System.out.println("Se esta haciendo el analisis lexico y semantico =)");


            // Create a Parser instance.
            Parser p =
                    new Parser(
                    new Lexer(
                    new PushbackReader(
                    new FileReader("src/test.in"), 1024)));


            // Parse the input.
            Start tree = p.parse();

            System.out.print(tree);


            // Apply the translation.
            //tree.apply(new Translation());
            //Esto lo vamos a ver para el final =)
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
