package hw0326_Fri_review;

import java.util.Scanner;

public class ch_2_최대공배수_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		int N = scanner.nextInt(); 
//		int M = scanner.nextInt();
		int N = (int)(Math.random()*100);
		int M = (int)(Math.random()*100);
		int GCD = 0;
		int LCM = 0;
		int i = 1;
		
		System.out.println(N);
		System.out.println(M);
		while (i <= N && i <= M) {
			if (N % i == 0 && M % i == 0) {
				GCD = i;
				
			}
			i++;
		}
		System.out.println("GCD = " + GCD);
		LCM = (N*M)/GCD;
		System.out.println("LCM = " +LCM);
		
	}

}
