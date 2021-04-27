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
	
	
	//권종 입력
	public int inputTicketSelect(ChValue cv) {
		cv.ticketSelect = 0;
		
		System.out.printf("%s\n", "권종을 선택하세요.");
		System.out.printf("%s\n", "1. 주간권");
		System.out.printf("%s\n", "2. 야간권");
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
	
	//주민등록번호 입력
	public long inputCustomerIDNumber(ChValue cv) {
		cv.customerIDNumber = 0;
		 System.out.printf("%s\n", "주민등록번호를 입력하세요. (- 제외 숫자만 입력)");
		 
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
	
	//주문 갯수 입력
	public int inputOrderCount(ChValue cv) {
		cv.orderCount = 0;
		
		System.out.printf("%s\n", "몇 개를 주문하시겠습니까? (최대 10개)");
		
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
	
	//우대사항 입력
	public int inputDiscount(ChValue cv) {
		cv.discountSelect = 0;
		
		System.out.printf("%s\n", "우대사항을 선택하세요.");
		System.out.printf("%s\n", "1. 없음 (나이 우대 자동처리)");
		System.out.printf("%s\n", "2. 장애인");
		System.out.printf("%s\n", "3. 국가유공자");
		System.out.printf("%s\n", "4. 다자녀");
		System.out.printf("%s\n", "5. 임산부");
		
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
	
	
	
	//input 메소드 호출
	public void inputData(int ticketSelect, long customerIDNumber, int orderCount, int discountSelect) {
//		ticketSelect = inputTicketSelect();
//		customerIDNumber = intputCustomerIDNumber();
//		orderCount = inputOrderCount();
//		discountSelect = inputDiscount();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
