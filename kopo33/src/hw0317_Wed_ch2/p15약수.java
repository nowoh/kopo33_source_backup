package hw0317_Wed_ch2;

import java.util.Scanner;

public class p15¾à¼ö {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int a = 1; a < n; a++ ) {
			if(n % a ==0) {
				System.out.println(a);
			}
		}
		scan.close();
	}
}
