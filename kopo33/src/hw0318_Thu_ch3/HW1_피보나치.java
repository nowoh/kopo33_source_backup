package hw0318_Thu_ch3;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class HW1_피보나치 {

	public static void main(String[] args) throws ParseException{
		   Scanner scan = new Scanner(System.in);

		   int num = scan.nextInt();
		   int a = 0, b = 1, next;   

		   for(int i = 0; i < num; i++){
		      if (i == 0) System.out.print(a + " ");
		      else if (i == 1)  System.out.print(b + " ");
		      else {
		         next = a + b;
		         System.out.print(next + " ");
		         a = b;
		         b = next;
		      }
		   }
		}
}


