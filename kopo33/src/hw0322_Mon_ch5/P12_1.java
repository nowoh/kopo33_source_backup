package hw0322_Mon_ch5;

import java.util.Scanner;

public class P12_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		double number = scan.nextDouble();
		sp(inNum);
		//double nm1 = 0, min = 0;
		
		/*String[] spl = inNum.split(" ");
		
		for (int i = 0; i < 6; i++) {
			nm1 = Double.parseDouble(spl[i]);
		    System.out.println(nm1);
		}*/
		
		

	}
	public static double sp (String spsp) {
		String[] inputs = spsp.split(" ");
	       
	    double min = 1000000000, result = 0;
	    for(int i = 0; i < inputs.length; i++){
	    	
	        double tmp = Double.parseDouble(inputs[i]);
	        if(tmp- number != 0 && Math.abs(tmp - number) < min){
	        	
	            min = Math.abs(tmp - number);
	            result = tmp;
	}
	
	
	public static double GN (double num1, double num2) {
		double gap = Math.abs(num1 - num2);
		return gap;
	}
	
	public static double min () {
		min = 
	}

}
