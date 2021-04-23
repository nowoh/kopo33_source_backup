package hw0326_Fir_review;

import java.util.Scanner;

public class ch2_0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i = 0;
		while (i < N) {
			int j = 0;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}	
	}
}
		

		//대소문자 구분 없이 contains
//		String sentence = scan.nextLine(); //입력할 문장
//		String text = scan.nextLine(); 		//입력할 단어
//		
//		if(sentence.toLowerCase().contains(text.toLowerCase())) {
//			System.out.println(text + " is included in the input string");
//		} else {
//			System.out.println(text + " is not included in the input string");
//		}
		
		
		//while 써서 P9해보기
//		int range = scan.nextInt(); //range
//		int itv = scan.nextInt();	//interval
//		
//		int a = 1;
//		int sum = 0;
//		while (a >= range) {
//			sum += a;
//			a += itv;
//		}
//		System.out.println(sum);
		
		
		
