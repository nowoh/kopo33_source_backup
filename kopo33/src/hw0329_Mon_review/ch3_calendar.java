package hw0329_Mon_review;

import java.util.Calendar;
import java.util.Scanner;


public class ch3_calendar {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		Scanner scan = new Scanner(System.in); 
		
		System.out.printf("년도 입력 : "); 
		int year = scan.nextInt();  
		System.out.printf("월 입력 : "); 
		int month = scan.nextInt(); 
		
		cal.set(Calendar.YEAR, year);  //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); //입력받은 월로 세팅
		
		System.out.println("SUN MON TUE WED THU FRI SAT"); 
		cal.set(year,month-1,1); //입력받은 월의 1일로 세팅 //month는 0이 1월이므로 -1을 해준다.
		
		int end = cal.getActualMaximum(Calendar.DATE);  //달의 마지막 날.
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  //해당 날짜의 요일(1부터 일요일)
		
		for(int i = 1; i <= end; i++) { 
			if(i == 1) { 
				for(int j = 1; j < dayOfWeek; j++) { 
					System.out.printf("    "); 
				} 
			}	
			if(i < 10) { 					//일수가 한 자리일 경우 공백 추가해서 줄 맞추기
				System.out.printf(" "); 
			} 
			System.out.printf(" "+i+" "); 	 //일 출력
			
			if(dayOfWeek % 7 == 0) {   //줄 바꾸기
				System.out.println(); 
			} 
			dayOfWeek++; 
		} 
		
	}
}
