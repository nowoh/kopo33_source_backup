package hw0324_Wed_ch7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P06_1_Sort {

	public static void main(String[] args) {
		String[] temp = {"lee", "kim", "john", "bill", "mike"};
		//String sort
		Arrays.sort(temp);;
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("==================");
		//String reverse
		Arrays.sort(temp, Collections.reverseOrder());
		for ( int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		System.out.println("==================");
		
		//Integer sort
		Integer[] temp2 = {23, 7, 30, 100, 1};
		Arrays.sort(temp2);
		for (int i = 0; i < temp2.length; i++) {
			System.out.println(temp2[i]);
		}
		System.out.println("==================");
		
		//Integer reverse
		Arrays.sort(temp2, Collections.reverseOrder());
		for ( int i = 0; i < temp2.length; i++) {
			System.out.println(temp2[i]);
		}
	}
}
