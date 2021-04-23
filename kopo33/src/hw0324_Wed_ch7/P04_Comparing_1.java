package hw0324_Wed_ch7;

import java.util.HashSet;
import java.util.Scanner;

public class P04_Comparing_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		String[] ArStr1 = str1.split("");
		String[] ArStr2 = str2.split("");
		
		System.out.println("1 : " + ArStr1.length);
		System.out.println("2 : " + ArStr2.length);
		
		HashSet<String> hashStr1 = new HashSet<String>();
		for (int i = 0; i < ArStr1.length; i++) {
			hashStr1.add(ArStr1[i]);
		}
		
		HashSet<String> hashStr2 = new HashSet<String>();
		for (int i = 0; i < ArStr2.length; i++) {
			hashStr2.add(ArStr2[i]);
		}
		
		int min, max;
		if (ArStr1.length < ArStr2.length) {
			min = ArStr1.length;
			max = ArStr2.length;
		} else {
			min = ArStr2.length;
			max = ArStr1.length;
			
		}
		int count = 0;	
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < max; j++) {
				if (min == ArStr1.length) {
					if (hashStr1[i].equals(hashStr2[j])) {
						count++;
					}
				} else if (min == ArStr2.length) {
					if (hashStr2[i].equals(hashStr1[j])) {
						count++;
					}
				}
				
			}
		}
		System.out.println("3 : " + count);

	}

}
