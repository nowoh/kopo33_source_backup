package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_05 { //Ŭ���� ����
	//
	//#5. �Ҽ��� �ڸ��� �ݿø�, ���� ó��
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		int k33_MyVal = 14/5;		//������(������) ���� MyVal ���� �� 14/5�� �ʱ�ȭ
		System.out.printf("#5-1 : %d\n", k33_MyVal);	//MyVal���
		
		double k33_MyValF;		//������(�Ǽ���) ���� MyValF ����

		k33_MyValF = 14/5;		//���� MyValF 14/5�� �ʱ�ȭ
		System.out.printf("#5-2 : %f\n", k33_MyValF);	//MyValF ���
		
		k33_MyValF = 14.0/5;	//���� MyValF 14.0/5�� ������
		System.out.printf("#5-3 : %f\n", k33_MyValF);	//�����ǵ� MyValF ���
		
		k33_MyValF = (14.0)/5 + 0.5;	//���� MyValF (14.0)/5 + 0.5�� ������
		System.out.printf("#5-4 : %f\n", k33_MyValF);	//�����ǵ� MyValF �ٽ� ���
		
		k33_MyVal = (int)((14.0)/5+0.5);	//���� MyVal�� (14.0)/5+0.5)�� integer��ȯ�� ���·� ������ 
		System.out.printf("#5-5 : %d\n", k33_MyVal);	//�����ǵ� MyVal ���
	}
}
