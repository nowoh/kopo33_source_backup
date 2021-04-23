package hw0318_Thu_ch3;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class HW2_ÇÐÁ¡ {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);

		   int num = scan.nextInt();
		   int arr[] = new int[num];
		   double sum = 0, count = 0;
		   String grade;   

		   for(int i = 0; i < num; i++){
		      arr[i]  = scan.nextInt();
		      count += arr[i];
		   }

		   scan.nextLine();

		   for(int i = 0; i < num; i++){
		      grade = scan.nextLine();
		      switch(grade){
		         case "A+": sum += arr[i] * 4.5; 
		         	break;
		         case "A0": sum += arr[i] * 4; 
		         	break;
		         case "B+": sum += arr[i] * 3.5; 
		         	break;
		         case "B0": sum += arr[i] * 3; 
		         	break;
		         case "C+": sum += arr[i] * 2.5; 
		         	break;
		         case "C0": sum += arr[i] * 2; 
		         	break;
		         case "D+": sum += arr[i] * 1.5; 	
		         	break;
		         case "D0": sum += arr[i] * 1; 
		         	break;
		         case "F": sum += arr[i] * 0; 
		         	break;   
		      }   
		   }
		   System.out.println(sum / count);


		}
}


