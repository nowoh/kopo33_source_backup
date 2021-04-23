package hw0322_Mon_ch5;

import java.util.Scanner;

public class P10_11_together {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		reverse(str);
	}
	public static void reverse(String nums) {
		for (int i = 1; i <= nums.length(); i++) {
			char a = nums.charAt(nums.length()-i);
			System.out.print(a);
		}
		/*for (int i = temp.length() -1; i >= 0; i--) { 
			System.out.println(temp.charAt(i));
		}*/  //±³¼ö´Ô ¹æ¹ý
	}
}
