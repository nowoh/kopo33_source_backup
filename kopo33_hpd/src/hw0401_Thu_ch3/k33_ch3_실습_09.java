package hw0401_Thu_ch3;

public class k33_ch3_실습_09 { //클래스 선언
	//
	//#9. 단순 환전 계산
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_MyWon = 1000000;			//환전할 금액 정의 (원화)
		double k33_MoneyEx = 1238.21;		//달러 환율 정의
		double k33_commission = 0.003;		//수수료 정의
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//환전한 달러 금액 (센트부분 버림처리)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//환전하고 남은 원화 반환금액(소수점 이하 버림처리)
		
		System.out.printf("***************************************************\n");	//*출력
		System.out.printf("*                수수료 없이 계산                     *\n");	//실습 주제
		System.out.printf("총 한화환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원\n",k33_MyWon, k33_usd, k33_remain);
																		//총 한화환전금액, 달러환전액, 반환원화금액 출력 
		System.out.printf("***************************************************\n"); //*출력	
	}	
}
