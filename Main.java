import java.io.*;
//import org.antlr.*;
import org.antlr.v4.runtime.*;

import java.io.*;
public class Main {
    public static void main(String[] args) {
		try {
			ANTLRInputStream input = new ANTLRFileStream(args[0]);
			HelloLexer lexer = new HelloLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			HelloParser parser = new HelloParser(tokens);
			parser.setBuildParseTree(true);
			RuleContext tree = parser.r();
			//tree.inspect(parser); // show in gui
			//tree.save(parser, "/tmp/R.ps"); // Generate postscript
			System.out.println(tree.toStringTree(parser));
		} catch(Exception e) {
	    	System.err.println("exception: "+e);
	    	System.exit(1);
		}
    }
}

