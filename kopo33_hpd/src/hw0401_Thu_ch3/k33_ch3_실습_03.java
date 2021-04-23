package hw0401_Thu_ch3;

public class k33_ch3_실습_03 { //클래스 선언
	//
	//#3. 정수형 연산(버림), 나머지 연산자 응용
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_ii = 1000/3;  //ii라는 숫자형 변수 정의하고 1000/3으로 초기화
		System.out.printf("#3-1 : %d\n", k33_ii);	//변수 ii 출력
		
		k33_ii = 1000%3;		//ii 변수 1000%3으로 재정의
		System.out.printf("3-2 : %d\n", k33_ii);	//재정의된 ii변수 출력
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {	//숫자형 변수 i를 0부터 20전까지 증가하면서 반복
			System.out.printf("#3-3 : %d ", k33_i);	//변수 i를 0부터 20전까지 증가하면서 차례대로 출력
			
			if ((k33_i+1) % 5 == 0) {		//변수 i+1를 5로 나누었을 때 나머지가 0일 때라는 조건
											//i는 0부터 시작이므로 첫 줄부터 5개씩 출력하기 위해서 변수 i에 +1을 해주기
				System.out.printf("\n"); 	//조건을 만족시킬 때마다 한 줄 씩 띄어쓰기
			}
		}
	}
}
