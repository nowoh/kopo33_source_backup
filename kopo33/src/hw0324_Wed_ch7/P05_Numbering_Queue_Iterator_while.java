package hw0324_Wed_ch7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P05_Numbering_Queue_Iterator_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<Integer>();
		
		int[] input = new int[6]; 
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		for (int j = 0; j < input.length; j++) {
			inputs.add(input[j]);
		}
		try {
			int number = scan.nextInt();
			int a = 0;
			while (a < input.length) {
				if (number == inputs.get(a)) {
					System.out.println(a+1);
					a++;
					break;
//				} else if (number != inputs.get(a)) {
//					System.out.println("no");
//					break;
				} else {
					a++;
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
