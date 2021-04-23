package hw0318_Thu_ch3;

import java.util.Scanner;

public class B_02_Test_1_2 {

	public static void main(String[] args) {
		int M;
		for (int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 10));
			for (int j = 0; j < 10; j++) {
				M = (int)(Math.random() * 2);
				if (M == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}	System.out.println();
			
			
		}
	

	}	
}
