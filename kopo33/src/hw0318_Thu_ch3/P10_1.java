package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P10_1 {

	public static void main(String[] args) {
		//String Class [" "로 split해서 정열하기]
		String text = "Hello how are you? I'm fine thank you and you";
		/*System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		
		char[] c= text.toCharArray();
		System.out.println(c[0]); */
		
		
		String[] t = text.split(" ");
		System.out.println(t.length);
		for (int n = 0; n < t.length; n++) {
			System.out.println(t[n]);
		}
		
		
	}	
}



