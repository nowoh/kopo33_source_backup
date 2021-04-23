package hw0321_Sun;

import java.util.Scanner;

public class 인도베다수학 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		india(a, b);
		
		scan.close();
	}
	public static void india(int num1, int num2) {
		int c = 100 - num1;
		int d = 100 - num2;
		int f = c * d;
		int g = 100 * (100 - (c + d));
		System.out.println(g + f);
		
	}
	
}
