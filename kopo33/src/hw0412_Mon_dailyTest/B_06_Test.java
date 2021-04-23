package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class B_06_Test {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] price = new int[5];
		int[] quantity = new int[5];
		
		while(true) {
			int type = printMenu(price);
			if(type == 1) {
				pressOne(price);
			} else if(type == 2) {
				pressTwo(price, quantity);
			} else if(type == 3) {
				pressThree(price);
			}
		}
	}
	
	public static int printMenu(int[] price) {
		System.out.println("#Menu");
		System.out.print("[PRICE] ");
		System.out.println("milk - " + price[0] + " apple - " + price[1] + " orange - " + price[2] + " melon - " + price[3] + " water - " + price[4]);
		System.out.println("1. Set the prices of items");
		System.out.println("2. Calculate the charges");
		System.out.println("3. Reset the prices of items");
		System.out.print("-> ");
		
		return scanner.nextInt();
	}
	
	public static void pressOne(int[] price) {
		System.out.println();
		System.out.println("#Please input the prices of milk, apple, orange, melon and water in order");
		System.out.print("-> ");
		for(int i = 0; i < 5; i++) {
			price[i] = scanner.nextInt();
		}
		System.out.println();
	}
	
	public static void pressTwo(int[] price, int[] quantity) {
		int sum = 0;
		System.out.println("#Total charge");
		System.out.println("#Please input the quantities of milk, apple, orange, melon and water in order");
		System.out.print("-> ");
		for(int i = 0; i < 5; i++) {
			quantity[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			sum += price[i] * quantity[i];
		}
		System.out.println("Total charge : " + sum);
		System.out.println();
	}
	
	public static void pressThree(int[] price) {
		System.out.println();
		System.out.println("#Reset complete");
		System.out.println();
		for(int i = 0; i < 5; i++) {
			price[i] = 0;
		}
	}
	
}
