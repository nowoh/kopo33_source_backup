package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P07_GradeCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.nextLine(); //이름 입력
		System.out.print("점수 입력 : ");
		String score = scan.nextLine(); // 점수 입력
		
		String[] ArName = name.split(" ");
		String[] ArScore = score.split(" ");
		
//		for (int i = 0; i < ArName.length; i++) {
//			theName.add(ArName[i]);
//		}
		ArrayList<String> theName = new ArrayList<String>();
		ArrayList<Double> theScore = new ArrayList<Double>();
		
		Collections.addAll(theName, ArName);
		for (int i = 0; i < ArScore.length; i++) {
			theScore.add(Double.parseDouble(ArScore[i]));
		}
//		Collections.addAll(theScore, Double.parseDouble(ArScore[]));
		
		System.out.println();
		System.out.println("==================");
		System.out.println("<입력한 이름 오름차순 정렬>");
		Collections.sort(theName);
		System.out.print(theName);

		System.out.println();
		System.out.println("==================");
		System.out.println("<입력한 이름 내림차순 정렬>");
		Collections.reverse(theName);
		System.out.print(theName);

		System.out.println();
		System.out.println("==================");
		System.out.println("<입력한 점수 오름차순 정렬>");
		Collections.sort(theScore);
		System.out.print(theScore);

		System.out.println();
		System.out.println("==================");
		System.out.println("<입력한 점수 내림차순 정렬>");
		Collections.reverse(theScore);
		System.out.println(theScore);

	}
}
