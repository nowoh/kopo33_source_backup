package hw0402_Fri;

import java.util.Scanner;

public class kyd_MoneyConverter_���� {	//������
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult; //��ȭ���
		double EX_RATE = 1127.6; //ȯ��
		int usd; //�޷�
	    double changeWon; //�Ž����� �Ҽ��� ����
		int changeWonResult = 0; //�Ž����� �Ҽ��� ����
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; //�޷�����
		int usdCurrent; //
		int won5000, won1000, won500, won100, won50, won10; //��ȭ ����
		int wonCurrent;
		int type; //��ȭ ����
		int euro; 
		int euro500, euro200, euro100, euro50, euro20, euro10, euro5; //���δ��� 
		int euroCurrent;
		int jpy;
		int jpy10000, jpy5000, jpy2000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1;
		int jpyCurrent;
		double EX_RATE_EURO = 1327.65;
		double EX_RATE_JPY = 10.20;
		
		
		
		System.out.print("���� ��ȭ �Է� : ");
		won = scan.nextDouble();
		System.out.println("ȯ���� ���� ����(1 : USD, 2 : EUR, 3 : JPY)?");
		type = scan.nextInt();
		
		if (type == 1) {
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
			
			
			
			
			
		} else if (type == 2) {
			exchangeResult = won / EX_RATE_EURO;
			euro = (int)exchangeResult/5*5;		//�ּ� ���� ���� ������ 5����
			euroCurrent = euro;
			changeWon = (won - (euro * EX_RATE_EURO)) / 10;
			changeWonResult = (int)changeWon * 10;
			System.out.println("���η� ȯ�� ���");
			System.out.println("���� ���� : " + euro +" ����");
			//����ȭ��� ��� ���;��ϴ°�
			euro500 = euroCurrent / 500;
			euroCurrent -= 500 * euro500;
			System.out.print("500���� : " + euro500 + "��\t");
			euro200 = euroCurrent / 200;
			euroCurrent -= 200 * euro200;
			System.out.print("200���� : " + euro200 + "��\t");
			euro100 = euroCurrent / 100;
			euroCurrent -= 100 * euro100;
			System.out.println("100���� : " + euro100 + "��");
			euro50 = euroCurrent / 50;
			euroCurrent -= 50 * euro50;
			System.out.print("50���� : " + euro50 + "��\t");
			euro20 = euroCurrent / 20;
			euroCurrent -= 20 * euro20;
			System.out.print("20���� : " + euro20 + "��\t");
			euro10 = euroCurrent / 10;
			euroCurrent -= 10 * euro10;
			System.out.print("10���� : " + euro10 + "��\t");
			euro5 = euroCurrent / 5;
			euroCurrent -= 5 * euro5;
			System.out.println("5���� : " + euro5 + "��");
			
		} else if (type == 3) {
			exchangeResult = won / EX_RATE_JPY;
			jpy = (int)exchangeResult/1000*1000;	//�ּ� ��ȭ ���� ������ 1000��
			jpyCurrent = jpy;
			changeWon = (won - (jpy * EX_RATE_JPY)) / 10;
			changeWonResult = (int)changeWon * 10;
			System.out.println("��ȭ�� ȯ�� ���");
			System.out.println("��ȭ ���� : " + jpy +" ��");
			//��ȭȭ��� ��� ���;��ϴ°�
			jpy10000 = jpyCurrent / 10000;
			jpyCurrent -= 10000 * jpy10000;
			System.out.print("10000�� : " + jpy10000 + "��\t");
			jpy5000 = jpyCurrent / 5000;
			jpyCurrent -= 5000 * jpy5000;
			System.out.print("5000�� : " + jpy5000 + "��\t");
			jpy2000 = jpyCurrent / 2000;
			jpyCurrent -= 2000 * jpy2000;
			System.out.print("2000�� : " + jpy2000 + "��\n");
			jpy1000 = jpyCurrent / 1000;
			jpyCurrent -= 1000 * jpy1000;
			System.out.print("1000�� : " + jpy1000 + "��\n");
//			jpy500 = jpyCurrent / 500;
//			jpyCurrent -= 500 * jpy500;
//			System.out.print("500�� : " + jpy500 + "��\t");
//			jpy100 = jpyCurrent / 100;
//			jpyCurrent -= 100 * jpy100;
//			System.out.print("100�� : " + jpy100 + "��\n");
//			jpy50 = jpyCurrent / 50;
//			jpyCurrent -= 50 * jpy50;
//			System.out.print("50�� : " + jpy50 + "��\t");
//			jpy10 = jpyCurrent / 10;
//			jpyCurrent -= 10 * jpy10;
//			System.out.print("10�� : " + jpy10 + "��\t");
//			jpy5 = jpyCurrent / 5;
//			jpyCurrent -= 5 * jpy5;
//			System.out.print("5�� : " + jpy5 + "��\n");
//			jpy1 = jpyCurrent / 1;
//			jpyCurrent -= 1 * jpy1;
//			System.out.print("1�� : " + jpy1 + "��\n");
		
			
		} else {
			System.out.println("ERROR. Please choose right type.");
		}	
		//��ȭ �Ž����� ���
		System.out.println("��ȭ �Ž����� ���� : " +changeWonResult+"��");
		wonCurrent = changeWonResult;
		won5000 = wonCurrent/5000;
		wonCurrent -= 5000 * won5000;
		System.out.print("5000�� : " + won5000 + "��\t");
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