package hw0320_Sat;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class GGD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 2; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " X " + i + " = " + (j * i) + "  ");	
			}
			System.out.println(" ");
			
		}
		scan.close();
	}
	
}


