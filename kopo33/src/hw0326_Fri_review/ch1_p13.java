package hw0326_Fir_review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ch1_p13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> number = new Stack<Integer>();
		
		int inNum = scan.nextInt(); //������ ��
		int formats = scan.nextInt(); //���ϴ� ����
		int a = 0; //��
		int b = 0; //������
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
			if (number.empty() == true) {		//�ҿ��� �ҽ� ����.
				break;
			}
		}
	}
}
