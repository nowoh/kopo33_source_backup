package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch5_�ǽ�_3_���������1_����ü {
	/*
	 * ������ ���1	(����ü ����)
	 */
	public static void main(String[] args) { 						//�����Լ�
		DecimalFormat k33_df = new DecimalFormat("###,###,###"); 	//DecimalFormat ��ü ����
		Calendar k33_cal = Calendar.getInstance();					//����ð����� Calendar ����
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
																	//SimpleDateFormat ��ü ����
		
		int k33_iPrice = 33000;									//������ ���� iPrice(����) ����
		int k33_net_price = (int)(k33_iPrice/11*10);			//������ ���� net_price => iPrice�� 11�� ������ 10 ���� ���� (����  0.1)
																//integer�� �� ��ȯ���� ������ ���� (���� ����)
																//���� ���� = ���� ���� / (���� ���� + ����)
		int k33_tax = k33_iPrice - k33_net_price;				//������ ���� tax�� iPrice���� net_price�� ���� ������ ����
		
		System.out.println("�ſ����");							//���ڿ� ���
		System.out.printf("%-16s %17s\n", "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");	//���ڿ� 2�� 16�ڸ� Ȯ���Ͽ� ��������, 17�ڸ� Ȯ���Ͽ� ���������Ͽ� ���
		System.out.printf("%-15s\n", "������ : �Ѿ��ġ�");				//���ڿ� 1�� 15�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-15s\n", "��  �� : ��� ������ �д籸 Ȳ�����351���� 10 , 1��");	//���ڿ� 1�� 15�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-15s\n", "��ǥ�� : ��â��");					//���ڿ� 1�� 15�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-18s%20s\n", "����� : 752-53-00558", "TEL : 7055695");		//���ڿ� 2�� 18�ڸ� Ȯ���ϰ� ��������, 20�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");	//���� ���
		System.out.printf("%-22s%14s ��\n", "��  ��", k33_df.format(k33_net_price));	//���ڿ� 2�� 22�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-21s%14s ��\n", "�ΰ���", k33_df.format(k33_tax));			//���ڿ� 2�� 21�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-22s%14s ��\n", "��  ��", k33_df.format(k33_iPrice));		//���ڿ� 2�� 22�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");	//���� ���
		System.out.printf("�츮ī��\n");	//���ڿ� ���
		System.out.printf("%-25s%6s", "ī���ȣ : 5387-20**-****-4613(S)", "�Ͻú�\n");		//���ڿ� 2�� 25�ڸ� Ȯ���ϰ� ��������, 6�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("�ŷ��Ͻ� : %s\n", k33_sdf.format(k33_cal.getTime()));			//���ڿ� ���
		System.out.printf("���ι�ȣ : 70404427\n");											//���ڿ� ���
		System.out.printf("�ŷ���ȣ : 357734873739\n");										//���ڿ� ���
		System.out.printf("���� : ��ī���     ���� : 720068568\n");						//���ڿ� ���
		System.out.printf("�˸� : EDC����ǥ\n");											//���ڿ� ���
		System.out.printf("���� : TEL)1544-4700\n");										//���ڿ� ���
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");					//���� ���
		System.out.printf("%14s%s%14s\n"," ", "* �����մϴ� *", " ");						//���ڿ� 3�� 14�ڸ� �������, �ٷ� �ٿ��� ���ڿ� ���, 14�ڸ� Ȯ���Ͽ� �������
		System.out.printf("%39s", "ǥ��V2.08_20200212");									//���ڿ� 1�� 39�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		
	}
}
