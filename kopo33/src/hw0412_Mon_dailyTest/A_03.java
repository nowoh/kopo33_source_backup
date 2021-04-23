package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class A_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = scan.nextInt();
		}
		int sum = 0, avg = 0, max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		avg = sum/a;
		if (avg - (int)avg > 0.5) {
			avg = (int)avg + 1;
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] < min) {
				min = b[i];
			} else if (b[i] > max) {
				max = b[i];
			}
		}
		System.out.println("Average : " + avg);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
		System.out.println("Summation : " + sum);
	}

}
