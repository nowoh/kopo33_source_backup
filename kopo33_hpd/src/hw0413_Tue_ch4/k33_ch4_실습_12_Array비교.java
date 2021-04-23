package hw0413_Tue_ch4;

public class k33_ch4_실습_12_Array비교 {
	/*
	 * Array비교
	 */
	public static void main(String[] args) {
		int[] k33_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};
								//정수형 배열 iLMD를 {31,28,31,30,31,30,31,31,30,31,30,31}로 초기화
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//반복문 : 정수형 변수 i는 1, i는 13전까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", k33_i);	//i와 월=> 같이 출력
			for (int k33_j = 1; k33_j < 32; k33_j++) {	//반복문 : 정수형 변수 j는 1, j는 32전까지 1씩 증가하며 반복
				System.out.printf("%d", k33_j);		//j 출력
				if (k33_iLMD[k33_i-1] == k33_j) break;	//조건문 : iLMD배열의 [i-1]이 j와 같다면 break 
				System.out.printf(",");		//콤마(,)찍기
			}
			System.out.printf("\n");		//행 바꾸기
		}
	}
}
