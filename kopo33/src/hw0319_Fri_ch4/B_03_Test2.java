package hw0319_Fri_ch4;

import java.util.Scanner;

public class B_03_Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//min max 값을 지정해서 추출되도록
		float a, b, c, d;
		a = scan.nextFloat();
		b = scan.nextFloat();
		c = scan.nextFloat();
		d = scan.nextFloat();
		double M = 0;
		double N = 0;
		double e = a + b + c + d;
		System.out.printf("Summation : %.2f\n", e);
		double f = (a+b+c+d)/4;
		System.out.printf("Average : %.4f\n", f);
		double g;
		
		if (a < b) {
			if (a < c) {
				if (a < d) {
					N = a;
					
				} else {
					N = d;
				}				
			} else if (a > c) {
				if (c > d) {
					N = d;
				} else {
					N = c;
				}
			}
		} else if (a > b) {
			if (b > c) {
				if (c > d) {
					N = d;
				} else {
					N = c;
				} 
			} else if (b < c) {
				if (b > d) {
					N = d;
				} else {
					N = b;
				}
			}
			
		}
		System.out.printf("Minimum : %.2f\n", N);
		if (a < b) {
			if (b < c) {
				if (c < d) {
					M = d;
					
				} else {
					M = c;
				}				
			} else if (b > c) {
				if (b >d) {
					M = b;
				} else {
					M = d;
				}
			}
		} else if (a > b) {
			if (a > c) {
				if (a > d) {
					M = a;
				} else {
					M = d;
				} 
			} else if (a < c) {
				if (c > d) {
					M = c;
				} else {
					M = d;
				}
			}
			
		}
		
		System.out.printf("Maximum : %.2f\n", M);

	}

}

