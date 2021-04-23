package hw0319_Fri_ch4;

import java.util.Scanner;

public class P07Àç±ÍÇÔ¼ö {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		sumToOne(n);
		
		
		

	}	

	public static int sumToOne(int N) {
		if (N == 1) {
			System.out.print(N +" ");
			return 1;
		} else {
			System.out.print(N +" ");
			return N * sumToOne(N-1);
		}
	}
}