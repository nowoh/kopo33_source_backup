package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_07_������_�������� {
	/*
	 * ������_��������
	 */
	public static void main(String[] args) {
		int k33_iI;		//������ ���� iI ����
		double k33_iD;	//�Ǽ��� ���� iD ����
		
		k33_iI = 10/3;		//iI�� 10/3���� ���� => 3
		k33_iD = 10/3.0;	//iD�� 10/3.0���� ���� => 3.333333...
		
		if (k33_iI == k33_iD) System.out.printf("equal\n");		//iI�� iD�� ������ equal ���
		else System.out.printf("Not equal[%f][%f]\n", (double)k33_iI, k33_iD);	
											//�׷��� ������ Not equal ��� �� iI�� iD���� ��� 
		if (k33_iD == 3.333333) System.out.printf("equal\n");	//iD�� 3.333333�� ������ equal ���
		else System.out.printf("Not equal[3.333333][%f]\n", k33_iD);
									//�׷��� ������ Not equal ��� �� 3.333333�� iD ���
									//�ٸ� ������ iD�� 3.333333d���� ������ ���� �ƴ� 3.333333...�̱� ����
		k33_iD = (int)k33_iD;	//iD�� ������ ������ ��ȯ
		if (k33_iI == k33_iD) System.out.printf("equal\n");	//���ǹ� : iI�� iD�� ������ equal ���
		else System.out.printf("Not equal[%f][%f]\n", (double)k33_iI, k33_iD);
											//�׷��� ������ Not equal�� �Ǽ���iI�� ���������� ��ȯ�� iD ���
		System.out.printf("int�� �μ�[%d][%f]\n", k33_iI, k33_iD);	//iI�� iD�� ������ ������ ���
																//iD�� %f�� ����Ͽ� �Ҽ���.00���� ���
		System.out.printf("double�� �μ�[%f][%f]\n", (double)k33_iI, k33_iD);
											//iI�� iD�� �Ǽ��� ������ ��� (�� ���� �� �� �Ҽ������� ���)
		char k33_a = 'c';					//���ھ� ���� a�� 'c'�� ����
		
		if (k33_a == 'b') System.out.printf("k33_a�� b�̴�.\n");	//���ǹ� : ���� a�� 'b'�� a�� b�̴�. ���
		if (k33_a == 'c') System.out.printf("k33_a�� c�̴�.\n");	//���ǹ� : ���� a�� 'c'�� a�� c�̴�. ���
		if (k33_a == 'd') System.out.printf("k33_a�� d�̴�.\n");	//���ǹ� : ���� a�� 'd'�� a�� d�̴�. ���
		
		String k33_aa = "abcd";			//���ڿ� ���� aa�� "abcd"�� ����
		
		if(k33_aa.equals("abcd")) System.out.printf("k33_aa�� abcd�̴�.\n");	
														//���ǹ� : aa�� "abcd"�� aa�� abcd�̴�. ���
		else System.out.printf("k33_aa�� abcd�� �ƴϴ�.\n");	//�׷��� ������ aa�� abcd�� �ƴϴ�. ���
		
		boolean k33_bb = true;		//boolean ���� bb�� true�� ����
		
		if (!!k33_bb) System.out.printf("k33_bb�� �ƴϰ� �ƴϸ� ���̴�.\n");	
												//bb�� false�� false�� bb�� �ƴϰ�ƴϸ� ���̴�. ���
		else System.out.printf("k33_bb�� �ƴϰ� �ƴϸ� �����̴�.\n"); 
												//�׷��� ������ bb�� �ƴϰ� �ƴϸ� �����̴�. ���
	}
}
