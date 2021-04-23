package hw0413_Tue_ch4;

import java.text.DecimalFormat;

public class k33_ch4_실습_18_칸_맞춰_인쇄 {
	/*
	 * 칸_맞춰_인쇄
	 */
	public static void main(String[] args) {
		String k33_item = " 사과";	//문자열 변수 item을 사과로 정의
		int k33_unit_price = 5000;	//정수형 변수 unit_price를 5000으로 정의
		int k33_num = 500;		//정수형 변수 num을 500으로 정의
		int k33_total = 0;		//정수형 변수 total을 0으로 정의
		
		DecimalFormat k33_df = new DecimalFormat( "###,###,###,###,###" );	
										//DecimalFormat 클래스 df 객체 선언, format 설정
		System.out.printf("======================================================\n");	//=========출력, 행 바꾸기
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");		//품목, 단가, 수량, 합계 출력
						//%20.20s => 문자열 20자리 확보하여 출력, 최대 20자리까지 가능 //%8.8s => 문자열 10자리 확보하여 출력, 최대 10자리까지 가능
		System.out.printf("======================================================\n");	//=========출력, 행 바꾸기
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", k33_item, 		
				k33_df.format(k33_unit_price), k33_df.format(k33_num), k33_df.format(k33_unit_price*k33_num));
						//item, unit_price, num, unit_price*num연산한 값 출력
						//정수형 변수들은 df.format으로 지정한 형식으로 출력
						//%20.20s => 문자열 20자리 확보하여 출력, 최대 20자리까지 가능 //%10.10s => 문자열 10자리 확보하여 출력, 최대 10자리까지 가능
		System.out.printf("======================================================\n");	//=========출력, 행 바꾸기
	}

}
