package hw0401_Thu_ch3;

public class k33_ch3_실습_10 { //클래스 선언
	//
	//#10. 수수료 포함 환전 계산(1)
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		int k33_MyWon = 1000000;			//환전할 금액 정의 (원화)
		double k33_MoneyEx = 1238.21;		//달러 환율 정의
		double k33_commission = 0.003;		//수수료 정의
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//환전한 달러 금액 (센트부분 버림처리)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//환전하고 남은 원화 반환금액(소수점 이하 버림처리)
		
		double k33_ComPerOne = k33_MoneyEx * k33_commission;	//1달러당 수수료 계산(단위는 원화)하여 ComPerOne으로 정의
		
		double k33_totalcom = k33_usd * k33_ComPerOne;		//환전한 달러 * 달러당 수수료 = 총 지급해야할 수수료(totalcom) 정의

		System.out.printf("*******************************************************************\n");	//*출력
		System.out.printf("*                          수수료 계산                               *\n");	//실습 주제
		System.out.printf("   총 수수료 : %f원 => 미화 : %d달러, 달러당 수수료 : %f원\n",k33_totalcom, k33_usd, k33_ComPerOne);
																				//총 수수료, 달러환전액, 달러당수수료 출력
		System.out.printf("*******************************************************************\n");	//*출력
	}
}
