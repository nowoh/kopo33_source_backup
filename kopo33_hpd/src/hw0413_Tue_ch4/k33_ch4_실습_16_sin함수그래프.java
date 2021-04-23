package hw0413_Tue_ch4;

public class k33_ch4_실습_16_sin함수그래프 {
	/*
	 * sin함수그래프
	 */
	public static void main(String[] args) {
		double k33_fSin;	//실수형 변수 fSin 선언
		for (int k33_i = 0; k33_i < 360; k33_i++) {	//반복문 : 정수형 변수 i는 0, i는 360 전까지 1씩 증가하며 반복
			k33_fSin = Math.sin(k33_i * 3.141592/180);	//fSin을 i*pi/180의 sin값으로 정의
														//i*pi/180 = i 각도에 대한 rad(라디언) 값
														//Math.sin은 ()안에 각도가 아닌 rad 값으로 받음
														//따라서 Math.sin ()안에 i*pi/180 rad 값 넣어주면
														//i 각도에 대한 sin 값을 얻을 수 있음
														//fSin은 최소 -1 최대 1
			System.out.printf("%d sin ==>%f\n", k33_i, k33_fSin);	//i와 sin ==> fSin 출력
		}
		for (int k33_i = 0; k33_i < 360; k33_i++) {	//반복문 : 정수형 변수 i는 0, i는 360 전까지 1씩 증가하며 반복
			k33_fSin = Math.sin(k33_i * 3.141592/180);	//fSin을 i*pi/180의 sin값으로 정의
														//i*pi/180 = i 각도에 대한 rad(라디언) 값
														//Math.sin은 ()안에 각도가 아닌 rad 값으로 받음
														//따라서 Math.sin ()안에 i*pi/180 rad 값 넣어주면
														//i 각도에 대한 sin 값을 얻을 수 있음
														//fSin은 최소 -1 최대 1
			int k33_iSpace = (int)((1.0-k33_fSin) * 50);	
									//정수형 변수 iSpace는 (1.0-fSin)*50을 integer로 변환한 것을 정의
			for (int k33_j = 0; k33_j < k33_iSpace; k33_j++) System.out.printf(" ");
				//반복문 : 정수형 변수 j는 0, j는 iSpace전까지 1씩 증가하며 반복하여 " "출력
			System.out.printf("*[%f]{%d]\n", k33_fSin, k33_iSpace);	//fSin과 iSpace 출력
		}
	}
}
