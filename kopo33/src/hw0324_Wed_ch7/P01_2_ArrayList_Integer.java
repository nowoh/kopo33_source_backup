package hw0324_Wed_ch7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P01_2_ArrayList_Integer {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(); //String을 Integer로 변경
		number.add(321);
		number.add(235);
		number.add(651);
		number.add(111);
		number.add(1021);
		
		System.out.println(number);
		System.out.println();
		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i) +" ");
		}
		System.out.println();
		System.out.println();
		Collections.sort(number);
		System.out.println(number);
		System.out.println();
		Collections.reverse(number);
		System.out.println(number);
		
		
	}

}
