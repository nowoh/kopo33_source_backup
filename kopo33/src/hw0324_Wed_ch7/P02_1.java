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

public class P02_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // first input number
		int[] nums = new int[n]; // initialize the array with the user input
		ArrayList<Integer> newNums = new ArrayList<Integer>();
		/*for (int i = 0; i < 5; i++) {
			nums[i] = scanner.nextInt();
		}*/
		
		int i = 0;
		while (true) {
			try {
				nums[i++] = scanner.nextInt();
			} catch(Exception e) {
				System.out.println("error");
				break;
			}
			
		}
		
		
		if (n == nums.length) {
			for (int j = 0; j < n; j++) {
				newNums.add(nums[j]);
			}
			Collections.sort(newNums);
			System.out.println(newNums);
		} else {
			
		}
		
		
		//System.out.println(newNums);
		/*if (n == nums.length ) {
			Collections.sort(newNums);
			System.out.println(newNums);
		} else if (n != nums.length) {
			System.out.println("error");
		} */
		
		
	}
}
