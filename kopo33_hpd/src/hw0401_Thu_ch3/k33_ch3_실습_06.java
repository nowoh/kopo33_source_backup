package hw0401_Thu_ch3;

public class k33_ch3_실습_06 { //클래스 선언
	//
	//#6. 단순 세금 계산
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_val = 271;		//세전 물건 값 
		int k33_rate = 3;		//세율 3%
		
		int k33_tax = k33_taxcal(k33_val, k33_rate);	//taxcal 함수에 세전 물건 값과 세율 입력한 결과값을 tax로 정의
		
		System.out.printf("*********************************\n");	//*출력
		System.out.printf("*          단순 세금 계산          *\n");	//단순 세금 계산 출력
		System.out.printf("실제 세금 계산 : %f\n", k33_val*k33_rate/100.0);		//실제 세금 계산 한 값 출력 (float형태)
		
		System.out.printf("세전가격 : %d 세금 : %d 세포함가격 : %d\n", k33_val, k33_tax, k33_val + k33_tax);	
										//세전가격, 세금, 세포함 가격 출력 | taxcal 함수에서 올림했기 때문에 정수형태로 출력
		System.out.printf("*********************************\n");	//*출력
	}
	
	public static int k33_taxcal(int k33_val, int k33_rate) {		//세전 물건 값과 세율을 인자로 받는 메소드 taxcal 생성
		int k33_ret;	//숫자형 변수 ret 선언
		
		if (((double)k33_val*(double)k33_rate/100.0) == k33_val*k33_rate/100) {		//세전 값과 세율을 곱해서 double형과 int형이 같으면
			k33_ret = k33_val*k33_rate/100;											//ret은 세전 값과 세율을 곱한 값으로 정의
		} else {
			k33_ret = k33_val*k33_rate/100 + 1;									//그렇지 않으면 세전 값과 세율을 곱한 값에 +1한 것으로 정의
		}																		//보수적으로 세금을 올림으로 처리한 것
		return k33_ret;															//최종 ret값으로 return
	}
}
