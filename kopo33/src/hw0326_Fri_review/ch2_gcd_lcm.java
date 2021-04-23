package hw0326_Fir_review;

import java.util.Scanner;

public class ch2_gcd_lcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		System.out.println(num1);
		System.out.println(num2);
		int gcd = 1;		  		//Greatest Common Divisor	
		int lcm;					//Least Common Multiple
		
		if (num1 < num2) {
			for (int i = 2; i <= num2; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					gcd *= i;
					num1 /= i;
					num2 /= i;
					i--;
				}
			}
		} else if (num1 > num2) {
			for (int i = 2; i <= num1; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					gcd *= i;
					num1 /= i;
					num2 /= i;
					i--;
				}
			}
		}
		System.out.println(gcd);
		
		lcm = num1 * num2 * gcd;	//num1 & num2 = remainder
		System.out.println(lcm);

	}

}
