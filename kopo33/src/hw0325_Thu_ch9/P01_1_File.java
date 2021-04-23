package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class P01_1_File {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\Howon\\Desktop\\howon\\01. 교안\\기본프로그래밍(Java)_김규석\\DailyTest");
		File files[] = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
