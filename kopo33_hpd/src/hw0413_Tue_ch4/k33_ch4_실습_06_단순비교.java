package hw0413_Tue_ch4;

public class k33_ch4_실습_06_단순비교 {
	/*
	 * 단순비교
	 */
	public static void main(String[] args) {
		int k33_iA, k33_iB;		//정수형 변수 iA와 iB 선언
		
		k33_iA = 0;				//iA를 0으로 정의
		while (true) {			//while 조건문 true로 무한 loop
			k33_iB = 0;			//iB를 0으로 정의
			while (true) {		//while 조건문 true로 무한 loop
				System.out.printf("*");		//조건문 둘아갈 때마다 *출력
				if (k33_iA == k33_iB) break;	//iA와 iB가 같으면 break
				k33_iB++;		//*출력하고 iB에 +1 해줌
			}
			System.out.printf("\n");	//행 바꾸기
			k33_iA++;					//행 바꾸고 iA에 +1 해줌
			if (k33_iA == 30) break;	//iA가 30이 되면 break
		}
	}
}
