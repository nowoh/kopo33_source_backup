package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_12_Array�� {
	/*
	 * Array��
	 */
	public static void main(String[] args) {
		int[] k33_iLMD = {31,28,31,30,31,30,31,31,30,31,30,31};
								//������ �迭 iLMD�� {31,28,31,30,31,30,31,31,30,31,30,31}�� �ʱ�ȭ
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//�ݺ��� : ������ ���� i�� 1, i�� 13������ 1�� �����ϸ� �ݺ�
			System.out.printf(" %d�� =>", k33_i);	//i�� ��=> ���� ���
			for (int k33_j = 1; k33_j < 32; k33_j++) {	//�ݺ��� : ������ ���� j�� 1, j�� 32������ 1�� �����ϸ� �ݺ�
				System.out.printf("%d", k33_j);		//j ���
				if (k33_iLMD[k33_i-1] == k33_j) break;	//���ǹ� : iLMD�迭�� [i-1]�� j�� ���ٸ� break 
				System.out.printf(",");		//�޸�(,)���
			}
			System.out.printf("\n");		//�� �ٲٱ�
		}
	}
}
