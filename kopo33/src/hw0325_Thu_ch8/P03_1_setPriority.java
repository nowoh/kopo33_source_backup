package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P03_1_setPriority  {

	public static void main(String[] args)  {
		Thread thread1 = new MultiThreadTest1("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest1("[ Thread " + 2 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}
class MultiThreadTest1 extends Thread {
	public MultiThreadTest1(String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start ");
		
	}
}
