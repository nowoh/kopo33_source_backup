package hw0325_Thu_ch8;

import java.util.Scanner;

public class ·Î¶Ç {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random() * 45));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	scan.close();
	}
}