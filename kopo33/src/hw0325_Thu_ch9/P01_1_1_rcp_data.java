package hw0325_Thu_ch9;

import java.io.FileWriter;
import java.io.IOException;

public class P01_1_1_rcp_data {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Howon\\Desktop\\RSP.txt", true);
		for (int i = 11; i < 16; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);;
		}
		fw.close();
	}

}
