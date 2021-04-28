package hw0326_Fir_review;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import hw0325_Thu_ch8.P05_Thread2_Implement;

public class B_08_Test implements Runnable {

	public static void main(String[] args) throws IOException {
		B_08_Test main = new B_08_Test();
		Thread thread = new Thread(main);
		thread.start();
		

	}

	@Override
	public void run() {
		
		double sum = 0;
		double avg = 0;
		double min = 1000000000;
		double max = 0;
		int count = 1;
		String data;
		while (true) {
			double number =(double)(Math.random() * 20);
			System.out.println(number);
			sum += number;
			avg = sum/count;
			if (min > number) {
				min = number;
			}
			if (max < number) {
				max = number;
			}
			System.out.println("count-" + count + " sum - " + sum +  " avg - " + avg + " min - " + min + " max - " + max);
			
			data = "count-" + count + " sum - " + sum +  " avg - " + avg + " min - " + min + " max - " + max;
			
			try {
				datas(data);
				Thread.sleep(500);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
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
		FileWriter fw = new FileWriter("C:\\Users\\Howon\\Desktop\\out.txt", true);
		fw.write(db);
		fw.write("\n");
		fw.close();
	}

}
