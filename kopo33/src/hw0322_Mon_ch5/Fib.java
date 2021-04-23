package hw0322_Mon_ch5;

import java.util.Scanner;

public class Fib {

	public static void fib1(int a) {
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();*/
		for (int i = 0; i < a; i++) {
			System.out.print(fib(i) + " ");
		}
	}	

	public static int fib(int N) {
		if (N == 0) {
			return N;
		} else if (N == 1) {
			return N;
		} else {
			return fib(N-2) + fib(N-1);
		}
	}
}