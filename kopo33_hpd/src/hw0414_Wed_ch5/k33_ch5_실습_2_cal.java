package hw0414_Wed_ch5;

import java.util.Calendar;

public class k33_ch5_�ǽ�_2_cal {
	/*
	 * �޷� �μ�(����ü ��Ʈ)
	 */
	public static void main(String[] args) {	//�����Լ� 
		int k33_iWeekday = 5;					//������ ���� iWeekday 5�� ����
												//iWeekday�� ������ ����, ������ 0���� ����, 5�� �ݿ���
		int[] k33_iEnd = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
												//������ �迭 iEnd {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}�� ����
												//iEnd�� �� ���� ������ �� �� (2���� ���޷� ó��)
		for (int k33_iMon = 0; k33_iMon < 12; k33_iMon++) {		//�ݺ��� : ������ ���� iMon(���� ����)�� 0�̰�, 12������ 1�� �����ϸ鼭 �ݺ�
			System.out.printf("\n\n%10d��\n", k33_iMon+1);	//iMon�� 0�� �� 1���̹Ƿ� ���� ����� �� iMon+1����
			System.out.printf("======================\n");			//====================== ����ϰ� �� �ٲٱ�
			System.out.printf("%2s%2s%2s%2s%2s%2s%2s\n", "��","��","ȭ","��","��","��","��");	//���ڿ� 3�ڸ� Ȯ���ϰ� �� ���� ���
			for (int k33_j = 1; k33_j <= k33_iWeekday; k33_j++) {	//�ݺ��� :         ������ ���� j�� 1�̰�, j�� iWeekday���� 1�� �����ϸ鼭 �ݺ�
				System.out.printf("%3s", " ");						//���ڿ� 3�ڸ� Ȯ���ϰ� " "���, iWeekday���� �ݺ��ؼ� ����ؾ�
																	//�� ���� ù ���ڰ� iWeekday�� �´� ���Ͽ������� ������
			}
			for (int k33_i = 1; k33_i <= k33_iEnd[k33_iMon]; k33_i++) {		
													//�ݺ��� : ������ ���� i�� 1�̰�, i�� �迭 iEnd�� iMon��° ��� ������ 1�� �����ϸ鼭 �ݺ�
				System.out.printf("%3d", k33_i);	//i (����) 3�ڸ� Ȯ���Ͽ� ���
				k33_iWeekday++;						//iWeekday +1
				if (k33_iWeekday % 7 == 0) {		//=> �������� ä������ ���� �ַ� �Ѿ
					System.out.println();			//�� �ٲٱ� (���� �ַ� �Ѿ��)
				}
			}
			k33_iWeekday %= 7; 						// ������ iWeekday�� 7�� ���� �������� ���� ���� ���� iWeekday�� �ǵ��� ������
		}	
	}
}
