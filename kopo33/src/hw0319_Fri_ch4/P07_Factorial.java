package hw0319_Fri_ch4;

import java.util.Scanner;

public class P07_Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		System.out.print(fac1(n) + " = ");
		fac2(n);

	}	

	public static int fac1(int M) {  //final return만 출력하기 위한 함수
		if (M == 1) {
			return 1;
		} else {
			return M * fac1(M-1);
		}		
	}
	
	public static int fac2(int N) {  //함수가 돌아가는 과정에서의 리턴 값들 출력.  
		if (N == 1) {
			System.out.print(N);
			return 1;
		} else {
			System.out.print(N + " X ");
			return N * fac2(N-1);
		}
	}
}