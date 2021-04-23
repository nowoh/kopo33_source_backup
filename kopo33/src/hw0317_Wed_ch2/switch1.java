package hw0317_Wed_ch2;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		n = 2;
		switch (n) {
			case 1 :
				System.out.println("One!");
				
			case 2 :
				System.out.println("Two!");
				break;
			default :
				System.out.println("Except 1, 2");
				break;
		}
		scan.close();

	}

}
