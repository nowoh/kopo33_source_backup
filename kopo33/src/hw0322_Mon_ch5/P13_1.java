package hw0322_Mon_ch5;

import java.util.Scanner;

public class P13_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PrintMenu();
	       
	       int beforeUnit = scan.nextInt();
	       int afterUnit = scan.nextInt();
	       double num = scan.nextDouble();
	       
	       double convertedNum = P13_1Class.Convert(beforeUnit, afterUnit, num);
	       
	       System.out.println(convertedNum);
	    }
	    
	    public static void PrintMenu(){
	       System.out.println("# Unit");
	       System.out.println("1. cm");
	       System.out.println("2. m");
	       System.out.println("3. mm");
	       System.out.println("4. km");
	       System.out.println("5. mile");
	       
	    }

}
