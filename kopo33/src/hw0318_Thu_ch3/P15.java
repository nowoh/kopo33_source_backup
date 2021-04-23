package hw0318_Thu_ch3;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inNum = scan.nextLine();
		String b;
		String c;
		double b1;
		double c1;
		int i = 0;
		for (i = 0; i < inNum.length(); i++) {
			if (inNum.charAt(i) == '+') {
				b = inNum.substring(0,i);
				c = inNum.substring(i+1);
				b1 = Double.parseDouble(b);
				c1 = Double.parseDouble(c);
				System.out.println(b1+c1);
			} else if (inNum.charAt(i) == '-') {
				b = inNum.substring(0,i);
				c = inNum.substring(i+1);
				b1 = Double.parseDouble(b);
				c1 = Double.parseDouble(c);
				System.out.println(b1-c1);
			} else if (inNum.charAt(i) == '/') {
				b = inNum.substring(0,i);
				c = inNum.substring(i+1);
				b1 = Double.parseDouble(b);
				c1 = Double.parseDouble(c);
				System.out.println(b1/c1);
			} else if (inNum.charAt(i) == '*') {
				b = inNum.substring(0,i);
				c = inNum.substring(i+1);
				b1 = Double.parseDouble(b);
				c1 = Double.parseDouble(c);
				System.out.println(b1*c1);
			} 
			
				
		} 
		
	}	
		
		/*15번 문자열 자르기
		String temp = "abcdefghijk";
		String temp1 = temp.substring(3,7);
		System.out.println(temp1);
		String temp2 = temp.substring(6);//6부터 다 자른다
		System.out.println(temp2);
		*/
}



