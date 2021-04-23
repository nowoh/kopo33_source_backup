package hw0319_Fri_ch4;

import java.util.Scanner;

public class P04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N1 = scan.nextInt();
		int N2 = scan.nextInt();
		addOperation(N1, N2);
	}
	
	public static void addOperation(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	
}
