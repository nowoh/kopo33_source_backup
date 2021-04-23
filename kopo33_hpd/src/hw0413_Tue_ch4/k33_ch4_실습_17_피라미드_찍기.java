package hw0413_Tue_ch4;

public class k33_ch4_실습_17_피라미드_찍기 {
	/*
	 * 피라미드_찍기
	 */
	public static void main(String[] args) {
		int k33_n, k33_m; //정수형 변수 n과 m 선언
		k33_m = 20; k33_n = 1;	//m은 20, n은 1로 정의
		while (true) {	//반복문 : 무한 loop
			for (int k33_i = 0; k33_i < k33_m; k33_i++) System.out.printf(" ");
								//반복문 : 정수형 변수 i는 0, i는 m전까지 1씩 증가하며 " "출력 반복
			for (int k33_i = 0; k33_i < k33_n; k33_i++) System.out.printf("*");
								//반복문 : 정수형 변수 i는 0, i는 n전까지 1씩 증가하며 *출력 반복
			System.out.printf("\n");	//행 바꾸기
			
			k33_m = k33_m-1;	//m은 m-1 한 것으로 재정의
			k33_n = k33_n+2;	//n은 n+2 한 것으로 재정의
			
			if (k33_m < 0) break;	//조건문 : m이 0 미만이면 break
		}	//반복문 종료
	}
}
