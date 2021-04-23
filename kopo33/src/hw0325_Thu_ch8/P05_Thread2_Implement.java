package hw0325_Thu_ch8;

public class P05_Thread2_Implement implements Runnable {

	public static void main(String[] args) {
		P05_Thread2_Implement main = new P05_Thread2_Implement();
		Thread thread = new Thread(main);
		thread.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
