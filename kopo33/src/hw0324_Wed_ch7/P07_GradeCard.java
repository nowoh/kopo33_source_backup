package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P07_GradeCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name = scan.nextLine(); //�̸� �Է�
		System.out.print("���� �Է� : ");
		String score = scan.nextLine(); // ���� �Է�
		
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
		System.out.println(theScore);

	}
}
