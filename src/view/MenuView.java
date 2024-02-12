package view;

import tools.Cnsl;
import controller.MainController;

public class MenuView {
	public void start() {
		Cnsl.println("Write an expression to calculate:");
		String expression = inputExpression();
		if(expression.equals("exit")) return;
		var mainController = new MainController();
		if(mainController.transferExpressionForCheckReturnBoolean(expression)) {
			Cnsl.print("Result: " + mainController.transferExpressionForCalculateReturnString(expression) + "\n");
			start();
		}else {
			Alerts.youCanWrt();
			start();
		}
	}

	private String inputExpression() {
		Alerts.wrtHr();
		return Cnsl.scan();
	}
	
	
}
