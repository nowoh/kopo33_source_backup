package hw0426_Mon_everland_project;

import java.util.Calendar;

public class CalPrice {
	//만나이 계산
	public int calAge(ChValue cv) {
		long calcIDNumber = 0;
		int customerYear = 0, customerMonth = 0, customerDay = 0;
		int todayYear = 0, todayMonth = 0, todayDay = 0;
		int type = 0;
		int koreanAge = 0;
		
		//주민등록번호 생년월일 추출
		cv.customerIDNumber += FixedValue.FULL_DIGIT;
		calcIDNumber = cv.customerIDNumber / FixedValue.SEVEN_DIGIT;
		type = (int) (calcIDNumber % 10);
		calcIDNumber /= FixedValue.ONE_DIGIT;
		customerDay = (int) (calcIDNumber % FixedValue.TWO_DIGIT);
		calcIDNumber /= FixedValue.TWO_DIGIT;
		customerMonth = (int) (calcIDNumber % FixedValue.TWO_DIGIT);
		calcIDNumber /= FixedValue.TWO_DIGIT;
		customerYear = (int) (calcIDNumber % FixedValue.TWO_DIGIT);
		
		if (type == FixedValue.MALE_NEW || type == FixedValue.FEMALE_NEW) {
			customerYear += FixedValue.NEW_GENERATION;
		} else {
			customerYear += FixedValue.OLD_GENERATION;
		}
		
		//오늘 날짜 구하기
		Calendar calendar = Calendar.getInstance();
		
		todayYear = calendar.get(Calendar.YEAR);
		todayMonth = calendar.get(Calendar.MONTH + 1);
		todayDay = calendar.get(Calendar.DATE);
		
		koreanAge = todayYear - customerYear + 1;
		
		//만나이 계산
		if (customerMonth < todayMonth || customerMonth == todayMonth 
				&& customerDay <= todayDay) {
			cv.age = koreanAge - FixedValue.AFTER_BIRTH;
		} else {
			cv.age = koreanAge - FixedValue.BEFORE_BIRTH;
		}
		return cv.age;
	}
	
	//연령대 별 분류
	public static int calcAgeGroup(int age) {
		int groupNum = 0;
		if (age < FixedValue.MIN_CHILD) {
			groupNum = 1;
		} else if (age >= FixedValue.MIN_CHILD && age <= FixedValue.MAX_CHILD) {
			groupNum = 2;
		} else if (age >= FixedValue.MIN_TEEN && age <= FixedValue.MAX_TEEN) {
			groupNum = 3;
		} else if (age >= FixedValue.MIN_ADULT && age <= FixedValue.MAX_ADULT) {
			groupNum = 4;
		} else if (age > FixedValue.MAX_ADULT) {
			groupNum = 5;
		}
		return groupNum;
	}
	
	//주야권과 나이에 따른 금액 계산
	public int calcPriceProcess(int age, int ticketSelect) {
		int calcPrice = 0;
		
		if (calcAgeGroup(age) == FixedValue.BABY) {
			calcPrice = FixedValue.BABY_PRICE;
		
		} else if (calcAgeGroup(age) == FixedValue.CHILD) {
			if (ticketSelect == 1) {
				calcPrice = FixedValue.CHILD_DAY_PRICE;
			} else if (ticketSelect == 2) {
				calcPrice = FixedValue.CHILD_NIGHT_PRICE;
			}
			
		} else if (calcAgeGroup(age) == FixedValue.TEEN) {
			if (ticketSelect == 1) {
				calcPrice = FixedValue.TEEN_DAY_PRICE;
			} else if (ticketSelect == 2) {
				calcPrice = FixedValue.TEEN_NIGHT_PRICE;
			}
		} else if (calcAgeGroup(age) == FixedValue.ADULT) {
			if (ticketSelect == 1) {
				calcPrice = FixedValue.ADULT_DAY_PRICE;
			} else if (ticketSelect == 2) {
				calcPrice = FixedValue.ADULT_NIGHT_PRICE;
			}
		} else if (calcAgeGroup(age) == FixedValue.OLD) {
			if (ticketSelect == 1) {
				calcPrice = FixedValue.OLD_DAY_PRICE;
			} else if (ticketSelect == 2) {
				calcPrice = FixedValue.OLD_NIGHT_PRICE;
			}
		}
		return calcPrice;
	}
	
	//우대사항에 따른 할인 계산
	public int calcDiscount(int calcPrice, int discountSelect) {
		switch(discountSelect) {
			case 2 :
				calcPrice *= FixedValue.DISABLE_RATE;
				break;
			case 3 :
				calcPrice *= FixedValue.MERIT_RATE;
				break;
			case 4 :
				calcPrice *= FixedValue.MULTICHILD_RATE;
				break;
			case 5 : 
				calcPrice *= FixedValue.PREGNANT_RATE;
				break;
			default :
				break;
		}
		return calcPrice;
	}
	
	//주문 갯수에 따른 금액 계산
	public int calcPriceResult(int calcPrice, int orderCount) {
		return calcPrice * orderCount;
	}
	
	//CalPrice 메소드 호출
	public int proecessIntergration(ChValue cv) {
		int calcPrice = 0;
		
		cv.age = calAge(cv);
		calcPrice = calcPriceProcess(cv.age, cv.ticketSelect);
		calcPrice = calcDiscount(calcPrice, cv.discountSelect);
		cv.priceResult = calcPriceResult(calcPrice, cv.orderCount);
		
		return cv.priceResult;
	}
	
	//주문 내역 저장
	public void saveOrderList(int ticketSelect, int age, int orderCount,
			int priceResult, int discountSelect, int position, int orderList[][]) {
		orderList[position][0] = ticketSelect;
		orderList[position][1] = age;
		orderList[position][2] = orderCount;
		orderList[position][3] = priceResult;
		orderList[position][4] = discountSelect;
		//position++;
		
	}
	
	
}
