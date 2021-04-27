package hw0427_Tue_ch7;

public class k33_ch7_01_한글계산 {

	public static void main(String[] args) {	//별2
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("한글abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("한글한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("한글aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("한글한글aa", 15));
		System.out.printf("한글은 [%d]개\n", k33_HanCount("한글한글aa"));
	}
	
	public static String k33_HanBlankForeword(String k33_aa, int k33_b) {
		byte[] k33_bb = k33_aa.getBytes();
		int k33_bleng = k33_bb.length;
		String k33_ret_str = "";
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {
			k33_ret_str = k33_ret_str + " ";
		}
		k33_ret_str = k33_ret_str + k33_aa;
		
		return k33_ret_str;
	}
	
	public static String k33_HanBlankBackword(String k33_aa, int k33_b) {
		byte[] k33_bb = k33_aa.getBytes();
		int k33_bleng = k33_bb.length;
		String k33_ret_str = "";
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {
			k33_ret_str = k33_ret_str + " ";
		}
		k33_ret_str = k33_aa + k33_ret_str;
		
		return k33_ret_str;
	}

	public static int k33_HanCount(String k33_aa) {
		int k33_count = 0;
		for (int k33_i = 0; k33_i < k33_aa.length(); k33_i++) {
			if (Character.getType(k33_aa.charAt(k33_i)) == Character.OTHER_LETTER) {
				k33_count++;
			}
		}
		return k33_count;
	}
}
