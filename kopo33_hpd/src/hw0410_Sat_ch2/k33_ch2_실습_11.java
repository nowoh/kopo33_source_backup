package hw0410_Sat_ch2;

public class k33_ch2_실습_11 {
	/*
	 * CastingEx3
	 */
	public static void main(String[] args) {
		float k33_f = 9.1234567f;			//실수형 변수 f 정의
		double k33_d = 9.1234567;			//실수형 변수 d 정의
		double k33_d2 = (double)k33_f;		//실수형 변수 d2는 변수 f를 double형으로 형 변환 해준 값으로 정의
		
		System.out.printf("k33_f =%20.18f\n", k33_f);	//f를 출력하는데 20자리 확보하고 소수점 18번째자리까지 출력
		System.out.printf("k33_d =%20.18f\n", k33_d);	//d를 출력하는데 20자리 확보하고 소수점 18번째자리까지 출력
		System.out.printf("k33_d2=%20.18f\n", k33_d2);	//d2를 출력하는데 20자리 확보하고 소수점 18번째자리까지 출력
	}
}
