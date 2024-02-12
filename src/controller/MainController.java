package controller;

import model.CheckModel;
import model.CalculateModel;

public class MainController {
	public boolean transferExpressionForCheckReturnBoolean(String expression) {
		var checkModel = new CheckModel();
		return checkModel.expressionCheck(expression);
	}

	public String transferExpressionForCalculateReturnString(String expression) {
		var calculateModel = new CalculateModel();
		return calculateModel.expressionCalculate(expression);
	}
}
