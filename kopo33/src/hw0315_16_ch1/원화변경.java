package hw0315_16_ch1;

import java.util.Scanner;

public class ��ȭ���� {
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
		
		System.out.print("���� ��ȭ �Է� : ");
		won = scan.nextDouble();
		exchangeResult = won / EX_RATE;
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * EX_RATE)) / 10;
		changeWonResult = (int)changeWon * 10;
		System.out.println("�޷��� ȯ�� ���");
		System.out.println("�޷� ���� : " + usd +" �޷�");
		//�޷����� ��� ���;��ϴ°�
		usd100 = usdCurrent /100;
		usdCurrent -= 100 * usd100;
		System.out.print("100�޷� : " + usd100 +"��\t");
		usd50 = usdCurrent/50;
		usdCurrent -= 50 * usd50;
		System.out.print("50�޷� : " + usd50 +"��\t");
		usd20 = usdCurrent/20;
		usdCurrent -= 20 * usd20;
		System.out.println("20�޷� : " + usd20 +"��");
		usd10 = usdCurrent/10;
		usdCurrent -= 10 * usd10;
		System.out.print("10�޷� : " + usd10 +"��\t");
		usd5 = usdCurrent/5;
		usdCurrent -= 5 * usd5;
		System.out.print("5�޷� : " + usd5 +"��\t");
		usd2 = usdCurrent/2;
		usdCurrent -= 2 * usd2;
		System.out.print("2�޷� : " + usd2 +"��\t");
		usd1 = usdCurrent/1;
		usdCurrent -= 1 * usd1;
		System.out.println("1�޷� : " + usd1 +"��");
		
		//��ȭ �Ž����� ���
		System.out.println("��ȭ �Ž����� ���� : " +changeWonResult+"��");
		wonCurrent = changeWonResult;
		won1000 = wonCurrent/1000;
		wonCurrent -= 1000* won1000;
		System.out.print("1000�� : " + won1000 +"��\t");
		won500 = wonCurrent/500;
		wonCurrent -= 500 * won500;
		System.out.print("500�� : " + won500 +"��\t");
		won100 = wonCurrent/100;
		wonCurrent -= 100 * won100;
		System.out.println("100�� : " + won100 +"��\t");
		won50 = wonCurrent/50;
		wonCurrent -= 50 * won50;
		System.out.print("50�� : " + won50 +"��\t");
		won10 = wonCurrent/10;
		wonCurrent -= 10 * won10;
		System.out.println("10�� : " + won10 +"��\t");
		scan.close();
	}
}