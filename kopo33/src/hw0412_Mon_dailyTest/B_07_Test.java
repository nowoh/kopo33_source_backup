package hw0412_Mon_dailyTest;

import java.util.HashSet;
import java.util.Scanner;

public class B_07_Test {

	public static void main(String[] args) {
		HashSet<Integer> number = new HashSet<Integer>();
		
		int i = 0;
		while (true) {
			int a = (int)((Math.random() * 10) + 1);
			i++;
			
			System.out.println("#" + i + "-" + a);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			number.add(a);
			
			if (number.size() == 10) {
				System.out.println("Total number of trials : " + i);
				break;
			} 
		}
	}
	
}
