package hw0427_Tue_ch7;

public class k33_ch7_07_main {		//��2

	public static void main(String[] args) {
		int k33_iPerson = 5; 
		
		k33_ch7_07_classArray[] k33_inData = new k33_ch7_07_classArray[k33_iPerson];
		
//		inData[0] = new k33_ch7_07_classArray("ȫ��01", 100, 100, 90);
//		inData[1] = new k33_ch7_07_classArray("ȫ��02", 100, 100, 90);
//		inData[2] = new k33_ch7_07_classArray("ȫ��03", 100, 100, 90);
//		inData[3] = new k33_ch7_07_classArray("ȫ��04", 100, 100, 90);
//		inData[4] = new k33_ch7_07_classArray("ȫ��05", 100, 100, 90);
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String k33_name = String.format("ȫ��%02d", k33_i);						//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int k33_kor = (int)(Math.random()*100);									//������ ���� kor�� 0~100������ ���� ������ ����
			int k33_eng = (int)(Math.random()*100);									//������ ���� eng�� 0~100������ ���� ������ ����
			int k33_mat = (int)(Math.random()*100);									//������ ���� mat�� 0~100������ ���� ������ ����
			
			k33_ch7_07_classArray k33_indata = new k33_ch7_07_classArray(k33_name, k33_kor, k33_eng, k33_mat);
			System.out.printf("��ȣ : %d, �̸� : %s, ���� :  %3d, ���� : %3d, ���� : %3d, ���� : %3d, ��� : %.2f\n", 
					k33_i+1, k33_indata.k33_name(), k33_indata.k33_kor(), k33_indata.k33_eng(), k33_indata.k33_mat(), k33_indata.k33_sum(), k33_indata.k33_avg());
		}																			
		
	}

}
