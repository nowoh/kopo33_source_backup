package hw0318_Thu_ch3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String tTemp = scan.nextLine();
		int n = 0;
		for (n = 0; n < tTemp.length(); n++) {
			int b = (int)tTemp.charAt(n);
			if (b >=97 && b <=122) {
				System.out.print((char)(b-32));	
			} else if (b >= 65 && b <= 90) {
				System.out.print((char)(b+32));
			} else {
				System.out.print((char)b);
				
			}
		}	
	}	
}