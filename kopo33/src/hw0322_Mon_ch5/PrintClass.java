package hw0322_Mon_ch5;

public class PrintClass {
	int a, b, n; //Constructor
	
	public PrintClass(int a, int b, int n2) {
		this.a = a;
		this.b = b;
		n = n2;
	}
	public PrintClass(int a, int b ) {
		this.a = a;
		this.b = b;
	}
	
	
	public void printInteger() {
		System.out.println(n);
	}
	
	public void printAdd() {
		int sum;
		sum = this.a + this.b;
		System.out.println(sum);
	}
	
}
