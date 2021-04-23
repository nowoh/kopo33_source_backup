package hw0317_Wed_ch2;

import java.util.Scanner;

public class p17최대공약수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = 0; 
		int gcd = 1;
		
		if (n > m) {
			for (a = 2; a < n; a++ ) {
				if(n % a == 0 && m % a == 0) {
					gcd*= a;
					n /= a;
					m /= a;
					a--;							
				}
			}
		} else if (n < m) {
			for (a = 2; a < m; a++ ) {
				if(n % a == 0 && m % a == 0) {
					gcd *= a;
					n /= a;
					m /= a;
					a--;
				}
			}
		}
		System.out.println(gcd);
		
		scan.close();
	}
}

