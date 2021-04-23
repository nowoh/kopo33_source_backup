package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_2_Buffer읽고쓰기 {

	public static void k33_FileWriter() throws IOException {		//FileWriter 메소드 생성, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");		//k33.txt파일 f파일로 불러오기 (없으면 불러오기)
		BufferedWriter k33_bw = new BufferedWriter(new FileWriter(k33_f));	//f파일 BufferedWriter 객체 생성하여 쓰기
		
		k33_bw.write("안녕 파일");											//bw로 문자열 쓰기
		k33_bw.newLine();													//행 바꾸기
		k33_bw.write("hello 헬로");											//bw로 문자열 쓰기
		k33_bw.newLine();													//행 바꾸기
		
		k33_bw.close();														//BufferedWriter 종료
	}
	
	public static void k33_FileRead() throws IOException {			//FileRead 메소드 생성, error 예외 처리 해줌
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");	//k33.txt파일 f파일로 불러오기 (없으면 불러오기)
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));	//f파일 BufferedReader 객체 생성하여 읽기
		
		String k33_readtxt;											//문자열 readtxt 정의
		
		while ((k33_readtxt = k33_br.readLine()) != null) {			//반복문 : readtxt를 줄 별로 읽어서 null이 아니면 반복
			System.out.printf("%s\n", k33_readtxt);					//readtxt 출력
		}
		k33_br.close();												//BufferedWriter 종료
	}
	public static void main(String[] args) throws IOException {		//메인함수, error 예외 처리 해줌
		k33_FileWriter();											//FileWriter 메소드 실행
		k33_FileRead();												//FileReader 메소드 실행
	}
}
