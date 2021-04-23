package hw0319_Fri_ch4;

import java.util.Scanner;

public class P01_2_실습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		P01_2_실습2 main = new P01_2_실습2();
		while (true) {
			main.showMenu();
			int n = scan.nextInt();
			main.getName(n);
		}
	}
	
	public void getName(int familyMember) {
		if (familyMember == 1) {
			System.out.println("Father is John");
		} else if (familyMember == 2 ) {
			System.out.println("Mother is Kate");
		} else if (familyMember == 3) {
			System.out.println("Son is Kane");
		} else if (familyMember == 4) {
			System.out.println("Daughter is Alli");
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
