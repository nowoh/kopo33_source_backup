package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_5_파일훑어보기 {

	public static void main(String[] args) throws IOException {		//메인함수, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\day_data\\THTSKS010H00.dat");	//dat파일 File 객체 생성하여 불러오기
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));						//f파일 BufferedReader 객체 생성하여 읽기
		
		String k33_readtxt;								//문자열 readtxt 정의
		int k33_LineCnt = 0;							//정수형 변수 LineCnt를 0으로 정의 (LineCnt는 줄 수를 카운트 한 것)
		int k33_n = -1;									//정수형 변수 n은 -1로 정의 (-1은 읽을 것이 없다는 의미)
		StringBuffer k33_s = new StringBuffer();		//StringBuffer s 객체 생성
		while (true) {									//반복문 : 무한 loop
			char[] k33_ch = new char[1000];				//문자어 배열 ch 생성하여 한 번에 1000개씩 읽도록함
			k33_n = k33_br.read(k33_ch);				//파일 리더에 읽은 것을 집어넣음, 몇개까지 읽었는지 표시
			if (k33_n == -1) break;						//더 이상 읽을 것이 없으면 break
			
			for (char k33_c : k33_ch) {					//반복문 : 문자어 c는 ch 배열만큼 반복
				if (k33_c == '\n') {					//문자어가 개행문자면
					System.out.printf("[%s]***\n", k33_s.toString());	//StringBuffer s 문자열로 변환 후 출력 후
					k33_s.delete(0, k33_s.length());					//여태까지 추가해준 문자어 모두 삭제
				} else {								//문자어가 개행문자가 아니면
					k33_s.append(k33_c);				//StringBuffer s에 문자어 c추가해줌
				}
			}
			k33_LineCnt++;								//줄 수 1 더해주기
		}
		System.out.printf("[%s]***\n", k33_s.toString());	//마지막 줄은 개행문자가 없으므로 마지막에 추가된 s 문자열로 변환 후 출력
		k33_br.close();										//BufferedReader 종료
		
	}
}
