
package src;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.Tool;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

public class Compiler {

	public static void main( String[] args ) throws Exception {

		File file = new File("/Users/sp31485/eclipse-workspace/Compiler/lib/test.c");
		FileInputStream fis = null;

		try {

			fis = new FileInputStream( file );
			ANTLRInputStream input = new ANTLRInputStream( fis );
			CLexer lexer = new CLexer(input);
//			for (Token t : lexer.getAllTokens()) {
//				System.out.print("Token: " + t.getText());
//				System.out.print(" On Line: " + t.getLine());
//				System.out.println(" Start Index: " + t.getStartIndex() + " End Index: " + t.getStopIndex());
//			}
//			System.out.println("\n");
			CommonTokenStream tokens = new CommonTokenStream( lexer );
			CParser parser = new CParser( tokens );
			CParser.CompilationUnitContext tree = parser.compilationUnit();
			
			MyListener extractor = new MyListener(  );
			ParseTreeWalker.DEFAULT.walk( extractor, tree );
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if ( fis != null )
					fis.close();
			} catch ( IOException ex ) {
				ex.printStackTrace();
			}
		}

	}

}