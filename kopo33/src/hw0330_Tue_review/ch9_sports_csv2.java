package hw0330_Tue_review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ch9_sports_csv2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\½ºÆ÷Ã÷Áö¿øÆ÷ÅÐ ÆÀµî·ÏÁ¤º¸(2019-12-03)..csv"));
		
		String line;
		int basket = 0;
		int volley = 0;
		int ice = 0;
		
		while ((line = reader.readLine()) != null) {		
			if (line.contains("³ó±¸")) {
				basket++;
			}
			if (line.contains("¹è±¸")) {
				volley++;
			}
			if (line.contains("ºù»ó")) {
				ice++;
			}
		}
		System.out.println("³ó±¸ ÆÀ : " + basket + "ÆÀ");
		System.out.println("¹è±¸ ÆÀ : " + volley + "ÆÀ");
		System.out.println("ºù»ó ÆÀ : " + ice + "ÆÀ");
		
	}

}
