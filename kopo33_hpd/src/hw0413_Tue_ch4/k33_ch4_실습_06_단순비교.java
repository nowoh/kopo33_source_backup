package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_06_�ܼ��� {
	/*
	 * �ܼ���
	 */
	public static void main(String[] args) {
		int k33_iA, k33_iB;		//������ ���� iA�� iB ����
		
		k33_iA = 0;				//iA�� 0���� ����
		while (true) {			//while ���ǹ� true�� ���� loop
			k33_iB = 0;			//iB�� 0���� ����
			while (true) {		//while ���ǹ� true�� ���� loop
				System.out.printf("*");		//���ǹ� �Ѿư� ������ *���
				if (k33_iA == k33_iB) break;	//iA�� iB�� ������ break
				k33_iB++;		//*����ϰ� iB�� +1 ����
			}
			System.out.printf("\n");	//�� �ٲٱ�
			k33_iA++;					//�� �ٲٰ� iA�� +1 ����
			if (k33_iA == 30) break;	//iA�� 30�� �Ǹ� break
		}
	}
}
