package hw0414_Wed_ch5;

public class k33_ch5_실습_1_GGD_2 {
	/*
	 * 구구단 인쇄2_세로3단 (consolas 폰트)
	 */
	public static void main(String[] args) {	//메인함수
		for (int k33_i = 1; k33_i < 4; k33_i++) {	//반복문 : 정수형 변수 i는 1이고, 4 전까지 1씩 증가하면서 반복
													//구구단을 1 4 7단 \n 2 5 8단 \n 3 6 9단 이렇게 출력해야 
													//가로로 1 2 3단 4 5 6단 7 8 9단 가지런하게 나옴
													//따라서 각 구구단이 세 단씩 출력되는 것이 한 줄이라고 하면 각 줄에서 시작하는
													//단수는 1, 2, 3이 되어야하기 때문에 i는 4전까지만 증가함
 			System.out.printf("***************\t***************\t***************\n");	//*************** 한 줄에 세 번 출력
			System.out.printf("  구구단 %d 단   \t  구구단 %d 단   \t  구구단 %d 단   \t\n", k33_i, k33_i+3, k33_i+6);
													//구구단 i단과 i+3단과 i+6단 한 줄에 출력
			System.out.printf("***************\t***************\t***************\n");
			for (int k33_j = 1; k33_j < 10; k33_j++) {		//반복문 : 정수형 변수 j는 1이고, 10 전까지 1씩 증가하면서 반복
															//각 구구단 단수마다 *1 ~ *9 까지 나오게 반복
				for (int k33_k = k33_i; k33_k < k33_i+7; k33_k += 3) {		
																//반복문 : 정수형 변수 k는 i이고, i+7전까지 3씩 증가하면서 반복
																//k가 3씩 증가해야 세 단씩 출력되는 구구단의 단수가 
																//각 줄마다 1 4 7 / 2 5 8 / 3 6 9단씩 출력됨
																//또한 i+7전까지만 반복해야 각 줄에서 7, 8, 9단까지 출력되도록 하고 
																//반복문을 빠져나오도록 함
					System.out.printf("  %d x %d = %2d\t", k33_k, k33_j, k33_k*k33_j);	
																			//변수 k x 변수 j = k*j(연산값, 2자리 확보하고 출력) 출력 후 탭
				}
				System.out.println();	//구구단 i i+3 i+6 가로 연속으로 출력 후 행 바꾸기
			}	
		}	
	}
}
