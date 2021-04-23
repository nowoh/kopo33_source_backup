package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_4_거리계산1 {
	
	public static void main(String[] args) throws IOException {		//메인함수, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\전국무료와이파이정보.txt");	//txt파일 File 객체 생성하여 불러오기
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));				//f파일 BufferedReader 객체 생성하여 읽기
		
		String k33_readtxt;																//문자열 readtxt 정의
		
		if ((k33_readtxt = k33_br.readLine()) == null) {								//readtxt를 한 줄 읽어서 null이면
			System.out.printf("빈 파일입니다.\n");										//문자열 출력하고
			return;																		//메인 함수 끝
		}
		String[] k33_field_name = k33_readtxt.split("\t");								//문자열 배열 field_name을 readtxt를 \t으로 나눈 것들을 요소로 받아서 정의함
																						//txt파일은 \t으로 각 요소들이 구분되어짐
																						//위 if문에서 br.readLine으로 한 줄을 readtxt에 넣어서 읽었기 때문에
																						//field_name 배열은 txt파일의 첫 줄(항목이름)을 받아온 것
		double k33_lat = 37.3860521;													//실수형 변수 lat 37.3860521으로 정의 (lat는 분당융기원 위도)
		double k33_lng = 127.1214038;													//실수형 변수 lng 127.1214038로 정의 (lng는 분당융기원 경도)
			
		int k33_LineCnt = 1;								//정수형 변수 LineCnt를 1으로 정의 (LineCnt는 줄 수를 카운트 한 것)									
		double k33_min = Double.MAX_VALUE;					//실수형 변수 min은 Double의 최대값으로 정의
		double k33_max = Double.MIN_VALUE;					//실수형 변수 max은 Double의 최소값으로 정의
		String k33_min_field = null;						//문자열 변수 min_field는 null 값으로 정의
		String k33_max_field = null;						//문자열 변수 max_field는 null 값으로 정의
		String k33_min_lat = null;							//문자열 변수 min_lat는 null 값으로 정의
		String k33_min_lng = null;							//문자열 변수 min_lng는 null 값으로 정의
		String k33_max_lat = null;							//문자열 변수 max_lat는 null 값으로 정의
		String k33_max_lng = null;							//문자열 변수 max_lng_field는 null 값으로 정의
		
		while ((k33_readtxt = k33_br.readLine()) != null) {	//반복문 : readtxt를 줄 별로 읽어서 null이 아니면 반복 (field_name으로 읽은 것 다음 줄부터 read)
			
			String[] k33_field = k33_readtxt.split("\t");	//문자열 배열 field는 readtxt를 \t으로 나눈 것들을 요소로 받아서 정의함
															//txt파일은 \t으로 각 요소들이 구분되어짐
			System.out.printf("**[%d번째 항목]*****************\n", k33_LineCnt);	//줄 수 출력
			System.out.printf(" %s : %s\n", k33_field_name[9], k33_field[9]);		//field_name배열의 9번째 요소와 field배열의 9번째 요소 출력 (소재지도로명주소 출력)
			System.out.printf(" %s : %s\n", k33_field_name[13], k33_field[13]);		//field_name배열의 13번째 요소와 field배열의 13번째 요소 출력 (위도 출력)
			System.out.printf(" %s : %s\n", k33_field_name[14], k33_field[14]);		//field_name배열의 14번째 요소와 field배열의 14번째 요소 출력 (경도 출력)
			double k33_dist = Math.sqrt( Math.pow(Double.parseDouble(k33_field[13])-k33_lat, 2)	//Math.sqrt와 Math.pow 이용하여 분당융기원과 각 도로명주소의 위도 경도 비교하여 
					+ Math.pow(Double.parseDouble(k33_field[14])-k33_lng, 2));					//분당융기원과의 거리를 구한다음 구한 값을 실수형 변수 dist로 정의
			System.out.printf(" 현재지점과 거리 : %f\n",k33_dist);								//분당융기원과의 거리 출력
			System.out.printf("********************************\n");							//문자열 출력

			if (k33_min > k33_dist) {															//조건문 : min이 dist보다 크면
				k33_min = k33_dist;																//min을 dist로 재정의하고 (최소거리)
				k33_min_field = k33_field[9];													//min_field를 field 배열의 9번째 요소로 재정의 (최소거리의 주소)
				k33_min_lat = k33_field[13];													//min_lat를 field 배열의 13번째 요소로 재정의 (최소거리의 위도)
				k33_min_lng = k33_field[14];													//min_lng를 field 배열의 14번째 요소로 재정의 (최소거리의 경도)
			} else if (k33_max < k33_dist) {													//조건문 : max가 dist보다 작으면
				k33_max = k33_dist;																//max를 dist로 재정의하고 (최대거리)
				k33_max_field = k33_field[9];													//max_field를 field 배열의 9번째 요소로 재정의 (최대거리의 주소)
				k33_max_lat = k33_field[13];													//max_lat를 field 배열의 13번째 요소로 재정의 (최대거리의 위도)
				k33_max_lng = k33_field[14];													//max_lng를 field 배열의 14번째 요소로 재정의 (최대거리의 경도)
				
			}	
			k33_LineCnt++;																		//줄 수 1 더해주기
		}
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "최소거리지점", k33_min_field, "위도", k33_min_lat, "경도", k33_min_lng, "거리", k33_min);	
																								//최종 최소거리지점 도로명주소와 위도, 경도, 분당융기원과의 거리 출력
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "최대거리지점", k33_max_field, "위도", k33_max_lat, "경도", k33_max_lng, "거리", k33_max);	
																								//최종 최대거리지점 도로명주소와 위도, 경도, 분당융기원과의 거리 출력
		k33_br.close();																			//BufferedReader 종료
	}
}
