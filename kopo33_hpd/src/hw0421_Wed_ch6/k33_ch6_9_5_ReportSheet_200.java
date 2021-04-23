package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_5_ReportSheet_200 {

	public static void main(String[] args) {	//메인함수
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat 객체 생성
		Date date = new Date();												//Date 객체 생성
		
		int iPerson = 200;													//정수형 전역 변수 iPerson 200으로 정의
		
		int korAcc = 0; int engAcc = 0; int matAcc = 0; int totalSumAcc = 0; double totalAvgAcc = 0;
														//전체 국어, 영어, 수학, 총점, 평균을 누적하는 모두 변수 0으로 정의
		int pageNum = 1; int totalAcc = 0;				//페이지 표시하는 pageNum을 1로 정의하고, 출력한 번호수를 누적으로 count하는 변수 totalAcc 0으로 정의
		
		k33_ch6_9_6_InputData200 inData = new k33_ch6_9_6_InputData200(iPerson);
														//inData를 k33_ch6_9_6_InputData200(iPerson) 객체 생성한 것으로 정의
		for (int i = 0; i < iPerson; i++) {				//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String name = String.format("홍길%02d", i);	//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int kor = (int)(Math.random()*100);			//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int eng = (int)(Math.random()*100);			//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int mat = (int)(Math.random()*100);			//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			inData.SetData(i, name, kor, eng, mat);			
		}												//정의된 name,kor,eng,mat을 k33_ch6_9_2_InputData 클래스의 SetData메소드의 인자로 넣어서 실행
		
		for (int i = 0; i < iPerson; i += 30) {			//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 30씩 증가하며 반복
														//30개씩 나눠서 출력하기 위함
			System.out.printf("%25s\n\n", "성적집계표");	//문자열 25자리 확보하고 우측정렬하여 출력
			System.out.printf("%-4s%-11d%9s%s\n", "PAGE : ", pageNum, "출력일자 : ", sdf.format(date));		//count한 pageNum과 날짜 출력
			System.out.printf("==================================================\n");						//문자열 ===출력
			System.out.printf("%-4s%-6s%-6s%-6s%-6s%-6s%-6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
																							//문자열 8개 각각 씌여진 숫자만큼 자리 확보하고 좌측정렬하여 출력					
			System.out.printf("==================================================\n");		//문자열 ===출력
			
			int korSum = 0; int engSum = 0; int matSum = 0; int totalSum = 0; double totalAvg = 0;
																//한 페이지에서 출력되는 국어, 영어, 수학, 총점, 평균 점수를 누적하는 변수 모두 0으로 정의
																//밑의 for문이 돌아가고 나서 위의 for문이 다시 시작할 때 초기화해주기 위해 첫 번째 for문 안에서 정의
			int pageCnt = 0; 									//한 페이지 안에서 출력되는 번호의 수를 count하는 변수 pageCnt를 0으로 정의
			
			try {												//출력되는 번호의 수가 i+30보다 작아도 끝까지 출력될 수 있도록 try 걸어줌
				for (int j = i; j < i+30; j++) {				//반복문 정수형 변수 j는 i이고, j는 i+30전까지 1씩 증가하며 반복
					System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
							j+1, inData.name[j], inData.kor[j], inData.eng[j], inData.mat[j], inData.sum[j], inData.avg[j]);
																//번호와 이름 국어 영어 수학 총점 평균을 차례대로 출력
					korSum += inData.kor[i];					//정의된 kor 값을 korSum에 더함
					engSum += inData.eng[i];					//정의된 eng 값을 engSum에 더함
					matSum += inData.mat[i];					//정의된 mat 값을 matSum에 더함
					totalSum += inData.sum[i];					//정의된 sum 값을 totalSum에 더함
					totalAvg += inData.avg[i];					//정의된 avg 값을 totalAvg에 더함
																//현재 반복문 끝나고 새로운 반복문 시작되면 초기화됨
					korAcc += inData.kor[j];					//정의된 kor 값을 korAcc에 더함								
					engAcc += inData.eng[j];					//정의된 eng 값을 engAcc에 더함
					matAcc += inData.mat[j];					//정의된 mat 값을 matAcc에 더함
					totalSumAcc += inData.sum[j];				//정의된 sum 값을 totalSumAcc에 더함
					totalAvgAcc += inData.avg[j];				//정의된 avg 값을 totalAvgAcc에 더함
																//현재 반복문 끝나고 새로운 반복문 시작되어도 계속 누적
					pageCnt++;									//pageCnt에 1 더함 (현재 반복문 끝나고 새로운 반복문 시작되면 초기화됨)
					totalAcc++;									//totalAcc에 1 더함
				}
			} catch (Exception e) {								//try - catch
				
			}
			System.out.printf("==================================================\n");				//문자열 ===출력
			System.out.printf("%s\n", "현재페이지");												//"현재페이지" 출력
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", korSum, engSum, matSum, totalSum, totalAvg);
																									//누적된 korSum, engSum, matSum, totalSum, totalAvg 출력		
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "평균", korSum/pageCnt, engSum/pageCnt, matSum/pageCnt, totalSum/pageCnt, totalAvg/pageCnt);
																									//누적된 korSum, engSum, matSum, totalSum, totalAvg을
																									//count된 pageCnt로 나눠 평균 구한다음 출력
			System.out.printf("==================================================\n");				//문자열 ===출력
			System.out.printf("%s\n", "누적페이지");												//"누적페이지" 출력
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", korAcc, engAcc, matAcc, totalSumAcc, totalAvgAcc);
																									//총 누적 국어, 영어, 수학, 총점, 평균 출력
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n\n", "평균", korAcc/totalAcc, engAcc/totalAcc, 
					matAcc/totalAcc, totalSumAcc/totalAcc, totalAvgAcc/totalAcc);
																									//총 누적된 국어, 영어, 수학, 총점, 평균을 
																									//count한 totalAcc로 나눠 평균 구한다음 출력
			pageNum++;																				//페이지 수를 뜻하는 pageNum에 1 더함
		}
	}
}
