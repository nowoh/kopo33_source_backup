package hw0330_Tue_review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ch9_sports_csv {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\�������������� ���������(2019-12-03)..csv"));
		ArrayList<String> basket = new ArrayList<String>();
		ArrayList<String> volley = new ArrayList<String>();
		ArrayList<String> ice = new ArrayList<String>();
		
		String line;
		
		while ((line = reader.readLine()) != null) {		
			String[] lines= line.split(",");
			if (lines[4].contains("��")) {					//number of basketball teams
				basket.add(lines[4]);
			} else if (lines[4].contains("�豸")) {				//number of volleyball teams
				volley.add(lines[4]);
			} else if (lines[4].contains("����")) {				//number of  ice sports teams
				ice.add(lines[4]);
			}
		}
		System.out.println("�� �� �� : " + basket.size());
		System.out.println("�豸 �� �� : " + volley.size());
		System.out.println("���� �� �� : " + ice.size());
		
	}

}
