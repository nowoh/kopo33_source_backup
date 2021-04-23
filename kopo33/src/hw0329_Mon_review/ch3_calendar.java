package hw0329_Mon_review;

import java.util.Calendar;
import java.util.Scanner;


public class ch3_calendar {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		Scanner scan = new Scanner(System.in); 
		
		System.out.printf("�⵵ �Է� : "); 
		int year = scan.nextInt();  
		System.out.printf("�� �Է� : "); 
		int month = scan.nextInt(); 
		
		cal.set(Calendar.YEAR, year);  //�Է¹��� �⵵�� ����
		cal.set(Calendar.MONTH, month); //�Է¹��� ���� ����
		
		System.out.println("SUN MON TUE WED THU FRI SAT"); 
		cal.set(year,month-1,1); //�Է¹��� ���� 1�Ϸ� ���� //month�� 0�� 1���̹Ƿ� -1�� ���ش�.
		
		int end = cal.getActualMaximum(Calendar.DATE);  //���� ������ ��.
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);  //�ش� ��¥�� ����(1���� �Ͽ���)
		
		for(int i = 1; i <= end; i++) { 
			if(i == 1) { 
				for(int j = 1; j < dayOfWeek; j++) { 
					System.out.printf("    "); 
				} 
			}	
			if(i < 10) { 					//�ϼ��� �� �ڸ��� ��� ���� �߰��ؼ� �� ���߱�
				System.out.printf(" "); 
			} 
			System.out.printf(" "+i+" "); 	 //�� ���
			
			if(dayOfWeek % 7 == 0) {   //�� �ٲٱ�
				System.out.println(); 
			} 
			dayOfWeek++; 
		} 
		
	}
}
