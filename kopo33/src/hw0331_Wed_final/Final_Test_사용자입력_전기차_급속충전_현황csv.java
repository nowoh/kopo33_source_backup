package hw0331_Wed_final;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Final_Test_������Է�_������_�޼�����_��Ȳcsv {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\�ѱ�ȯ�����_������ ������ ��Ȳ_ȯ��� �����޼�������_20200629.csv"));
		String line;
		int n = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = 0;
		int count = 0;
		
		System.out.print("���ϴ� �⵵ �Է� : ");
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
		System.out.println(input + "�⵵ �հ� : " + sum);
		System.out.println(input + "�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum/count);
		System.out.println(input + "�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min);
		System.out.println(input + "�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max);
	}
}
