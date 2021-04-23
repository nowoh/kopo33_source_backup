package hw0412_Mon_dailyTest;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import hw0325_Thu_ch8.P05_Thread2_Implement;

public class B_08_Test extends Thread {

	public static void main(String[] args) throws InterruptedException {
		B_08_Test main = new B_08_Test();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		
		double sum = 0, avg = 0;
		double min = Double.MAX_VALUE, max = 0; 
		int count = 1;
		String data;
		while (true) {
			double number =(double)(Math.random() * 19 + 1);
			System.out.println(number);
			sum += number;
			avg = sum/count;
			if (min > number) {
				min = number;
			}
			if (max < number) {
				max = number;
			}
			System.out.println("count-" + count + " sum - " 
			+ sum +  " avg - " + avg + " min - " + min + " max - " + max);
			
			data = "count-" + count + " sum - " + sum +  " avg - " 
			+ avg + " min - " + min + " max - " + max;
			
			try {
				datas(data);
				Thread.sleep(500);
			} catch (IOException e) {
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			
			if (count > 10) {
				break;
			} else {
			}
		}
	}
	
	public static void datas (String db) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\howon\\Desktop\\out.txt", true);
		fw.write(db);
		fw.write("\n");
		fw.close();
	}

}
