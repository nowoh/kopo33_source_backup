package hw0322_Mon_ch5;

import java.util.Scanner;

public class Test1 {
	public void printMyName() {
		System.out.println("kim");
	}
	
	public static void printMyName2() {
		System.out.println("kim2");
	}
	public static void printMyName3(int a) {
		System.out.println(a);
	}
	
	public void printAdd(int a, int b) {
		int sum;
		sum = a + b;
		System.out.println(sum);
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
