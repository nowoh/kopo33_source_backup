package hw0322_Mon_ch5;

import java.util.Scanner;

public class P03_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*P03_Characters char1 = new P03_Characters("D");
		System.out.print("1. ");
		System.out.println(char1.printCharacter());
		
		P03_Characters char2 = new P03_Characters("E", 46.1);
		System.out.print("2. ");
		System.out.println(char2.printCharacter());
		
		P03_Characters c = new P03_Characters("C", 8, 9, 10);
		System.out.println(c.printCharacter());*/
		
		P03_Characters ad = new P03_Characters("c");
		ad.setName("a");
		System.out.println(ad.printCharacter());
		//getter & setter
		
		
	}
}
