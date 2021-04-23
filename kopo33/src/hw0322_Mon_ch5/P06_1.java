package hw0322_Mon_ch5;

import java.util.Scanner;

public class P06_1{  //inner Class
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		P06_Characters char1 = new P06_Characters("D");
		System.out.println(char1.printCharacter());
		
		
	}
}
class P06_Characters {
	
	String name;
	int age;
	double ofP, deP;
	
	public P06_Characters(String name) {
		this(name, 260, 35.5, 42.1);
	}
	
	public P06_Characters (String name, int age, double ofP, double deP) {
		this.name = name;
		this.age = age;
		this.ofP = ofP;
		this.deP = deP;
	}
	public String printCharacter() {
		String ret = "";
		ret = name + " / " + age + " / " + ofP + " / " + deP;
		return ret;
	}
}
