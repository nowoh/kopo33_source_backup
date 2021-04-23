package hw0410_Sat_ch2;

public class k33_ch2_실습_07 {
	/*
	 * PrintEx2
	 */
	public static void main(String[] args) {
		String k33_url = "www.codechobo.com";	//문자열 url 정의
				
		float k33_f1 = .10f;					//실수형 변수 f1 정의
		float k33_f2 = 1e1f;					//실수형 변수 f2 정의
		float k33_f3 = 3.14e3f;					//실수형 변수 f3 정의
		double k33_d = 1.23456789;				//실수형 변수 d 정의
		
		System.out.printf("k33_f1=%f, %e, %g%n", k33_f1, k33_f1, k33_f1);	
							//f1를 float형태와 지수형태, 마짐가은 간략하게 표시하여 출력 
		System.out.printf("k33_f2=%f, %e, %g%n", k33_f2, k33_f2, k33_f2);
							//f2를 float형태와 지수형태, 마짐가은 간략하게 표시하여 출력 
		System.out.printf("k33_f3=%f, %e, %g%n", k33_f3, k33_f3, k33_f3);
							//f3를 float형태와 지수형태, 마짐가은 간략하게 표시하여 출력 
		
		System.out.printf("k33_d=%f%n", k33_d);			//double형 변수 d를 float형으로 출력
		System.out.printf("k33_d=%14.10f%n", k33_d);	//변수 d를 14자리 확보하고 소수점 10자리까지만 출력
		
		System.out.printf("[12345678901234567890]%n");	//문자열 출력하고 행 바꾸기
		System.out.printf("[%s]%n", k33_url);			//url 출력
		System.out.printf("[%20s]%n", k33_url);			//url 20자리 확보하고 우측정렬하여 출력		
		System.out.printf("[%-20s]%n", k33_url);		//url 20자리 확보하고 좌측정렬하여 출력
		System.out.printf("[%.8s]%n", k33_url);			//url 8자리까지만 출력하고 나머지 버림
	}
}
