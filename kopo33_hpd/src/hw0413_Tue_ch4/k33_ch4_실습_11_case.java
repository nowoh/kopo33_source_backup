package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_11_case {
	/*
	 * case��
	 */
	public static void main(String[] args) {
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//�ݺ��� : ������ ���� i�� 1, i�� 13������ 1�� �����ϸ� �ݺ�
			System.out.printf(" %d�� =>", k33_i);	//i�� ��=> ���� ���
			LOOP:for (int k33_j = 1; k33_j < 32; k33_j++) {	//�ݺ��� : ������ ���� j�� 1, j�� 32������ 1�� �����ϸ� �ݺ�
				System.out.printf("%d,", k33_j);	//j ���
				
				switch (k33_i) {	//switch ���ǹ� : i�̸�
					case 4:case 6:case 9:case 11:	//i�� 4,6,9,11�̸� 
						if (k33_j == 30) break LOOP;	//���ǹ� : j�� 30�̸� break �ϰ� �ٽ� LOOP�� ���ư��� ��
						break;
					case 2:		//i�� 2�̸�
						if (k33_j == 28) break LOOP;	//���ǹ� : j�� 28�̸� break �ϰ� �ٽ� LOOP�� ���ư��� ��
						break;
				}
			}
			System.out.printf("\n");			//�� �ٲٱ�
		}
	}
}
