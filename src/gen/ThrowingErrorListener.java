package gen;

import javax.swing.JOptionPane;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener {

	   public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

	   @Override
	   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	      throws ParseCancellationException {
		   JOptionPane.showMessageDialog(null, "line " + line + ":" + charPositionInLine + " " + msg);
	        
	       System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
	       
	         
		   throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
	      }
	   
	   /*
	   public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
	            String msg, RecognitionException e) {
		   
//		   System.out.println("line " + line + ":" + charPositionInLine + " " + msg);
//		   System.out.println("error :" + charPositionInLine + " " + msg);
		   JOptionPane.showMessageDialog(null, "Error: " +  msg);
	        
	        SyntaxErrorCollector.getInstance().recordError(line, charPositionInLine, msg);
	        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
	    }
	    */
	}