package hw0402_Fri_arrayConvert;

import hw0402_Fri.CostValueClass;
import hw0402_Fri.PrintClass;

public class ConvertProcessing {
	public static double exchangeResult;	//��ȭ ȯ�� ���
	public static double changeWon;		//�Ž����� �Ҽ��� ����
	public static int changeWonResult;	//�Ž����� �Ҽ��� ����
	
	public void exchangeUSD(double won) {
		int usd; 			//�޷� 
		int[] usdArr = CostValue.USD_ARR;			//�޷� ����
		int usdCurrent; 
		int usdCount;								//�޷� ����
		
		exchangeResult = won / CostValue.EX_RATE_USD;
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * CostValue.EX_RATE_USD)) / 10;
		changeWonResult = (int)changeWon * 10;
		System.out.println("�޷��� ȯ�� ���");
		System.out.println("�޷� ���� : " + usd +" �޷�");
		
		//�޷����� ��� ���;��ϴ°�
		for (int i = 0; i < usdArr.length; i ++) {
				usdCount = usdCurrent / usdArr[i];
				System.out.printf(usdArr[i] + "�޷� : " + usdCount + "��\t");
				usdCurrent -= usdArr[i] * usdCount;
				if ((i+1) % 4 == 0) {
					System.out.printf("\n");
				}
		}
	}
	
	public void exchangeEURO(double won) {
		int euro; 
		int[] euroArr = CostValue.EURO_ARR;			//���δ��� 
		int euroCurrent;
		int euroCount;								//���� ����
		
		exchangeResult = won / CostValue.EX_RATE_EURO;		//��ȭ�� ���η� ��ȯ
		euro = (int)exchangeResult/5*5;		//�ּ� ���� ���� ������ 5����
		euroCurrent = euro;
		changeWon = (won - (euro * CostValue.EX_RATE_EURO)) /10;	
		//��ȯ �� ������ ��ȭ (1������ ����ó��)
		changeWonResult = (int)changeWon *10;
		System.out.println("���η� ȯ�� ���");
		System.out.println("���� ���� : " + euro +" ����");
		
		//����ȭ��� ��� ���;��ϴ°�
		for (int i = 0; i < euroArr.length; i ++) {
			euroCount = euroCurrent / euroArr[i];
			System.out.printf(euroArr[i] + "���� : " + euroCount + "��\t");
			euroCurrent -= euroArr[i] * euroCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public void exchangeJPY(double won) {
		int jpy;
		int[] jpyArr = CostValue.JPY_ARR;			//��ȭ ����
		int jpyCurrent;
		int jpyCount;								//��ȭ ����
		
		exchangeResult = won / CostValue.EX_RATE_JPY;		//��ȭ�� ��ȭ�� ��ȯ
		jpy = (int)exchangeResult/1000*1000;	//�ּ� ��ȭ ���� ������ 1000��
		jpyCurrent = jpy;
		changeWon = (won - (jpy * CostValue.EX_RATE_JPY)) /10;	
		//��ȯ �� ������ ��ȭ (1������ ����ó��)
		changeWonResult = (int)changeWon *10;
		System.out.println("��ȭ�� ȯ�� ���");
		System.out.println("��ȭ ���� : " + jpy +" ��");
		
		//��ȭȭ��� ��� ���;��ϴ°�
		for (int i = 0; i < jpyArr.length; i ++) {
			jpyCount = jpyCurrent / jpyArr[i];
			System.out.printf(jpyArr[i] + "�� : " + jpyCount + "��\t");
			jpyCurrent -= jpyArr[i] * jpyCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public void resultWon() { 	//��ȭ �Ž����� ���
		int wonCurrent =0;
		int wonCount =0;								//��ȭ ����
		int[] wonArr = CostValue.WON_ARR;				//��ȭ ����
		wonCurrent = changeWonResult;
		System.out.println("\n\n��ȭ �Ž����� ���� : " +changeWonResult+"��");
		
		for (int i = 0; i < wonArr.length; i ++) {
			wonCount = wonCurrent / wonArr[i];
			if (wonArr[i] == 5000 || wonArr[i] == 1000) {
				System.out.printf(wonArr[i] + "�� : " + wonCount + "��\t");
			} else {
				System.out.printf(wonArr[i] + "�� : " + wonCount + "��\t");
			}
			wonCurrent -= wonArr[i] * wonCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
		System.out.printf("\n\n");
		Print_arrayConvert.printWon(wonCount, wonArr[], wonCurrent);
	}
}
