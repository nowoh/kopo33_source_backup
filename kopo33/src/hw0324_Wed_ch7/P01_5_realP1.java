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

public class P01_5_realP1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String[] spl = input.split(" ");
		
		ArrayList<String> spl1 = new ArrayList<String>();
		
		for (int i = 0; i < spl.length; i++) {
			spl1.add(spl[i]);
		}
		Collections.sort(spl1);
		System.out.println(spl1);
	}
}
