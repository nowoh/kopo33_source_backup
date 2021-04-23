package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class k33_ch8_실습_6_5_삼전min_max {
	
	public static void main(String[] args) throws IOException {						//메인함수, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\삼전2015.csv");	//csv파일 File 객체 생성하여 불러오기
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));		//f파일 BufferedReader 객체 생성하여 읽기
		DecimalFormat df = new DecimalFormat("###,###,###,###");				//DecimalFormat df 객체 생성
		
		String k33_readtxt;														//문자열 readtxt 정의
		
		int k33_min = Integer.MAX_VALUE;										//정수형 변수 min은 Integer의 최대값으로 정의
		int k33_max = Integer.MIN_VALUE;										//정수형 변수 max는 Integer의 최소값으로 정의
		String k33_min_date = null;												//문자열 min_date는 null로 정의
		String k33_max_date = null;												//문자열 max_date는 null로 정의
		
		int k33_cnt = 0;														//정수형 변수 cnt를 0으로 정의 (cnt는 거래건수)
		while ((k33_readtxt = k33_br.readLine()) != null) {						//반복문 : readtxt를 줄 별로 읽어서 null이 아니면 반복
			
			String[] k33_field = k33_readtxt.split(",");						//문자열 배열 field는 readtxt를 콤마(,)로 나눈 것들을 요소로 받아서 정의함
			
			int k33_price = Integer.parseInt(k33_field[3]);						//정수형 변수 price는 field배열의 [3]번째 요소를 Integer로 형 변환해준 것으로 정의	
			
			if (k33_min > k33_price) {											//조건문 : min이 price보다 크면
				k33_min = k33_price;											//min은 price로 정의해주고
				k33_min_date = k33_field[1];									//그 때의 field배열 [1] 값을 min_date로 정의해줌 
			} else if (k33_max < k33_price) {									//조건문 : max가 price보다 작으면
				k33_max = k33_price;											//max은 price로 정의해주고
				k33_max_date = k33_field[1];									//그 때의 field배열 [1] 값을 max_date로 정의해줌 
			}
			k33_cnt++;															//cnt에 1씩 더해줌
		}
		System.out.printf("총 거래건수 : %s건\n", k33_cnt);
		System.out.printf("%s : %s 원 (%s : %s)\n", "최소 종가액", df.format(k33_min), "거래 일자", k33_min_date);	//최소종가액 min값과 그 거래일자 min_date 출력
		System.out.printf("%s : %s 원 (%s : %s)\n", "최대 종가액", df.format(k33_max), "거래 일자", k33_max_date);	//최소종가액 min값과 그 거래일자 min_date 출력
		k33_br.close();																								//BufferedReader 종료
	}
}
