package hw0317_Wed_ch2;

import java.util.Scanner;

public class asterT2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				if (i % 2 == 0) {
					System.out.print(".");
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
