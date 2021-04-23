package hw0317_Wed_ch2;

import java.util.Scanner;

public class p18¼Ò¼ö {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int isPrimeC = 0; 
		
		for (int a = 2; a <= n; a++) {
			for (int b = 2; b < a; b++) {
				if ( a % b == 0)	{
					isPrimeC++;
				}
			}
			if (isPrimeC == 0) {
				System.out.println(a + "");
			}
			isPrimeC = 0;
		}
		scan.close();
	}
}
