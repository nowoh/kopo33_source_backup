package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_3_ReportSheet_30 {

	public static void main(String[] args) {		//�����Լ�
		SimpleDateFormat k33_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat ��ü ����
		Date k33_date = new Date();												//Date ��ü ����
		
		int k33_iPerson = 30;													//������ ���� ���� iPerson 30���� ����
		int k33_korSum = 0; int k33_engSum = 0; int k33_matSum = 0; int k33_totalSum = 0; double k33_totalAvg = 0;
																				//����, ����, ����, ����, ��� �հ踦 ������ ������ ��� 0���� ����
		k33_ch6_9_4_InputData30 k33_inData = new k33_ch6_9_4_InputData30(k33_iPerson);
																				//inData�� k33_ch6_9_4_InputData30(iPerson) ��ü ������ ������ ����
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String k33_name = String.format("ȫ��%02d", k33_i);					//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int k33_kor = (int)(Math.random()*100);								//������ ���� kor�� 0~100������ ���� ������ ����
			int k33_eng = (int)(Math.random()*100);								//������ ���� eng�� 0~100������ ���� ������ ����
			int k33_mat = (int)(Math.random()*100);								//������ ���� mat�� 0~100������ ���� ������ ����
			k33_inData.SetData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);			
		}																		//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		System.out.printf("%25s\n\n", "��������ǥ");							//���ڿ� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%27s%s\n", "������� : ", k33_sdf.format(k33_date));	//���ڿ� 2�� 27�ڸ� Ȯ���ϰ� �������� & ��¥ ���ڿ��� ��ȯ �� ���
		System.out.printf("==================================================\n");		//���ڿ� ===���
		System.out.printf("%-5s%-6s%-6s%-6s%-6s%-6s%-6s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
																						//���ڿ� 8�� ���� ������ ���ڸ�ŭ �ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("==================================================\n");		//���ڿ� ===���
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {								//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
					k33_i+1, k33_inData.name[k33_i], k33_inData.kor[k33_i], k33_inData.eng[k33_i], k33_inData.mat[k33_i], k33_inData.sum[k33_i], k33_inData.avg[k33_i]);
																					//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
			k33_korSum += k33_inData.kor[k33_i];									//���ǵ� kor ���� korSum�� ����
			k33_engSum += k33_inData.eng[k33_i];									//���ǵ� eng ���� engSum�� ����
			k33_matSum += k33_inData.mat[k33_i];									//���ǵ� mat ���� matSum�� ����
			k33_totalSum += k33_inData.sum[k33_i];									//���ǵ� sum ���� totalSum�� ����
			k33_totalAvg += k33_inData.avg[k33_i];									//���ǵ� avg ���� totalAvg�� ����
		}
		System.out.printf("==================================================\n");	//���ڿ� ===���
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", k33_korSum, k33_engSum, k33_matSum, k33_totalSum, k33_totalAvg);
																					//������ korSum, engSum, matSum, totalSum, totalAvg ���
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "���", k33_korSum/k33_iPerson, k33_engSum/k33_iPerson, 
				k33_matSum/k33_iPerson, k33_totalSum/k33_iPerson, k33_totalAvg/k33_iPerson);
																					//������ korSum, engSum, matSum, totalSum, totalAvg��
																					//iPerson���� ������ ��� ���Ѵ��� ���
	}

}
