package hw0319_Fri_ch4;

import java.util.Scanner;

public class P01_2_멀티플 {

	public static void main(String[] args) {
		
		P01_2_멀티플 main = new P01_2_멀티플();
		main.print("abc", 5, 3);	
		main.print("qwerty");
	}
	
	void print(String text, int number1, int number2) {
		for (int i = 0; i < Math.abs(number1 - number2); i++) {
			System.out.println(text);
		}
	}
	void print(String text) {
		System.out.println(text);
	}
	
}
