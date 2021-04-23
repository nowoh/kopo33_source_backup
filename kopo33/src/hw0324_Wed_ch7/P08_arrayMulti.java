package hw0324_Wed_ch7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P08_arrayMulti {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Double> number = new LinkedList<Double>();
		String num = scan.nextLine();
		int choose = scan.nextInt();
		
		String[] arrayNum = num.split(" ");
		//double[] nums = new double[arrayNum.length];
		
		for (int i = 0; i < arrayNum.length; i++) {
			number.offer(Double.parseDouble(arrayNum[i]));
		}
		
		int count = 0;
		for (int a = 0; a < arrayNum.length; a++) {
			double temp = number.poll();
			if (temp % choose == 0) {
				if(arrayNum[a].contains(".")) {
					System.out.print(temp + " ");
				}
				else System.out.print((int)temp + " ");
				//System.out.print(temp + " ");
				
				count++;
			} 
		}
		if (count == 0) {
			System.out.println("NO RESULT");
		}
	}
}
