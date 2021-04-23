package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P01_1_BufferedReader_월별교통 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\도로교통공단_시군구별 월별 교통사고 통계_20191231.csv"));
		ArrayList<Integer> number = new ArrayList<Integer>();
		String line;
		int sum = 0;
		int n = 0;
		double cnt = 0;
		int min = 100000000;
		int max = -1;
		int m = scan.nextInt();
		while ((line = reader.readLine()) != null) {
			String[] lines = line.split(",");
			n = Integer.parseInt(lines[m]);  //for문으로 해당 카테고리 범위 지정 출력 가능한지??
			sum += n;
			cnt++;
			if (min > n) {
				min = n;
			} 
			if (max < n) {
				max = n;
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);
		System.out.println(min);
		System.out.println(max);
	}
}
