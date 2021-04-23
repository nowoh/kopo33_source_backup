package hw0326_Fir_review;

import java.util.Scanner;

public class ch2_PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				} 		
			}
			if (count == 0) {
				System.out.println(i);
			}
			count = 0;
		}	
		

	}

}
