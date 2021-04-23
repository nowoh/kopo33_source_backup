package hw0317_Wed_ch2;

import java.util.Scanner;

public class asterT4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}	
			for (int k = 0; k < 2*n-1-2*i; k++){
				System.out.print("*");
			}
			for (int t = 0; t < i; t++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		scan.close();
	}
}
