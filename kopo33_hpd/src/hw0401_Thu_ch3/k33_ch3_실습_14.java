package hw0401_Thu_ch3;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k33_ch3_�ǽ�_14 { //Ŭ���� ����
	//
	//#14. �޸�,���� ��¥, �ð� ���
	//
	public static void main(String[] args) { //�������κ��� ���α׷� ����
		DecimalFormat k33_df = new DecimalFormat("###, ###, ###, ###");	//DecimalFormat�� �̿��Ͽ� �ڸ������� �޸�(,)��� 
		Calendar k33_cal = Calendar.getInstance();						//cal�̶�� calendar class�� �����Ͽ� ���� �ð��� ������
		SimpleDateFormat k33_sdf = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");		//sdf��� SimpleDateFormat ��ü ����
		
		int k33_MyWon = 1000000;			//ȯ���� �ݾ� ���� (��ȭ)
		double k33_MoneyEx = 1238.21;		//�޷� ȯ�� ����
		double k33_commission = 0.003;		//������ ����
		
		int k33_usd = (int)(k33_MyWon/k33_MoneyEx);		//ȯ���� �޷� �ݾ� (��Ʈ�κ� ����ó��)
		int k33_remain = (int)(k33_MyWon - k33_usd*k33_MoneyEx);	//ȯ���ϰ� ���� ��ȭ ��ȯ�ݾ�(�Ҽ��� ���� ����ó��)
		
		double k33_ComPerOne = k33_MoneyEx * k33_commission;	//1�޷��� ������ ���(������ ��ȭ)�Ͽ� ComPerOne���� ����
		
		double k33_totalcom = k33_usd * k33_ComPerOne;	//ȯ���� �޷� * �޷��� ������ = �� �����ؾ��� ������(totalcom) ����
		
		int k33_i_totalcom;	//i_totalcom��� ������ ���� ����
		
		k33_usd = (int) (k33_MyWon/(k33_MoneyEx + k33_ComPerOne));	//ȯ���� �޷� �ݾ��� �������� ������ ȯ���ݾ����� ����
		k33_totalcom = k33_usd * k33_ComPerOne;		//ȯ���� �޷� * �޷��� ������ = �� �����ؾ��� ������(totalcom) ����
		
		if (k33_totalcom != (double)((int)k33_totalcom)) {		//double�� totalcom�� int�� �ٲ�ٰ� �ٽ� double�� �� ��ȯ
																//�� �Ҽ��� ���ϸ� �� ������ �ٽ� .000���� ���� �� ���� �ʴٸ�
			k33_i_totalcom = (int)(k33_totalcom + 1);			//totalcom�� �ø����� ������ ����
		} else {
			k33_i_totalcom = (int)k33_totalcom;					//�׷��� �ʴٸ� �׳� totalcom�� int�� �� ��ȯ�� ������ ����
		}
		
		System.out.printf("*******************************************************************\n");	//*���
		System.out.printf("*                          �޸� ����                                *\n");	//�ǽ� ����
		System.out.printf("�� ������ : %s�� => ��ȭ : %s�޷�, �޷��� ������ : %f��\n", 				//������, ȯ�� �޷�, �޷��� ������ ���
				k33_df.format(k33_i_totalcom), k33_df.format(k33_usd), k33_ComPerOne);		//�� ������� ȯ�� �޷��ݾ׿� Decimal format ����
		
		k33_remain = (int) (k33_MyWon - k33_usd * k33_MoneyEx - k33_i_totalcom);		//ȯ���� ��ȭ���� ȯ���� �鷯�� ������ ���� ���� remain���� ����
		System.out.printf("�� ��ȭȯ�� �ݾ� : %s�� => ��ȭ : %s�޷�, ������ ¡�� : %s��  �ܵ� : %s��\n", //�� ��ȭȯ�� �ݾ�, ȯ�� �޷�, ������, �ܵ� ���
				k33_df.format(k33_MyWon), k33_df.format(k33_usd), 
				k33_df.format(k33_i_totalcom), k33_df.format(k33_remain));						//�� ��� �ݾ� ��½� Decimal format ����
		System.out.printf("��������ð� : %s\n", k33_sdf.format(k33_cal.getTime()));				//calendar�� SimpleDateFormat���� �ð� ���
		System.out.printf("*******************************************************************\n");		//*���
		}
}
