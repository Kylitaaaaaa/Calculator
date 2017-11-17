// Generated from /Users/Thea/Documents/workspace/Calculator/src/gen/Demo.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void enterMath_expression(DemoParser.Math_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#math_expression}.
	 * @param ctx the parse tree
	 */
	void exitMath_expression(DemoParser.Math_expressionContext ctx);
}