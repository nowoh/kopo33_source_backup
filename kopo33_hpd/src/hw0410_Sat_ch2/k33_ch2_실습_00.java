package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_00 {

	public static void main(String[] args) {
		
		String k33_s = "12345";		//���ڿ� s 12345�� ���� 
		int k33_i = Integer.parseInt(k33_s);	//���ڿ� s�� ���������� ��ȯ�Ͽ� ������ ���� i�� ����
		
		System.out.printf("���ڸ� ���ڷ� %d	   (%d)   \n", k33_i, k33_i+10);	//%d�� ��ȯ�� i ��� 
		
		String k33_a;	//���ڿ� a ���� 
		k33_a = String.format("%d", k33_i);		//������ ��ȯ�� i�� �ٽ� ���ڿ� a�� ��ȯ 
		
		System.out.printf("���ڸ� ���ڷ� %s   (%s)   \n", k33_a, k33_a+"abcde");	//%s�� ���ڿ��� ��ȯ�� a ��� 
	}

}
