package hw0421_Wed_ch6;

public class k33_ch6_5_4_CalMain {	//��1
	/*
	 * �޼ҵ� �����ε�
	 */
	public static void main(String[] args) {
		k33_ch6_5_3_Calc1 cc = new k33_ch6_5_3_Calc1();
		
		System.out.printf("2�� ������ ȣ��� [%d]\n", cc.sum(1, 2));
		System.out.printf("3�� ������ ȣ��� [%d]\n", cc.sum(1, 2, 3));
		System.out.printf("4�� ������ ȣ��� [%d]\n", cc.sum(1, 2, 3, 4));
		System.out.printf("������ ������ ȣ��� [%d]\n", cc.sum(1, 2));
		
	}

}
