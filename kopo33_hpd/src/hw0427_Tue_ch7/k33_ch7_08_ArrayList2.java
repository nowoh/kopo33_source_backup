package hw0427_Tue_ch7;

import java.util.ArrayList;

public class k33_ch7_08_ArrayList2 {		

	public static void main(String[] args) {
		int k33_iTestMAX = 1000000;
		ArrayList k33_iAL = new ArrayList();
		
		for (int k33_i = 0; k33_i < k33_iTestMAX; k33_i++) {
			k33_iAL.add((int)(Math.random() * 1000000));
		}
		
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf(" ArrayList %d = %d\n", k33_i, k33_iAL.get(k33_i));
		}
		System.out.printf("********************************\n");
		k33_iAL.sort(null);
		
		for (int k33_i = 0; k33_i < k33_iAL.size(); k33_i++) {
			System.out.printf(" ArrayList %d = %d\n", k33_i, k33_iAL.get(k33_i));
		}
	}

}
