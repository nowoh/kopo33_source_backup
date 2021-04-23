package hw0325_Thu_ch8;

import java.util.Scanner;

public class P09_Race_ldy {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		P09_Race_ldy thread = new P09_Race_ldy();
		thread.start();
		System.out.println("Ready \nStart!");
		Thread.sleep(10000);
	}
	public static double randomSpeed(double n) {
		double randomNumber = ((int)(Math.random() * 100)/10.0);	
		return randomNumber;
	}
	public void run() {
		int count = 0;
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		while (true) {
			if (count == 10) {
				break;
			}
			try {
				for (int i = 0; i < count; i++) {
					sum1 = (((int)sum1* 10)/10.0) + randomSpeed(0);
					sum2 = (((int)sum2* 10)/10.0) + randomSpeed(0);
					sum3 = (((int)sum3* 10)/10.0) + randomSpeed(0);
					if(sum1 > 50) {
						String fin = Double.toString(sum1);
						fin = "(Runner1 : Finished)";
						System.out.println(fin+"\t");
						break;
					}
					if(sum2 > 50) {
						String fin = Double.toString(sum1);
						fin = "(Runner2 : Finished)";
						System.out.println(fin+"\t");
						break;
					}
					if(sum3 > 50) {
						String fin = Double.toString(sum1);
						fin = "(Runner3 : Finished)";
						System.out.println(fin+"\t");
						break;
					}	
					System.out.println(sum1 +"m" +"\t" + sum2 +"m" +"\t" + sum3 +"m" +"\t");
				}
				System.out.println("(" + count + "s)");
				Thread.sleep(1000);
				count++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
