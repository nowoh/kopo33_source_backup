package hw0324_Wed_ch7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P06_Stack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> number = new Stack<String>();
		String num = scan.nextLine();
		String choose = scan.nextLine();
		
		String[] arrayNum = num.split(" ");
		
		for (int i = 0; i < arrayNum.length; i++) {
			number.add(arrayNum[i]);
		}
		int count  = arrayNum.length;
		for (int a = 0; a < arrayNum.length; a++) {
			if ((number.pop()).equals(choose)) {
				System.out.println(count);
				break;
			} else {
				count--;
			}
		}
		if (count <= 0) {
			System.out.println("error");
		}
	}
}
