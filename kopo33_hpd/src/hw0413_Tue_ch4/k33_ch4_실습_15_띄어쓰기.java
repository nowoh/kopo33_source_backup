package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_15_���� {
	/*
	 * ����
	 */
	public static void main(String[] args) {
		for (int k33_i = 0; k33_i < 10; k33_i++) {	//�ݺ��� : ������ ���� i�� 0, i�� 10 ������ 1�� �����ϸ� �ݺ�
			for (int k33_j = 0; k33_j < k33_i; k33_j++) System.out.printf(" ");	
						//�ݺ��� : ������ ���� j�� 0, j�� i������ 1�� �����ϸ� �ݺ��Ͽ� " "���
			System.out.printf("%d\n", k33_i);	//i����ϰ� �� �ٲٱ�
		}
	}
}
