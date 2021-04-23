package hw0322_Mon_ch5;

import java.util.Scanner;

import hw0317_Wed_ch2.string;

public class P07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String student1, student2, student3, student4, student5;
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Input a record");
			System.out.println("2. Make descriptive statistics");
			System.out.println("3. Print all the records");
			int n = scan.nextInt();
			//string student1, student2, student3, student4; 
			switch (n) {
				case 1 :
					String student1 = scan.nextLine();
					String student2 = scan.nextLine();
					String student3 = scan.nextLine();
					String student4 = scan.nextLine();
					String student5 = scan.nextLine();
					String[] s1 = student1.split(",");
					System.out.println(s1[1]);
					String[] s2 = student1.split(",");
					String[] s3 = student1.split(",");
					String[] s4 = student1.split(",");
					String[] s5 = student1.split(",");
				case 2 :
				case 3 :
					
			} 
				
		}
		//public 
		
		
		
		
		
		

	}


}
