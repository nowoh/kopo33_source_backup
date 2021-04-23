package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P02_0_Thread extends Thread {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		P02_0_Thread thread = new P02_0_Thread();
		//int timer = scan.nextInt();
		thread.start();
		System.out.println("Check 1 : " + getCurrentTime() + "-" + thread.isAlive());
		//Thread.sleep(timer * 1000);
		System.out.println("Check 2 : " + getCurrentTime() + "-" + thread.isAlive());

	}
	
	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	
	public void run() {
		int cnt = 0;
		int n = scan.nextInt();
		while (true) {
			if (cnt == 3) {
				break;
			}
			try {
				System.out.println( getCurrentTime() + "-" + cnt);
				Thread.sleep(1000);
				cnt++;
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}
	}
}
