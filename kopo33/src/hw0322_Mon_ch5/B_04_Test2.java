package hw0322_Mon_ch5;

import java.util.Scanner;

public class B_04_Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double nm1 = 0, nm2 = 0;
		String input = scan.nextLine();
		
		if (input.contains("+")) {
			String[] a = input.split("\\+");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
			System.out.println(addition(nm1, nm2));
		} else if (input.contains("-")) {
			String[] a = input.split("\\-");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
			System.out.println(subtraction(nm1, nm2));
		} else if (input.contains("*")) {
			String[] a = input.split("\\*");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
			System.out.println(multiplication(nm1, nm2));		
		} else if (input.contains("/")) {
			String[] a = input.split("\\/");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
		    System.out.println(division(nm1, nm2));
		}
	}
			
	public static double addition(double num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}
	
	public static double subtraction(double num1, double num2) {
		double sbt = num1 - num2;
		return sbt;
	}
	
	public static double multiplication(double num1, double num2) {
		double multi = num1 * num2;
		return multi;
	}
	
	public static double division(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}
	
	
}
