package hw0402_Fri;

public class ProcessingClass {
	public static double exchangeResult;	//��ȭ ȯ�� ���
	public static double changeWon;		//�Ž����� �Ҽ��� ����
	public static int changeWonResult;	//�Ž����� �Ҽ��� ����
	
	PrintClass PrintClass = new PrintClass();
	
	public void exchangeUSD(double won) {
		int usd; 			//�޷� 
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; //�޷�����
		int usdCurrent;
		
		exchangeResult = won / CostValueClass.EX_RATE_USD;	//��ȭ�� �޷��� ��ȯ
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * CostValueClass.EX_RATE_USD)) /10; 
		//��ȯ �� ������ ��ȭ (1������ ����ó��)
		changeWonResult = (int)changeWon *10;	
		
		//�޷����� ��� ���;��ϴ°�
		usd100 = usdCurrent /100;	//100�޷� ȭ�� ����
		usdCurrent -= 100 * usd100;
		usd50 = usdCurrent/50;		//50�޷� ȭ�� ����
		usdCurrent -= 50 * usd50;
		usd20 = usdCurrent/20;		//20�޷� ȭ�� ����
		usdCurrent -= 20 * usd20;
		usd10 = usdCurrent/10;		//10�޷� ȭ�� ����
		usdCurrent -= 10 * usd10;
		usd5 = usdCurrent/5;		//5�޷� ȭ�� ����
		usdCurrent -= 5 * usd5;
		usd2 = usdCurrent/2;		//2�޷� ȭ�� ����
		usdCurrent -= 2 * usd2;
		usd1 = usdCurrent/1;		//1�޷� ȭ�� ����
		usdCurrent -= 1 * usd1;
		
		PrintClass.printUsd(usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
	}
	
	
	
	public void exchangeEURO(double won) {
		int euro; 
		int euro500, euro200, euro100, euro50, euro20, euro10, euro5; //���δ��� 
		int euroCurrent;
		
		exchangeResult = won / CostValueClass.EX_RATE_EURO;		//��ȭ�� ���η� ��ȯ
		euro = (int)exchangeResult/5*5;		//�ּ� ���� ���� ������ 5����
		euroCurrent = euro;
		changeWon = (won - (euro * CostValueClass.EX_RATE_EURO)) /10;	
		//��ȯ �� ������ ��ȭ (1������ ����ó��)
		changeWonResult = (int)changeWon *10;
		
		//����ȭ��� ��� ���;��ϴ°�
		euro500 = euroCurrent / 500;	//500���� ����
		euroCurrent -= 500 * euro500;	
		euro200 = euroCurrent / 200;	//200���� ����
		euroCurrent -= 200 * euro200;
		euro100 = euroCurrent / 100;	//100���� ����
		euroCurrent -= 100 * euro100;
		euro50 = euroCurrent / 50;		//50���� ����
		euroCurrent -= 50 * euro50;
		euro20 = euroCurrent / 20;		//20���� ����
		euroCurrent -= 20 * euro20;
		euro10 = euroCurrent / 10;		//10���� ����
		euroCurrent -= 10 * euro10;
		euro5 = euroCurrent / 5;		//5���� ����
		euroCurrent -= 5 * euro5;
		
		PrintClass.printEuro(euro, euro500, euro200, euro100, euro50, euro20, euro10, euro5);
	}
	
	
	
	public void exchangeJPY(double won) {
		int jpy;
		int jpy10000, jpy5000, jpy2000, jpy1000;
		int jpyCurrent;
		
		exchangeResult = won / CostValueClass.EX_RATE_JPY;		//��ȭ�� ��ȭ�� ��ȯ
		jpy = (int)exchangeResult/1000*1000;	//�ּ� ��ȭ ���� ������ 1000��
		jpyCurrent = jpy;
		changeWon = (won - (jpy * CostValueClass.EX_RATE_JPY)) /10;	
		//��ȯ �� ������ ��ȭ (1������ ����ó��)
		changeWonResult = (int)changeWon *10;
		
		//��ȭȭ��� ��� ���;��ϴ°�
		jpy10000 = jpyCurrent / 10000;		//10000�� ����
		jpyCurrent -= 10000 * jpy10000;
		jpy5000 = jpyCurrent / 5000;		//5000�� ����
		jpyCurrent -= 5000 * jpy5000;
		jpy2000 = jpyCurrent / 2000;		//2000�� ����
		jpyCurrent -= 2000 * jpy2000;
		jpy1000 = jpyCurrent / 1000;		//1000�� ����
		jpyCurrent -= 1000 * jpy1000;
		
		PrintClass.printJpy(jpy, jpy10000, jpy5000, jpy2000, jpy1000);
	}
	
	
	
	public void resultWon() { 	//��ȭ �Ž����� ���
		int won5000, won1000, won500, won100, won50, won10; //��ȭ ����
		int wonCurrent;
		
		
		wonCurrent = changeWonResult;
		won5000 = wonCurrent/5000;		//5000�� ����
		wonCurrent -= 5000 * won5000;
		won1000 = wonCurrent/1000;		//1000�� ����
		wonCurrent -= 1000* won1000;		
		won500 = wonCurrent/500;		//500�� ����
		wonCurrent -= 500 * won500;		
		won100 = wonCurrent/100;		//100�� ����
		wonCurrent -= 100 * won100;		
		won50 = wonCurrent/50;			//50�� ����
		wonCurrent -= 50 * won50;	
		won10 = wonCurrent/10;			//10�� ����
		
		PrintClass.printWon(changeWonResult, won5000, won1000, won500, won100, won50, won10);
	}
}
