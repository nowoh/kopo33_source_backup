package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_06 { //Ŭ���� ����
	//
	//#6. �ܼ� ���� ���
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		int k33_val = 271;		//���� ���� �� 
		int k33_rate = 3;		//���� 3%
		
		int k33_tax = k33_taxcal(k33_val, k33_rate);	//taxcal �Լ��� ���� ���� ���� ���� �Է��� ������� tax�� ����
		
		System.out.printf("*********************************\n");	//*���
		System.out.printf("*          �ܼ� ���� ���          *\n");	//�ܼ� ���� ��� ���
		System.out.printf("���� ���� ��� : %f\n", k33_val*k33_rate/100.0);		//���� ���� ��� �� �� ��� (float����)
		
		System.out.printf("�������� : %d ���� : %d �����԰��� : %d\n", k33_val, k33_tax, k33_val + k33_tax);	
										//��������, ����, ������ ���� ��� | taxcal �Լ����� �ø��߱� ������ �������·� ���
		System.out.printf("*********************************\n");	//*���
	}
	
	public static int k33_taxcal(int k33_val, int k33_rate) {		//���� ���� ���� ������ ���ڷ� �޴� �޼ҵ� taxcal ����
		int k33_ret;	//������ ���� ret ����
		
		if (((double)k33_val*(double)k33_rate/100.0) == k33_val*k33_rate/100) {		//���� ���� ������ ���ؼ� double���� int���� ������
			k33_ret = k33_val*k33_rate/100;											//ret�� ���� ���� ������ ���� ������ ����
		} else {
			k33_ret = k33_val*k33_rate/100 + 1;									//�׷��� ������ ���� ���� ������ ���� ���� +1�� ������ ����
		}																		//���������� ������ �ø����� ó���� ��
		return k33_ret;															//���� ret������ return
	}
}
