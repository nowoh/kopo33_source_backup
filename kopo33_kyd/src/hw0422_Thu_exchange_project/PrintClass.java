package hw0422_Thu_exchange_project;

public class PrintClass {
	
	public void printUsd(int usd, int usd100, int usd50, 
			int usd20, int usd10, int usd5,
			int usd2, int usd1) {
		System.out.println("�޷��� ȯ�� ���");
		System.out.println("�޷� ���� : " + usd +" �޷�");
		System.out.print("100�޷� : " + usd100 +"��\t");
		System.out.print("50�޷� : " + usd50 +"��\t");
		System.out.println("20�޷� : " + usd20 +"��");
		System.out.print("10�޷� : " + usd10 +"��\t");
		System.out.print("5�޷� : " + usd5 +"��\t");
		System.out.print("2�޷� : " + usd2 +"��\t");
		System.out.println("1�޷� : " + usd1 +"��\n");
		
	}
	
	public void printEuro(int euro, int euro500, int euro200, 
			int euro100, int euro50, int euro20, 
			int euro10, int euro5) {
		System.out.println("���η� ȯ�� ���");
		System.out.println("���� ���� : " + euro +" ����");
		System.out.print("500���� : " + euro500 + "��\t");
		System.out.print("200���� : " + euro200 + "��\t");
		System.out.println("100���� : " + euro100 + "��");
		System.out.print("50���� : " + euro50 + "��\t");
		System.out.print("20���� : " + euro20 + "��\t");
		System.out.print("10���� : " + euro10 + "��\t");
		System.out.println("5���� : " + euro5 + "��\n");
		
	}
	
	public void printJpy(int jpy, int jpy10000, int jpy5000, 
			int jpy2000, int jpy1000) {
		System.out.println("��ȭ�� ȯ�� ���");
		System.out.println("��ȭ ���� : " + jpy +" ��");
		System.out.print("10000�� : " + jpy10000 + "��\t");
		System.out.print("5000�� : " + jpy5000 + "��\t");
		System.out.print("2000�� : " + jpy2000 + "��\n");
		System.out.print("1000�� : " + jpy1000 + "��\n");
	}
	
	public void printWon(int changeWonResult, int won5000, 
			int won1000, int won500, int won100, 
			int won50, int won10) {
		System.out.println("��ȭ �Ž����� ���� : " +changeWonResult+"��");
		System.out.print("5000�� : " + won5000 + "��\t");
		System.out.print("1000�� : " + won1000 +"��\t");
		System.out.print("500�� : " + won500 +"��\t");
		System.out.println("100�� : " + won100 +"��\t");
		System.out.print("50�� : " + won50 +"��\t");
		System.out.println("10�� : " + won10 +"��\n");
	}
}
