package hw0319_Fri_ch4;

import java.util.Scanner;

public class P09_Combination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int r = n-m;
		System.out.print("p(" + n + "," + m + ") = ");
		System.out.print(n + "! / (" + n + " - " + m + ")! = (");
		fac2(n);
		System.out.print(" ) / ( ");
		fac2(r);
		System.out.print(" ) = ");
		System.out.print(fac1(n) + " / " + fac1(r) + " = ");
		System.out.print(fac1(n)/fac1(r));
		

	}	

	public static int fac1(int M) {
		if (M == 1) {
			return 1;
		} else {
			return M * fac1(M-1);
		}		
	}
	
	public static int fac2(int N) {
		if (N == 1) {
			System.out.print(N);
			return 1;
		} else {
			System.out.print(N + " X ");
			return N * fac2(N-1);
		}
	}
}