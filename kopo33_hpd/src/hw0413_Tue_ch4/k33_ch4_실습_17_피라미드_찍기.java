package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_17_�Ƕ�̵�_��� {
	/*
	 * �Ƕ�̵�_���
	 */
	public static void main(String[] args) {
		int k33_n, k33_m; //������ ���� n�� m ����
		k33_m = 20; k33_n = 1;	//m�� 20, n�� 1�� ����
		while (true) {	//�ݺ��� : ���� loop
			for (int k33_i = 0; k33_i < k33_m; k33_i++) System.out.printf(" ");
								//�ݺ��� : ������ ���� i�� 0, i�� m������ 1�� �����ϸ� " "��� �ݺ�
			for (int k33_i = 0; k33_i < k33_n; k33_i++) System.out.printf("*");
								//�ݺ��� : ������ ���� i�� 0, i�� n������ 1�� �����ϸ� *��� �ݺ�
			System.out.printf("\n");	//�� �ٲٱ�
			
			k33_m = k33_m-1;	//m�� m-1 �� ������ ������
			k33_n = k33_n+2;	//n�� n+2 �� ������ ������
			
			if (k33_m < 0) break;	//���ǹ� : m�� 0 �̸��̸� break
		}	//�ݺ��� ����
	}
}
