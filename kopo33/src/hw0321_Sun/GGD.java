package hw0321_Sun;

import java.util.Scanner;

public class GGD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " X " + i + " = " + (j * i) + "  ");	
			}
			System.out.println(" ");
			
		}
		scan.close();
	}
	
}


