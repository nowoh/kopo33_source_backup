package hw0401_Thu_ch3;

public class k33_ch3_�ǽ�_08 { //Ŭ���� ����
	//
	//#8. �Һ��ڰ� ���� ���2
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		String[] k33_item = {"������", "���Ͻ�", "�Ե�����", "����", "��극"};	//item �迭 ����
		int[] k33_price = {1000, 2000, 3000 ,2400, 1450};	//price �迭 ����
		int[] k33_amount = {10, 2, 1, 3, 5};	//amount �迭 ����
		double k33_tax_rate = 0.1;			//����
		int k33_total_sum = 0;				//total_sum�̶�� ������ ���� 0���� �ʱ�ȭ
		
		System.out.printf("**************************************************\n");  //*���
		System.out.printf("                ������ ���ڵ�                     \n");		//"������ ���ڵ�" ���
		System.out.printf("��  ��      ��  ��       �� ��          �� ��   \n");				//�׸� ���
		
		for (int k33_i = 0; k33_i < k33_item.length; k33_i++) {		//for loop������ item, price, amount, sum��� 
			int k33_sum = k33_price[k33_i] * k33_amount[k33_i];		//���� �迭 ������ �ִ� price�� amount ���ؼ� sum(�հ谡��) ����
			k33_total_sum = k33_total_sum + k33_sum;				//�ݺ��� ���ư� ������ �հ谡�� total_sum�� �����ֱ�
			System.out.printf("%.5s	%7d		%2d	%9d\n", k33_item[k33_i], k33_price[k33_i], k33_amount[k33_i], k33_sum);
		}													//tab���� �� ���缭 ���
		
		System.out.printf("**************************************************\n"); //*���
		System.out.printf(" 	���� �ݾ� :    %20d\n", k33_total_sum);		//�� ���� �ݾ� ���
	
		int k33_total_net_price = (int)(k33_total_sum/(1+k33_tax_rate));	//�� ���� �ݾ׿��� ���� �ݾ� ���ϱ�
		System.out.printf(" 	���� �ݾ� :    %20d\n", k33_total_net_price);	//�� ���� �ݾ��� ���� �ݾ� ���
		int k33_tax = k33_total_sum - k33_total_net_price;					//�� ���� �ݾ׿��� ���� �ݾ� ���� ���� ���ϱ�
		System.out.printf(" 	��    �� :    %20d\n", k33_tax);				//���� ���	
	}
}
