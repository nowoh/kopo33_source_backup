package hw0410_Sat_ch2;

public class k33_ch2_실습_01 {
	/*
	 * VarEx1
	 */
	public static void main(String[] args) {	//메인함수
		
		int k33_year = 0;	//정수형 변수 year 0으로 초기화 
		int k33_age = 14;	//정수형 변수 age 14로 초기화 
		
		System.out.println("결과1 : " + k33_year);	//"결과1 :"와 함께 year 출력 
		System.out.println("결과2 : " + k33_age);		//"결과2 :"와 함께 age 출력
		
		k33_year = k33_age + 2000;	//age에 2000 더한 값으로 year 재정의 
		k33_age = k33_age + 1;		//age를 age+1한 값으로 재정의 
		
		System.out.println("결과3 : " + k33_year);	//"결과3 :"와 함께 year 출력
		System.out.println("결과4 : " + k33_age);		//"결과4 :"와 함께 age 출력
	}

}
