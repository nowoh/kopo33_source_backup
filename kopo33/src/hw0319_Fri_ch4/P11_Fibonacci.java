package hw0319_Fri_ch4;

import java.util.Scanner;

public class P11_Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
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