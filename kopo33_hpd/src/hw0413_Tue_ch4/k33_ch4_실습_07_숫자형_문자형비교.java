package hw0413_Tue_ch4;

public class k33_ch4_실습_07_숫자형_문자형비교 {
	/*
	 * 숫자형_문자형비교
	 */
	public static void main(String[] args) {
		int k33_iI;		//정수형 변수 iI 선언
		double k33_iD;	//실수형 변수 iD 선언
		
		k33_iI = 10/3;		//iI를 10/3으로 정의 => 3
		k33_iD = 10/3.0;	//iD를 10/3.0으로 정의 => 3.333333...
		
		if (k33_iI == k33_iD) System.out.printf("equal\n");		//iI와 iD가 같으면 equal 출력
		else System.out.printf("Not equal[%f][%f]\n", (double)k33_iI, k33_iD);	
											//그렇지 않으면 Not equal 출력 후 iI와 iD각각 출력 
		if (k33_iD == 3.333333) System.out.printf("equal\n");	//iD와 3.333333가 같으면 equal 출력
		else System.out.printf("Not equal[3.333333][%f]\n", k33_iD);
									//그렇지 않으면 Not equal 출력 후 3.333333과 iD 출력
									//다른 이유는 iD는 3.333333d에서 끝나는 것이 아닌 3.333333...이기 때문
		k33_iD = (int)k33_iD;	//iD를 정수형 변수로 변환
		if (k33_iI == k33_iD) System.out.printf("equal\n");	//조건문 : iI와 iD가 같으면 equal 출력
		else System.out.printf("Not equal[%f][%f]\n", (double)k33_iI, k33_iD);
											//그렇지 않으면 Not equal과 실수형iI와 정수형으로 변환한 iD 출력
		System.out.printf("int로 인쇄[%d][%f]\n", k33_iI, k33_iD);	//iI와 iD를 정수형 변수로 출력
																//iD는 %f로 출력하여 소수점.00같이 출력
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k33_iI, k33_iD);
											//iI와 iD를 실수형 변수로 출력 (두 변수 둘 다 소수점까지 출력)
		char k33_a = 'c';					//문자어 변수 a를 'c'로 정의
		
		if (k33_a == 'b') System.out.printf("k33_a는 b이다.\n");	//조건문 : 변수 a가 'b'면 a는 b이다. 출력
		if (k33_a == 'c') System.out.printf("k33_a는 c이다.\n");	//조건문 : 변수 a가 'c'면 a는 c이다. 출력
		if (k33_a == 'd') System.out.printf("k33_a는 d이다.\n");	//조건문 : 변수 a가 'd'면 a는 d이다. 출력
		
		String k33_aa = "abcd";			//문자열 변수 aa를 "abcd"로 정의
		
		if(k33_aa.equals("abcd")) System.out.printf("k33_aa는 abcd이다.\n");	
														//조건문 : aa가 "abcd"면 aa는 abcd이다. 출력
		else System.out.printf("k33_aa는 abcd가 아니다.\n");	//그렇지 않으면 aa는 abcd가 아니다. 출력
		
		boolean k33_bb = true;		//boolean 변수 bb를 true로 정의
		
		if (!!k33_bb) System.out.printf("k33_bb가 아니고 아니면 참이다.\n");	
												//bb가 false의 false면 bb가 아니고아니면 참이다. 출력
		else System.out.printf("k33_bb가 아니고 아니면 거짓이다.\n"); 
												//그렇지 않으면 bb가 아니고 아니면 거짓이다. 출력
	}
}
