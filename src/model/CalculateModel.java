package model;

import tools.Cnsl;

import java.util.ArrayList;

public class CalculateModel {
//	Variables:
	private final String simbolOperators = "*/+-";
	
//	Methods:
	public String expressionCalculate(String expression) {
		
		ArrayList<String> numbersTemp = new ArrayList<>();
		ArrayList<Double> numbers = new ArrayList<>();
		ArrayList<String> operators = new ArrayList<>();
		
		// Sort an expression into its constituent parts:
		for(int i = 0; i < expression.length(); i++) {
			if(!simbolOperators.contains(expression.substring(i, i+1))) {
				numbersTemp.add(expression.substring(i, i+1));
			}else {
				operators.add(expression.substring(i, i+1));
				numbers.add(Double.parseDouble(numbersTempToString(numbersTemp)));
				numbersTemp.clear();
			}
			if(i == expression.length()-1) {
				numbers.add(Double.parseDouble(numbersTempToString(numbersTemp)));
			}
		}
		
		// Executing an expression by operators:
		String firstOperators = "*/";
		while(operators.contains("*") || operators.contains("/")) {
			for(int i = 0; i < operators.size(); i++) {
				if(firstOperators.contains(operators.get(i))) {
					if(operators.get(i).equals("*")) {
						numbers.set(i, numbers.get(i) * numbers.get(i+1));
						numbers.remove(i+1);
						operators.remove(i);
					}
					else if(operators.get(i).equals("/")) {
						numbers.set(i, numbers.get(i) / numbers.get(i+1));
						numbers.remove(i+1);
						operators.remove(i);
					}
				}
			}
		}
		
		String secondOperatros = "+-";
		
		while(operators.contains("+") || operators.contains("-")) {
			for(int i = 0; i < operators.size(); i++) {
				if(secondOperatros.contains(operators.get(i))) {
					if(operators.get(i).equals("+")) {
						numbers.set(i, numbers.get(i) + numbers.get(i+1));
						numbers.remove(i+1);
						operators.remove(i);
						
					}
					else if(operators.get(i).equals("-")) {
						numbers.set(i, numbers.get(i) - numbers.get(i+1));
						numbers.remove(i+1);
						operators.remove(i);
					}
				}
			}
		}
		
		return numbers.get(0).toString();
	}
	private String numbersTempToString(ArrayList<String> numbersTemp) {
		String numbersStr = "";
		for(String str: numbersTemp) {
			numbersStr += str;
		}
		return numbersStr;
	}
}
