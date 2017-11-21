package gen;

public class MathUtil {
	
	public static Object solve(float left, char op, float right) {
		switch (op) {
	        case '*': return left * right;
	        case '/': return left / right;
	        case '+': return left + right;
	        case '-': return left - right;
	        case '%': return left % right;
	        default: throw new IllegalArgumentException("Unknown operator " + op);
		}
	}
}