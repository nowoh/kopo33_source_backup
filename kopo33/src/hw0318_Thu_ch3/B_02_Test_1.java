package hw0318_Thu_ch3;

import java.util.Scanner;

public class B_02_Test_1 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int	N = (int)(Math.random() * 8);
			System.out.print(N);
			if (i % 2 == 0) {
				for (int j = 0; j < 10; j++) {
					if (j <= N+1 || j == 9 ) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int k = 0; k < 10; k++) {
					if(k == 0 || k >= 9 - N) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();	
		}
	}	
}
