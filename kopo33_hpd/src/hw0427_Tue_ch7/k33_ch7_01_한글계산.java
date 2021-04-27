package hw0427_Tue_ch7;

public class k33_ch7_01_�ѱ۰�� {

	public static void main(String[] args) {	//��2
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ�abcd", 15));
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ��ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ�aa", 15));
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ��ѱ�aa", 15));
		System.out.printf("�ѱ��� [%d]��\n", k33_HanCount("�ѱ��ѱ�aa"));
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
