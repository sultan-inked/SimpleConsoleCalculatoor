package tools;

import java.util.Scanner;

public class Cnsl {
	
	public static void println() {
		System.out.println();
	}
	public static void println(String str) {
		System.out.println(str);
	}
	public static void println(int n) {
		System.out.println(n);
	}
	public static void println(double nD) {
		System.out.println(nD);
	}
	
	public static void print(String str) {
		System.out.print(str);
	}
	public static void print(int n) {
		System.out.print(n);
	}
	public static void print(double nD) {
		System.out.print(nD);
	}
	
	static Scanner scan = new Scanner(System.in);
	
	public static String scan() {
		return scan.nextLine().trim();
	}
}
