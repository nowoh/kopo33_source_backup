package hw0426_Mon_everland_project;

import java.io.IOException;
import java.util.Scanner;

public class main {
	static ChValue cv;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		InputConsole IC = new InputConsole();
		CalPrice CP = new CalPrice();
		Print pr = new Print();
		FileWrite fwt = new FileWrite();
		cv = new ChValue();
		
		//cv.totalPrice = 0;
		int position = 0; 	//�ֹ� ���� �迭 Ž����
		int filePosition = 0;
		int reportPosition = 0;
		int[][] orderList = new int[10][5];
		int isExit = 0;
		int continueSelect = 0;
		
		
		do {
			while(true) {
				IC.inputData(IC.inputTicketSelect(cv), IC.inputCustomerIDNumber(cv), 
						IC.inputOrderCount(cv), IC.inputDiscount(cv));
				
				//��� ���
				cv.priceResult = CP.proecessIntergration(cv);
				
				//�ֹ����� ����s
				CP.saveOrderList(cv.ticketSelect, cv.age, cv.orderCount, 
						cv.priceResult, cv.discountSelect, position, orderList);
//				for (int i =0; i <orderList.length; i++) {
//					for (int j = 0; j <orderList[i].length; j++) {
//						System.out.printf(orderList[i][j] + " ");
//					}
//					System.out.println();
//				}
				position++;		//�ֹ��Ǽ� ++
				
				//��� �հ� ���
				cv.totalPrice += cv.priceResult;
				
				//���� ���
				pr.pricePrint(cv.priceResult);
				
				//�̾ �ֹ����� �Է�  ok
				continueSelect = pr.orderContinue();
				
				if (continueSelect == 2) {
					break;
				}
			}
			//�ֹ� ���� ���
			pr.orderPrint(cv.totalPrice, position, orderList);
			//�ֹ� ���� ���Ϸ� ���
			fwt.orderFilePrint(cv.totalPrice, position, orderList, filePosition);
			
			System.out.printf("��� ���� (1 : ���ο� �ֹ�, 2 : ���α׷� ����)\n");
			isExit = scan.nextInt();
			position = 0;
			cv.totalPrice = 0;
			//orderList = null;
		} while (isExit == 1);
		
	}
	

}
