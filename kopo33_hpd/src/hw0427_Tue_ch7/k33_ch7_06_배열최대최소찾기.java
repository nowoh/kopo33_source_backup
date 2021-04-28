package hw0427_Tue_ch7;

public class k33_ch7_06_배열최대최소찾기 {

	public static void main(String[] args) {							//메인함수
		int[] k33_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9 ,12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
																		//정수형 배열 iArray 정의
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//반복문 : 정수형 변수 i는 0이고, i는 iArray길이전까지 1씩 증가하며 반복
			System.out.printf("iArray[%d]=%d\n", k33_i, k33_iArray[k33_i]);
		}																//iArray 번호와 해당 배열 요소 출력
		/*
		 * MAX 찾기
		 */
		int k33_iMax = k33_iArray[0];									//iMax를 iArray[0]으로 정의
		int k33_iMaxPt = 0;												//iMaxPt를 0으로 정의
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//반복문 정수형 변수 i는 0이고, i는 iArray길이전까지 1씩 증가하며 반복
			if (k33_iMax < k33_iArray[k33_i]) {							//조건문 : iMax가 iArray[i]보다 작으면
				k33_iMax = k33_iArray[k33_i];							//iMax를 iArray[i]로 재정의
				k33_iMaxPt = k33_i;										//그 때의 i를 iMaxPt로 재정의
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMaxPt, k33_iMax);	//iMaxPt와 iMax 출력
		
		/*
		 * MIN 찾기
		 */
		int k33_iMin = k33_iArray[0];									//iMin을 iArray[0]으로 정의
		int k33_iMinPt = 0;												//iMinPt를 0으로 정의
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//반복문 정수형 변수 i는 0이고, i는 iArray길이전까지 1씩 증가하며 반복
			if (k33_iMin > k33_iArray[k33_i]) {							//조건문 : iMin이 iArray[i]보다 크면
				k33_iMin = k33_iArray[k33_i];							//iMin을 iArray[i]로 재정의
				k33_iMinPt = k33_i;										//그 때의 i를 iMinPt로 재정의
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMinPt, k33_iMin);	//iMinPt와 iMin 출력
	}
}
