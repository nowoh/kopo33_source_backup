package hw0427_Tue_ch7;

public class k33_ch7_06_배열최대최소찾기 {		//별2

	public static void main(String[] args) {
		int[] k33_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9 ,12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
		
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {
			System.out.printf("iArray[%d]=%d\n", k33_i, k33_iArray[k33_i]);
		}
		
		/*
		 * MAX 찾기
		 */
		int k33_iMax = k33_iArray[0];
		int k33_iMaxPt = 0;
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {
			if (k33_iMax < k33_iArray[k33_i]) {
				k33_iMax = k33_iArray[k33_i];
				k33_iMaxPt = k33_i;
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMaxPt, k33_iMax);
		
		/*
		 * MIN 찾기
		 */
		int k33_iMin = k33_iArray[0];
		int k33_iMinPt = 0;
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {
			if (k33_iMin > k33_iArray[k33_i]) {
				k33_iMin = k33_iArray[k33_i];
				k33_iMinPt = k33_i;
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMinPt, k33_iMin);
	}

}
