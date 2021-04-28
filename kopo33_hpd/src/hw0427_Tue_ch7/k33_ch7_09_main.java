package hw0427_Tue_ch7;

import java.util.ArrayList;

public class k33_ch7_09_main {		
	static ArrayList<k33_ch7_09_Class_ArrayList> k33_ArrayOneRec = new ArrayList <k33_ch7_09_Class_ArrayList>();
											//ArrayList를 클래스형태로 받아서 전역으로 선언 및 생성 
	static int k33_sumkor = 0;				//정수형 변수 sumkor를 0으로 정의 (전역변수)
	static int k33_sumeng = 0;				//정수형 변수 sumeng를 0으로 정의 (전역변수)
	static int k33_summat = 0;				//정수형 변수 summat를 0으로 정의 (전역변수)
	static int k33_sumsum = 0;				//정수형 변수 sumsum을 0으로 정의 (전역변수)
	static int k33_sumavg = 0;				//정수형 변수 sumavg를 0으로 정의 (전역변수)
	static final int k33_iPerson = 20;		//정수형 변수 iPerson을 0으로 정의 (전역변수, final로 정의하여 수정 불가)
	
	public static void main(String[] args) {							//메인 함수
		k33_dataSet();													//dataSet 함수 실행
		k33_HeaderPrint();												//HeaderPrint 함수 실행
		for(int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i++) {	//반복문 : 정수형 변수 i는 0이고, i는 ArrayOneRec크기 전까지 1씩 증가하며 반복
			k33_ItemPrint(k33_i);										//ArrayOneRec 배열의 i번째 요소 ItemPrint에 맞게 출력하기
		}
		k33_TailPrint();												//TailPrint 함수 실행
	}
	
	public static void k33_dataSet() {									//데이터를 set하는 메소드 dataSet 정의
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {			//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String k33_name = String.format("홍길%02d", k33_i);			//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int k33_kor = (int)(Math.random()*100);						//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int k33_eng = (int)(Math.random()*100);						//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int k33_mat = (int)(Math.random()*100);						//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			k33_ArrayOneRec.add(new k33_ch7_09_Class_ArrayList(k33_i, k33_name, k33_kor, k33_eng, k33_mat)); 
		}									//ArrayOneRec 배열에 k33_ch7_09_Class_ArrayList 클래스의 메소드 (set 함수) 값을 저장
	}
	
	public static void k33_HeaderPrint() {										//head 타이틀을 출력해주는 메소드 HeaderPrint 정의
		System.out.printf("*****************************************\n");		//문자열 출력
		System.out.printf("%2s %4s %2s %2s %2s  %2s    %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");
																				//타이틀 출력
		System.out.printf("*****************************************\n");		//문자열 출력
	}
	
	public static void k33_ItemPrint(int k33_i) {								//Item을 출력 하는 메소드 ItemPrint 정의 (integer를 인자로 받음)
		k33_ch7_09_Class_ArrayList k33_rec;										//Class_ArrayList rec 선언
		
		k33_rec = k33_ArrayOneRec.get(k33_i);									//ArrayOneRec배열의 i번째 요소를 rec으로 정의
		System.out.printf("%3d %5s %3d %4d %5d   %3d  %6.2f\n", k33_rec.k33_student_id(), k33_rec.k33_name(),k33_rec.k33_kor(), k33_rec.k33_eng(), 
				k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_avg());
											//k33_ch7_07_classArray의 메소드(get 함수) 가져와서 학번, 이름, 국어 점수, 영어 점수, 수학 점수, 총점, 평균 출력
		k33_sumkor += k33_rec.k33_kor();	//sumkor에 국어 점수 누적하기
		k33_sumeng += k33_rec.k33_eng();	//sumeng에 영어 점수 누적하기
		k33_summat += k33_rec.k33_mat();	//summat에 수학 점수 누적하기
		k33_sumsum += k33_rec.k33_sum();	//sumsum에 총점 누적하기
		k33_sumavg += k33_rec.k33_avg();	//sumavg에 평균 점수 누적하기
	}
	
	public static void k33_TailPrint() {										//누적된 합계 평균 출력하는 메소드 TailPrint 정의
		System.out.printf("*****************************************\n");		//문자열 출력
		System.out.printf("국어합계 %6d   국어평균 : %6.2f\n", k33_sumkor, k33_sumkor / (double)k33_ArrayOneRec.size());	//누적된 국어 합계, 평균 출력
		System.out.printf("영어합계 %6d   영어평균 : %6.2f\n", k33_sumeng, k33_sumeng / (double)k33_ArrayOneRec.size());	//누적된 영어 합계, 평균 출력
		System.out.printf("수학합계 %6d   수학평균 : %6.2f\n", k33_summat, k33_summat / (double)k33_ArrayOneRec.size());	//누적된 수학 합계, 평균 출력
		System.out.printf("*****************************************\n");													//문자열 출력
		System.out.printf("반평균합계 %4d   반평균 : %6.2f\n", k33_sumavg, k33_sumavg / (double)k33_ArrayOneRec.size());	//누적된 반평균 합계, 반평균 출력
	}
}
