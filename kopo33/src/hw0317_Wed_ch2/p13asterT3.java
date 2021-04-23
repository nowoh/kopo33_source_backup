package hw0317_Wed_ch2;

import java.util.Scanner;

public class p13asterT3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++ ) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}	
			for (int k = 0; k < (1+i*2); k++){
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
