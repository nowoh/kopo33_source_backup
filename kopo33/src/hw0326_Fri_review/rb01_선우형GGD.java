package hw0326_Fir_review;

import java.util.Scanner;

public class rb01_¼±¿ìÇüGGD {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			int sub = num1 - num2;

			int n1 = 10000;

			System.out.println(sub);

			for (int i = 0; i < 7; i++) {
				if (i % 2 == 0) {
					System.out.println(n1 + " - " + sub / n1);
					sub = sub - n1 * (sub / n1);
					n1 /= 2;
				} else {
					System.out.println(n1 + " - " + sub / n1);
					sub = sub - n1 * (sub / n1);
					n1 /= 5;
				}

			}
		} catch (Exception e) {
			System.out.println("Out of range");
		}

	}

}
