package hw0413_Tue_ch4;

import java.text.DecimalFormat;

public class k33_ch4_�ǽ�_18_ĭ_����_�μ� {
	/*
	 * ĭ_����_�μ�
	 */
	public static void main(String[] args) {
		String k33_item = " ���";	//���ڿ� ���� item�� ����� ����
		int k33_unit_price = 5000;	//������ ���� unit_price�� 5000���� ����
		int k33_num = 500;		//������ ���� num�� 500���� ����
		int k33_total = 0;		//������ ���� total�� 0���� ����
		
		DecimalFormat k33_df = new DecimalFormat( "###,###,###,###,###" );	
										//DecimalFormat Ŭ���� df ��ü ����, format ����
		System.out.printf("======================================================\n");	//=========���, �� �ٲٱ�
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");		//ǰ��, �ܰ�, ����, �հ� ���
						//%20.20s => ���ڿ� 20�ڸ� Ȯ���Ͽ� ���, �ִ� 20�ڸ����� ���� //%8.8s => ���ڿ� 10�ڸ� Ȯ���Ͽ� ���, �ִ� 10�ڸ����� ����
		System.out.printf("======================================================\n");	//=========���, �� �ٲٱ�
		
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", k33_item, 		
				k33_df.format(k33_unit_price), k33_df.format(k33_num), k33_df.format(k33_unit_price*k33_num));
						//item, unit_price, num, unit_price*num������ �� ���
						//������ �������� df.format���� ������ �������� ���
						//%20.20s => ���ڿ� 20�ڸ� Ȯ���Ͽ� ���, �ִ� 20�ڸ����� ���� //%10.10s => ���ڿ� 10�ڸ� Ȯ���Ͽ� ���, �ִ� 10�ڸ����� ����
		System.out.printf("======================================================\n");	//=========���, �� �ٲٱ�
	}

}
