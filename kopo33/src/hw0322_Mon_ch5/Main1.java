package hw0322_Mon_ch5;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*Test1 t = new Test1(); //객체 생성
		t.printMyName(); //객체 생성 후 Overriding
		Test1.printMyName2(); //Static 함수는 바로 Overriding 가능
		Test1.printMyName3(1); //parameter 넣어보기
		Test1 sum = new Test1();
		sum.printAdd(2, 3);
		System.out.println(Test1.fib(3));
		Fib.fib1(3); */
		
		/*PrintClass printClass = new PrintClass(1, 3, 5);
		printClass.printInteger();
		printClass.printAdd();
		PrintClass printClass1 = new PrintClass(1, 3);
		printClass1.printAdd();*/
		
		Price price = new Price(1000, 2000, 3000, 5000);
		price.printMenu();
		int a = scan.nextInt();
		price.getPrice(a);
		
		
	}

}
