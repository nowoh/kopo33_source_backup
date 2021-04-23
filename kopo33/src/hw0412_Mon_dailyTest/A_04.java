package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class A_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int[] b = new int[a];
		int i = 0;
		while (i < a) {
			b[i] = scan.nextInt();
			i++;
		}
		int sum = 0, avg = 0, max = 0, min = Integer.MAX_VALUE;
		
		i = 0;
		while (i < b.length) {
			sum += b[i];
			i++;
		}
		avg = sum/a;
		if (avg - (int)avg > 0.5) {
			avg = (int)avg + 1;
		}
		i = 0;
		while (i < b.length) {
			if (b[i] < min) {
				min = b[i];
			} else if (b[i] > max) {
				max = b[i];
			}
			i++;
		}
		
		System.out.println("Average : " + avg);
		System.out.println("Minimum : " + min);
		System.out.println("Maximum : " + max);
		System.out.println("Summation : " + sum);
	}

}
