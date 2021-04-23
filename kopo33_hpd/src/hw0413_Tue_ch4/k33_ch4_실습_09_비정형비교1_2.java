package hw0413_Tue_ch4;

public class k33_ch4_실습_09_비정형비교1_2 {
	/*
	 * 비정형비교1
	 */
	public static void main(String[] args) {
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//반복문 : 정수형 변수 i는 1, i는 13 전까지 1씩 증가하며 반복
			System.out.printf(" %d월 =>", k33_i);	//i와 월=> 출력
			for (int k33_j = 1; k33_j < 32; k33_j++) {
											//반복분 : 정수형 변수 j는 1, j는 32 전까지 1씩 증가하며 반복
				if(k33_i == 1  && k33_j == 31) {	//i가 1이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 2  && k33_j == 28) {	//i가 2이고 j가 28이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 3  && k33_j == 31) {	//i가 3이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 4  && k33_j == 30) {	//i가 4이고 j가 30이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 5  && k33_j == 31) {	//i가 5이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 6  && k33_j == 30) {	//i가 6이고 j가 30이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 7  && k33_j == 31) {	//i가 7이고 j가 31이면 
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 8  && k33_j == 31) {	//i가 8이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 9  && k33_j == 30) {	//i가 9이고 j가 30이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 10 && k33_j == 31) {	//i가 10이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 11 && k33_j == 30) {	//i가 11이고 j가 30이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				if(k33_i == 12 && k33_j == 31) {	//i가 12이고 j가 31이면
					System.out.printf("%d", k33_j);	//j출력하고 break
					break;
				}
				System.out.printf("%d,", k33_j);	//j 출력
			}
			System.out.printf("\n");	//행 바꾸기
		}

	}

}
