package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P02_0_1_√÷¡æ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> splited1 = new ArrayList<Integer>();
		try {
			int a = scan.nextInt();
			int[] splited2 = new int[a];
			scan.nextLine();
			String input = scan.nextLine();
			String[] splited = input.split(" ");
		
			for (int i = 0; i < splited.length; i++) {
				splited2[i] = Integer.parseInt(splited[i]);
				splited1.add(splited2[i]);
			}
				Collections.sort(splited1);
				System.out.println(splited1);
			
		} catch (Exception e) {
			System.out.println("ERROR!");
		}
	}
}
