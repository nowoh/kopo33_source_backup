package hw0318_Thu_ch3;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			//System.out.println(words[i]);
			if (words[i].equals("a") || words[i].equals("an")) {
				char a = words[i+1].charAt(0);
				if (a == 'a' || a == 'e' || a == 'o' || a == 'i' || a == 'u') {
					words[i] = "an";
				} else {
					words[i] = "a";
				} 	
			}
			System.out.print(words[i] + " ");
		}
		
	}	
}



