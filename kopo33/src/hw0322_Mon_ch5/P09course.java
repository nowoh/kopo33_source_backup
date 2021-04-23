package hw0322_Mon_ch5;

public class P09course {
	String[] courseList = { "Korean", "Math", "English", "Social Studies", "Science"};
	  
	public static void printMenu(){
	    System.out.println("\n#Menu");
	    System.out.println("1. Course List");
	    System.out.println("2. My Course");
	    System.out.print("--> ");
	}
	  
	public static void printCourseList(){
		System.out.println("\n#Course List");
	    for(int i = 0; i < 5; i++){
	      System.out.println(i + 1 + ". " + courseList[i]);
	    }
	    System.out.println("0. Back to Main");
	    System.out.print("--> ");
	}
	  
	public static void registCourse(int num){
	    System.out.println("\"" + courseList[num - 1] + "\" is registerd");
	    printCourseList();
	}
	  
	public static void printMyCourse(int[] myCourse){
		System.out.println("\n#My Course");
	    for(int i = 0; i < 5; i++){
	      if(myCourse[i] != -1) System.out.println(i + 1 + ". " + courseList[meCourse[i]]);
	    }
	    System.out.print("--> ");
	}
	
}
	
