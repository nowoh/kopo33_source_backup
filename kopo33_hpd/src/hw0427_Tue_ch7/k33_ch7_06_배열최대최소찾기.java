package hw0427_Tue_ch7;

public class k33_ch7_06_�迭�ִ��ּ�ã�� {

	public static void main(String[] args) {							//�����Լ�
		int[] k33_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9 ,12, 1, 212, 33, 11, 21, 11, 2121, 121, 11, 5, 6, 33};
																		//������ �迭 iArray ����
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//�ݺ��� : ������ ���� i�� 0�̰�, i�� iArray���������� 1�� �����ϸ� �ݺ�
			System.out.printf("iArray[%d]=%d\n", k33_i, k33_iArray[k33_i]);
		}																//iArray ��ȣ�� �ش� �迭 ��� ���
		/*
		 * MAX ã��
		 */
		int k33_iMax = k33_iArray[0];									//iMax�� iArray[0]���� ����
		int k33_iMaxPt = 0;												//iMaxPt�� 0���� ����
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//�ݺ��� ������ ���� i�� 0�̰�, i�� iArray���������� 1�� �����ϸ� �ݺ�
			if (k33_iMax < k33_iArray[k33_i]) {							//���ǹ� : iMax�� iArray[i]���� ������
				k33_iMax = k33_iArray[k33_i];							//iMax�� iArray[i]�� ������
				k33_iMaxPt = k33_i;										//�� ���� i�� iMaxPt�� ������
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMaxPt, k33_iMax);	//iMaxPt�� iMax ���
		
		/*
		 * MIN ã��
		 */
		int k33_iMin = k33_iArray[0];									//iMin�� iArray[0]���� ����
		int k33_iMinPt = 0;												//iMinPt�� 0���� ����
		for (int k33_i = 0; k33_i < k33_iArray.length; k33_i++) {		//�ݺ��� ������ ���� i�� 0�̰�, i�� iArray���������� 1�� �����ϸ� �ݺ�
			if (k33_iMin > k33_iArray[k33_i]) {							//���ǹ� : iMin�� iArray[i]���� ũ��
				k33_iMin = k33_iArray[k33_i];							//iMin�� iArray[i]�� ������
				k33_iMinPt = k33_i;										//�� ���� i�� iMinPt�� ������
			}
		}
		System.out.printf("MAX : iArray[%d]=%d\n", k33_iMinPt, k33_iMin);	//iMinPt�� iMin ���
	}
}
