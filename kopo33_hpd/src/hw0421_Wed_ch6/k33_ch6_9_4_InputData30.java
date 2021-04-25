package hw0421_Wed_ch6;

public class k33_ch6_9_4_InputData30 {	
	String[] k33_name;			//문자열 배열 name 전역변수로 정의
	int[] k33_kor;				//정수형 배열 kor 전역변수로 정의
	int[] k33_eng;				//정수형 배열 eng 전역변수로 정의
	int[] k33_mat;				//정수형 배열 mat 전역변수로 정의
	int[] k33_sum;				//정수형 배열 sum 전역변수로 정의
	double[] k33_avg;			//실수형 배열 avg 전역변수로 정의
	
	k33_ch6_9_4_InputData30(int k33_iPerson) {		//인자로 정수형 변수 iPerson을 받는 생성자 정의
		k33_name = new String[k33_iPerson];			//배열 name의 크기를 iPerson으로 정의
		k33_kor = new int[k33_iPerson];				//배열 kor의 크기를 iPerson으로 정의
		k33_eng = new int[k33_iPerson];				//배열 eng의 크기를 iPerson으로 정의
		k33_mat = new int[k33_iPerson];				//배열 mat의 크기를 iPerson으로 정의
		k33_sum = new int[k33_iPerson];				//배열 sum의 크기를 iPerson으로 정의
		k33_avg = new double[k33_iPerson];			//배열 avg의 크기를 iPerson으로 정의
		
	}
	public void k33_SetData(int k33_i, String k33_name, int k33_kor, int k33_eng, int k33_mat) {	
												//리턴값이 없고 정수형 변수 4개와 문자열 변수 1개를 인자로 받는 SetData 메소드 정의
												//배열의 각 요소를 정의해주는 메소드
		this.k33_name[k33_i] = k33_name;		//배열 name의 i번째 요소를 name으로 정의
		this.k33_kor[k33_i] = k33_kor;			//배열 kor의 i번째 요소를 kor로 정의
		this.k33_eng[k33_i] = k33_eng;			//배열 eng의 i번째 요소를 eng으로 정의
		this.k33_mat[k33_i] = k33_mat;			//배열 mat의 i번째 요소를 mat으로 정의
		this.k33_sum[k33_i] = k33_kor + k33_eng + k33_mat;						//배열 sum의 i번째 요소를 kor + eng + mat으로 정의
		this.k33_avg[k33_i] = (double) ((k33_kor + k33_eng + k33_mat) / 3.0);	//배열 avg의 i번째 요소를 ((kor + eng + mat) / 3.0)으로 정의
	}
}