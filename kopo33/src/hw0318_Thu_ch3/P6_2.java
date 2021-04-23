package hw0318_Thu_ch3;

import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

public class P6_2 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("년도 입력 : "); 
		int year = scan.nextInt();  
		System.out.print("월 입력 : "); 
		int month = scan.nextInt(); 
		
		cal.set(Calendar.YEAR, year); 
		cal.set(Calendar.MONTH, month);  
		
		System.out.println("SUN MON TUE WED THU FRI SAT"); 
		cal.set(year,month-1,1); 
		
		int end = cal.getActualMaximum(Calendar.DATE);  
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  
		
		for(int i=1; i<=end; i++) { 
			if(i==1) { 
				for(int j=1; j<dayOfWeek; j++) { 
					System.out.print("    "); 
				} 
			}	
			if(i<10) { 
				System.out.print(" "); 
			} 
			System.out.print(" "+i+" "); 
			if(dayOfWeek % 7 == 0) {  
				System.out.println(); 
			} 
			dayOfWeek++; 
		} 
		
	}
}



