package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_07 { //Ŭ���� ����
	//
	//#7. �Һ��ڰ� ���� ���1
	//
	public static int k33_netprice (int k33_price, double k33_rate) { 	//���� ���� ����ϴ� �Լ� netprice ����
		return (int) (k33_price/(1+k33_rate));		// ��ǰ���� / (1 + ����) = ���� ����
	}												//���������� ���� ó�� �׷��� ������ �ø�ó����								
	
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		int k33_price = 1234;				//��ǰ����
		double k33_tax_rate = 0.1;			//����
		int k33_netprice = k33_netprice(k33_price, k33_tax_rate);	//���� ���� ����
		int k33_tax = k33_price - k33_netprice;						//��ǰ���ݿ��� ���� ������ ���� ���� ���
		
		System.out.printf("**********************************\n");	//*���
		System.out.printf("*     �Һ��ڰ�, ��������, ���� ���     *\n");	//ī�װ� ���
		System.out.printf(" �Һ��ڰ��� : %d, �������� : %d, ���� : %d\n", k33_price, k33_netprice, k33_tax);
																	//�Һ��� ����, ���� ����, ���� ���
		System.out.printf("**********************************\n");	//*���
	}
}
