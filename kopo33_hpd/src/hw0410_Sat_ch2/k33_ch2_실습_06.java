package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_06 {
	/*
	 * PrintEx1
	 */
	public static void main(String[] args) {
		byte k33_b = 1;							//byte ���� b�� 1�� ����
		short k33_s = 2;						//short ���� s�� 2�� ����
		char k33_c = 'A';						//���ھ� ���� c�� A�� ����
		
		int k33_finger = 10;					//integer ���� finger�� 10���� ����
		long k33_big = 100000000000L;			//long ���� big�� 100000000000L�� ����
		long k33_hex = 0xFFFFFFFFFFFFFFFFL;		//long ���� hex�� 0xFFFFFFFFFFFFFFFFL�� ����
		
		int k33_octNum = 010;					//integer ���� octNum�� 8���� 010�� ���� (���λ� 0, 10�����δ� 8)
		int k33_hexNum = 0x10;					//integer ���� hexNum�� 16���� 0x10�� ���� (���λ� 0x, 10�����δ� 16)
		int k33_binNum = 0b10;					//integer ���� binNum�� 2���� 0b10�� ���� (���λ� 0b, 10�����δ� 2)
		
		System.out.printf("k33_b=%d%n", k33_b);						//byte b ��� 
		System.out.printf("k33_s=%d%n", k33_s);						//short s ���
		System.out.printf("k33_c=%c, %d %n", k33_c, (int)k33_c);	//���ھ� c�� ���ھ�c�� integer�� �� ��ȯ �� �� ���
		System.out.printf("k33_finger=[%5d]%n", k33_finger);		//integer finger 5�ڸ� �����ϰ� ���� �����Ͽ� ���
		System.out.printf("k33_finger=[%-5d]%n", k33_finger);		//integer finger 5�ڸ� �����ϰ� ���� �����Ͽ� ���		
		System.out.printf("k33_finger=[%05d]%n", k33_finger);		//integer finger 5�ڸ� �����ϰ� ���� �����Ͽ� ���
																	//����� 0 ä���� ���
		System.out.printf("k33_big=%d%n", k33_big);					//long big ���
		System.out.printf("k33_hex=%#x%n", k33_hex);				//long hex ��� (16����)
																	//#�� ���λ� (16���� 0x, 8���� 0, 2���� 0b)
																	//���λ�� �� �������� �ľ� ����
		System.out.printf("k33_octNum=%o, %d%n", k33_octNum, k33_octNum); 	//integer octNum ����ϰ� 10�����ε� ��� 
		System.out.printf("k33_hexNum=%x, %d%n", k33_hexNum, k33_hexNum); 	//integer hexNum ����ϰ� 10�����ε� ���
		System.out.printf("k33_binNum=%s, %d%n", Integer.toBinaryString(k33_binNum), k33_binNum);
	}																	 	//integer binNum ����ϰ� 10�����ε� ���
}																//Integer.toBinaryString�� 10������ 2�������� ȯ������
