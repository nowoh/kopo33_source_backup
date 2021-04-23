package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch5_실습_3_영수증출력1_굴림체 {
	/*
	 * 영수증 출력1	(굴림체 기준)
	 */
	public static void main(String[] args) { 						//메인함수
		DecimalFormat k33_df = new DecimalFormat("###,###,###"); 	//DecimalFormat 객체 생성
		Calendar k33_cal = Calendar.getInstance();					//현재시간으로 Calendar 선언
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
																	//SimpleDateFormat 객체 생성
		
		int k33_iPrice = 33000;									//정수형 변수 iPrice(가격) 정의
		int k33_net_price = (int)(k33_iPrice/11*10);			//정수형 변수 net_price => iPrice를 11로 나누고 10 곱한 값을 (세율  0.1)
																//integer로 형 변환해준 것으로 정의 (세전 가격)
																//세전 가격 = 세후 가격 / (세후 가격 + 세율)
		int k33_tax = k33_iPrice - k33_net_price;				//정수형 변수 tax를 iPrice에서 net_price를 빼준 값으로 정의
		
		System.out.println("신용승인");							//문자열 출력
		System.out.printf("%-16s %17s\n", "단말기 : 2N68665898", "전표번호 : 041218");	//문자열 2개 16자리 확보하여 좌측정렬, 17자리 확보하여 우측정렬하여 출력
		System.out.printf("%-15s\n", "가맹점 : 한양김치찌개");				//문자열 1개 15자리 확보하고 좌측정렬하여 출력
		System.out.printf("%-15s\n", "주  소 : 경기 성남시 분당구 황새울로351번길 10 , 1층");	//문자열 1개 15자리 확보하고 좌측정렬하여 출력
		System.out.printf("%-15s\n", "대표자 : 유창신");					//문자열 1개 15자리 확보하고 좌측정렬하여 출력
		System.out.printf("%-18s%20s\n", "사업자 : 752-53-00558", "TEL : 7055695");		//문자열 2개 18자리 확보하고 좌측정렬, 20자리 확보하고 우측정렬하여 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");	//점선 출력
		System.out.printf("%-22s%14s 원\n", "금  액", k33_df.format(k33_net_price));	//문자열 2개 22자리 확보하고 좌측정렬, 14자리 확보하고 우측정렬하여 출력
		System.out.printf("%-21s%14s 원\n", "부가세", k33_df.format(k33_tax));			//문자열 2개 21자리 확보하고 좌측정렬, 14자리 확보하고 우측정렬하여 출력
		System.out.printf("%-22s%14s 원\n", "합  계", k33_df.format(k33_iPrice));		//문자열 2개 22자리 확보하고 좌측정렬, 14자리 확보하고 우측정렬하여 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");	//점선 출력
		System.out.printf("우리카드\n");	//문자열 출력
		System.out.printf("%-25s%6s", "카드번호 : 5387-20**-****-4613(S)", "일시불\n");		//문자열 2개 25자리 확보하고 좌측정렬, 6자리 확보하고 우측정렬하여 출력
		System.out.printf("거래일시 : %s\n", k33_sdf.format(k33_cal.getTime()));			//문자열 출력
		System.out.printf("승인번호 : 70404427\n");											//문자열 출력
		System.out.printf("거래번호 : 357734873739\n");										//문자열 출력
		System.out.printf("매입 : 비씨카드사     가맹 : 720068568\n");						//문자열 출력
		System.out.printf("알림 : EDC매출표\n");											//문자열 출력
		System.out.printf("문의 : TEL)1544-4700\n");										//문자열 출력
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");					//점선 출력
		System.out.printf("%14s%s%14s\n"," ", "* 감사합니다 *", " ");						//문자열 3개 14자리 공백출력, 바로 붙여서 문자열 출력, 14자리 확보하여 공백출력
		System.out.printf("%39s", "표준V2.08_20200212");									//문자열 1개 39자리 확보하고 우측정렬하여 출력
		
	}
}
