package hw0410_Sat_ch2;

public class k33_ch2_실습_00 {

	public static void main(String[] args) {
		
		String k33_s = "12345";		//문자열 s 12345로 정의 
		int k33_i = Integer.parseInt(k33_s);	//문자열 s를 정수형으로 변환하여 정수형 변수 i로 정의
		
		System.out.printf("문자를 숫자로 %d	   (%d)   \n", k33_i, k33_i+10);	//%d로 변환한 i 출력 
		
		String k33_a;	//문자열 a 정의 
		k33_a = String.format("%d", k33_i);		//정수로 변환한 i를 다시 문자열 a로 변환 
		
		System.out.printf("숫자를 문자로 %s   (%s)   \n", k33_a, k33_a+"abcde");	//%s로 문자열로 변환한 a 출력 
	}

}
