package hw0402_Fri_arrayConvert;

import java.util.Scanner;

public class Input_Class {
	Scanner scan = null;
	Input_Class() {					//생성자
		scan = new Scanner(System.in);
	}
	protected void fianlize() {		//소멸자
		scan.close();
	}
	
	public double inputWon() {
		double won;
		System.out.print("받은 원화 입력 : ");
		won = scan.nextDouble();
		return won;
	}
	public int inputType() {
		int type;
		System.out.println("환전할 종류 선택(0 : Close, 1 : USD, 2 : EUR, 3 : JPY)?");
		type = scan.nextInt();
		return type;
	}
}
