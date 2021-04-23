package hw0322_Mon_ch5;

public class P09course_1 {
	
	public static void printMenu() {
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. MyCourse");
		System.out.print("--> ");
	}
	
	public static void printCourseList() {
		System.out.println("#Course List");
		System.out.println("1. Korean");
		System.out.println("2. Math");
		System.out.println("3. English");
		System.out.println("4. Social Studies");
		System.out.println("5. Science");
		System.out.println("0. Back to Main");
		System.out.print("--> ");
			
	
	}
	public static void getCourse(int num) {
		//while (true) {
		switch (num) {
		case 1 :
			System.out.println("\"Korean\" is registered");
			P09course_1.printCourseList();
			break;
		case 2 :
			System.out.println("\"Math\" is registered");
			P09course_1.printCourseList();
			break;
		case 3 :
			System.out.println("\"English\" is registered");
			P09course_1.printCourseList();
			break;
		case 4 :
			System.out.println("\"Social Studies\" is registered");
			P09course_1.printCourseList();
			break;
		case 5 :
			System.out.println("\"Science\" is registered");
			P09course_1.printCourseList();
			break;
		case 0 :
			
			break;	
		}
		
		
	}
}
