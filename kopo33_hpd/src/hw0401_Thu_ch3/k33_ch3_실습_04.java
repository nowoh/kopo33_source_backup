package hw0401_Thu_ch3;

public class k33_ch3_실습_04 { //클래스 선언
	//
	//#4. 원하는 자릿수 반올림, 버림처리
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_ii = 12345;		//숫자형 변수 ii 정의 및 12345로 초기화
		int k33_j = (k33_ii/10) * 10;		// 숫자형 변수 j 정의 및 (ii/10)*10으로 초기화
		System.out.printf("#4-1 : %d\n", k33_j);	//변수 j 출력
		
		k33_ii = 12345;		//변수 ii 다시 한 번 정의 (위의 값과 같기 때문에 굳이 할 필요는 
							//					  없지만 보기 편하게 다시 정의)
		k33_j = ((k33_ii+5)/10) * 10;	//숫자형 변수 j를 ((ii+5)/10)*10으로 재정의
		
		System.out.printf("#4-2 : %d\n", k33_j);	//변수 j 출력
		
		k33_ii = 12344;		//변수 ii를 12344fh 재정의
		k33_j = ((k33_ii+5)/10) * 10;	//변수 j를 새로 정의 된 ((ii+5)/10)*10으로 재정의
		
		System.out.printf("#4-3 : %d\n", k33_j);	//변수 j 출력
	}
}
