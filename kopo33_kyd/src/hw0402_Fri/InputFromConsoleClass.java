package hw0402_Fri;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scan = null;
	InputFromConsoleClass() {	//������
		scan = new Scanner(System.in);
	}
	protected void fianlize() {		//�Ҹ���
		scan.close();
	}
	
	public double inputWon() {
		double won;
		System.out.print("���� ��ȭ �Է� : ");
		won = scan.nextDouble();
		return won;
	}
	public int inputType() {
		int type;
		System.out.println("ȯ���� ���� ����(0 : Close, 1 : USD, 2 : EUR, 3 : JPY)?");
		type = scan.nextInt();
		return type;
	}
}	
