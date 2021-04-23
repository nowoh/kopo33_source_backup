package hw0421_Wed_ch6;

public class k33_ch6_9_6_InputData200 {
	String[] name;			//문자열 배열 name 전역변수로 정의
	int[] kor;				//정수형 배열 kor 전역변수로 정의
	int[] eng;				//정수형 배열 eng 전역변수로 정의
	int[] mat;				//정수형 배열 mat 전역변수로 정의
	int[] sum;				//정수형 배열 sum 전역변수로 정의
	double[] avg;			//실수형 배열 avg 전역변수로 정의
	
	k33_ch6_9_6_InputData200(int iPerson) {	//인자로 정수형 변수 iPerson을 받는 생성자 정의
		name = new String[iPerson];			//배열 name의 크기를 iPerson으로 정의
		kor = new int[iPerson];				//배열 kor의 크기를 iPerson으로 정의
		eng = new int[iPerson];				//배열 eng의 크기를 iPerson으로 정의
		mat = new int[iPerson];				//배열 mat의 크기를 iPerson으로 정의
		sum = new int[iPerson];				//배열 sum의 크기를 iPerson으로 정의
		avg = new double[iPerson];			//배열 avg의 크기를 iPerson으로 정의
		
	}
	public void SetData(int i, String name, int kor, int eng, int mat) {	
									//리턴값이 없고 정수형 변수 4개와 문자열 변수 1개를 인자로 받는 SetData 메소드 정의
									//배열의 각 요소를 정의해주는 메소드
		this.name[i] = name;		//배열 name의 i번째 요소를 name으로 정의
		this.kor[i] = kor;			//배열 kor의 i번째 요소를 kor로 정의
		this.eng[i] = eng;			//배열 eng의 i번째 요소를 eng으로 정의
		this.mat[i] = mat;			//배열 mat의 i번째 요소를 mat으로 정의
		this.sum[i] = kor + eng + mat;						//배열 sum의 i번째 요소를 kor + eng + mat으로 정의
		this.avg[i] = (double) ((kor + eng + mat) / 3.0);	//배열 avg의 i번째 요소를 ((kor + eng + mat) / 3.0)으로 정의
	}
}
