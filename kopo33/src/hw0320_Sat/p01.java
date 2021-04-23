package hw0320_Sat;

import java.util.Scanner;

public class p01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();		
		String str2 = scan.nextLine();

		
		int length;
		int counter = 0;
		
		System.out.println(counter + "/" + length);
	}
	public static int getLength(String str1, String str2 ) {
		int length = 0;
		if (str1.length() > str2.length()) {
			length = str1.length();
		} else {
			length = str2.length();
		}
		return length;
	}
	
		
		
}
