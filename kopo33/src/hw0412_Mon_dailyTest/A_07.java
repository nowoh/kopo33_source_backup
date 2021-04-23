package hw0412_Mon_dailyTest;

import java.util.HashSet;

public class A_07 implements Runnable {

	public static void main(String[] args) {
		A_07 main = new A_07();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		int i = 0;
		int sum = 0;
		try {
			while (true) {
				int a = (int)((Math.random() * 10) + 1);
				i++;
				sum += a;
				System.out.printf("#%d : %d(%d)\n", i, a, sum);
				Thread.sleep(100);
				
				if (sum > 100) {
					System.out.println("Count : " + i);
					break;
				} 
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}

	

}
