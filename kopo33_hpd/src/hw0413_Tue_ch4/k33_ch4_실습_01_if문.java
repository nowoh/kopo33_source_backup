package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_01_if�� {
	/*
	 * if��
	 */
	public static void main(String[] args) {	//�����Լ�
		int k33_score = 70;			//������ ���� score�� 70���� ����
		
		if(k33_score > 60) {		//���ǹ� : score�� 60 �ʰ���
			System.out.println("�հ��Դϴ�.");	//�հ��Դϴ�. ���
		}
		
		if(k33_score > 60)			//���ǹ� : score�� 60 �ʰ���
			System.out.println("�հ��Դϴ�.");	//�հ��Դϴ�. ���
											//���� ���ǹ��� �� {} ���� ����
		if(k33_score > 60) {		//���ǹ� : score�� 60 �ʰ���
			System.out.println("�հ��Դϴ�.");	//�հ��Դϴ�. ���
		} else {					//�׷��� ������ (score�� 60�ʰ����� ������)
			System.out.println("���հ��Դϴ�.");	//���հ��Դϴ�. ���
		}
		
		int k33_num = 5;	//������ ���� num�� 5�� ����
		
		if (k33_num > 0) {	//���ǹ� : num�� 0 �ʰ���
			System.out.println("����Դϴ�.");	//����Դϴ�. ���
		} else if (k33_num < 0) {	//���ǹ� : num�� 0 �̸��� ��
			System.out.println("�����Դϴ�."); //�����Դϴ�. ���	
		} else {			//�׷��� ������ (num�� 0 �ʰ��� �ƴϰų� 0 �̸��� �ƴϸ�)
			System.out.println("���Դϴ�.");	//���Դϴ�. ���
		}
		
		if(k33_score >= 90) {	//���ǹ� : score�� 90 �̻��� ��
			System.out.println("A���");	//A��� ���
		} else if (k33_score >= 80 && k33_score < 90) {	//���ǹ� : score�� 80 �̻��̰� 80 �̸��� ��
			System.out.println("B���");	//B��� ���
		} else if (k33_score >=70 && k33_score < 80) {	//���ǹ� : score�� 70 �̻��̰� 80 �̸��� ��
			System.out.println("C���");	//C��� ���
		} else {		//�׷��� ������ (score�� 70�̸��� ��)
			System.out.println("F���");	//F��� ���
		}	
	}

}
