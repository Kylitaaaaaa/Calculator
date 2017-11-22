package gen;

import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import gen.DemoParser.Math_expressionContext;

public class MyVisitor extends DemoBaseVisitor<Float>{
    public boolean isError = false; 
	private DemoParser parser;
    private ParseTree tree;
    
    private DemoLexer lexer;
    private CommonTokenStream tokens;
    private ANTLRErrorStrategy defaultStrat;
    private DemoBaseErrorListener demoBaseErrorListener;
    
    public MyVisitor(String input){
    	isError = false;
    	System.out.println("huh");
        StringBuilder sb = new StringBuilder("");
        String userInput = input;
//      String userInput = "((5+(5/3)*4-6)";
        System.out.println("input: " + userInput);
        defaultStrat = new DefaultErrorStrategy();
        
        lexer = new DemoLexer(CharStreams.fromString(userInput));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        tokens = new CommonTokenStream(lexer);
        
        demoBaseErrorListener = new DemoBaseErrorListener();
//        SyntaxErrorCollector.getInstance().reset();
        
        parser = new DemoParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);
            parser.setErrorHandler(defaultStrat);
        
            try{
            	System.out.println("getting code");
            	tree  = parser.code();
            }
            catch(Exception e){
                System.out.println("error herewueriqw");
                isError = true;
            }
        
        
    }
    
    
    
    public DemoBaseErrorListener getDemoBaseErrorListener() {
        return demoBaseErrorListener;
    }



    public void setDemoBaseErrorListener(DemoBaseErrorListener demoBaseErrorListener) {
        this.demoBaseErrorListener = demoBaseErrorListener;
    }



    @Override
    public Float visitMath_expression(Math_expressionContext ctx) {
        
        try{
        System.out.println("Printing : " + ctx.getText());
        for(int i=0; i<ctx.getChildCount(); i++)
            System.out.println(i + " : " + ctx.getChild(i).getText() + " : " + ctx.getChild(i).getClass().getSimpleName().toString());
        
        System.out.println("Done Printing\n\n");
        
        if(ctx.getChildCount() == 1){
        	System.out.println("here???? : " + ctx.getChild(0).getText());
//        	return Float.parseFloat(ctx.getChild(0).getText());
        	
            if(ctx.getChild(0).getText().charAt(0) == '$')
                return Float.parseFloat(ctx.getChild(0).getText().substring(1, ctx.getChild(0).getText().length())) * -1;
            else
                return Float.parseFloat(ctx.getChild(0).getText());
                
        }
        else if(ctx.getChild(0).getText().equals("(")){
            System.out.println("here");
            return (Float) visitMath_expression(ctx.math);
        }
        else {
            System.out.println("here 1");
            System.out.println("left : " + ctx.left.getText());
            return (Float) MathUtil.solve(visitMath_expression(ctx.left), ctx.op.getText().charAt(0), visitMath_expression(ctx.right));
        }
        }
        catch(Exception e){
            System.out.println("error here huhuhu");
            isError = true;
            return (float) 0;
        }
        
        
    }
    
    
    public DemoParser getParser() {
        return parser;
    }

    public ParseTree getTree() {
        return tree;
    }



	public boolean getIsError() {
		return isError;
	}



	public void setError(boolean isError) {
		this.isError = isError;
	}



	
    
    
}
