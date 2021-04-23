package hw0410_Sat_ch2;

import java.util.Scanner;

public class k33_ch2_실습_05 {
	/*
	 * ScannerEx
	 */
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);	
		System.out.println("두자리 정수를 하나 입력해주세요.>");	
		
		String k33_input = scan.nextLine();
		int k33_num = Integer.parseInt(k33_input);	
							
		System.out.println("입력내용 : " + k33_input);		
		System.out.printf("k33_num=%d%n", k33_num);		
	}
}
