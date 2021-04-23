package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class B_03_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, d;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		d = scan.nextDouble();
		
		System.out.println(a + " " + b + " " + c + " " + d);
		double e = a + b + c + d;
		System.out.println("Summation : " +e);
		double f = (a+b+c+d)/4;
		System.out.println("Average : " + f);
		double M = 0;
		double N = 0;
		
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
		System.out.println("Minimum : " + N);
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
		System.out.println("Maximum : " + M);
	}

}
