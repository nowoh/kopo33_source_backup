package hw0322_Mon_ch5;

import java.util.Scanner;

public class P05 {
	
	public static void main(String[] args) {
		//P5_1 p051 = new P5_1(3); without creating an object!
		P5_1.print5(5);
		
		
		
	}
}
class P5_1 {
	int age; 
	
	public P5_1(int age) {
		this.age = age;
	}
	public static void print5(int age) {
		System.out.println(age);
	}
}
