package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P03_2_RandomSum  {

	public static void main(String[] args)  {
		Thread thread1 = new MultiThreadSum("[ Thread " + 1 + " ]");
		thread1.start();
		Thread thread2 = new MultiThreadSum("[ Thread " + 2 + " ]");
		thread2.start();
	}
}
class MultiThreadSum extends Thread {
	public MultiThreadSum(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		int sum = 0;
		while (true) {
			int a = (int)((Math.random() * 9 + 1));
			sum += a;
			try {
				
				Thread.sleep(1000);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (sum >= 100) {
				break;
			} else {
			}
		}
		
		System.out.println(this.getName() + "  ");	
	}
}
