package hw0319_Fri_ch4;

import java.util.Scanner;

public class P10_re_Mult_Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		ggd(n,1);

	}	
	public static void ggd(int dan, int num) {
		if (num > 9) {
			return;
		} else {
			System.out.println(dan + " X " + num + " = " + (dan * num));
			ggd(dan, num + 1);
			return;
		}
	}	
	/*public static int fac1(int M) {
		if (M == 1) {
			return 1;
		} else {
			return M * fac1(M-1);
		}		
	}*/
	
	/*public static int fac(int N) {
		if (N == 1) {
			System.out.print(N);
			return N;
		} else if (N <= 50 ) {
			System.out.print(N +" ");
			return N + fac(N+);
		} else {
			return N*0;
		}
		*/	
	
}