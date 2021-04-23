package hw0318_Thu_ch3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Scanner;

public class P8 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		String startdate = scan.nextLine();
		int addD = scan.nextInt();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd"); //DTF 객체 생성
		LocalDate ld = LocalDate.parse(startdate, dtf); //string을 LocalDate로 변환
		
		ld = ld.plusDays(addD); //날짜 더하기
		
		String str = ld.format(DateTimeFormatter.ofPattern("yyyyMMdd")); //LocalDate를 String으로 변환 
		System.out.println(str);
	}
}



