package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class B_02_Test_1 {

	public static void main(String[] args) {
		int M;
		for (int i = 0; i < 5; i++) {
			int random = (int)(Math.random() * 9);
			System.out.print(random);
			System.out.print("*");
			
			if (i % 2 == 0) {					//�汝� 還
				for (int j = 0; j < random; j++) {
					System.out.print("*");
				}
				for (int k = 8-random; k > 0; k--) {
					System.out.print(" ");
				}
				System.out.print("*\n");
			} else {							//礎熱還
				for (int k = 8-random; k > 0; k--) {
					System.out.print(" ");
				}
				for (int j = 0; j < random; j++) {
					System.out.print("*");
				}
				System.out.print("*\n");
			}

		}	
	}
}	
