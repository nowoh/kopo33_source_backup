package hw0401_Thu_ch3;

public class k33_ch3_실습_07 { //클래스 선언
	//
	//#7. 소비자가 세금 계산1
	//
	public static int k33_netprice (int k33_price, double k33_rate) { 	//세전 가격 계산하는 함수 netprice 선언
		return (int) (k33_price/(1+k33_rate));		// 상품가격 / (1 + 세율) = 세전 가격
	}												//정수형으로 버림 처리 그래야 세금이 올림처리됨								
	
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_price = 1234;				//상품가격
		double k33_tax_rate = 0.1;			//세율
		int k33_netprice = k33_netprice(k33_price, k33_tax_rate);	//세전 가격 정의
		int k33_tax = k33_price - k33_netprice;						//상품가격에서 세전 가격을 빼서 세금 계산
		
		System.out.printf("**********************************\n");	//*출력
		System.out.printf("*     소비자가, 세전가격, 세금 계산     *\n");	//카테고리 출력
		System.out.printf(" 소비자가격 : %d, 세전가격 : %d, 세금 : %d\n", k33_price, k33_netprice, k33_tax);
																	//소비자 가격, 세전 가격, 세금 출력
		System.out.printf("**********************************\n");	//*출력
	}
}
