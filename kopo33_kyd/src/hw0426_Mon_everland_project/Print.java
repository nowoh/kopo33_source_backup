package hw0426_Mon_everland_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hw0422_Thu_exchange_project.CostValueClass;

public class Print {
	Scanner scan = null;
	Print() {
		scan = new Scanner(System.in);
	}
	protected void finalize() {
		scan.close();
	}
	
	//티켓 가격 출력
	public void pricePrint(int priceResult) {
		System.out.printf("가격은 %s 원 입니다.\n", priceResult);
		System.out.printf("감사합니다.\n");
	}
	
	//주문 내역 출력
	public void orderPrint(int totalPrice, int position, int orderList[][]) {
		System.out.printf("티켓 발권을 종료합니다. 감사합니다. \n");
		System.out.println();
		System.out.printf("===============에버랜드===============\n");
		
		for (int index = 0; index < position; index++) {
			switch(orderList[index][0]) {
				case 1 : 
					System.out.printf("주간권 ");
					break;
				case 2 : 
					System.out.printf("야간권 ");
					break;
				default : 
					break;
			}
			
			if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.BABY) {
				System.out.printf("유  아 ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.CHILD) {
				System.out.printf("어린이 ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.TEEN) {
				System.out.printf("청소년 ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.ADULT) {
				System.out.printf("어  른 ");
			} else {
				System.out.printf("노  인 ");
			}
			
			System.out.printf("X %3d", orderList[index][2]);
			System.out.printf("%8d  ", orderList[index][3]);
			
			switch(orderList[index][4]) {
			case 1 :
				System.out.printf("*우대적용 없음\n");
				break;
			case 2 :
				System.out.printf("*장애인 우대적용\n");
				break;
			case 3 : 
				System.out.printf("*국가 유공자 우대적용\n");
				break;
			case 4 :
				System.out.printf("*다자녀 우대적용\n");
				break;
			case 5 :
				System.out.printf("*임산부 우대적용\n");
				break;
			default : 
				break;
			}
		}
		System.out.println();
		System.out.printf("입장료 총액은 %d 원 입니다.\n", totalPrice);
		System.out.printf("======================================\n");
		System.out.println();
	}
	
	//이어서 주문 or 주문 내역 출력 후 종료
	public int orderContinue() {
		int continueNumber = 0;
		
		System.out.printf("계속 발권 하시겠습니까?\n");
		System.out.printf("1. 티켓 발권\n");
		System.out.printf("2. 종료\n");
		
		while(true) {
			continueNumber = scan.nextInt();
			
			if(continueNumber == 1 || continueNumber == 2) {
				break;
			} else {
				System.out.printf("%s", FixedValue.ERROR_MSG);
			}
		}
		return continueNumber;
	}
	
	
	
	
	
	
	

}
