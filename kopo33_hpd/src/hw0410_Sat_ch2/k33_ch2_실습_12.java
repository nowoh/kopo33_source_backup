package hw0410_Sat_ch2;

public class k33_ch2_실습_12 {
	/*
	 * class VarEx2
	 */
	public static void main(String[] args) {
		int k33_i = 91234567;			//정수형 변수 i 정의
		float k33_f = (float)k33_i;		//실수형 변수 f를 변수 i를 float로 형 변환한 값으로 정의
		int k33_i2 = (int)k33_f;		//정수형 변수 i2를 변수 f를 integer로 형 변환한 값으로 정의
		
		double k33_d = (double)k33_i;	//실수형 변수 d를 변수 i를 double형으로 형 변환한 값으로 정의
		int k33_i3 = (int)k33_d;		//정수형 변수 i3을 변수 d를 integer로 형 변환한 값으로 정의
		
		float k33_f2 = 1.666f;			//실수형 변수 f2를 1.666f로 정의
		int k33_i4 = (int)k33_f2;		//정수형 변수 i4를 변수 f2를 integer로 형 변환한 값으로 정의
		
		System.out.printf("k33_i=%d\n", k33_i);		//i출력
		System.out.printf("k33_f=%f k33_i2=%d\n", k33_f, k33_i2);	//f와 i2 출력
		System.out.printf("k33_d=%f k33_i3=%d\n", k33_d, k33_i3);	//d와 i3 출력
		System.out.printf("(int)%f=%d\n", k33_f2, k33_i4);			//f2와 i4 출력
	}
}
