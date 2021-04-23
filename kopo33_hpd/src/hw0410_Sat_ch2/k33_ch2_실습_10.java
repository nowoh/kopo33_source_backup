package hw0410_Sat_ch2;

public class k33_ch2_실습_10 {
	/*
	 * CastingEx2
	 */
	public static void main(String[] args) {
		int k33_i = 10;						//정수형 변수 i 10으로 정의
		byte k33_b = (byte)k33_i;			//byte 변수 b를 i를 byte로 형 변환 해준 값으로 정의
		System.out.printf("[int -> byte] k33_i=%d -> k33_b=%d%n", k33_i, k33_b);
											//i 출력하고 형 변환 해준 값인 b 출력
		k33_i = 300;						//정수형 변수 i 300으로 재정의
		k33_b = (byte)k33_i;				//byte 변수 b를 i를 byte로 형 변환 해준 값으로 정의
		System.out.printf("[int -> byte] k33_i=%d -> k33_b=%d%n", k33_i, k33_b);
											//i 출력하고 형 변환 해준 값인 b 출력
		k33_b = 10;							//정수형 변수 i 10으로 재정의
		k33_i = (int)k33_b;					//byte 변수 b를 i를 byte로 형 변환 해준 값으로 정의
		System.out.printf("[byte -> int] k33_b=%d -> k33_i=%d%n", k33_b, k33_i);
											//i 출력하고 형 변환 해준 값인 b 출력
		k33_b = -2;							//정수형 변수 i -2으로 재정의
		k33_i = (int)k33_b;					//byte 변수 b를 i를 byte로 형 변환 해준 값으로 정의
		System.out.printf("[byte -> int] k33_b=%d -> k33_i=%d%n", k33_b, k33_i);
											//i 출력하고 형 변환 해준 값인 b 출력
		System.out.println("k33_i="+Integer.toBinaryString(k33_i));
	}										//i를 2진수로 환산하여 출력
}
