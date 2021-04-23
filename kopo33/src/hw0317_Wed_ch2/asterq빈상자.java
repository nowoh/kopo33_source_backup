package hw0317_Wed_ch2;

import java.util.Scanner;

public class asterqºó»óÀÚ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		//n = 5;
		for (int i = 0; i < 5; i++ ) {
			for(int j = 0; j < 5; j++) {
				if (i == 0) {
					System.out.print("*");
				} else if (i == 4) {
					System.out.print("*");
				} else {
					for (j = 1; j < 2; j++) {
						System.out.print("*");
					}
					for (j = 2; j < 5; j++) {
						System.out.print(" ");
					}
					for (j = 4; j < 5; j++) {
						System.out.print("*");
					}	
				}
				
			}
			System.out.println();
		}
		scan.close();
	}
}
