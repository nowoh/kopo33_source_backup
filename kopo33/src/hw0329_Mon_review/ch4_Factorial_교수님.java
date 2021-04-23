package hw0329_Mon_review;

import java.util.Scanner;

public class ch4_Factorial_±³¼ö´Ô {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		fac1(n, true);
		
		System.out.println(fac1(n,false));

	}	

	public static int fac1(int M, boolean process) {  //final return
		if (M == 1) {
			if (process) {
				System.out.print(M);
			}
			return 1;
		} else {
			if (process) {
				System.out.print(M + " X ");
			}
			return M * fac1(M-1, true);
		}		
	}
}
