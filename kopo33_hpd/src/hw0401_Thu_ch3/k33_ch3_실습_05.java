package hw0401_Thu_ch3;

public class k33_ch3_실습_05 { //클래스 선언
	//
	//#5. 소수점 자리의 반올림, 버림 처리
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_MyVal = 14/5;		//숫자형(정수형) 변수 MyVal 정의 및 14/5로 초기화
		System.out.printf("#5-1 : %d\n", k33_MyVal);	//MyVal출력
		
		double k33_MyValF;		//숫자형(실수형) 변수 MyValF 정의

		k33_MyValF = 14/5;		//변수 MyValF 14/5로 초기화
		System.out.printf("#5-2 : %f\n", k33_MyValF);	//MyValF 출력
		
		k33_MyValF = 14.0/5;	//변수 MyValF 14.0/5로 재정의
		System.out.printf("#5-3 : %f\n", k33_MyValF);	//재정의된 MyValF 출력
		
		k33_MyValF = (14.0)/5 + 0.5;	//변수 MyValF (14.0)/5 + 0.5로 재정의
		System.out.printf("#5-4 : %f\n", k33_MyValF);	//재정의된 MyValF 다시 출력
		
		k33_MyVal = (int)((14.0)/5+0.5);	//변수 MyVal를 (14.0)/5+0.5)의 integer변환한 상태로 재정의 
		System.out.printf("#5-5 : %d\n", k33_MyVal);	//재정의된 MyVal 출력
	}
}
