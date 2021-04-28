package hw0322_Mon_ch5;

import java.util.Scanner;

public class B_04_Test_Overriding {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double multi, nm1 = 0, nm2 = 0;
		String input = scan.nextLine();
		multiplication(input);
		multiplication(nm1, nm2);
		
	
	}
	
	public static double multiplication(String sp1) {
		if (sp1.contains("*")) {
			String[] a = sp1.split("\\*");
			double nm1 = Double.parseDouble(a[0]);
		    double nm2 = Double.parseDouble(a[1]);
		    return multiplication(nm1, nm2);
		} else {
			
		}
	}
	public static double multiplication(double num1, double num2) {
		double multi = num1 * num2;
		return multi;
	}
	
	
}
