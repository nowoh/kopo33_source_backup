package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_09 { //Ŭ���� ����
	//
	//#9. �ܼ� ȯ�� ���
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		int k33_MyWon = 1000000;			//ȯ���� �ݾ� ���� (��ȭ)
		double k33_MoneyEx = 1238.21;		//�޷� ȯ�� ����
		double k33_commission = 0.003;		//������ ����
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//ȯ���� �޷� �ݾ� (��Ʈ�κ� ����ó��)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//ȯ���ϰ� ���� ��ȭ ��ȯ�ݾ�(�Ҽ��� ���� ����ó��)
		
		System.out.printf("***************************************************\n");	//*���
		System.out.printf("*                ������ ���� ���                     *\n");	//�ǽ� ����
		System.out.printf("�� ��ȭȯ���ݾ� : %d�� => ��ȭ : %d�޷�, �ܵ� : %d��\n",k33_MyWon, k33_usd, k33_remain);
																		//�� ��ȭȯ���ݾ�, �޷�ȯ����, ��ȯ��ȭ�ݾ� ��� 
		System.out.printf("***************************************************\n"); //*���	
	}	
}
