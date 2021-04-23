package hw0323_Tue_ch6;

import java.util.Scanner;

public class P07_0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [] original = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String [] encrypted = {"z", "y", "x", "w", "v", "u", "t", "s", "r", "q", "p", "o", "n", "m", "l", "k", "j", "i", "h", "g", "f", "e", "d", "c", "b", "a"}; 
		String str = scan.nextLine();
		Encryption(str, original, encrypted);	
	}
	public static void Encryption (String str, String [] ori, String [] enc ) {
		String result = "";

		for(int i = 0; i < str.length(); i++){
			result += enc[ori.indexOf(str.charAt(i))];
		}
		System.out.println(result);
	}
}
