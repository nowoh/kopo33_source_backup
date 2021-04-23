package hw0413_Tue_ch4;

public class k33_ch4_실습_10_비정형비교23_1 {
	/*
	 * 비정형비교2_3
	 */
	public static void main(String[] args) {
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//반복문 : 정수형 변수 i는 1, i는 13전까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", k33_i);	//i와 월=> 같이 출력
			for (int k33_j = 1; k33_j < 32; k33_j++) {	//반복문 : 정수형 변수 j는 1, j는 32전까지 1씩 증가하며 반복
				System.out.printf("%d,", k33_j);	//j 출력
				if (k33_i == 4 || k33_i == 6 || k33_i == 9 || k33_i == 11) {
												//조건문 : i가 4거나 6이거나 9이거나 11이면
					if (k33_j == 30) break;		//조건문 : j가 30이면 break (두 조건문 동시 만족)
				}
				if (k33_i == 2) {				//조건문 : i가 2이면
					if (k33_j == 28) break;		//조건문 : j가 28이면 break (두 조건문 동시 만족)
				}								//끝이 31일인 달은 어차피 j가 32전까지 반복하므로 조건 필요 X
			}
			System.out.printf("\n");			//행 바꾸기
		}
	}
}
