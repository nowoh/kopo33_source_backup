package hw0322_Mon_ch5;

import java.util.Scanner;

public class P12_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String input = scan.nextLine();
	    double number = scan.nextDouble();
	       
	    String[] inputs = input.split(" ");
	       
	    double min = 1000000000, result = 0;
	    for(int i = 0; i < inputs.length; i++){
	    	
	        double tmp = Double.parseDouble(inputs[i]);
	        if(tmp- number != 0 && Math.abs(tmp - number) < min){
	        	
	            min = Math.abs(tmp - number);
	            result = tmp;
	       }
	    }
	    System.out.println(result);
	}
}
