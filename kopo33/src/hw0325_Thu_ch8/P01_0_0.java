package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P01_0_0 {

	public static void main(String[] args) {
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
