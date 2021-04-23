package hw0322_Mon_ch5;

import java.util.Scanner;

public class P01_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Price price = new Price(1000, 2000, 3000, 5000);
		while (true) {
			price.printMenu();
			int a = scan.nextInt();
			price.getPrice(a);	
		}
		
	}
}
