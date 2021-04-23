package hw0322_Mon_ch5;

public class Polymorphism {

	public static void main(String[] args) {
		Man man = new Man();
		man.printContent();
		People people = new People();
		people.printContent();
		
		People people2 = new Man();
		people2.printContent();
		People people3 = new Woman();
		people3.printContent();
		
		

	}

}
