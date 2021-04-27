package hw0426_Mon_everland_project;

import java.util.Scanner;

public class InputConsole {
	Scanner scan = null;
	InputConsole() {
		scan = new Scanner(System.in);
	}
	protected void finalize() {
		scan.close();
	}
	
	
	//���� �Է�
	public int inputTicketSelect(ChValue cv) {
		cv.ticketSelect = 0;
		
		System.out.printf("%s\n", "������ �����ϼ���.");
		System.out.printf("%s\n", "1. �ְ���");
		System.out.printf("%s\n", "2. �߰���");
		while(true) {
			cv.ticketSelect = scan.nextInt();
			
			if (cv.ticketSelect == 1 || cv.ticketSelect == 2) {
				break;
			} else {
				System.out.printf("%s\n", FixedValue.ERROR_MSG);
			}
		}
		return cv.ticketSelect;
	}
	
	//�ֹε�Ϲ�ȣ �Է�
	public long inputCustomerIDNumber(ChValue cv) {
		cv.customerIDNumber = 0;
		 System.out.printf("%s\n", "�ֹε�Ϲ�ȣ�� �Է��ϼ���. (- ���� ���ڸ� �Է�)");
		 
		 while(true) {
			 cv.IDNumber = scan.next();
			// cv.customerIDNumber = scan.nextLong();
			 if(cv.IDNumber.length() == 13) {
				 cv.customerIDNumber = Long.parseLong(cv.IDNumber);
				 break;
			 } else {
				 System.out.printf("%s\n", FixedValue.ERROR_MSG);
			 }
		 }
		 return cv.customerIDNumber;
	}
	
	//�ֹ� ���� �Է�
	public int inputOrderCount(ChValue cv) {
		cv.orderCount = 0;
		
		System.out.printf("%s\n", "�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
		
		while(true) {
			cv.orderCount = scan.nextInt();
			
			if(cv.orderCount <= FixedValue.MAX_COUNT && cv.orderCount >= FixedValue.MIN_COUNT) {
				break;
			} else {
				System.out.printf("%s\n", FixedValue.ERROR_MSG);
			}
		}
		return cv.orderCount;
	}
	
	//������ �Է�
	public int inputDiscount(ChValue cv) {
		cv.discountSelect = 0;
		
		System.out.printf("%s\n", "�������� �����ϼ���.");
		System.out.printf("%s\n", "1. ���� (���� ��� �ڵ�ó��)");
		System.out.printf("%s\n", "2. �����");
		System.out.printf("%s\n", "3. ����������");
		System.out.printf("%s\n", "4. ���ڳ�");
		System.out.printf("%s\n", "5. �ӻ��");
		
		while(true) {
			cv.discountSelect = scan.nextInt();
			
			if(cv.discountSelect >= 1 && cv.discountSelect <= 5) {
				break;
			} else {
				System.out.printf("%s\n", FixedValue.ERROR_MSG);
			}
		}
		return cv.discountSelect;
	}
	
	
	
	//input �޼ҵ� ȣ��
	public void inputData(int ticketSelect, long customerIDNumber, int orderCount, int discountSelect) {
//		ticketSelect = inputTicketSelect();
//		customerIDNumber = intputCustomerIDNumber();
//		orderCount = inputOrderCount();
//		discountSelect = inputDiscount();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
