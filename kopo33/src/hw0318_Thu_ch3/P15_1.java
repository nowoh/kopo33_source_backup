package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P15_1 {

	public static void main(String[] args) {
		String temp = "abcdefghijk";
		String temp1 = temp.substring(3,7);
		System.out.println(temp1);
		String temp2 = temp.substring(6);//6부터 다 자른다
		System.out.println(temp2);
		String temp3 = temp.substring(temp.indexOf("h"));
		
	}	
}



