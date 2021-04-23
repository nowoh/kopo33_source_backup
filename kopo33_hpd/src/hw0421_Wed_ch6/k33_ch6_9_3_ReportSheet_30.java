package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_3_ReportSheet_30 {

	public static void main(String[] args) {		//메인함수
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat 객체 생성
		Date date = new Date();												//Date 객체 생성
		
		int iPerson = 30;							//정수형 전역 변수 iPerson 30으로 정의
		int korSum = 0; int engSum = 0; int matSum = 0; int totalSum = 0; double totalAvg = 0;
													//국어, 영어, 수학, 총점, 평균 합계를 정의할 변수들 모두 0으로 정의
		k33_ch6_9_4_InputData30 inData = new k33_ch6_9_4_InputData30(iPerson);
													//inData를 k33_ch6_9_4_InputData30(iPerson) 객체 생성한 것으로 정의
		for (int i = 0; i < iPerson; i++) {					//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String name = String.format("홍길%02d", i);		//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int kor = (int)(Math.random()*100);				//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int eng = (int)(Math.random()*100);				//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int mat = (int)(Math.random()*100);				//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			inData.SetData(i, name, kor, eng, mat);			
		}							//정의된 name,kor,eng,mat을 k33_ch6_9_2_InputData 클래스의 SetData메소드의 인자로 넣어서 실행
		System.out.printf("%25s\n\n", "성적집계표");		//문자열 25자리 확보하고 우측정렬하여 출력
		System.out.printf("%27s%s\n", "출력일자 : ", sdf.format(date));	//문자열 2개 27자리 확보하고 우측정렬 & 날짜 문자열로 변환 후 출력
		System.out.printf("==================================================\n");	//문자열 ===출력
		System.out.printf("%-5s%-6s%-6s%-6s%-6s%-6s%-6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
																	//문자열 8개 각각 씌여진 숫자만큼 자리 확보하고 좌측정렬하여 출력
		System.out.printf("==================================================\n");	//문자열 ===출력
		for (int i = 0; i < iPerson; i++) {							//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
					i+1, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.avg[i]);
																	//번호와 이름 국어 영어 수학 총점 평균을 차례대로 출력
			korSum += inData.kor[i];								//정의된 kor 값을 korSum에 더함
			engSum += inData.eng[i];								//정의된 eng 값을 engSum에 더함
			matSum += inData.mat[i];								//정의된 mat 값을 matSum에 더함
			totalSum += inData.sum[i];								//정의된 sum 값을 totalSum에 더함
			totalAvg += inData.avg[i];								//정의된 avg 값을 totalAvg에 더함
		}
		System.out.printf("==================================================\n");	//문자열 ===출력
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", korSum, engSum, matSum, totalSum, totalAvg);
																	//누적된 korSum, engSum, matSum, totalSum, totalAvg 출력
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "평균", korSum/iPerson, engSum/iPerson, 
				matSum/iPerson, totalSum/iPerson, totalAvg/iPerson);
																	//누적된 korSum, engSum, matSum, totalSum, totalAvg을
																	//iPerson으로 나눠서 평균 구한다음 출력
	}

}
