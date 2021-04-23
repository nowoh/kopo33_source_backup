package hw0317_Wed_ch2;

import java.util.Scanner;

public class for_timeTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int i = 0;
		//int n = 6;
		int a = scan.nextInt();
		for (int i = 2; i < 10; i++) {
			//if ( i % 2 == 0 ) {
			//System.out.println(i);
			//}
			System.out.println(a + " X " + i + " = " + (a * i));
		}
		scan.close();
	}
}
