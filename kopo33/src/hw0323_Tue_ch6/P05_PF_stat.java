package hw0323_Tue_ch6;

import java.util.Scanner;

public class P05_PF_stat {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[][] score = {{"Jeong", "70", "80", "100"}, {"Pyo", "60", "70", "86"},
				{"Choi", "54", "100", "82"}, {"Mike", "87", "95", "79"}
		};
		while(true) {
			int mainChoice = mainMenu();
			if (mainChoice == 1) {
				int nameChoice = nameMenu(score);
				statisticsByName(score, nameChoice);
			} else if (mainChoice == 2) {
				int subjectChoice = subjectMenu(score);
				statisticsBySubject(score, subjectChoice);
			} else {
				
			}
		}
	}
	
	public static int mainMenu() {
		System.out.println("#Menu");
		System.out.println("1. Name");
		System.out.println("2. Subject");
		return scanner.nextInt();
	}
	
	public static int nameMenu(String[][] score) {
		System.out.println("#Name");
		for (int i = 0; i < score.length; i++) {
			System.out.println("#" + (i + 1) + " : " + score[i][0]);
		}
		return scanner.nextInt();
	}
	
	public static int subjectMenu(String[][] score) {
		System.out.println("#Subject Name");
		System.out.println("#1 : Korean");
		System.out.println("#2 : English");
		System.out.println("#3 : Math");
		return scanner.nextInt();
	}
	
	public static void statisticsByName(String[][] score, int nameIndex) {
		System.out.println("#Statistics : " + score[nameIndex-1][0]);
		int sum = 0;
		int avg = 0;
		int min = Integer.parseInt(score[nameIndex-1][1]);
		int max = Integer.parseInt(score[nameIndex-1][1]);
		for (int i = 1; i < score.length; i++) {
			sum = sum + Integer.parseInt(score[nameIndex-1][i]);
			avg = sum / (score[i].length-1);
			if (min > Integer.parseInt(score[nameIndex-1][i])) {
				min = Integer.parseInt(score[nameIndex-1][i]);
			}
			if (max < Integer.parseInt(score[nameIndex-1][i])) {
				max = Integer.parseInt(score[nameIndex-1][i]);
			} 
		}
		
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
	
	public static void statisticsBySubject(String[][] score, int nameIndex) {
		int sum = 0;
		int avg = 0;
		int min = Integer.parseInt(score[1][nameIndex]);
		int max = Integer.parseInt(score[1][nameIndex]);
		
		switch (nameIndex) {
			case 1 : 
				System.out.println("#Statistics : Korean");
				for (int i = 0; i < score.length; i++) {
					sum = sum + Integer.parseInt(score[i][nameIndex]);
					avg = sum / score.length;
					if (min > Integer.parseInt(score[i][nameIndex])) {
						min = Integer.parseInt(score[i][nameIndex]);
					}
					if (max < Integer.parseInt(score[i][nameIndex])) {
						max = Integer.parseInt(score[i][nameIndex]);
					}  
				}
				break;
			case 2 : 
				System.out.println("#Statistics : English");
				for (int i = 0; i < score.length; i++) {
					sum = sum + Integer.parseInt(score[i][nameIndex]);
					avg = sum / score.length;
					if (min > Integer.parseInt(score[i][nameIndex])) {
						min = Integer.parseInt(score[i][nameIndex]);
					}
					if (max < Integer.parseInt(score[i][nameIndex])) {
						max = Integer.parseInt(score[i][nameIndex]);
					}  
				}
				break;
			case 3 : 
				System.out.println("#Statistics : Math");
				for (int i = 0; i < score.length; i++) {
					sum = sum + Integer.parseInt(score[i][nameIndex]);
					avg = sum / score.length;
					if (min > Integer.parseInt(score[i][nameIndex])) {
						min = Integer.parseInt(score[i][nameIndex]);
					}
					if (max < Integer.parseInt(score[i][nameIndex])) {
						max = Integer.parseInt(score[i][nameIndex]);
					}  
				}
				break;
			
		}
		System.out.println("SUM : " + sum);
		System.out.println("AVG : " + avg);
		System.out.println("MIN : " + min);
		System.out.println("MAX : " + max);
	}
}
