package hw0322_Mon_ch5;

import java.util.Scanner;

public class P09
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    int[] myCourse = [-1, -1, -1, -1, -1];
    int menuNum;
    int courseNum;
    
    P09course.printMenu();
    
    while (true) {
      menuNum = scan.nextInt();
      switch (menuNum) {
        
        case 0 : 
        P09course.printMenu();
        break;
        
        case 1 :
        P09course.printCourseList();
        courseNum = scan.nextInt();
        if(courseNum != 0){
          for(int i = 0; i < 5; i++){
            if(myCourse[i] == -1){
              myCourse[i] = courseNum;
              break;
            }
          }
        P09course.registCourse(courseNum);
        }
        break;
        
        case 2 :
        P09course.printMyCourse(myCourse);
        
        break;
        
      }
    }
  }
}

