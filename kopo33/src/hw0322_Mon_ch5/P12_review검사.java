package hw0322_Mon_ch5;

import java.util.Scanner;

public class P12_review°Ë»ç {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		results();
	}
	
	public static void results () {
		String input = scan.nextLine();
	    double number = scan.nextDouble();
	       
	    String[] inputs = input.split(" ");
	       
	    double min = 1000000000, result = 0;
	    
	    int i = 0;
	    while (i < inputs.length) {
	    	double tmp = Double.parseDouble(inputs[i]);
	        if(tmp- number != 0 && Math.abs(tmp - number) < min){
	        	
	            min = Math.abs(tmp - number);
	            result = tmp;
	        }
	        i++;
	    }
	    System.out.println(result);
	}
}
