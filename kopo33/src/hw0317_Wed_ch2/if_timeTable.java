package hw0317_Wed_ch2;

import java.util.Scanner;

public class if_timeTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a > 0) {
			System.out.println(a +" X 2 = " +(a*2));
			System.out.println(a +" X 3 = " +(a*3));
			System.out.println(a +" X 4 = " +(a*4));
			System.out.println(a +" X 5 = " +(a*5));
			System.out.println(a +" X 6 = " +(a*6));
			System.out.println(a +" X 7 = " +(a*7));
			System.out.println(a +" X 8 = " +(a*8));
			System.out.println(a +" X 9 = " +(a*9));	
		} else {
			System.out.println("please input right number.");
		}
		scan.close();
	}
}
