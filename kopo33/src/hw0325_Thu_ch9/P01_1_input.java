package hw0325_Thu_ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P01_1_input {

	public static void main(String[] args) throws IOException {
		byte[] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\Howon\\Desktop\\out.txt");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);

		input.close();
	}
}
