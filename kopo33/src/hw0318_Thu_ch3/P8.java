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
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd"); //DTF ��ü ����
		LocalDate ld = LocalDate.parse(startdate, dtf); //string�� LocalDate�� ��ȯ
		
		ld = ld.plusDays(addD); //��¥ ���ϱ�
		
		String str = ld.format(DateTimeFormatter.ofPattern("yyyyMMdd")); //LocalDate�� String���� ��ȯ 
		System.out.println(str);
	}
}



