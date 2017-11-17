// Generated from /Users/Thea/Documents/workspace/Calculator/src/gen/Demo.g4 by ANTLR 4.7
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DemoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DemoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DemoParser#math_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expression(DemoParser.Math_expressionContext ctx);
}