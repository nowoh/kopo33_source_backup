package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_11 {
	/*
	 * CastingEx3
	 */
	public static void main(String[] args) {
		float k33_f = 9.1234567f;			//�Ǽ��� ���� f ����
		double k33_d = 9.1234567;			//�Ǽ��� ���� d ����
		double k33_d2 = (double)k33_f;		//�Ǽ��� ���� d2�� ���� f�� double������ �� ��ȯ ���� ������ ����
		
		System.out.printf("k33_f =%20.18f\n", k33_f);	//f�� ����ϴµ� 20�ڸ� Ȯ���ϰ� �Ҽ��� 18��°�ڸ����� ���
		System.out.printf("k33_d =%20.18f\n", k33_d);	//d�� ����ϴµ� 20�ڸ� Ȯ���ϰ� �Ҽ��� 18��°�ڸ����� ���
		System.out.printf("k33_d2=%20.18f\n", k33_d2);	//d2�� ����ϴµ� 20�ڸ� Ȯ���ϰ� �Ҽ��� 18��°�ڸ����� ���
	}
}
