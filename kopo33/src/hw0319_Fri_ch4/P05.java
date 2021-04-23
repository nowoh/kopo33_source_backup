package hw0319_Fri_ch4;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		NTable(N);
		
	}	
	
	public static void NTable(int NT) {
		if (NT > 0) {	
			for (int i = 2; i < 10; i++) {
				System.out.println(NT + " X " + i + " = " + (NT * i));
			}
		} else {
			System.out.println("please input right number.");
		}	
	}

}
