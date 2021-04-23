package hw0413_Tue_ch4;

public class k33_ch4_실습_15_띄어쓰기 {
	/*
	 * 띄어쓰기
	 */
	public static void main(String[] args) {
		for (int k33_i = 0; k33_i < 10; k33_i++) {	//반복문 : 정수형 변수 i는 0, i는 10 전까지 1씩 증가하며 반복
			for (int k33_j = 0; k33_j < k33_i; k33_j++) System.out.printf(" ");	
						//반복문 : 정수형 변수 j는 0, j는 i전까지 1씩 증가하며 반복하여 " "출력
			System.out.printf("%d\n", k33_i);	//i출력하고 행 바꾸기
		}
	}
}
