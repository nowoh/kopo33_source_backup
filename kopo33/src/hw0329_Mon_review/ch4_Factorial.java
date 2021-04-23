package hw0329_Mon_review;

import java.util.Scanner;

public class ch4_Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.print(fac1(n) + " = ");
		fac2(n);

	}	

	public static int fac1(int M) {  //final return
		if (M == 1) {
			return 1;
		} else {
			return M * fac1(M-1);
		}		
	}
	
	public static int fac2(int N) {  //return process  
		if (N == 1) {
			System.out.print(N);
			return 1;
		} else {
			System.out.print(N + " X ");
			return N * fac2(N-1);
		}
	}

}
