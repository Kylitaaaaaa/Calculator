import java.util.Arrays;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import gen.DemoLexer;
import gen.DemoParser;
import gen.MyVisitor;

public class CalculatorDemo { 
    public static void main(String[] args) throws Exception {
        
        MyVisitor mv = new MyVisitor("");
		
		TreeViewer viewr = new TreeViewer(Arrays.asList(
                mv.getParser().getRuleNames()), mv.getTree());
		viewr.setScale(1.5);
	    viewr.open();
	    
	    System.out.println("answer: " + mv.visit(mv.getTree()));
        
    }
}