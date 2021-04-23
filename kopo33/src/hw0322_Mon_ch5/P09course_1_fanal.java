package hw0322_Mon_ch5;

import java.util.ArrayList;
import java.util.Scanner;

public class P09course_1_fanal {
	public static Scanner scan = new Scanner(System.in);
	public static String[] course = {"Korean", "Math", "English", "Social Studies", "Science"};
	public static ArrayList<String> subChoice = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		while (true) {
			int menuChoice = printMenu();
			if (menuChoice == 1) {
				while (true) {
					int courseChoice = printCourseList();
					if (courseChoice == 0) {
						break;
					}
					getCourse(course, courseChoice);
					subChoice.add(course[courseChoice-1]);
					
				}

			} else if (menuChoice == 2) {
				if (subChoice.size() != 0) {
					System.out.println("#My Course");
					for (int i = 0; i < subChoice.size(); i++) {
						System.out.println(i+1 + ". " + subChoice.get(i));
					}	
					System.out.println("- End -\n");
				
				} else {
					System.out.println("My Course is empty.");
				}
			}
		}
	}
	
	public static int printMenu() {
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. MyCourse");
		System.out.print("--> ");
		return scan.nextInt();
	}
	
	public static int printCourseList() {
		System.out.println("#Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("--> ");
		return scan.nextInt();	
	}
	
	public static String getCourse(String[] str, int num) {
		try {
			for (int i = 0; i < course.length; i++) {
				String subject = str[num-1];
				if (subChoice.get(i) != null && subChoice.get(i).equals(subject) == true) {
					System.out.println("Already registered\n");
					subChoice.remove(i);
					return null;
				} else {
					
				}
			}
		} catch (Exception e) {
		}
		
		System.out.println("\"" + str[num - 1] + "\" is registered\n");
		return str[num - 1];
	}
}
