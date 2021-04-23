package hw0413_Tue_ch4;

public class k33_ch4_실습_08_범위를주어비교_찾기 {
	/*
	 * 범위를주어비교_찾기
	 */
	public static void main(String[] args) {
		int k33_iVal;		//정수형 변수 iVal 선언
		for (int k33_i = 0; k33_i < 300; k33_i++) {	//반복문 : 정수형 변수 i는0부터 시작, i는 300전까지 1씩 증가하면 반복
			k33_iVal = 5 * k33_i;					//iVal은 5의 배수로 정의 (결국 반복문은 5의 배수로 1495까지 반복함) 
			if (k33_iVal >= 0 && k33_iVal < 10) System.out.printf("일 %d\n", k33_iVal);
													//iVal이 0 이상 10 미만이면 일과 iVal 같이 출력
			else if (k33_iVal >= 10 && k33_iVal < 100) System.out.printf("십 %d\n", k33_iVal);
													//iVal이 10 이상 100 미만이면 십과 iVal 같이 출력
			else if (k33_iVal >= 100 && k33_iVal < 1000) System.out.printf("백 %d\n", k33_iVal);
													//iVal이 100 이상 1000 미만이면 백과 iVal 같이 출력
			else System.out.printf("천 %d\n", k33_iVal);
													//그렇지 않으면 (iVal이 1000 이상이면) 천과 iVal 같이 출력
		}
	}
}
