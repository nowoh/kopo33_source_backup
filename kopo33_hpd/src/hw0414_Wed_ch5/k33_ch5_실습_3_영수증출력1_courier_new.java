package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch5_�ǽ�_3_���������1_courier_new {
	/*
	 * ������ ���1	(courier new ��Ʈ����)
	 */
	public static void main(String[] args) { 
		DecimalFormat k33_df = new DecimalFormat("###, ###, ###, ###"); 
		Calendar k33_cal = Calendar.getInstance();
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		
		int k33_iPrice = 33000;
		double k33_tax_rate = 0.1;
		int k33_net_price = (int)(k33_iPrice/(1+k33_tax_rate));
		int k33_tax = (int)(k33_iPrice - k33_net_price);
		
		System.out.println("�ſ����");
		System.out.printf("%-15s %16s\n", "�ܸ��� : 2N68665898", "��ǥ��ȣ : 041218");
		System.out.printf("%-15s\n", "������ : �Ѿ��ġ�");
		System.out.printf("%-15s\n", "�� �� : ��� ������ �д籸 Ȳ�����351���� 10, 1��");
		System.out.printf("%-15s\n", "��ǥ�� : ��â��");
		System.out.printf("%-15s%15s\n", "����� : 752-53-00558", "TEL : 7055695");
		System.out.println("----------------------------------");
		System.out.printf("%-16s%15s ��\n", "��   ��", k33_df.format(k33_net_price));
		System.out.printf("%-16s%15s ��\n", "�� �� ��", k33_df.format(k33_tax));
		System.out.printf("%-16s%15s ��\n", "��   ��", k33_df.format(k33_iPrice));
		System.out.printf("�츮ī��\n");
		System.out.printf("%-25s", "ī���ȣ : 5387-20**-****-4613(S) �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : %s\n", k33_sdf.format(k33_cal.getTime()));
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���\t���� : 720068568\n");
		System.out.printf("�˸� : EDC����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.println("----------------------------------");
		System.out.printf("%12s%s%12s\n"," ", "* �����մϴ� *", " ");
		System.out.printf("%34s", "ǥ��V2.08_20200212");
		
	}
}
