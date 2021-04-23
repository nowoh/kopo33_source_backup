package hw0315_16_ch1;

import java.util.Scanner;

public class 원화변경 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult;
		double EX_RATE = 1133.4;
		int usd;
	    double changeWon;
		int changeWonResult;
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1;
		int usdCurrent;
		int won1000, won500, won100, won50, won10;
		int wonCurrent;
		
		System.out.print("받은 원화 입력 : ");
		won = scan.nextDouble();
		exchangeResult = won / EX_RATE;
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * EX_RATE)) / 10;
		changeWonResult = (int)changeWon * 10;
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 : " + usd +" 달러");
		//달러별로 몇개씩 나와야하는가
		usd100 = usdCurrent /100;
		usdCurrent -= 100 * usd100;
		System.out.print("100달러 : " + usd100 +"장\t");
		usd50 = usdCurrent/50;
		usdCurrent -= 50 * usd50;
		System.out.print("50달러 : " + usd50 +"장\t");
		usd20 = usdCurrent/20;
		usdCurrent -= 20 * usd20;
		System.out.println("20달러 : " + usd20 +"장");
		usd10 = usdCurrent/10;
		usdCurrent -= 10 * usd10;
		System.out.print("10달러 : " + usd10 +"장\t");
		usd5 = usdCurrent/5;
		usdCurrent -= 5 * usd5;
		System.out.print("5달러 : " + usd5 +"장\t");
		usd2 = usdCurrent/2;
		usdCurrent -= 2 * usd2;
		System.out.print("2달러 : " + usd2 +"장\t");
		usd1 = usdCurrent/1;
		usdCurrent -= 1 * usd1;
		System.out.println("1달러 : " + usd1 +"장");
		
		//원화 거스름돈 계산
		System.out.println("원화 거스름돈 지급 : " +changeWonResult+"원");
		wonCurrent = changeWonResult;
		won1000 = wonCurrent/1000;
		wonCurrent -= 1000* won1000;
		System.out.print("1000원 : " + won1000 +"장\t");
		won500 = wonCurrent/500;
		wonCurrent -= 500 * won500;
		System.out.print("500원 : " + won500 +"장\t");
		won100 = wonCurrent/100;
		wonCurrent -= 100 * won100;
		System.out.println("100원 : " + won100 +"개\t");
		won50 = wonCurrent/50;
		wonCurrent -= 50 * won50;
		System.out.print("50원 : " + won50 +"개\t");
		won10 = wonCurrent/10;
		wonCurrent -= 10 * won10;
		System.out.println("10원 : " + won10 +"개\t");
		scan.close();
	}
}