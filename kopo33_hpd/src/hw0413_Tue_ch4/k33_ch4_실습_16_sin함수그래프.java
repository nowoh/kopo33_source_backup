package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_16_sin�Լ��׷��� {
	/*
	 * sin�Լ��׷���
	 */
	public static void main(String[] args) {
		double k33_fSin;	//�Ǽ��� ���� fSin ����
		for (int k33_i = 0; k33_i < 360; k33_i++) {	//�ݺ��� : ������ ���� i�� 0, i�� 360 ������ 1�� �����ϸ� �ݺ�
			k33_fSin = Math.sin(k33_i * 3.141592/180);	//fSin�� i*pi/180�� sin������ ����
														//i*pi/180 = i ������ ���� rad(����) ��
														//Math.sin�� ()�ȿ� ������ �ƴ� rad ������ ����
														//���� Math.sin ()�ȿ� i*pi/180 rad �� �־��ָ�
														//i ������ ���� sin ���� ���� �� ����
														//fSin�� �ּ� -1 �ִ� 1
			System.out.printf("%d sin ==>%f\n", k33_i, k33_fSin);	//i�� sin ==> fSin ���
		}
		for (int k33_i = 0; k33_i < 360; k33_i++) {	//�ݺ��� : ������ ���� i�� 0, i�� 360 ������ 1�� �����ϸ� �ݺ�
			k33_fSin = Math.sin(k33_i * 3.141592/180);	//fSin�� i*pi/180�� sin������ ����
														//i*pi/180 = i ������ ���� rad(����) ��
														//Math.sin�� ()�ȿ� ������ �ƴ� rad ������ ����
														//���� Math.sin ()�ȿ� i*pi/180 rad �� �־��ָ�
														//i ������ ���� sin ���� ���� �� ����
														//fSin�� �ּ� -1 �ִ� 1
			int k33_iSpace = (int)((1.0-k33_fSin) * 50);	
									//������ ���� iSpace�� (1.0-fSin)*50�� integer�� ��ȯ�� ���� ����
			for (int k33_j = 0; k33_j < k33_iSpace; k33_j++) System.out.printf(" ");
				//�ݺ��� : ������ ���� j�� 0, j�� iSpace������ 1�� �����ϸ� �ݺ��Ͽ� " "���
			System.out.printf("*[%f]{%d]\n", k33_fSin, k33_iSpace);	//fSin�� iSpace ���
		}
	}
}
