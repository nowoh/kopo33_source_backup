package hw0317_Wed_ch2;

import java.util.Scanner;

public class ÀÌÁß¹®p10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a > 0) {	
			for (int i = 2; i < 10; i++) {
				System.out.println(a + " X " + i + " = " + (a * i));
			}
		} else {
			System.out.println("please input right number.");
		}
		scan.close();
		
	}
}
