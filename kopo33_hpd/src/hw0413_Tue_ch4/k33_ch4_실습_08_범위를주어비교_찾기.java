package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_08_�������־��_ã�� {
	/*
	 * �������־��_ã��
	 */
	public static void main(String[] args) {
		int k33_iVal;		//������ ���� iVal ����
		for (int k33_i = 0; k33_i < 300; k33_i++) {	//�ݺ��� : ������ ���� i��0���� ����, i�� 300������ 1�� �����ϸ� �ݺ�
			k33_iVal = 5 * k33_i;					//iVal�� 5�� ����� ���� (�ᱹ �ݺ����� 5�� ����� 1495���� �ݺ���) 
			if (k33_iVal >= 0 && k33_iVal < 10) System.out.printf("�� %d\n", k33_iVal);
													//iVal�� 0 �̻� 10 �̸��̸� �ϰ� iVal ���� ���
			else if (k33_iVal >= 10 && k33_iVal < 100) System.out.printf("�� %d\n", k33_iVal);
													//iVal�� 10 �̻� 100 �̸��̸� �ʰ� iVal ���� ���
			else if (k33_iVal >= 100 && k33_iVal < 1000) System.out.printf("�� %d\n", k33_iVal);
													//iVal�� 100 �̻� 1000 �̸��̸� ��� iVal ���� ���
			else System.out.printf("õ %d\n", k33_iVal);
													//�׷��� ������ (iVal�� 1000 �̻��̸�) õ�� iVal ���� ���
		}
	}
}
