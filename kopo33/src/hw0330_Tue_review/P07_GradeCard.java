package hw0330_Tue_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P07_GradeCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] set = new String[2];
		set[0] = scan.nextLine();
		set[1] = scan.nextLine();
		
		
		System.out.println(set);
		
/*		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine(); //�̸� �Է�
		System.out.print("���� �Է� : ");
		String score = scan.nextLine(); // ���� �Է�
		
		String[] ArName = name.split(" ");
		String[] ArScore = score.split(" ");

		ArrayList<String> theName = new ArrayList<String>();
		ArrayList<Double> theScore = new ArrayList<Double>();
		
		Collections.addAll(theName, ArName);
		for (int i = 0; i < ArScore.length; i++) {
			theScore.add(Double.parseDouble(ArScore[i]));
		}
		
		System.out.println();
		System.out.println("==================");
		System.out.println("<�Է��� �̸� �������� ����>");
		Collections.sort(theName);
		System.out.print(theName);

		System.out.println();
		System.out.println("==================");
		System.out.println("<�Է��� �̸� �������� ����>");
		Collections.reverse(theName);
		System.out.print(theName);

		System.out.println();
		System.out.println("==================");
		System.out.println("<�Է��� ���� �������� ����>");
		Collections.sort(theScore);
		System.out.print(theScore);

		System.out.println();
		System.out.println("==================");
		System.out.println("<�Է��� ���� �������� ����>");
		Collections.reverse(theScore);
		System.out.println(theScore);*/
	}
}
