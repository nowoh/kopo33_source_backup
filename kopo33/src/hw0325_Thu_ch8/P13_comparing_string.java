package hw0325_Thu_ch8;

import java.util.HashSet;
import java.util.Scanner;

public class P13_comparing_string {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		String[] ArStr1 = str1.split("");
		String[] ArStr2 = str2.split("");
		
		System.out.println("1 : " + ArStr1.length);
		System.out.println("2 : " + ArStr2.length);
		
		HashSet<String> same = new HashSet<String>();	
		for(int i = 0; i < ArStr1.length; i++){
			for(int j = 0; j < ArStr2.length; j++){
				if(ArStr1[i].equals(ArStr2[j])){
					same.add(ArStr1[i]);
					break;
				}
			}
		}	
		System.out.println("3 : " + same.size());
	}
}
