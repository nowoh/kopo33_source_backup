package hw0421_Wed_ch6;

public class k33_ch6_9_1_ReportSheet {

	public static void main(String[] args) {			//�����Լ�
		int k33_iPerson = 10;							//������ ���� ���� iPerson�� 10���� ���� 
		
		k33_ch6_9_2_InputData k33_inData = new k33_ch6_9_2_InputData(k33_iPerson);	//k33_ch6_9_2_InputData Ŭ������ inData�� ��ü����
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String k33_name = String.format("ȫ��%02d", k33_i);						//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int k33_kor = (int)(Math.random()*100);									//������ ���� kor�� 0~100������ ���� ������ ����
			int k33_eng = (int)(Math.random()*100);									//������ ���� eng�� 0~100������ ���� ������ ����
			int k33_mat = (int)(Math.random()*100);									//������ ���� mat�� 0~100������ ���� ������ ����
			k33_inData.k33_SetData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);			
		}																			//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d ��� : %f\n", 
					k33_i, k33_inData.k33_name[k33_i], k33_inData.k33_kor[k33_i], k33_inData.k33_eng[k33_i], k33_inData.k33_mat[k33_i], k33_inData.k33_sum[k33_i], k33_inData.k33_avg[k33_i]);
																					//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
		}
	}

}
