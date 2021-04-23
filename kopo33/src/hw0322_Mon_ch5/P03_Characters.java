package hw0322_Mon_ch5;

import java.util.Scanner;

public class P03_Characters {
	String name;
	int age;
	double ofP, deP;
	
	public P03_Characters(String name) {
		this(name, 260, 35.5, 42.1);
	}
	
	public P03_Characters(String name, double ofP) {
		this(name, 1213, ofP, 38.9);
	}
	public P03_Characters (String name, int age, double ofP, double deP) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getOfP() {
		return ofP;
	}

	public void setOfP(double ofP) {
		this.ofP = ofP;
	}

	public double getDeP() {
		return deP;
	}

	public void setDeP(double deP) {
		this.deP = deP;
	}
	
	
	/*public void characters() {
		System.out.println(name + " / " + age + " / " + ofP + " / " + deP); //리턴값말고 그냥 출력하는 방법
	}
	*/
	
	
}
