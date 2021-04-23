package hw0325_Thu_ch9;

import java.io.FileOutputStream;
import java.io.IOException;

public class P01_1_output {

	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("C:\\Users\\Howon\\Desktop\\out.csv");
		String a = ("no,name,age,school,major,score\n1,kim,20,Seoul,english,5\n2,lee,30,Korea,korea,4");

		output.write(a.getBytes());

		output.close();
	}
}
