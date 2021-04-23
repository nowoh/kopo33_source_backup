package hw0419_Mon_ch8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class k33_ch8_실습_1_무식하게읽고쓰기 {

	public static void main(String[] args) {	//메인함수
		try {									//try 시작
			File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");	//k33.txt파일 f파일로 불러오기 (없으면 생성)	
			FileWriter k33_fw = new FileWriter(k33_f);						//f 파일에 FileWriter 객체 생성하여 쓰기
			
			k33_fw.write("안녕 파일\n");									//fw에 문자열 쓰기
			k33_fw.write("hello 헬로\n");									//fw에 문자열 쓰기
			
			k33_fw.close();													//FileWriter 종료
			
			FileReader k33_fr = new FileReader(k33_f);						//FileReader로 f 파일 읽기
			
			int k33_n = -1;													//정수형 변수 n은 -1로 정의 (-1은 읽을 것이 없다는 의미)
			char[] k33_ch;													//char 배열 ch 정의
			
			while (true) {													//반복문 : 무한 loop
				k33_ch = new char [100];									//문자어 배열 ch 생성하여 한 번에 100개씩 읽도록함
				k33_n = k33_fr.read(k33_ch);								//파일 리더에 읽은 것을 집어넣음, 몇개까지 읽었는지 표시
				
				if (k33_n == -1) break;										//더 이상 읽을 것이 없으면 break
				
				for (int k33_i = 0; k33_i < k33_n; k33_i++) {				//반복문 : 정수형 변수 i는 0이고, i는 n전까지 1씩 증가하며 반복
					System.out.printf("%c", k33_ch[k33_i]);					//배열 ch에 있는 문자어 순서대로 출력
				}
			}
			k33_fr.close();													//FileReader 종료
			
			System.out.printf("\n FILE READ END ");							//문자열 출력
		} catch (Exception k33_e) {											//예외문 (catch)		
			System.out.printf("나 에러[%s]\n", k33_e);						//error가 나면 문자열 출력하고 error 이유 출력
		}
	}
}
