package hw0319_Fri_ch4;

import java.util.Scanner;

public class HW2_1Enc_Dec {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Encoder");
			System.out.println("2. Decoder");
			System.out.println("3. Exit");
			int chNum = scan.nextInt();
			scan.nextLine();
			String str = scan.nextLine();
			
			if (chNum == 1) {
				str = Encoding(str);
				System.out.println(str);
			} else if (chNum == 2) {
				str = Decoding(str);
				System.out.println(str);
			} else {
				System.out.println("Bye.");
				break;
			}
		}
	}	
	public static String Encoding(String str) {
		str = str.replace("0", "a");
		str = str.replace("1", "b");
		str = str.replace("2", "c");
		str = str.replace("3", "d");
		str = str.replace("4", "e");
		str = str.replace("5", "f");
		str = str.replace("6", "g");
		str = str.replace("7", "h");
		str = str.replace("8", "i");
		str = str.replace("9", "j");	
		return str;
	}
	public static String Decoding(String str) {
		str = str.replace("a", "0");
		str = str.replace("b", "1");
		str = str.replace("c", "2");
		str = str.replace("d", "3");
		str = str.replace("e", "4");
		str = str.replace("f", "5");
		str = str.replace("g", "6");
		str = str.replace("h", "7");
		str = str.replace("i", "8");
		str = str.replace("j", "9");
		return str;
	}
		
}
	
