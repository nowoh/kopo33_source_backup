package hw0326_Fir_review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ch1_p13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> number = new Stack<Integer>();
		
		int inNum = scan.nextInt(); //십진수 값
		int formats = scan.nextInt(); //원하는 진법
		int a = 0; //몫
		int b = 0; //나머지
		while (true) {
			
			b = inNum % formats;
			number.add(b);
			a = inNum / formats;
			inNum = a;
			
			if (a < formats) {
				number.add(a);
				break;
			}
		}
		while (true) {								
			System.out.print(number.pop());
			if (number.empty() == true) {		//소영님 소스 참고.
				break;
			}
		}
	}
}
