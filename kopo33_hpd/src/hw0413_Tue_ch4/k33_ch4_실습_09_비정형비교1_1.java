package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_09_��������1_1 {
	/*
	 * ��������1
	 */
	public static void main(String[] args) {
		for (int k33_i = 1; k33_i < 13; k33_i++) {	//�ݺ��� : ������ ���� i�� 1, i�� 13 ������ 1�� �����ϸ� �ݺ�
			System.out.printf(" %d�� =>", k33_i);	//i�� ��=> ���
			for (int k33_j = 1; k33_j < 32; k33_j++) {	
												//�ݺ��� : ������ ���� j�� 1, j�� 32 ������ 1�� �����ϸ� �ݺ�
				System.out.printf("%d,", k33_j);	//j ���
				
				if(k33_i == 1  && k33_j == 31) break;	//i�� 1�̰� j�� 31�̸� break;
				if(k33_i == 2  && k33_j == 28) break;	//i�� 2�̰� j�� 28�̸� break;
				if(k33_i == 3  && k33_j == 31) break;	//i�� 3�̰� j�� 31�̸� break;
				if(k33_i == 4  && k33_j == 30) break;	//i�� 4�̰� j�� 30�̸� break;
				if(k33_i == 5  && k33_j == 31) break;	//i�� 5�̰� j�� 31�̸� break;
				if(k33_i == 6  && k33_j == 30) break;	//i�� 6�̰� j�� 30�̸� break;
				if(k33_i == 7  && k33_j == 31) break;	//i�� 7�̰� j�� 31�̸� break;
				if(k33_i == 8  && k33_j == 31) break;	//i�� 8�̰� j�� 31�̸� break;
				if(k33_i == 9  && k33_j == 30) break;	//i�� 9�̰� j�� 30�̸� break;
				if(k33_i == 10 && k33_j == 31) break;	//i�� 10�̰� j�� 31�̸� break;
				if(k33_i == 11 && k33_j == 30) break;	//i�� 11�̰� j�� 30�̸� break;
				if(k33_i == 12 && k33_j == 31) break;	//i�� 12�̰� j�� 31�̸� break;
				
			}
			System.out.printf("\n");	//�� �ٲٱ�
		}
	}
}
