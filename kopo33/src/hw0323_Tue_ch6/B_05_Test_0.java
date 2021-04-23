package hw0323_Tue_ch6;

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
			System.out.println(calAddition(nm1, nm2) + getOperator(input) + );
		} else if (input.contains("-")) {
			String[] a = input.split("\\-");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
			
		} else if (input.contains("*")) {
			String[] a = input.split("\\*");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
				
		} else if (input.contains("/")) {
			String[] a = input.split("\\/");
			nm1 = Double.parseDouble(a[0]);
		    nm2 = Double.parseDouble(a[1]);
		  
		}
		
		
		
		

	}
	

	
	public double calAddition(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}

	
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



	@Override
	public double calAdditon(double num1, double num2) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String getOperator(String formula) {
		// TODO Auto-generated method stub
		return null;
	}

}
