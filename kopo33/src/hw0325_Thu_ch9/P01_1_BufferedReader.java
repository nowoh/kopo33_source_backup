package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class P01_1_BufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\out.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
