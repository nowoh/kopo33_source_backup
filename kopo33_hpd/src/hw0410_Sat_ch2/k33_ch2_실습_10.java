package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_10 {
	/*
	 * CastingEx2
	 */
	public static void main(String[] args) {
		int k33_i = 10;						//������ ���� i 10���� ����
		byte k33_b = (byte)k33_i;			//byte ���� b�� i�� byte�� �� ��ȯ ���� ������ ����
		System.out.printf("[int -> byte] k33_i=%d -> k33_b=%d%n", k33_i, k33_b);
											//i ����ϰ� �� ��ȯ ���� ���� b ���
		k33_i = 300;						//������ ���� i 300���� ������
		k33_b = (byte)k33_i;				//byte ���� b�� i�� byte�� �� ��ȯ ���� ������ ����
		System.out.printf("[int -> byte] k33_i=%d -> k33_b=%d%n", k33_i, k33_b);
											//i ����ϰ� �� ��ȯ ���� ���� b ���
		k33_b = 10;							//������ ���� i 10���� ������
		k33_i = (int)k33_b;					//byte ���� b�� i�� byte�� �� ��ȯ ���� ������ ����
		System.out.printf("[byte -> int] k33_b=%d -> k33_i=%d%n", k33_b, k33_i);
											//i ����ϰ� �� ��ȯ ���� ���� b ���
		k33_b = -2;							//������ ���� i -2���� ������
		k33_i = (int)k33_b;					//byte ���� b�� i�� byte�� �� ��ȯ ���� ������ ����
		System.out.printf("[byte -> int] k33_b=%d -> k33_i=%d%n", k33_b, k33_i);
											//i ����ϰ� �� ��ȯ ���� ���� b ���
		System.out.println("k33_i="+Integer.toBinaryString(k33_i));
	}										//i�� 2������ ȯ���Ͽ� ���
}
