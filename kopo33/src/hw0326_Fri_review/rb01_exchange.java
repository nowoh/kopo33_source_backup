package hw0326_Fri_review;

import java.util.Scanner;

public class rb01_exchange {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int myMoney = scanner.nextInt();
		int price = scanner.nextInt();
		int exchange = myMoney - price;
		int [] money = {10000,5000,1000,500,100,50,10};
		int change = 0;
		for (int i=0; i<money.length; i++) {
			if(i==0) {
				change = exchange/(money[i]);
				System.out.println(money[i] + "원 : " +change + "장");

			} else {
				change = exchange%(money[i-1])/money[i];
				System.out.println(money[i] +"원 : "+ change + "장");
			}
		}
	}
}
