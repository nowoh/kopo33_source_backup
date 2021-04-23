package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		//String Class
		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		
		char[] c= text.toCharArray();
		System.out.println(c[0]);
		
		System.out.println(text.replace("H", "h"));
		
		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		
	}	
}



