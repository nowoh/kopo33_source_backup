package hw0427_Tue_ch7;

public class k33_ch7_07_main {		//별2

	public static void main(String[] args) {
		int k33_iPerson = 5; 
		
		k33_ch7_07_classArray[] k33_inData = new k33_ch7_07_classArray[k33_iPerson];
		
//		inData[0] = new k33_ch7_07_classArray("홍길01", 100, 100, 90);
//		inData[1] = new k33_ch7_07_classArray("홍길02", 100, 100, 90);
//		inData[2] = new k33_ch7_07_classArray("홍길03", 100, 100, 90);
//		inData[3] = new k33_ch7_07_classArray("홍길04", 100, 100, 90);
//		inData[4] = new k33_ch7_07_classArray("홍길05", 100, 100, 90);
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {							//반복문 : 정수형 변수 i는 0이고, i는 iPerson전까지 1씩 증가하며 반복
			String k33_name = String.format("홍길%02d", k33_i);						//문자열 변수 name을 "홍길i"를 문자열로 변환한 값으로 정의
			int k33_kor = (int)(Math.random()*100);									//정수형 변수 kor을 0~100까지의 랜덤 정수로 정의
			int k33_eng = (int)(Math.random()*100);									//정수형 변수 eng을 0~100까지의 랜덤 정수로 정의
			int k33_mat = (int)(Math.random()*100);									//정수형 변수 mat을 0~100까지의 랜덤 정수로 정의
			
			k33_ch7_07_classArray k33_indata = new k33_ch7_07_classArray(k33_name, k33_kor, k33_eng, k33_mat);
			System.out.printf("번호 : %d, 이름 : %s, 국어 :  %3d, 영어 : %3d, 수학 : %3d, 총점 : %3d, 평균 : %.2f\n", 
					k33_i+1, k33_indata.k33_name(), k33_indata.k33_kor(), k33_indata.k33_eng(), k33_indata.k33_mat(), k33_indata.k33_sum(), k33_indata.k33_avg());
		}																			
		
	}

}
