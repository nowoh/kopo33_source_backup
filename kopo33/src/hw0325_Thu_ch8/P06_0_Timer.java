package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P06_0_Timer extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		P06_0_Timer thread = new P06_0_Timer();
		
		System.out.println(getCurrentTime());
		int timer = scan.nextInt();
		Thread.sleep(timer * 1000);
		System.out.println("Time is over (" + getCurrentTime() + ")");
		
	}
	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	

}
