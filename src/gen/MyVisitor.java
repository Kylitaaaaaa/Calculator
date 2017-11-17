package gen;

import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import gen.DemoParser.Math_expressionContext;

public class MyVisitor extends DemoBaseVisitor<Float>{
	private DemoParser parser;
	private ParseTree tree;
	
	private DemoLexer lexer;
	private CommonTokenStream tokens;
	
	public MyVisitor(String input){
		StringBuilder sb = new StringBuilder("");
    	String userInput = input;
    	lexer = new DemoLexer(CharStreams.fromString(userInput));
        
        tokens = new CommonTokenStream(lexer);
        
        parser = new DemoParser(tokens);
	        parser.removeErrorListeners();
	        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        
        tree  = parser.math_expression();
        
        
	}
	
	@Override
	public Float visitMath_expression(Math_expressionContext ctx) {
		try{
		
		visitChildren(ctx);
		
		if(ctx.getChildCount() == 1){
			float temp;
			if(ctx.getChild(0).getText().charAt(0) == '$')
				temp = Float.parseFloat(ctx.getChild(0).getText().substring(1, ctx.getChild(0).getText().length())) * -1;
			else
				temp = Float.parseFloat(ctx.getChild(0).getText());
			
//			System.out.println("null: " + ctx.getChild(0).getText());
			return temp;
		}
		else {
			if(ctx.left == null && ctx.right == null){
//				System.out.println("null: " + ctx.getChild(0).getText());
				float first = Float.parseFloat(ctx.getChild(0).getText());
				
				if(ctx.getChild(0).getText().charAt(0) == '$')
					first = Float.parseFloat(ctx.getChild(0).getText().substring(1, ctx.getChild(0).getText().length())) * -1;
				else
					first = Float.parseFloat(ctx.getChild(0).getText());
		
				float answer = (Float) MathUtil.solve(first, '+', visitMath_expression(ctx));
				
				return answer;
			}
			
			float left, right;
//			System.out.println("left: " + ctx.left.getText());
//			System.out.println("right: " + ctx.right.getText());
//			
//			if(ctx.left.getText().charAt(0) == '$')
//				left = Float.parseFloat(ctx.left.getText().substring(1, ctx.left.getText().length())) * -1;
//			else{
//				left = Float.parseFloat(ctx.left.getText());
//			}
//			
//			if(ctx.right.getText().charAt(0) == '$'){
//				right = Float.parseFloat(ctx.right.getText().substring(1, ctx.right.getText().length())) * -1;
//			}
//			else
//				right = Float.parseFloat(ctx.right.getText());
			
			
			float temp = (Float) MathUtil.solve(visitMath_expression(ctx.left), ctx.op.getText().charAt(0), visitMath_expression(ctx.right));
			return temp;
		}
		}
		catch(Exception e){
			//Console.Error.WriteLine(e.StackTrace);
			return (float) 0.00;
		
		}
	}
	
	public DemoParser getParser() {
		return parser;
	}

	public ParseTree getTree() {
		return tree;
	}
	
}
