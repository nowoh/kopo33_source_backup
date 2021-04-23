package hw0410_Sat_ch2;

public class k33_ch2_실습_06 {
	/*
	 * PrintEx1
	 */
	public static void main(String[] args) {
		byte k33_b = 1;							//byte 변수 b를 1로 정의
		short k33_s = 2;						//short 변수 s를 2로 정의
		char k33_c = 'A';						//문자어 변수 c를 A로 정의
		
		int k33_finger = 10;					//integer 변수 finger를 10으로 정의
		long k33_big = 100000000000L;			//long 변수 big을 100000000000L로 정의
		long k33_hex = 0xFFFFFFFFFFFFFFFFL;		//long 변수 hex를 0xFFFFFFFFFFFFFFFFL로 정의
		
		int k33_octNum = 010;					//integer 변수 octNum을 8진법 010로 정의 (접두사 0, 10진수로는 8)
		int k33_hexNum = 0x10;					//integer 변수 hexNum을 16진법 0x10로 정의 (접두사 0x, 10진수로는 16)
		int k33_binNum = 0b10;					//integer 변수 binNum을 2진법 0b10로 정의 (접두사 0b, 10진수로는 2)
		
		System.out.printf("k33_b=%d%n", k33_b);						//byte b 출력 
		System.out.printf("k33_s=%d%n", k33_s);						//short s 출력
		System.out.printf("k33_c=%c, %d %n", k33_c, (int)k33_c);	//문자어 c와 문자어c를 integer로 형 변환 한 것 출력
		System.out.printf("k33_finger=[%5d]%n", k33_finger);		//integer finger 5자리 차지하고 우측 정렬하여 출력
		System.out.printf("k33_finger=[%-5d]%n", k33_finger);		//integer finger 5자리 차지하고 좌측 정렬하여 출력		
		System.out.printf("k33_finger=[%05d]%n", k33_finger);		//integer finger 5자리 차지하고 우측 정렬하여 출력
																	//빈공간 0 채워서 출력
		System.out.printf("k33_big=%d%n", k33_big);					//long big 출력
		System.out.printf("k33_hex=%#x%n", k33_hex);				//long hex 출력 (16진수)
																	//#은 접두사 (16진수 0x, 8진수 0, 2진수 0b)
																	//접두사로 몇 진수인지 파악 가능
		System.out.printf("k33_octNum=%o, %d%n", k33_octNum, k33_octNum); 	//integer octNum 출력하고 10진수로도 출력 
		System.out.printf("k33_hexNum=%x, %d%n", k33_hexNum, k33_hexNum); 	//integer hexNum 출력하고 10진수로도 출력
		System.out.printf("k33_binNum=%s, %d%n", Integer.toBinaryString(k33_binNum), k33_binNum);
	}																	 	//integer binNum 출력하고 10진수로도 출력
}																//Integer.toBinaryString은 10진수를 2진법으로 환산해줌
