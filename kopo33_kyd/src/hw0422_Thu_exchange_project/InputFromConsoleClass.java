package hw0422_Thu_exchange_project;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scan = null;
	InputFromConsoleClass() {				//������
		scan = new Scanner(System.in);
	}
	protected void fianlize() {				//�Ҹ���
		scan.close();
	}
	
	public void inputWon(ExchangeType et) {
		System.out.print("���� ��ȭ �Է� : ");
		et.won = scan.nextDouble();
	}
	public void inputType(ExchangeType et) {
		System.out.println("ȯ���� ���� ����(0 : Close, 1 : USD, 2 : EUR, 3 : JPY)?");
		et.type = scan.nextInt();
		
		if (et.type == CostValueClass.EX_TYPE_USD) {
			et.exType = "USD";
			
		} else if (et.type == CostValueClass.EX_TYPE_EURO) {
			et.exType = "EURO";
			
		} else if (et.type == CostValueClass.EX_TYPE_JPY) {
			et.exType = "JPY";
		}
	}
}	
