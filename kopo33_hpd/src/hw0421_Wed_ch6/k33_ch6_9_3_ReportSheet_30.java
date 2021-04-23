package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_3_ReportSheet_30 {

	public static void main(String[] args) {		//�����Լ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat ��ü ����
		Date date = new Date();												//Date ��ü ����
		
		int iPerson = 30;							//������ ���� ���� iPerson 30���� ����
		int korSum = 0; int engSum = 0; int matSum = 0; int totalSum = 0; double totalAvg = 0;
													//����, ����, ����, ����, ��� �հ踦 ������ ������ ��� 0���� ����
		k33_ch6_9_4_InputData30 inData = new k33_ch6_9_4_InputData30(iPerson);
													//inData�� k33_ch6_9_4_InputData30(iPerson) ��ü ������ ������ ����
		for (int i = 0; i < iPerson; i++) {					//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String name = String.format("ȫ��%02d", i);		//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int kor = (int)(Math.random()*100);				//������ ���� kor�� 0~100������ ���� ������ ����
			int eng = (int)(Math.random()*100);				//������ ���� eng�� 0~100������ ���� ������ ����
			int mat = (int)(Math.random()*100);				//������ ���� mat�� 0~100������ ���� ������ ����
			inData.SetData(i, name, kor, eng, mat);			
		}							//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		System.out.printf("%25s\n\n", "��������ǥ");		//���ڿ� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%27s%s\n", "������� : ", sdf.format(date));	//���ڿ� 2�� 27�ڸ� Ȯ���ϰ� �������� & ��¥ ���ڿ��� ��ȯ �� ���
		System.out.printf("==================================================\n");	//���ڿ� ===���
		System.out.printf("%-5s%-6s%-6s%-6s%-6s%-6s%-6s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
																	//���ڿ� 8�� ���� ������ ���ڸ�ŭ �ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("==================================================\n");	//���ڿ� ===���
		for (int i = 0; i < iPerson; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
					i+1, inData.name[i], inData.kor[i], inData.eng[i], inData.mat[i], inData.sum[i], inData.avg[i]);
																	//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
			korSum += inData.kor[i];								//���ǵ� kor ���� korSum�� ����
			engSum += inData.eng[i];								//���ǵ� eng ���� engSum�� ����
			matSum += inData.mat[i];								//���ǵ� mat ���� matSum�� ����
			totalSum += inData.sum[i];								//���ǵ� sum ���� totalSum�� ����
			totalAvg += inData.avg[i];								//���ǵ� avg ���� totalAvg�� ����
		}
		System.out.printf("==================================================\n");	//���ڿ� ===���
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", korSum, engSum, matSum, totalSum, totalAvg);
																	//������ korSum, engSum, matSum, totalSum, totalAvg ���
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "���", korSum/iPerson, engSum/iPerson, 
				matSum/iPerson, totalSum/iPerson, totalAvg/iPerson);
																	//������ korSum, engSum, matSum, totalSum, totalAvg��
																	//iPerson���� ������ ��� ���Ѵ��� ���
	}

}
