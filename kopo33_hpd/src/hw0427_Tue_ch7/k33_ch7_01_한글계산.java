package hw0427_Tue_ch7;

public class k33_ch7_01_�ѱ۰�� {

	public static void main(String[] args) {	//���� �Լ�
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ�abcd", 15));		//k33_HanBlankForeword�޼ҵ� �ҷ��ͼ� ���ϰ� ���
		System.out.printf("HanBlankForeword[%s]\n", k33_HanBlankForeword("�ѱ��ѱ�aa", 15));	//k33_HanBlankForeword�޼ҵ� �ҷ��ͼ� ���ϰ� ���
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ�aa", 15));		//k33_HanBlankBackword�޼ҵ� �ҷ��ͼ� ���ϰ� ���
		System.out.printf("HanBlankBackword[%s]\n", k33_HanBlankBackword("�ѱ��ѱ�aa", 15));	//k33_HanBlankBackword�޼ҵ� �ҷ��ͼ� ���ϰ� ���
		System.out.printf("�ѱ��� [%d]��\n", k33_HanCount("�ѱ��ѱ�aa"));						//k33_HanCount �޼ҵ� �ҷ��ͼ� ���ϰ� ���
	}
	
	public static String k33_HanBlankForeword(String k33_aa, int k33_b) {	
												//���ڿ��� ���ϰ��� �ְ� ���ڿ��� ������ ������ ���ڷ� �޴� �޼ҵ� ����
												//b�� ���߷��� �ϴ� ����Ʈ ��
		byte[] k33_bb = k33_aa.getBytes();		//���ڿ� aa ����Ʈ �� ��������
		int k33_bleng = k33_bb.length;			//aa�� ����Ʈ ���� ������ ���� bleng���� ����
		String k33_ret_str = "";				//���ڿ� ret_str null�� ����
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {	//�ݺ��� : ������ ���� i�� 0�̰� i�� b-bleng������ 1�� �����ϸ� �ݺ�
																	//���ڿ� bleng��ŭ ����Ʈ ���� ä��� ���� �� ���̸�ŭ �ݺ��ϱ�
			k33_ret_str = k33_ret_str + " ";						//ret_str�� " " ������ ������ ret_str ������
		}
		k33_ret_str = k33_ret_str + k33_aa;							//" "�߰��� ret_str�� aa ������ ������ ret_str ������
		
		return k33_ret_str;											//�����ǵ� ret_str ����
	}
	public static String k33_HanBlankBackword(String k33_aa, int k33_b) {
												//���ڿ��� ���ϰ��� �ְ� ���ڿ��� ������ ������ ���ڷ� �޴� �޼ҵ� ����
												//b�� ���߷��� �ϴ� ����Ʈ ��
		byte[] k33_bb = k33_aa.getBytes();		//���ڿ� aa ����Ʈ �� ��������
		int k33_bleng = k33_bb.length;			//aa�� ����Ʈ ���� ������ ���� bleng���� ����
		String k33_ret_str = "";				//���ڿ� ret_str null�� ����
		
		for (int k33_i = 0; k33_i < (k33_b - k33_bleng); k33_i++) {	//�ݺ��� : ������ ���� i�� 0�̰� i�� b-bleng������ 1�� �����ϸ� �ݺ�
																	//���ڿ� bleng��ŭ ����Ʈ ���� ä��� ���� �� ���̸�ŭ �ݺ��ϱ�
			k33_ret_str = k33_ret_str + " ";						//ret_str�� " " ������ ������ ret_str ������
		}
		k33_ret_str = k33_aa + k33_ret_str;							//aa�� " "�߰��� ret_str�� ������ ������ ret_str ������
		
		return k33_ret_str;											//�����ǵ� ret_str ����
	}

	public static int k33_HanCount(String k33_aa) {					//���������� ���ϰ��� �ְ� ���ڿ��� ���ڷ� �޴� �޼ҵ� ����
		int k33_count = 0;											//������ ���� count�� 0���� ����
		for (int k33_i = 0; k33_i < k33_aa.length(); k33_i++) {		//�ݺ��� : ������ ���� i�� 0�̰�, i�� aa���������� 1�� �����ϸ� �ݺ�
			if (Character.getType(k33_aa.charAt(k33_i)) == Character.OTHER_LETTER) {	//aa�� i��° ���ھ �ѱ��̸� (�ѱ�, ��ȣ ���)
				k33_count++;															//count +1
			}
		}
		return k33_count;																//count ����
	}
}
