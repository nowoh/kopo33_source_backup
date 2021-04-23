package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch5_실습_3_영수증출력1_courier_new {
	/*
	 * 영수증 출력1	(courier new 폰트기준)
	 */
	public static void main(String[] args) { 
		DecimalFormat k33_df = new DecimalFormat("###, ###, ###, ###"); 
		Calendar k33_cal = Calendar.getInstance();
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		int k33_iPrice = 33000;
		double k33_tax_rate = 0.1;
		int k33_net_price = (int)(k33_iPrice/(1+k33_tax_rate));
		int k33_tax = (int)(k33_iPrice - k33_net_price);
		
		System.out.println("신용승인");
		System.out.printf("%-15s %16s\n", "단말기 : 2N68665898", "전표번호 : 041218");
		System.out.printf("%-15s\n", "가맹점 : 한양김치찌개");
		System.out.printf("%-15s\n", "주 소 : 경기 성남시 분당구 황새울로351번길 10, 1층");
		System.out.printf("%-15s\n", "대표자 : 유창신");
		System.out.printf("%-15s%15s\n", "사업자 : 752-53-00558", "TEL : 7055695");
		System.out.println("----------------------------------");
		System.out.printf("%-16s%15s 원\n", "금   액", k33_df.format(k33_net_price));
		System.out.printf("%-16s%15s 원\n", "부 가 세", k33_df.format(k33_tax));
		System.out.printf("%-16s%15s 원\n", "합   계", k33_df.format(k33_iPrice));
		System.out.printf("우리카드\n");
		System.out.printf("%-25s", "카드번호 : 5387-20**-****-4613(S) 일시불\n");
		System.out.printf("거래일시 : %s\n", k33_sdf.format(k33_cal.getTime()));
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사\t가맹 : 720068568\n");
		System.out.printf("알림 : EDC매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.println("----------------------------------");
		System.out.printf("%12s%s%12s\n"," ", "* 감사합니다 *", " ");
		System.out.printf("%34s", "표준V2.08_20200212");
		
	}
}
