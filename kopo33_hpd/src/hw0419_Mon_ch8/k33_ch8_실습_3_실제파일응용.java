package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_3_실제파일응용 {

	public static void main(String[] args) throws IOException {		//메인함수, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\전국무료와이파이정보.csv");	//csv파일 File 객체 생성하여 불러오기
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));						//f파일 BufferedReader 객체 생성하여 읽기
		
		String k33_readtxt;																		//문자열 readtxt 정의
		
		if ((k33_readtxt = k33_br.readLine()) == null) {										//readtxt를 한 줄 읽어서 null이면
			System.out.printf("빈 파일입니다.\n");												//문자열 출력하고ㄴ
			return;																				//메인 함수 끝
		}
		String[] k33_field_name = k33_readtxt.split(",");			//문자열 배열 field_name을 readtxt를 ,로 나눈 것들을 요소로 받아서 정의함
																	//csv파일은 ,로 각 요소들이 구분되어짐
																	//위 if문에서 br.readLine으로 한 줄을 readtxt에 넣어서 읽었기 때문에
																	//field_name 배열은 csv파일의 첫 줄(항목이름)을 받아온 것
		int k33_LineCnt = 0;										//정수형 변수 LineCnt를 0으로 정의 (LineCnt는 줄 수를 카운트 한 것)
		while ((k33_readtxt = k33_br.readLine()) != null) {			//반복문 : readtxt를 줄 별로 읽어서 null이 아니면 반복 (field_name으로 읽은 것 다음 줄부터 read)
			String[] k33_field = k33_readtxt.split(",");			//문자열 배열 field는 readtxt를 ,로 나눈 것들을 요소로 받아서 정의함
																	//csv파일은 ,로 각 요소들이 구분되어짐
			System.out.printf("**[%d번째 항목]*****************\n", k33_LineCnt);	//줄 수 출력
			for (int j = 0; j < k33_field_name.length; j++) {						
														//반복문 : 정수형 변수 j는 0이고, j는 field_name 배열 크기 전까지 1씩 증가하며 반복
				System.out.printf(" %s : %s\n", k33_field_name[j], k33_field[j]);
			}											//field_name배열의 j번째, field 배열의 j번째 요소 출력
			System.out.printf("***********************************\n");		//문자열 출력
			if (k33_LineCnt == 100) break;									//LineCnt가 100이면 반복문 break
			k33_LineCnt++;													//LineCnt 1 더해주기
		}
		
		k33_br.close();														//BufferedReader 종료
	}
}
