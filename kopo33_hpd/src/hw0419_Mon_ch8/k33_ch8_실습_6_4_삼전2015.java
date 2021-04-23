package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_6_4_삼전2015 {
	
	public static void main(String[] args) throws IOException {		//메인함수, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\day_data\\\\THTSKS010H00.dat");	//dat파일 File 객체 생성하여 불러오기
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));							//f파일 BufferedReader 객체 생성하여 읽기
		
		File k33_f1 = new File("C:\\Users\\Howon\\Desktop\\howon\\삼전2015.csv");					//csv파일 File 객체 생성하여 불러오기
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_f1));						//f파일 BufferedWriter 객체 생성하여 쓰기
		
		String k33_readtxt;																			//문자열 readtxt 정의
		
		int k33_cnt = 0; int k33_wcnt = 0;															//정수형 변수 cnt와 wcnt 각각 0으로 정의		
		while ((k33_readtxt = k33_br.readLine()) != null) {											//반복문 : readtxt를 한 줄씩 읽어서 null이 아니면 반복
			StringBuffer k33_s = new StringBuffer();												//StringBuffer s 객체 생성
			String[] k33_field = k33_readtxt.split("%_%");											//문자열 배열 field를 readtxt를 %_%기준으로 나눈 것들을 요소로 받아서 정의함
			//dat파일은 %_%를 기준으로 분리할 수 있음
			if(k33_field.length > 2 && k33_field[2].replace("^", "").trim().equals("A005930") && k33_field[1].replace("^", "").trim().substring(0, 4).equals("2015")) {
			//조건문 : field 배열의 길이가 2보다 크고 field배열의 [2]번째 요소의 ^를 없애고 앞뒤 공백을 없앤 다음 문자열이 A005930과 같음과 동시에
			//field배열의 [1]번째 요소의 ^를 없애고 앞뒤 공백을 없앤 다음 문자열이 20150112와 같으면 true (세 조건 모두 만족시키는 값)
			//A005930은 삼성전자의 종목코드이고 20150112는 2015년 1월 12일에 거래되었다는 것을 의미하는 정보
				
				k33_s.append(k33_field[0].replace("^","").trim());									//StringBuffer s에 field배열 [0]번째 요소 ^를 없애고 공백을 없앤 값을 붙여넣기
																									//첫 줄은 콤마(,)를 안 넣어주기 때문에 먼저 따로 삽입해줌
				for (int k33_j = 1; k33_j < k33_field.length; k33_j++) {							//반복문 : 정수형 변수 j는 1이고, j는 field배열의 길이전까지 1씩 증가하며 반복
					k33_s.append("," + k33_field[k33_j].replace("^","").trim());					//StringBuffer s에 콤마(,)와 field배열 [j]번째 요소 ^를 없애고 공백을 없앤 값을 붙여넣기
				}
				k33_bw1.write(k33_s.toString()); k33_bw1.newLine();									//bw1을 통해 s를 문자열로 형변환 해준다음 파일을 쓰고 행을 바꿔줌
				k33_wcnt++;																			//wcnt에 1을 더해줌
			}
			k33_cnt++;																				//cnt에 1을 더해줌
		}
		k33_br.close();																				//BufferedReader 종료
		k33_bw1.close();																			//BufferedWriter 종료
		
		System.out.printf("Program End[%d][%d]records\n", k33_cnt, k33_wcnt);						//문자열을 cnt값과 wcnt값과 같이 출력
	}																								//wcnt는 쓴 횟수, cnt는 읽은 횟수
}
