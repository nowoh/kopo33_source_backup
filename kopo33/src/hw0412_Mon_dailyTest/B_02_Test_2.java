package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class B_02_Test_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 1;
		
		while (true) {
			int a = (int)(Math.random() * 20);
			System.out.println(cnt +" - " +a);
			if (n == a) {
				System.out.println("Number of trial : " +cnt);
				break;
			}
			cnt++;
		}
	}	
}