package hw0323_Tue_ch6;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String input = scan.nextLine();
		
	}
	public static char splitS(String text) {
		char[] c = text.toCharArray();
		
		
		
	}
	public static int count(char[] a, char[]b) {
		int count = 0;
		for (int i =0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				a[i] = b[j];
				count++;
			}
		}
		return count;
	}

}
