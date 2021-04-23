package hw0326_Fir_review;

import java.util.Scanner;

public class ch2__ÀÎ¼ö {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int a = 1; a < n; a++ ) {
			if(n % a == 0) {
				System.out.println(a);
			}
		}
		
		int b = 1;
		while (b < n) {
			if (n % b == 0) {
				System.out.println(b);
			}
			b++;
		}

	}

}
