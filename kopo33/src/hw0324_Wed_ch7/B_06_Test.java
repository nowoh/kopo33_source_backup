package hw0324_Wed_ch7;

import java.util.Scanner;

public class B_06_Test {
	public static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				/*System.out.println("#Please input the price of milk, apple, orange, melon and water in order.");
				String a = scan.nextLine();
				String b = scan.nextLine();
				String c = scan.nextLine();
				String d = scan.nextLine();
				String e = scan.nextLine();
				String[][] price1 = price(a, b, c, d, e);
				System.out.println(price1[1][1]);*/
			} else if (mainChoice == 2) {
				
				
			} else {

			}
			}				

	}
		
	public static int mainMenu() {
		System.out.println("#Menu");
		System.out.println("1. Set the prices of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		return scan.nextInt();
	}
	
	public static String[][] price(String a, String b, String c, String d, String e) {
		String[][] prices = {{"milk", a},{"apple", b},{"orange", c},{"melon", d},{"water", e}};
		return prices;
	}
	
	
	
	public static int cal(String[][] prices) {
		
	}

		
}
