package hw0319_Fri_ch4;

import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if (input.contains("+")) {
			String[] a = input.split("\\+");
			double nm1 = Double.parseDouble(a[0]);
		    double nm2 = Double.parseDouble(a[1]);
			addition(nm1, nm2);
		} else if (input.contains("-")) {
			String[] a = input.split("\\-");
			double nm1 = Double.parseDouble(a[0]);
		    double nm2 = Double.parseDouble(a[1]);
			subtraction(nm1, nm2);
		} else if (input.contains("*")) {
			String[] a = input.split("\\*");
			double nm1 = Double.parseDouble(a[0]);
		    double nm2 = Double.parseDouble(a[1]);
			multiplication(nm1, nm2);		
		} else if (input.contains("/")) {
			String[] a = input.split("\\/");
			double nm1 = Double.parseDouble(a[0]);
		    double nm2 = Double.parseDouble(a[1]);
			division(nm1, nm2);
		} else {
			System.out.println("error");
		}
	}
			
	public static void addition(double num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	public static void subtraction(double num1, double num2) {
		double sbt = num1 - num2;
		System.out.println(sbt);
	}
	
	public static void multiplication(double num1, double num2) {
		double multi = num1 * num2;
		System.out.println(multi);
	}
	
	public static void division(double num1, double num2) {
		double div = num1 / num2;
		System.out.println(div);
	}	
}
