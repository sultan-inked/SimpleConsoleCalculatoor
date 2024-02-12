package model;

public class CheckModel {
//	Variables:
	private final String simbolsForCheck = "1234567890+-*/";
	
//	Methods:
	public boolean expressionCheck(String expression) {
		for(int i = 0; i < expression.length(); i++) {
			if(!simbolsForCheck.contains(expression.substring(i, i+1))) {
				return false;
			}
		}
		return true;
	}
	
	public boolean expressionCheckGPT(String expression) {
		for(char c: expression.toCharArray()) {
			if(simbolsForCheck.indexOf(c) == -1) {
				return false;
			}
		}
		return true;
	}
}
