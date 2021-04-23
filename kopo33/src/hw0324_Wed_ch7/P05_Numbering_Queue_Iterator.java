package hw0324_Wed_ch7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P05_Numbering_Queue_Iterator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> inputs = new ArrayList<Integer>();
		
		//int inputs = scan.nextLine();
		
		int[] input = new int[6]; 
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.nextInt();
		}
		for (int j = 0; j < input.length; j++) {
			inputs.add(input[j]);
		}
		int number = scan.nextInt();
		
		try {
			for (int a = 0; a < input.length; a++) {
				if (number == inputs.get(a)) {
					System.out.println(a+1);
				} else {
					System.out.println("no");
				}
			}
		} catch (Exception e) {
			System.out.println("error");
		}//while(iterator.hasNext()) ·Î ´Ù½Ã
	}
}
