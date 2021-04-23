package hw0315_16_ch1;

import java.util.Scanner;

public class 원화변경초기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult;
		double EX_RATE = 1133.4;
		int usd;
	    double changeWon;
		int changeWonResult;
		
		System.out.print("받은 원화 입력 : ");
		won = scan.nextDouble();
		exchangeResult = won / EX_RATE;
		usd = (int)exchangeResult;
		changeWon = (int)(won - (usd * EX_RATE))/10;
		changeWonResult = (int)changeWon*10;
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 : " + usd +" 달러");
		//달러별로 몇 장씩 나와야하는가
		System.out.println("100달러 : " + usd/100);
		System.out.println("50달러 : " + usd%100/50);
		System.out.println("20달러 : " + usd%50/20);
		System.out.println("10달러 : " + usd%50%20/10);
		System.out.println("5달러 : " + usd%10/5);
		System.out.println("2달러 : " + usd%5/2);
		System.out.println("1달러 : " + usd%5%2/1);
		
		//
		System.out.println("원화 지급 : "+ changeWonResult +"원");
		scan.close();
	}
}