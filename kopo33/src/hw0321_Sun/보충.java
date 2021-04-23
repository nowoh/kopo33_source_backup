package hw0321_Sun;

import java.util.Scanner;

public class º¸Ãæ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println();
		}
		System.out.println();
		String a = scan.nextInt();
		char [] re = a.toCharArray();
		
		System.out.println(a.replace(a, inc(i)));
		
		
		
		
	}
	public static void enc(char num) {
		switch (num) {
		case '0' : 
			System.out.println('a');
			break;
		case '1' :
			System.out.println('b');
			break;
		case '2' :
			System.out.println('c');
			break;
		case '3' :
			System.out.println('d');
			break;
		case '4' :
			System.out.println('e');
			break;
		case '5' :
			System.out.println('f');
			break;
		case '6' :
			System.out.println('g');
			break;
		case '7' :
			System.out.println('h');
			break;
		case '8' :
			System.out.println('i');
			break;
		case '9' :
			System.out.println('j');
			break;
		}
		
		
	}
	public static void dec(char al) {
		switch (al) {
			case 'a' : 
				System.out.println('0');
				break;
			case 'b' :
				System.out.println('1');
				break;
			case 'c' :
				System.out.println('2');
				break;
			case 'd' :
				System.out.println('3');
				break;
			case 'e' :
				System.out.println('4');
				break;
			case 'f' :
				System.out.println('5');
				break;
			case 'g' :
				System.out.println('6');
				break;
			case 'h' :
				System.out.println('7');
				break;
			case 'i' :
				System.out.println('8');
				break;
			case 'j' :
				System.out.println('9');
				break;
		
		}
		
		
	}
	
}
