package hw0318_Thu_ch3;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P15_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inNum = scan.nextLine();
		
		if(inNum.contains("+") == true) {
			String[] a = inNum.split("\\+");
			double np1 = Double.parseDouble(a[0]);
		    double np2 = Double.parseDouble(a[1]);
			System.out.println(np1 + np2);
		} else if(inNum.contains("-") == true){
			String[] a = inNum.split("\\-");
			double np1 = Double.parseDouble(a[0]);
			double np2 = Double.parseDouble(a[1]);
			System.out.println(np1 - np2);
		} else if(inNum.contains("*") == true){
			String[] a = inNum.split("\\*");
			double np1 = Double.parseDouble(a[0]);
			double np2 = Double.parseDouble(a[1]);
			System.out.println(np1 * np2);
		} else if(inNum.contains("/") == true){
		    String[] a = inNum.split("\\/");
			double np1 = Double.parseDouble(a[0]);
			double np2 = Double.parseDouble(a[1]);
			System.out.println(np1 / np2);
		}
	}	
}


