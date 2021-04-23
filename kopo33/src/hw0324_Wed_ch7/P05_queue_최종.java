package hw0324_Wed_ch7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P05_queue_√÷¡æ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<String> number = new LinkedList<String>();
		String num = scan.nextLine();
		String choose = scan.nextLine();
		
		String[] arrayNum = num.split(" ");
		
		for (int i = 0; i < arrayNum.length; i++) {
			number.offer(arrayNum[i]);
		} // = Collections.addAll(number,arrayNum);
		
		int count  = 1;
		for (int a = 0; a < arrayNum.length; a++) {
			if ((number.poll()).equals(choose)) {
				System.out.println(count);
				break;
			} else {
				count++;
			}
		}
		if (count > arrayNum.length) {
			System.out.println("ERROR!!!");
		} 
	}
}
