package hw0325_Thu_ch8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P07_0_Timer2 extends Thread {

	public static void main(String[] args) throws InterruptedException, ParseException {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		P07_0_Timer2 thread = new P07_0_Timer2();	
		
		
		 
		
		Date first = format.parse(getCurrentTime());
		System.out.println(getCurrentTime());
		int timer = scan.nextInt();
		Date second = format.parse(getCurrentTime()); 
		
		
		long timeGap = second.getTime() - first.getTime();
		
		if (timeGap > timer * 1000) {
			System.out.println("time is already over(It's " + getCurrentTime() + ")" );
			timer = scan.nextInt();
			Thread.sleep(timer * 1000);
			System.out.println("Time is over (" + getCurrentTime() + ")");
		} else {
			System.out.println("Time is over (" + getCurrentTime() + ")");
		}
	}
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
}
