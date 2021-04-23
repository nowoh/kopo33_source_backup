package hw0401_Thu_ch3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch3_실습_14 { //클래스 선언
	//
	//#14. 콤마,현재 날짜, 시간 찍기
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		DecimalFormat k33_df = new DecimalFormat("###, ###, ###, ###");	//DecimalFormat을 이용하여 자릿수별로 콤마(,)찍기 
		Calendar k33_cal = Calendar.getInstance();						//cal이라는 calendar class를 선언하여 현재 시간을 가져옴
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");		//sdf라는 SimpleDateFormat 객체 생성
		
		int k33_MyWon = 1000000;			//환전할 금액 정의 (원화)
		double k33_MoneyEx = 1238.21;		//달러 환율 정의
		double k33_commission = 0.003;		//수수료 정의
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//환전한 달러 금액 (센트부분 버림처리)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//환전하고 남은 원화 반환금액(소수점 이하 버림처리)
		
		double k33_ComPerOne = k33_MoneyEx * k33_commission;	//1달러당 수수료 계산(단위는 원화)하여 ComPerOne으로 정의
		
		double k33_totalcom = k33_usd * k33_ComPerOne;	//환전한 달러 * 달러당 수수료 = 총 지급해야할 수수료(totalcom) 정의
		
		int k33_i_totalcom;	//i_totalcom라는 숫자형 변수 정의
		
		k33_usd = (int) (k33_MyWon/(k33_MoneyEx + k33_ComPerOne));	//환전한 달러 금액을 수수료율 포함한 환전금액으로 정의
		k33_totalcom = k33_usd * k33_ComPerOne;		//환전한 달러 * 달러당 수수료 = 총 지급해야할 수수료(totalcom) 정의
		
		if (k33_totalcom != (double)((int)k33_totalcom)) {		//double인 totalcom을 int로 바꿨다가 다시 double로 형 변환
																//즉 소수점 이하를 다 버리고 다시 .000으로 했을 때 같지 않다면
			k33_i_totalcom = (int)(k33_totalcom + 1);			//totalcom을 올림해준 것으로 정의
		} else {
			k33_i_totalcom = (int)k33_totalcom;					//그렇지 않다면 그냥 totalcom을 int로 형 변환한 것으로 정의
		}
		
		System.out.printf("*******************************************************************\n");	//*출력
		System.out.printf("*                          콤마 적용                                *\n");	//실습 주제
		System.out.printf("총 수수료 : %s원 => 미화 : %s달러, 달러당 수수료 : %f원\n", 				//수수료, 환전 달러, 달러당 수수료 출력
				k33_df.format(k33_i_totalcom), k33_df.format(k33_usd), k33_ComPerOne);		//단 수수료와 환전 달러금액에 Decimal format 적용
		
		k33_remain = (int) (k33_MyWon - k33_usd * k33_MoneyEx - k33_i_totalcom);		//환전할 원화에서 환전한 들러와 수수료 빼준 것을 remain으로 정의
		System.out.printf("총 한화환전 금액 : %s원 => 미화 : %s달러, 수수료 징구 : %s원  잔돈 : %s원\n", //총 한화환전 금액, 환전 달러, 수수료, 잔돈 출력
				k33_df.format(k33_MyWon), k33_df.format(k33_usd), 
				k33_df.format(k33_i_totalcom), k33_df.format(k33_remain));						//단 모든 금액 출력시 Decimal format 적용
		System.out.printf("최종실행시간 : %s\n", k33_sdf.format(k33_cal.getTime()));				//calendar와 SimpleDateFormat으로 시간 출력
		System.out.printf("*******************************************************************\n");		//*출력
		}
}
