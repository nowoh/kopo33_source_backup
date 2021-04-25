package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_3_ReportSheet_30 {

	public static void main(String[] args) {		//메인함수
		SimpleDateFormat k33_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat 객체 생성
		Date k33_date = new Date();												//Date 객체 생성
		
		int k33_iPerson = 30;													//정수형 전역 변수 iPerson 30으로 정의
		int k33_korSum = 0; int k33_engSum = 0; int k33_matSum = 0; int k33_totalSum = 0; double k33_totalAvg = 0;
																				//국어, 영어, 수학, 총점, 평균 합계를 정의할 변수들 모두 0으로 정의
		k33_ch6_9_4_InputData30 k33_inData = new k33_ch6_9_4_InputData30(k33_iPerson);
																				//inData를 k33_ch6_9_4_InputData30(iPerson) 객체 생성한 것으로 정의
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String k33_name = String.format("홍길%02d", k33_i);					//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int k33_kor = (int)(Math.random()*100);								//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int k33_eng = (int)(Math.random()*100);								//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int k33_mat = (int)(Math.random()*100);								//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			k33_inData.SetData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);			
		}																		//정의된 name,kor,eng,mat을 k33_ch6_9_2_InputData 클래스의 SetData메소드의 인자로 넣어서 실행
		System.out.printf("%25s\n\n", "성적집계표");							//문자열 25자리 확보하고 우측정렬하여 출력
		System.out.printf("%27s%s\n", "출력일자 : ", k33_sdf.format(k33_date));	//문자열 2개 27자리 확보하고 우측정렬 & 날짜 문자열로 변환 후 출력
		System.out.printf("==================================================\n");		//문자열 ===출력
		System.out.printf("%-5s%-6s%-6s%-6s%-6s%-6s%-6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
																						//문자열 8개 각각 씌여진 숫자만큼 자리 확보하고 좌측정렬하여 출력
		System.out.printf("==================================================\n");		//문자열 ===출력
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {								//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
					k33_i+1, k33_inData.name[k33_i], k33_inData.kor[k33_i], k33_inData.eng[k33_i], k33_inData.mat[k33_i], k33_inData.sum[k33_i], k33_inData.avg[k33_i]);
																					//번호와 이름 국어 영어 수학 총점 평균을 차례대로 출력
			k33_korSum += k33_inData.kor[k33_i];									//정의된 kor 값을 korSum에 더함
			k33_engSum += k33_inData.eng[k33_i];									//정의된 eng 값을 engSum에 더함
			k33_matSum += k33_inData.mat[k33_i];									//정의된 mat 값을 matSum에 더함
			k33_totalSum += k33_inData.sum[k33_i];									//정의된 sum 값을 totalSum에 더함
			k33_totalAvg += k33_inData.avg[k33_i];									//정의된 avg 값을 totalAvg에 더함
		}
		System.out.printf("==================================================\n");	//문자열 ===출력
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", k33_korSum, k33_engSum, k33_matSum, k33_totalSum, k33_totalAvg);
																					//누적된 korSum, engSum, matSum, totalSum, totalAvg 출력
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "평균", k33_korSum/k33_iPerson, k33_engSum/k33_iPerson, 
				k33_matSum/k33_iPerson, k33_totalSum/k33_iPerson, k33_totalAvg/k33_iPerson);
																					//누적된 korSum, engSum, matSum, totalSum, totalAvg을
																					//iPerson으로 나눠서 평균 구한다음 출력
	}

}
