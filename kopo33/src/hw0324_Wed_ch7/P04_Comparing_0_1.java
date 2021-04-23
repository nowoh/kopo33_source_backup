package hw0324_Wed_ch7;

import java.util.Scanner;

public class P04_Comparing_0_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		String[] ArStr1 = str1.split("");
		String[] ArStr2 = str2.split("");
		
		System.out.println("1 : " + ArStr1.length);
		System.out.println("2 : " + ArStr2.length);
		
		int count = 0;	
		for(int i = 0; i < ArStr1.length; i++){
			for(int j = 0; j < ArStr2.length; j++){
				if(ArStr1[i].equals(ArStr2[j])){
					ArStr2[j] = " ";
					break;
				}
			}
		}
		for(int i = 0; i < ArStr2.length; i++){
	         if(ArStr2[i] == " ") {
	        	 count++;
	         }
	     }
		System.out.println("3 : " + count);
	}

}
