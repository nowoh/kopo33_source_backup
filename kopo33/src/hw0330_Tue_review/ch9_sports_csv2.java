package hw0330_Tue_review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class ch9_sports_csv2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\�������������� ���������(2019-12-03)..csv"));
		
		String line;
		int basket = 0;
		int volley = 0;
		int ice = 0;
		
		while ((line = reader.readLine()) != null) {		
			if (line.contains("��")) {
				basket++;
			}
			if (line.contains("�豸")) {
				volley++;
			}
			if (line.contains("����")) {
				ice++;
			}
		}
		System.out.println("�� �� : " + basket + "��");
		System.out.println("�豸 �� : " + volley + "��");
		System.out.println("���� �� : " + ice + "��");
		
	}

}
