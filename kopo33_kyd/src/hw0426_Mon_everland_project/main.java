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
		int position = 0; 	//주문 내역 배열 탐색용
		int filePosition = 0;
		int reportPosition = 0;
		int[][] orderList = new int[10][5];
		int isExit = 0;
		int continueSelect = 0;
		
		
		do {
			while(true) {
				IC.inputData(IC.inputTicketSelect(cv), IC.inputCustomerIDNumber(cv), 
						IC.inputOrderCount(cv), IC.inputDiscount(cv));
				
				//요금 계산
				cv.priceResult = CP.proecessIntergration(cv);
				
				//주문내역 저장s
				CP.saveOrderList(cv.ticketSelect, cv.age, cv.orderCount, 
						cv.priceResult, cv.discountSelect, position, orderList);
//				for (int i =0; i <orderList.length; i++) {
//					for (int j = 0; j <orderList[i].length; j++) {
//						System.out.printf(orderList[i][j] + " ");
//					}
//					System.out.println();
//				}
				position++;		//주문건수 ++
				
				//요금 합계 계산
				cv.totalPrice += cv.priceResult;
				
				//가격 출력
				pr.pricePrint(cv.priceResult);
				
				//이어서 주문할지 입력  ok
				continueSelect = pr.orderContinue();
				
				if (continueSelect == 2) {
					break;
				}
			}
			//주문 내역 출력
			pr.orderPrint(cv.totalPrice, position, orderList);
			//주문 내역 파일로 출력
			fwt.orderFilePrint(cv.totalPrice, position, orderList, filePosition);
			
			System.out.printf("계속 진행 (1 : 새로운 주문, 2 : 프로그램 종료)\n");
			isExit = scan.nextInt();
			position = 0;
			cv.totalPrice = 0;
			//orderList = null;
		} while (isExit == 1);
		
	}
	

}
