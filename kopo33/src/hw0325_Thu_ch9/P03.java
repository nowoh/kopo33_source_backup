package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P03 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\충청남도_회원가입 월별 건수_20210129.csv"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
