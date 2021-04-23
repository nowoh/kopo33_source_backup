package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_5_ReportSheet_200 {

	public static void main(String[] args) {	//�����Լ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat ��ü ����
		Date date = new Date();												//Date ��ü ����
		
		int iPerson = 200;													//������ ���� ���� iPerson 200���� ����
		
		int korAcc = 0; int engAcc = 0; int matAcc = 0; int totalSumAcc = 0; double totalAvgAcc = 0;
														//��ü ����, ����, ����, ����, ����� �����ϴ� ��� ���� 0���� ����
		int pageNum = 1; int totalAcc = 0;				//������ ǥ���ϴ� pageNum�� 1�� �����ϰ�, ����� ��ȣ���� �������� count�ϴ� ���� totalAcc 0���� ����
		
		k33_ch6_9_6_InputData200 inData = new k33_ch6_9_6_InputData200(iPerson);
														//inData�� k33_ch6_9_6_InputData200(iPerson) ��ü ������ ������ ����
		for (int i = 0; i < iPerson; i++) {				//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String name = String.format("ȫ��%02d", i);	//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int kor = (int)(Math.random()*100);			//������ ���� kor�� 0~100������ ���� ������ ����
			int eng = (int)(Math.random()*100);			//������ ���� eng�� 0~100������ ���� ������ ����
			int mat = (int)(Math.random()*100);			//������ ���� mat�� 0~100������ ���� ������ ����
			inData.SetData(i, name, kor, eng, mat);			
		}												//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		
		for (int i = 0; i < iPerson; i += 30) {			//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 30�� �����ϸ� �ݺ�
														//30���� ������ ����ϱ� ����
			System.out.printf("%25s\n\n", "��������ǥ");	//���ڿ� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
			System.out.printf("%-4s%-11d%9s%s\n", "PAGE : ", pageNum, "������� : ", sdf.format(date));		//count�� pageNum�� ��¥ ���
			System.out.printf("==================================================\n");						//���ڿ� ===���
			System.out.printf("%-4s%-6s%-6s%-6s%-6s%-6s%-6s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
																							//���ڿ� 8�� ���� ������ ���ڸ�ŭ �ڸ� Ȯ���ϰ� ���������Ͽ� ���					
			System.out.printf("==================================================\n");		//���ڿ� ===���
			
			int korSum = 0; int engSum = 0; int matSum = 0; int totalSum = 0; double totalAvg = 0;
																//�� ���������� ��µǴ� ����, ����, ����, ����, ��� ������ �����ϴ� ���� ��� 0���� ����
																//���� for���� ���ư��� ���� ���� for���� �ٽ� ������ �� �ʱ�ȭ���ֱ� ���� ù ��° for�� �ȿ��� ����
			int pageCnt = 0; 									//�� ������ �ȿ��� ��µǴ� ��ȣ�� ���� count�ϴ� ���� pageCnt�� 0���� ����
			
			try {												//��µǴ� ��ȣ�� ���� i+30���� �۾Ƶ� ������ ��µ� �� �ֵ��� try �ɾ���
				for (int j = i; j < i+30; j++) {				//�ݺ��� ������ ���� j�� i�̰�, j�� i+30������ 1�� �����ϸ� �ݺ�
					System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
							j+1, inData.name[j], inData.kor[j], inData.eng[j], inData.mat[j], inData.sum[j], inData.avg[j]);
																//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
					korSum += inData.kor[i];					//���ǵ� kor ���� korSum�� ����
					engSum += inData.eng[i];					//���ǵ� eng ���� engSum�� ����
					matSum += inData.mat[i];					//���ǵ� mat ���� matSum�� ����
					totalSum += inData.sum[i];					//���ǵ� sum ���� totalSum�� ����
					totalAvg += inData.avg[i];					//���ǵ� avg ���� totalAvg�� ����
																//���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǹ� �ʱ�ȭ��
					korAcc += inData.kor[j];					//���ǵ� kor ���� korAcc�� ����								
					engAcc += inData.eng[j];					//���ǵ� eng ���� engAcc�� ����
					matAcc += inData.mat[j];					//���ǵ� mat ���� matAcc�� ����
					totalSumAcc += inData.sum[j];				//���ǵ� sum ���� totalSumAcc�� ����
					totalAvgAcc += inData.avg[j];				//���ǵ� avg ���� totalAvgAcc�� ����
																//���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǿ ��� ����
					pageCnt++;									//pageCnt�� 1 ���� (���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǹ� �ʱ�ȭ��)
					totalAcc++;									//totalAcc�� 1 ����
				}
			} catch (Exception e) {								//try - catch
				
			}
			System.out.printf("==================================================\n");				//���ڿ� ===���
			System.out.printf("%s\n", "����������");												//"����������" ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", korSum, engSum, matSum, totalSum, totalAvg);
																									//������ korSum, engSum, matSum, totalSum, totalAvg ���		
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "���", korSum/pageCnt, engSum/pageCnt, matSum/pageCnt, totalSum/pageCnt, totalAvg/pageCnt);
																									//������ korSum, engSum, matSum, totalSum, totalAvg��
																									//count�� pageCnt�� ���� ��� ���Ѵ��� ���
			System.out.printf("==================================================\n");				//���ڿ� ===���
			System.out.printf("%s\n", "����������");												//"����������" ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", korAcc, engAcc, matAcc, totalSumAcc, totalAvgAcc);
																									//�� ���� ����, ����, ����, ����, ��� ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n\n", "���", korAcc/totalAcc, engAcc/totalAcc, 
					matAcc/totalAcc, totalSumAcc/totalAcc, totalAvgAcc/totalAcc);
																									//�� ������ ����, ����, ����, ����, ����� 
																									//count�� totalAcc�� ���� ��� ���Ѵ��� ���
			pageNum++;																				//������ ���� ���ϴ� pageNum�� 1 ����
		}
	}
}
