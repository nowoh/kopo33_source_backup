package hw0413_Tue_ch4;

public class k33_ch4_실습_13_숫자읽기 {
	/*
	 * 숫자읽기
	 */
	public static void main(String[] args) {
		String[] k33_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
							//문자열 배열 units을 {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}로 초기화
		for (int k33_i = 0; k33_i < 101; k33_i++) {	//반복문 : 정수형 변수 i는 0, i는 100전까지 1씩 증가하며 반복
			if (k33_i >= 0 && k33_i < 10) {		//조건문 : i가 0 이상 10 미만이면
				System.out.printf("일의자리 : %s\n", k33_units[k33_i]); //"일의자리 : "과 배열 units의 [i] 같이 출력 
			} else if (k33_i >= 10 && k33_i < 100) {	//그렇지 않고 i가 10 이상 100 미만이면
				int k33_i10, k33_i0;		//정수형 변수 i10과 i0 선언
				k33_i10 = k33_i/10;			//i10은 i를 10으로 나눈 몫으로 정의 (10의 자리 숫자)
				k33_i0 = k33_i % 10;		//i0은 i를 10으로 나눈 나머지로 정의	(1의 자리 숫자)
				if (k33_i0 == 0) {			//조건문 : i0이 0이면 (i를 10으로 나눴을 때 나머지가 0이면 => i가 10의 배수이면)
					System.out.printf("십의자리 : %s십\n", k33_units[k33_i10]);	//"십의자리 : "과 배열 units의 [i10]과 "십" 같이 출력
				} else {	//그렇지 않으면 (i가 10의 배수가 아니면)
					System.out.printf("십의자리 : %s십%s\n", k33_units[k33_i10], k33_units[k33_i0]);
				}													//"십의자리 : "과 배열 units의 [i10]과 "십"과 units의 [i0] 같이 출력
			}
			else System.out.printf("==> %d\n", k33_i);		//==> i 출력
		}
	}
}
