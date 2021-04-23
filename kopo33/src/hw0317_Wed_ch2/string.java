package hw0317_Wed_ch2;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = "how are you?";
		if (a.contains("how") == true) {
			System.out.println("It's hello");
		} else {
			System.out.println("It's not hello");
		}
		scan.close();

	}

}
