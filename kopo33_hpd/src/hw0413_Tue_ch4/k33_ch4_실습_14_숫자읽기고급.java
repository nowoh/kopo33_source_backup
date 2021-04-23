package hw0413_Tue_ch4;

public class k33_ch4_실습_14_숫자읽기고급 {
	/*
	 * 숫자읽기고급
	 */
	public static void main(String[] args) {
		int k33_iNumVal = 1001034567;	//정수형 변수 iNumVal를 1001034567로 정의
		String k33_sNumVal = String.valueOf(k33_iNumVal);	
				//문자열 변수 sNumVal를 iNumVal을 문자열로 변환한 값으로 정의
		String k33_sNumVoice = "";	//문자열 sNumVoice를 ""로 정의 (null)
		System.out.printf("==> %s [%d자리]\n", k33_sNumVal, k33_sNumVal.length());
							//==> sNumVal [sNumVal문자열길이+자리] 출력하고 행 바꾸기
		int k33_i, k33_j;	//정수형 변수 i, j 선언
		
		String[] k33_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
				//문자열 배열 units을 {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"}로 초기화
		String[] k33_unitx = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};
				//문자열 배열 unitx을 {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"}로 초기화
		k33_i = 0;	//i를 0으로 정의
		k33_j = k33_sNumVal.length()-1;	//j를 문자열 sNumVal의 길이-1로 정의
		
		while (true) {	//반복문 : 무한 loop
			if (k33_i >= k33_sNumVal.length()) break;	//조건문 : i가 sNumVal길이 이상이면 break
			System.out.printf("%s[%s]",			
					k33_sNumVal.substring(k33_i, k33_i+1),
					k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i+1))]);
			//sNumVal의 i번째자리와 배열 units에서 sNumVal의 i번째자리를 정수형으로 변환한 값 자리를 같이 출력
			if (k33_sNumVal.substring(k33_i, k33_i+1).equals("0")) {	//조건문 : sNumVal의 i번째자리가 0이면
				if (k33_unitx[k33_j].equals("만") || k33_unitx[k33_j].equals("억")) {
					k33_sNumVoice = k33_sNumVoice + "" + k33_unitx[k33_j];
					//조건문 : 배열 unitx의 j번째 요소가 "만"이거나 "억"이면
					//sNumVoice를 sNumVoice + unitx 배열의 j번째 요소로 정의
				} else {
					//아무 지시 없음
				}
			} else {	//그렇지 않으면 (sNumVal의 i번째자리가 0이 아니면)
				k33_sNumVoice = k33_sNumVoice 
						+ k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i+1))] 
						+ k33_unitx[k33_j];
				//sNumVoice는 sNumVoice + units 배열의 sNumVal의 i번째 자리를 정수형으로 변환한 값 자리
				//+ unitx 배열의 j번째 요소로 정의
			}
			k33_i++; k33_j--;	//i 1 증가, j 1 감소
		}
		System.out.printf("\n %s[%s]\n", k33_sNumVal, k33_sNumVoice);	//sNumVal와 sNumVoice 출력
	}
}
