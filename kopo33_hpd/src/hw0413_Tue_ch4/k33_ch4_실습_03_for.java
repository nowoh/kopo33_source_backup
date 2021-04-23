package hw0413_Tue_ch4;

public class k33_ch4_실습_03_for {
	/*
	 * for문
	 */
	public static void main(String[] args) {
		//기본 for문
		int k33_sum = 0;		//정수형 변수 sum을 0으로 정의
		for (int k33_i = 0; k33_i <10; k33_i++) {	//숫자형 변수 i를 선언하고 0으로 정의, i는 10미만까지 반복, i는 1씩 증가
			k33_sum = k33_sum + k33_i;		//sum을 sum+i로 반복 시마다 재정의
		}
		System.out.printf("k33_sum %d\n", k33_sum);	//마지막 sum 출력하고 행 바꾸기
		
		//복합 for문
		for (int k33_i = 1; k33_i < 10; k33_i++) {	//숫자형 변수 i를 선언하고 1으로 정의, i는 10미만까지 반복, i는 1씩 증가
			System.out.printf("***************\n", k33_i);	//* 출력하고 행 바꾸기
			System.out.printf("   구구단 %d 단\n", k33_i);		// 구구단 i 단 출력학 행 바꾸기
			System.out.printf("***************\n", k33_i);	//* 출력하고 행 바꾸기
			for (int k33_j = 1; k33_j <10; k33_j++) {		//숫자형 변수 j를 선언하고 1으로 정의, j는 10미만까지 반복, j는 1씩 증가
				System.out.printf("  %d  *  %d = %d \n", k33_i, k33_j, k33_i*k33_j);
														//i * j = i*j(연산 후 결과 값) 출력
			}
		}
	}
}
