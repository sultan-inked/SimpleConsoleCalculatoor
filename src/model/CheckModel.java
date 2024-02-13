package model;

import tools.Cnsl;

public class CheckModel {
//	Variables:
	private final String symbolsForCheck = "1234567890+-*/.";
	private final String operators = "+-*/";
	private final String digits = "1234567890";
	
//	Methods:
	public boolean expressionCheck(String expression) {
		for(char c: expression.toCharArray()) {
			if(symbolsForCheck.indexOf(c) == -1) {
				Cnsl.println("The expression cannot contain this charackter: \'" + c + "\'");
				return false;
			}
		}
		if(checkForOpereatorsBeginAndEnd(expression)) {
			return true;
		}
		return false;
	}
	public boolean checkForOpereatorsBeginAndEnd(String expression) {
		if(digits.contains(expression.substring(0, 1)) && 
				digits.contains(expression.substring(expression.length()-1))) {
			return true;
		}else {
			Cnsl.println("The expression must not begin or end with valid operators");
			return false;
		}
	}
	
}







