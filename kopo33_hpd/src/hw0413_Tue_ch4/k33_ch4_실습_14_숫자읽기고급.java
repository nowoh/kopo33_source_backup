package hw0413_Tue_ch4;

public class k33_ch4_�ǽ�_14_�����б��� {
	/*
	 * �����б���
	 */
	public static void main(String[] args) {
		int k33_iNumVal = 1001034567;	//������ ���� iNumVal�� 1001034567�� ����
		String k33_sNumVal = String.valueOf(k33_iNumVal);	
				//���ڿ� ���� sNumVal�� iNumVal�� ���ڿ��� ��ȯ�� ������ ����
		String k33_sNumVoice = "";	//���ڿ� sNumVoice�� ""�� ���� (null)
		System.out.printf("==> %s [%d�ڸ�]\n", k33_sNumVal, k33_sNumVal.length());
							//==> sNumVal [sNumVal���ڿ�����+�ڸ�] ����ϰ� �� �ٲٱ�
		int k33_i, k33_j;	//������ ���� i, j ����
		
		String[] k33_units = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
				//���ڿ� �迭 units�� {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"}�� �ʱ�ȭ
		String[] k33_unitx = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};
				//���ڿ� �迭 unitx�� {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"}�� �ʱ�ȭ
		k33_i = 0;	//i�� 0���� ����
		k33_j = k33_sNumVal.length()-1;	//j�� ���ڿ� sNumVal�� ����-1�� ����
		
		while (true) {	//�ݺ��� : ���� loop
			if (k33_i >= k33_sNumVal.length()) break;	//���ǹ� : i�� sNumVal���� �̻��̸� break
			System.out.printf("%s[%s]",			
					k33_sNumVal.substring(k33_i, k33_i+1),
					k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i+1))]);
			//sNumVal�� i��°�ڸ��� �迭 units���� sNumVal�� i��°�ڸ��� ���������� ��ȯ�� �� �ڸ��� ���� ���
			if (k33_sNumVal.substring(k33_i, k33_i+1).equals("0")) {	//���ǹ� : sNumVal�� i��°�ڸ��� 0�̸�
				if (k33_unitx[k33_j].equals("��") || k33_unitx[k33_j].equals("��")) {
					k33_sNumVoice = k33_sNumVoice + "" + k33_unitx[k33_j];
					//���ǹ� : �迭 unitx�� j��° ��Ұ� "��"�̰ų� "��"�̸�
					//sNumVoice�� sNumVoice + unitx �迭�� j��° ��ҷ� ����
				} else {
					//�ƹ� ���� ����
				}
			} else {	//�׷��� ������ (sNumVal�� i��°�ڸ��� 0�� �ƴϸ�)
				k33_sNumVoice = k33_sNumVoice 
						+ k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i+1))] 
						+ k33_unitx[k33_j];
				//sNumVoice�� sNumVoice + units �迭�� sNumVal�� i��° �ڸ��� ���������� ��ȯ�� �� �ڸ�
				//+ unitx �迭�� j��° ��ҷ� ����
			}
			k33_i++; k33_j--;	//i 1 ����, j 1 ����
		}
		System.out.printf("\n %s[%s]\n", k33_sNumVal, k33_sNumVoice);	//sNumVal�� sNumVoice ���
	}
}
