package hw0421_Wed_ch6;

public class k33_ch6_9_1_ReportSheet {	//별2

	public static void main(String[] args) {		//메인함수
		int iPerson = 10;							//정수형 전역 변수 iPerson을 10으로 정의 
		
		k33_ch6_9_2_InputData inData = new k33_ch6_9_2_InputData(iPerson);	//k33_ch6_9_2_InputData 클래스를 inData로 객체생성
		
		for (int i = 0; i < iPerson; i++) {					//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String name = String.format("홍길%02d", i);		//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int kor = (int)(Math.random()*100);				//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int eng = (int)(Math.random()*100);				//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int mat = (int)(Math.random()*100);				//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			inData.SetData(i, name, kor, eng, mat);			
		}							//정의된 name,kor,eng,mat을 k33_ch6_9_2_InputData 클래스의 SetData메소드의 인자로 넣어서 실행
		
		for (int i = 0; i < iPerson; i++) {					//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			System.out.printf("번호 : %d, 이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d 평균 : %f\n", 
					i, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.avg[i]);
															//번호와 이름 국어 영어 수학 총점 평균을 차례대로 출력
		}
	}

}
