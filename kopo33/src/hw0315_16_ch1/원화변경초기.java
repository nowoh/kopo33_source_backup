package hw0315_16_ch1;

import java.util.Scanner;

public class ��ȭ�����ʱ� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult;
		double EX_RATE = 1133.4;
		int usd;
	    double changeWon;
		int changeWonResult;
		
		System.out.print("���� ��ȭ �Է� : ");
		won = scan.nextDouble();
		exchangeResult = won / EX_RATE;
		usd = (int)exchangeResult;
		changeWon = (int)(won - (usd * EX_RATE))/10;
		changeWonResult = (int)changeWon*10;
		System.out.println("�޷��� ȯ�� ���");
		System.out.println("�޷� ���� : " + usd +" �޷�");
		//�޷����� �� �徿 ���;��ϴ°�
		System.out.println("100�޷� : " + usd/100);
		System.out.println("50�޷� : " + usd%100/50);
		System.out.println("20�޷� : " + usd%50/20);
		System.out.println("10�޷� : " + usd%50%20/10);
		System.out.println("5�޷� : " + usd%10/5);
		System.out.println("2�޷� : " + usd%5/2);
		System.out.println("1�޷� : " + usd%5%2/1);
		
		//
		System.out.println("��ȭ ���� : "+ changeWonResult +"��");
		scan.close();
	}
}