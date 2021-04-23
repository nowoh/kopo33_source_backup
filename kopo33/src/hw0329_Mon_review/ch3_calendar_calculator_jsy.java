package hw0329_Mon_review;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;


class ch3_calendar_calculator_jsy {
	public static void main(String args[]){
		 Scanner scanner = new Scanner(System.in);
		 SimpleDateFormat Format = new SimpleDateFormat("yyyyMMdd");
		 
		 String dateBeforeString = scanner.nextLine();
		 String dateAfterString = scanner.nextLine();

		 try {
		       Date dateBefore = Format.parse(dateBeforeString);
		       Date dateAfter = Format.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       int daysBetween = (int)(difference / (1000*60*60*24));
	              
	               
		       System.out.printf("%d", daysBetween);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	  }
}
