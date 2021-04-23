package hw0331_Wed_final;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Final_Test_사용자입력_전기차_급속충전_현황csv {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\한국환경공단_전기차 충전기 현황_환경부 공공급속충전기_20200629.csv"));
		String line;
		int n = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = 0;
		int count = 0;
		
		System.out.print("원하는 년도 입력 : ");
		String input = scan.nextLine();
		while ((line = reader.readLine()) != null) {
			
			String[] lines = line.split(",");
			if (lines[3].equals(input)) {
				n = Integer.parseInt(lines[2]);
				sum += n;
				count++;
				if (min > n) {
					min = n;
				} 
				if (max < n) {
					max = n;
				}
			}
		}
		System.out.println(input + "년도 합계 : " + sum);
		System.out.println(input + "년도 1회 설치 시 평균 충전기 수 : " + sum/count);
		System.out.println(input + "년도 1회 설치 시 최소 충전기 수 : " + min);
		System.out.println(input + "년도 1회 설치 시 최대 충전기 수 : " + max);
	}
}
