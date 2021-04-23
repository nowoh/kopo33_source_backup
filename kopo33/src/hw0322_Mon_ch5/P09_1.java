package hw0322_Mon_ch5;

import java.util.Scanner;

public class P09_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			P09course.printMenu();
			int Mnum = scan.nextInt();
			switch (Mnum) {
				case 1 :
					P09course.printCourseList();
					int Cnum = scan.nextInt();
					P09course.getCourse(Cnum);
				case 2 :	
			}
			
		}

	}

}
