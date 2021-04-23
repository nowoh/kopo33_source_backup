package hw0330_Tue_review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ch9_sports_csv {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\½ºÆ÷Ã÷Áö¿øÆ÷ÅÐ ÆÀµî·ÏÁ¤º¸(2019-12-03)..csv"));
		ArrayList<String> basket = new ArrayList<String>();
		ArrayList<String> volley = new ArrayList<String>();
		ArrayList<String> ice = new ArrayList<String>();
		
		String line;
		
		while ((line = reader.readLine()) != null) {		
			String[] lines= line.split(",");
			if (lines[4].contains("³ó±¸")) {					//number of basketball teams
				basket.add(lines[4]);
			} else if (lines[4].contains("¹è±¸")) {				//number of volleyball teams
				volley.add(lines[4]);
			} else if (lines[4].contains("ºù»ó")) {				//number of  ice sports teams
				ice.add(lines[4]);
			}
		}
		System.out.println("³ó±¸ ÆÀ ¼ö : " + basket.size());
		System.out.println("¹è±¸ ÆÀ ¼ö : " + volley.size());
		System.out.println("ºù»ó ÆÀ ¼ö : " + ice.size());
		
	}

}
