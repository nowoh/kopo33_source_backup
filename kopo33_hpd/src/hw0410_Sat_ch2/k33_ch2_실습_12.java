package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_12 {
	/*
	 * class VarEx2
	 */
	public static void main(String[] args) {
		int k33_i = 91234567;			//������ ���� i ����
		float k33_f = (float)k33_i;		//�Ǽ��� ���� f�� ���� i�� float�� �� ��ȯ�� ������ ����
		int k33_i2 = (int)k33_f;		//������ ���� i2�� ���� f�� integer�� �� ��ȯ�� ������ ����
		
		double k33_d = (double)k33_i;	//�Ǽ��� ���� d�� ���� i�� double������ �� ��ȯ�� ������ ����
		int k33_i3 = (int)k33_d;		//������ ���� i3�� ���� d�� integer�� �� ��ȯ�� ������ ����
		
		float k33_f2 = 1.666f;			//�Ǽ��� ���� f2�� 1.666f�� ����
		int k33_i4 = (int)k33_f2;		//������ ���� i4�� ���� f2�� integer�� �� ��ȯ�� ������ ����
		
		System.out.printf("k33_i=%d\n", k33_i);		//i���
		System.out.printf("k33_f=%f k33_i2=%d\n", k33_f, k33_i2);	//f�� i2 ���
		System.out.printf("k33_d=%f k33_i3=%d\n", k33_d, k33_i3);	//d�� i3 ���
		System.out.printf("(int)%f=%d\n", k33_f2, k33_i4);			//f2�� i4 ���
	}
}
