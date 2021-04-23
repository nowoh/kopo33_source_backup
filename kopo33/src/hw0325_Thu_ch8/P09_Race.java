package hw0325_Thu_ch8;

public class P09_Race {

	public static void main(String[] args)  {
		Thread thread1 = new MultiThreadRace("[ " + 1 + " ]");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start(); 
		Thread thread2 = new MultiThreadRace("[ " + 2 + " ]");
		thread2.start();
		Thread thread3 = new MultiThreadRace("[ " + 3 + " ]");
		thread3.setPriority(Thread.MIN_PRIORITY);
		thread3.start();
	}
}
class MultiThreadRace extends Thread {
	public MultiThreadRace(String threadName) {
		this.setName(threadName);
	}
	@Override
	public void run() {
		double sum = 0;
		while (true) {
			double dis = (double)(Math.random() * 10);
			sum += dis;
			System.out.printf(this.getName() + "\t");
			System.out.printf("%.1fm\t", sum);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
			
			if (sum > 50) {
				System.out.printf(this.getName() + " -> END\t");
				System.out.printf("%.1fm\t", sum);
				break;
			} else {	
			}
		}
		System.out.println();
	}
}
