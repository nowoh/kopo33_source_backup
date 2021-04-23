package hw0326_Fri_review;

import java.util.Scanner;

public class ch2_¼Ò¼ö_ {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}	
	}
}