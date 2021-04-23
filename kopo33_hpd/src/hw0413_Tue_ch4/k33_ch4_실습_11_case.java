package hw0413_Tue_ch4;

public class k33_ch4_실습_11_case {
	/*
	 * case문
	 */
	public static void main(String[] args) {
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//반복문 : 정수형 변수 i는 1, i는 13전까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", k33_i);	//i와 월=> 같이 출력
			LOOP:for (int k33_j = 1; k33_j < 32; k33_j++) {	//반복문 : 정수형 변수 j는 1, j는 32전까지 1씩 증가하며 반복
				System.out.printf("%d,", k33_j);	//j 출력
				
				switch (k33_i) {	//switch 조건문 : i이면
					case 4:case 6:case 9:case 11:	//i가 4,6,9,11이면 
						if (k33_j == 30) break LOOP;	//조건문 : j가 30이면 break 하고 다시 LOOP로 돌아가게 함
						break;
					case 2:		//i가 2이면
						if (k33_j == 28) break LOOP;	//조건문 : j가 28이면 break 하고 다시 LOOP로 돌아가게 함
						break;
				}
			}
			System.out.printf("\n");			//행 바꾸기
		}
	}
}
