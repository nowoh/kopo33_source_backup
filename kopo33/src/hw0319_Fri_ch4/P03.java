package hw0319_Fri_ch4;

import java.util.Scanner;

public class P03 {

	public static final String father = "John";
	public static final String mother = "Kate";
	public static final String son = "Michael";
	public static final String daughter = "Sue";
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		P03 main = new P03();
		
		while (true) {
			main.showMenu();
			int n = scan.nextInt();
			main.getName(n);
			System.out.println();
		}
	}
	
	public void getName(int familyMember) {
		if (familyMember == 1) {
			System.out.println(father);
		} else if (familyMember == 2 ) {
			System.out.println(mother);
		} else if (familyMember == 3) {
			System.out.println(son);
		} else if (familyMember == 4) {
			System.out.println(daughter);
		} else {
			System.out.println("error");
		}
	}
	public void showMenu() {
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. Son");
		System.out.println("4. Daughter");
		System.out.print("--> ");
	}
	
}
