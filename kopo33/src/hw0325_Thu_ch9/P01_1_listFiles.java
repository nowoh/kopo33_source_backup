package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class P01_1_listFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Howon\\Desktop\\data.csv");
		System.out.println(file.exists());
		if (file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}
}
