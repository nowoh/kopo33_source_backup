package hw0402_Fri_arrayConvert;

import hw0402_Fri.CostValueClass;
import hw0402_Fri.PrintClass;

public class ConvertProcessing {
	public static double exchangeResult;	//외화 환전 결과
	public static double changeWon;		//거스름돈 소수점 포함
	public static int changeWonResult;	//거스름돈 소수점 제외
	
	public void exchangeUSD(double won) {
		int usd; 			//달러 
		int[] usdArr = CostValue.USD_ARR;			//달러 단위
		int usdCurrent; 
		int usdCount;								//달러 개수
		
		exchangeResult = won / CostValue.EX_RATE_USD;
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * CostValue.EX_RATE_USD)) / 10;
		changeWonResult = (int)changeWon * 10;
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 : " + usd +" 달러");
		
		//달러별로 몇개씩 나와야하는가
		for (int i = 0; i < usdArr.length; i ++) {
				usdCount = usdCurrent / usdArr[i];
				System.out.printf(usdArr[i] + "달러 : " + usdCount + "장\t");
				usdCurrent -= usdArr[i] * usdCount;
				if ((i+1) % 4 == 0) {
					System.out.printf("\n");
				}
		}
	}
	
	public void exchangeEURO(double won) {
		int euro; 
		int[] euroArr = CostValue.EURO_ARR;			//유로단위 
		int euroCurrent;
		int euroCount;								//유로 개수
		
		exchangeResult = won / CostValue.EX_RATE_EURO;		//원화를 유로로 변환
		euro = (int)exchangeResult/5*5;		//최소 유로 지폐 단위는 5유로
		euroCurrent = euro;
		changeWon = (won - (euro * CostValue.EX_RATE_EURO)) /10;	
		//변환 후 나머지 원화 (1원단위 버림처리)
		changeWonResult = (int)changeWon *10;
		System.out.println("유로로 환전 결과");
		System.out.println("유로 지급 : " + euro +" 유로");
		
		//유로화폐로 몇개씩 나와야하는가
		for (int i = 0; i < euroArr.length; i ++) {
			euroCount = euroCurrent / euroArr[i];
			System.out.printf(euroArr[i] + "유로 : " + euroCount + "장\t");
			euroCurrent -= euroArr[i] * euroCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public void exchangeJPY(double won) {
		int jpy;
		int[] jpyArr = CostValue.JPY_ARR;			//엔화 단위
		int jpyCurrent;
		int jpyCount;								//엔화 개수
		
		exchangeResult = won / CostValue.EX_RATE_JPY;		//원화를 엔화로 변환
		jpy = (int)exchangeResult/1000*1000;	//최소 엔화 지폐 단위는 1000엔
		jpyCurrent = jpy;
		changeWon = (won - (jpy * CostValue.EX_RATE_JPY)) /10;	
		//변환 후 나머지 원화 (1원단위 버림처리)
		changeWonResult = (int)changeWon *10;
		System.out.println("엔화로 환전 결과");
		System.out.println("엔화 지급 : " + jpy +" 엔");
		
		//엔화화폐로 몇개씩 나와야하는가
		for (int i = 0; i < jpyArr.length; i ++) {
			jpyCount = jpyCurrent / jpyArr[i];
			System.out.printf(jpyArr[i] + "엔 : " + jpyCount + "장\t");
			jpyCurrent -= jpyArr[i] * jpyCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public void resultWon() { 	//원화 거스름돈 계산
		int wonCurrent =0;
		int wonCount =0;								//원화 개수
		int[] wonArr = CostValue.WON_ARR;				//원화 단위
		wonCurrent = changeWonResult;
		System.out.println("\n\n원화 거스름돈 지급 : " +changeWonResult+"원");
		
		for (int i = 0; i < wonArr.length; i ++) {
			wonCount = wonCurrent / wonArr[i];
			if (wonArr[i] == 5000 || wonArr[i] == 1000) {
				System.out.printf(wonArr[i] + "원 : " + wonCount + "장\t");
			} else {
				System.out.printf(wonArr[i] + "원 : " + wonCount + "개\t");
			}
			wonCurrent -= wonArr[i] * wonCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n\n");
		Print_arrayConvert.printWon(wonCount, wonArr[], wonCurrent);
	}
}
