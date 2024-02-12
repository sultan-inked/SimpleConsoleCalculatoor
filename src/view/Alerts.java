package view;

import tools.Cnsl;

public class Alerts {
	public static void wrtHr() {
		Cnsl.print("Writ here: ");
	}
	public static void youCanWrt() {
		Cnsl.println("You can enter only numbers and the following characters: \'-\', \'+\', \'*\', \'/\'\n" + 
						"And without spases!");
	}
}