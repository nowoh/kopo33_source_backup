package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P02_read {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\경기도 성남시_스마트도서관_현황_20210129.csv"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
