package hw0421_Wed_ch6;

public class k33_ch6_9_1_ReportSheet {	//��2

	public static void main(String[] args) {		//�����Լ�
		int iPerson = 10;							//������ ���� ���� iPerson�� 10���� ���� 
		
		k33_ch6_9_2_InputData inData = new k33_ch6_9_2_InputData(iPerson);	//k33_ch6_9_2_InputData Ŭ������ inData�� ��ü����
		
		for (int i = 0; i < iPerson; i++) {					//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String name = String.format("ȫ��%02d", i);		//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int kor = (int)(Math.random()*100);				//������ ���� kor�� 0~100������ ���� ������ ����
			int eng = (int)(Math.random()*100);				//������ ���� eng�� 0~100������ ���� ������ ����
			int mat = (int)(Math.random()*100);				//������ ���� mat�� 0~100������ ���� ������ ����
			inData.SetData(i, name, kor, eng, mat);			
		}							//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		
		for (int i = 0; i < iPerson; i++) {					//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			System.out.printf("��ȣ : %d, �̸� : %s, ���� : %d, ���� : %d, ���� : %d, ���� : %d ��� : %f\n", 
					i, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.avg[i]);
															//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
		}
	}

}
