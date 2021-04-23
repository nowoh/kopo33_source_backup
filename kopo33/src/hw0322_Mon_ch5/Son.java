package hw0322_Mon_ch5;

public class Son extends Inheritance {
	public static int power = 100;
	
	public static void main(String[] args) {
		Son main = new Son();
		main.printPower();
	}
	
	public void printPower() {
		super.printPower();
		System.out.println(power);
	}
}


class Inheritance {
	public static int power = 30;
	
	public void printPower() {
		System.out.println(power);
	}
}
