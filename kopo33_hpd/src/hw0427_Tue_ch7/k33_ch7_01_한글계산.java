package hw0427_Tue_ch7;

public class k33_ch7_01_한글계산 {

	public static void main(String[] args) {	//메인 함수
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("한글abcd", 15));		//k33_HanBlankForeword메소드 불러와서 리턴값 출력
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("한글한글aa", 15));	//k33_HanBlankForeword메소드 불러와서 리턴값 출력
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("한글aa", 15));		//k33_HanBlankBackword메소드 불러와서 리턴값 출력
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("한글한글aa", 15));	//k33_HanBlankBackword메소드 불러와서 리턴값 출력
		System.out.printf("한글은 [%d]개\n", k33_HanCount("한글한글aa"));						//k33_HanCount 메소드 불러와서 리턴값 출력
	}
	
	public static String k33_HanBlankForeword(String k33_aa, int k33_b) {	
												//문자열로 리턴값을 주고 문자열과 정수형 변수를 인자로 받는 메소드 정의
												//b는 맞추려고 하는 바이트 수
		byte[] k33_bb = k33_aa.getBytes();		//문자열 aa 바이트 수 가져오기
		int k33_bleng = k33_bb.length;			//aa의 바이트 수를 정수형 변수 bleng으로 정의
		String k33_ret_str = "";				//문자열 ret_str null로 정의
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {	//반복문 : 정수형 변수 i는 0이고 i는 b-bleng전까지 1씩 증가하며 반복
																	//문자열 bleng만큼 바이트 수를 채우기 위해 그 차이만큼 반복하기
			k33_ret_str = k33_ret_str + " ";						//ret_str에 " " 덧붙인 것으로 ret_str 재정의
		}
		k33_ret_str = k33_ret_str + k33_aa;							//" "추가된 ret_str에 aa 덧붙인 것으로 ret_str 재정의
		
		return k33_ret_str;											//재정의된 ret_str 리턴
	}
	public static String k33_HanBlankBackword(String k33_aa, int k33_b) {
												//문자열로 리턴값을 주고 문자열과 정수형 변수를 인자로 받는 메소드 정의
												//b는 맞추려고 하는 바이트 수
		byte[] k33_bb = k33_aa.getBytes();		//문자열 aa 바이트 수 가져오기
		int k33_bleng = k33_bb.length;			//aa의 바이트 수를 정수형 변수 bleng으로 정의
		String k33_ret_str = "";				//문자열 ret_str null로 정의
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {	//반복문 : 정수형 변수 i는 0이고 i는 b-bleng전까지 1씩 증가하며 반복
																	//문자열 bleng만큼 바이트 수를 채우기 위해 그 차이만큼 반복하기
			k33_ret_str = k33_ret_str + " ";						//ret_str에 " " 덧붙인 것으로 ret_str 재정의
		}
		k33_ret_str = k33_aa + k33_ret_str;							//aa에 " "추가된 ret_str을 덧붙인 것으로 ret_str 재정의
		
		return k33_ret_str;											//재정의된 ret_str 리턴
	}

	public static int k33_HanCount(String k33_aa) {					//정수형으로 리턴값을 주고 문자열을 인자로 받는 메소드 정의
		int k33_count = 0;											//정수형 변수 count를 0으로 정의
		for (int k33_i = 0; k33_i < k33_aa.length(); k33_i++) {		//반복문 : 정수형 변수 i는 0이고, i는 aa길이전까지 1씩 증가하며 반복
			if (Character.getType(k33_aa.charAt(k33_i)) == Character.OTHER_LETTER) {	//aa의 i번째 문자어가 한글이면 (한글, 기호 등등)
				k33_count++;															//count +1
			}
		}
		return k33_count;																//count 리턴
	}
}
