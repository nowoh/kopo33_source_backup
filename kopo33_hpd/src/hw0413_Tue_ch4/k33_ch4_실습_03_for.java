package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_03_for {
	/*
	 * for��
	 */
	public static void main(String[] args) {
		//�⺻ for��
		int k33_sum = 0;		//������ ���� sum�� 0���� ����
		for (int k33_i = 0; k33_i <10; k33_i++) {	//������ ���� i�� �����ϰ� 0���� ����, i�� 10�̸����� �ݺ�, i�� 1�� ����
			k33_sum = k33_sum + k33_i;		//sum�� sum+i�� �ݺ� �ø��� ������
		}
		System.out.printf("k33_sum %d\n", k33_sum);	//������ sum ����ϰ� �� �ٲٱ�
		
		//���� for��
		for (int k33_i = 1; k33_i < 10; k33_i++) {	//������ ���� i�� �����ϰ� 1���� ����, i�� 10�̸����� �ݺ�, i�� 1�� ����
			System.out.printf("***************\n", k33_i);	//* ����ϰ� �� �ٲٱ�
			System.out.printf("   ������ %d ��\n", k33_i);		// ������ i �� ����� �� �ٲٱ�
			System.out.printf("***************\n", k33_i);	//* ����ϰ� �� �ٲٱ�
			for (int k33_j = 1; k33_j <10; k33_j++) {		//������ ���� j�� �����ϰ� 1���� ����, j�� 10�̸����� �ݺ�, j�� 1�� ����
				System.out.printf("  %d  *  %d = %d \n", k33_i, k33_j, k33_i*k33_j);
														//i * j = i*j(���� �� ��� ��) ���
			}
		}
	}
}
