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

public class P02_0_String2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> spl1 = new ArrayList<Integer>();
		int a = scan.nextInt();
		int[] spl2 = new int[a];
		scan.nextLine();
		String input = scan.nextLine();
		String[] spl = input.split(" ");
		
		for (int i = 0; i < spl.length; i++) {
			spl2[i] = Integer.parseInt(spl[i]);
			spl1.add(spl2[i]);
		}
		if (a == spl2.length ) {
			System.out.println(spl1);
			Collections.sort(spl1);
			System.out.println(spl1);
			Collections.reverse(spl1);
			System.out.println(spl1);
		} else if (a != spl2.length) {
			System.out.println("error");
		} 
		
	}
}
