package hw0410_Sat_ch2;

public class k33_ch2_�ǽ�_07 {
	/*
	 * PrintEx2
	 */
	public static void main(String[] args) {
		String k33_url = "www.codechobo.com";	//���ڿ� url ����
				
		float k33_f1 = .10f;					//�Ǽ��� ���� f1 ����
		float k33_f2 = 1e1f;					//�Ǽ��� ���� f2 ����
		float k33_f3 = 3.14e3f;					//�Ǽ��� ���� f3 ����
		double k33_d = 1.23456789;				//�Ǽ��� ���� d ����
		
		System.out.printf("k33_f1=%f, %e, %g%n", k33_f1, k33_f1, k33_f1);	
							//f1�� float���¿� ��������, �������� �����ϰ� ǥ���Ͽ� ��� 
		System.out.printf("k33_f2=%f, %e, %g%n", k33_f2, k33_f2, k33_f2);
							//f2�� float���¿� ��������, �������� �����ϰ� ǥ���Ͽ� ��� 
		System.out.printf("k33_f3=%f, %e, %g%n", k33_f3, k33_f3, k33_f3);
							//f3�� float���¿� ��������, �������� �����ϰ� ǥ���Ͽ� ��� 
		
		System.out.printf("k33_d=%f%n", k33_d);			//double�� ���� d�� float������ ���
		System.out.printf("k33_d=%14.10f%n", k33_d);	//���� d�� 14�ڸ� Ȯ���ϰ� �Ҽ��� 10�ڸ������� ���
		
		System.out.printf("[12345678901234567890]%n");	//���ڿ� ����ϰ� �� �ٲٱ�
		System.out.printf("[%s]%n", k33_url);			//url ���
		System.out.printf("[%20s]%n", k33_url);			//url 20�ڸ� Ȯ���ϰ� ���������Ͽ� ���		
		System.out.printf("[%-20s]%n", k33_url);		//url 20�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("[%.8s]%n", k33_url);			//url 8�ڸ������� ����ϰ� ������ ����
	}
}
