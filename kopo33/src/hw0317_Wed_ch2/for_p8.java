package hw0317_Wed_ch2;

import java.util.Scanner;

public class for_p8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		scan.close();
	}
	
}
