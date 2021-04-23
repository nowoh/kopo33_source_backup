package hw0317_Wed_ch2;

import java.util.Scanner;

public class stringContain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a;
		a = scan.nextLine();
		
		if (a.toLowerCase().contains("car".toLowerCase()) == true) {
			System.out.println("car is included in the input string.");
		} else {
			System.out.println("car is not included in the input string.");
		}
		
		System.out.println(a);

		/*String b = a.toLowerCase();
		System.out.println(b);*/
		scan.close();
	}

}
