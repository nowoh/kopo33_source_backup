package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P01_1_BufferedReader_�������� {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\���α������_�ñ����� ���� ������ ���_20191231.csv"));
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
			n = Integer.parseInt(lines[m]);  //for������ �ش� ī�װ� ���� ���� ��� ��������??
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
