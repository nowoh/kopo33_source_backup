package hw0323_Tue_ch6;

import java.util.Scanner;

public class P08_decryption {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [] encrypted = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};
		char [] decrypted = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		 
		
		String str = scan.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			int first = 0;
			for (int j = 0; j < encrypted.length; j++) {
				if(str.charAt(i) == encrypted[j]) {
					first = j;
					System.out.print(decrypted[j]);
				}
			}
		}
	}

}
