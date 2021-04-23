package hw0401_Thu_ch3;

public class k33_ch3_실습_02 { //클래스 선언
	//
	//#2. 누적하기, 합구하기
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_sum;  //sum이라는 숫자형 변수 정의
		
		k33_sum = 0;  //sum 변수 0으로 초기화
		
		for (int k33_i = 1; k33_i < 101; k33_i++) {  //숫자형 변수 i를 1부터 101전까지 증가하면서 반복
			k33_sum = k33_sum+k33_i; 		//sum 변수에 i를 더한 것으로 sum 재정의
		}
		System.out.printf("#2 : %d\n", k33_sum); //반복문에서의 최종 sum 변수 값 출력
		
		System.out.printf("#2-2 : %d\n", k33_sum/100);	//sum 변수를 100으로 나눈 값 출력
		
		int [] k33_v = {1, 2, 3, 4, 5}; //숫자형으로 이루어진 배열 v 정의 및 초기값 설정
		int k33_vSum;	//vSum이라는 숫자형 변수 정의
		
		k33_vSum = 0;	//vSum 변수 0으로 초기화
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {	//숫자형 변수 i를 0부터 5전까지 증가하면서 반복
			k33_vSum = k33_vSum + k33_v[k33_i];		//vSum 변수에 배열 v의 i번째 인자를 더한 것으로 vSum 재정의
		}
		System.out.printf("#2-3 : %d\n", k33_vSum);		//반복문에서의 최종 vSum 변수 값 출력
	}
}
