package gen;

import java.util.ArrayList;

public class SyntaxErrorCollector {
	private static SyntaxErrorCollector instance = null;
	
	private ArrayList<String> errors;
	
	public static SyntaxErrorCollector getInstance() {
		if(instance == null) {
			instance = new SyntaxErrorCollector();
		}
		return instance;
	}
	
	private SyntaxErrorCollector() {
		reset();
	}
	
	public void reset() {
		errors = new ArrayList<String>();
	}
	
	public String recordError(int line, int charPositionInLine, String msg) {
		StringBuilder sb = new StringBuilder();
		String error = sb.append("line ").append(line).append(":").append(charPositionInLine).append(" ").append(msg).toString();
		System.out.println("heree: " + error);
		if(errors.add(error)) {
			return error;
		}else {
			return null;
		}
	}
	
	public String listErrors() {
		StringBuilder sb = new StringBuilder();
		for(String e: errors) {
			sb.append(e).append(System.getProperty("line.separator"));
		}
		return sb.toString();
	}
	
	public int countErrors() {
		return errors.size();
	}
	
}

