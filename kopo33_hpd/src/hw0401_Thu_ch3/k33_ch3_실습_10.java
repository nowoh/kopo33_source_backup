package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_10 { //Ŭ���� ����
	//
	//#10. ������ ���� ȯ�� ���(1)
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		int k33_MyWon = 1000000;			//ȯ���� �ݾ� ���� (��ȭ)
		double k33_MoneyEx = 1238.21;		//�޷� ȯ�� ����
		double k33_commission = 0.003;		//������ ����
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//ȯ���� �޷� �ݾ� (��Ʈ�κ� ����ó��)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//ȯ���ϰ� ���� ��ȭ ��ȯ�ݾ�(�Ҽ��� ���� ����ó��)
		
		double k33_ComPerOne = k33_MoneyEx * k33_commission;	//1�޷��� ������ ���(������ ��ȭ)�Ͽ� ComPerOne���� ����
		
		double k33_totalcom = k33_usd * k33_ComPerOne;		//ȯ���� �޷� * �޷��� ������ = �� �����ؾ��� ������(totalcom) ����

		System.out.printf("*******************************************************************\n");	//*���
		System.out.printf("*                          ������ ���                               *\n");	//�ǽ� ����
		System.out.printf("   �� ������ : %f�� => ��ȭ : %d�޷�, �޷��� ������ : %f��\n",k33_totalcom, k33_usd, k33_ComPerOne);
																				//�� ������, �޷�ȯ����, �޷�������� ���
		System.out.printf("*******************************************************************\n");	//*���
	}
}
