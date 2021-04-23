package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class B_05_Test_0 implements B_05_Test_Interface {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double nm1 = 0, nm2 = 0;
		B_05_Test_0 m = new B_05_Test_0();
		
		if (input.contains("+")) {
			String[] a = input.split("\\+");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
			System.out.println(nm1 +  " " + m.getOperator(input) + " " + nm2 + " = " + m.calAddition(nm1, nm2));
		} else if (input.contains("-")) {
			String[] a = input.split("\\-");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
		    System.out.println(nm1 + " " + m.getOperator(input) + " " + nm2 + " = " + m.calSubtraction(nm1, nm2));
		} else if (input.contains("*")) {
			String[] a = input.split("\\*");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
		    System.out.println(nm1 + " " + m.getOperator(input) + " " + nm2 + " = " + m.calMultiplication(nm1, nm2));
		} else if (input.contains("/")) {
			String[] a = input.split("\\/");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
		    System.out.println(nm1 +  " " + m.getOperator(input) + " " + nm2 + " = " + m.calDivision(nm1, nm2));
		}
	}
	public double calAddition(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}
	@Override
	public double calSubtraction(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}

	@Override
	public double calMultiplication(double num1, double num2) {
		double mul = num1 * num2;
		return mul;
	}

	@Override
	public double calDivision(double num1, double num2) {
		double div = num1 / num2;
		return div;
	}

	@Override
	public char getOperator(String formula) {
		if (formula.contains("+")) {
			return '+';
		} else if (formula.contains("-")) {
			return '-';
			
		} else if (formula.contains("*")) {
			return '*';		
		} else if (formula.contains("/")) {
			return '/';
		} else {
			return 0;
		}

	}

}
