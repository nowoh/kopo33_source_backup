package hw0331_Wed_final;

public class abstract_class extends animal{

	public static void main(String[] args) {

	}
	public void eat() {
		System.out.println("���� �޸���.");
	}

}
abstract class animal {
	public int leg;
	public void run() {
		System.out.println("�޸���");
	}
	abstract public void eat();
}

//class Dog extends animal {
//	public void eat() {
//		System.out.println("���� �޸���");
//	}
//}
