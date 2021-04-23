package hw0414_Wed_ch5;

import java.util.Calendar;

public class k33_ch5_실습_2_cal {
	/*
	 * 달력 인쇄(굴림체 폰트)
	 */
	public static void main(String[] args) {	//메인함수 
		int k33_iWeekday = 5;					//정수형 변수 iWeekday 5로 정의
												//iWeekday는 요일을 뜻함, 요일은 0부터 시작, 5는 금요일
		int[] k33_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
												//정수형 배열 iEnd {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}로 정의
												//iEnd는 각 달의 마지막 일 수 (2월은 윤달로 처리)
		for (int k33_iMon = 0; k33_iMon < 12; k33_iMon++) {		//반복문 : 정수형 변수 iMon(월을 뜻함)는 0이고, 12전까지 1씩 증가하면서 반복
			System.out.printf("\n\n%10d월\n", k33_iMon+1);	//iMon가 0일 때 1월이므로 월수 출력할 때 iMon+1해줌
			System.out.printf("======================\n");			//====================== 출력하고 행 바꾸기
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "일","월","화","수","목","금","토");	//문자열 3자리 확보하고 각 요일 출력
			for (int k33_j = 1; k33_j <= k33_iWeekday; k33_j++) {	//반복문 :         정수형 변수 j는 1이고, j는 iWeekday까지 1씩 증가하면서 반복
				System.out.printf("%3s", " ");						//문자열 3자리 확보하고 " "출력, iWeekday까지 반복해서 출력해야
																	//각 월의 첫 일자가 iWeekday에 맞는 요일에서부터 시작함
			}
			for (int k33_i = 1; k33_i <= k33_iEnd[k33_iMon]; k33_i++) {		
													//반복문 : 정수형 변수 i는 1이고, i는 배열 iEnd의 iMon번째 요소 값까지 1씩 증가하면서 반복
				System.out.printf("%3d", k33_i);	//i (일자) 3자리 확보하여 출력
				k33_iWeekday++;						//iWeekday +1
				if (k33_iWeekday % 7 == 0) {		//=> 일주일이 채워지면 다음 주로 넘어감
					System.out.println();			//행 바꾸기 (다음 주로 넘어가기)
				}
			}
			k33_iWeekday %= 7; 						// 마지막 iWeekday를 7로 나눈 나머지가 다음 달의 시작 iWeekday가 되도록 재정의
		}	
	}
}
