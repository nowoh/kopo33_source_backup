package hw0421_Wed_ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class k33_ch6_9_5_ReportSheet_200 {

	public static void main(String[] args) {	//�����Լ�
		SimpleDateFormat k33_k33_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat ��ü ����
		Date k33_date = new Date();													//Date ��ü ����
		
		int k33_iPerson = 200;														//������ ���� ���� iPerson 200���� ����
		
		int k33_korAcc = 0; int k33_engAcc = 0; int k33_matAcc = 0; int k33_totalSumAcc = 0; double k33_totalAvgAcc = 0;
																//��ü ����, ����, ����, ����, ����� �����ϴ� ��� ���� 0���� ����
		int k33_pageNum = 1; int k33_totalAcc = 0;				//������ ǥ���ϴ� pageNum�� 1�� �����ϰ�, ����� ��ȣ���� �������� count�ϴ� ���� totalAcc 0���� ����
		
		k33_ch6_9_6_InputData200 k33_inData = new k33_ch6_9_6_InputData200(k33_iPerson);
																		//inData�� k33_ch6_9_6_InputData200(iPerson) ��ü ������ ������ ����
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {				//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String k33_name = String.format("ȫ��%02d", k33_i);			//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int k33_kor = (int)(Math.random()*100);						//������ ���� kor�� 0~100������ ���� ������ ����
			int k33_eng = (int)(Math.random()*100);						//������ ���� eng�� 0~100������ ���� ������ ����
			int k33_mat = (int)(Math.random()*100);						//������ ���� mat�� 0~100������ ���� ������ ����
			k33_inData.k33_SetData(k33_i, k33_name, k33_kor, k33_eng, k33_mat);			
		}																//���ǵ� name,kor,eng,mat�� k33_ch6_9_2_InputData Ŭ������ SetData�޼ҵ��� ���ڷ� �־ ����
		
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i += 30) {			//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 30�� �����ϸ� �ݺ�
																		//30���� ������ ����ϱ� ����
			System.out.printf("%25s\n\n", "��������ǥ");				//���ڿ� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
			System.out.printf("%-4s%-11d%9s%s\n", "PAGE : ", k33_pageNum, "������� : ", k33_k33_sdf.format(k33_date));		//count�� pageNum�� ��¥ ���
			System.out.printf("==================================================\n");										//���ڿ� ===���
			System.out.printf("%-4s%-6s%-6s%-6s%-6s%-6s%-6s\n", "��ȣ", "�̸�", "����", "����", "����", "����", "���");
																							//���ڿ� 8�� ���� ������ ���ڸ�ŭ �ڸ� Ȯ���ϰ� ���������Ͽ� ���					
			System.out.printf("==================================================\n");		//���ڿ� ===���
			
			int k33_korSum = 0; int k33_engSum = 0; int k33_matSum = 0; int k33_totalSum = 0; double k33_totalAvg = 0;
																		//�� ���������� ��µǴ� ����, ����, ����, ����, ��� ������ �����ϴ� ���� ��� 0���� ����
																		//���� for���� ���ư��� ���� ���� for���� �ٽ� ������ �� �ʱ�ȭ���ֱ� ���� ù ��° for�� �ȿ��� ����
			int k33_pageCnt = 0; 										//�� ������ �ȿ��� ��µǴ� ��ȣ�� ���� count�ϴ� ���� pageCnt�� 0���� ����
				
			try {														//��µǴ� ��ȣ�� ���� i+30���� �۾Ƶ� ������ ��µ� �� �ֵ��� try �ɾ���
				for (int k33_j = k33_i; k33_j < k33_i+30; k33_j++) {	//�ݺ��� ������ ���� j�� i�̰�, j�� i+30������ 1�� �����ϸ� �ݺ�
					System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", 
							k33_j+1, k33_inData.k33_name[k33_j], k33_inData.k33_kor[k33_j], k33_inData.k33_eng[k33_j], k33_inData.k33_mat[k33_j], k33_inData.k33_sum[k33_j], k33_inData.k33_avg[k33_j]);
																			//��ȣ�� �̸� ���� ���� ���� ���� ����� ���ʴ�� ���
					k33_korSum += k33_inData.k33_kor[k33_i];					//���ǵ� kor ���� korSum�� ����
					k33_engSum += k33_inData.k33_eng[k33_i];					//���ǵ� eng ���� engSum�� ����
					k33_matSum += k33_inData.k33_mat[k33_i];					//���ǵ� mat ���� matSum�� ����
					k33_totalSum += k33_inData.k33_sum[k33_i];					//���ǵ� sum ���� totalSum�� ����
					k33_totalAvg += k33_inData.k33_avg[k33_i];					//���ǵ� avg ���� totalAvg�� ����
																			//���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǹ� �ʱ�ȭ��
					k33_korAcc += k33_inData.k33_kor[k33_j];					//���ǵ� kor ���� korAcc�� ����								
					k33_engAcc += k33_inData.k33_eng[k33_j];					//���ǵ� eng ���� engAcc�� ����
					k33_matAcc += k33_inData.k33_mat[k33_j];					//���ǵ� mat ���� matAcc�� ����
					k33_totalSumAcc += k33_inData.k33_sum[k33_j];				//���ǵ� sum ���� totalSumAcc�� ����
					k33_totalAvgAcc += k33_inData.k33_avg[k33_j];				//���ǵ� avg ���� totalAvgAcc�� ����
																			//���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǿ ��� ����
					k33_pageCnt++;											//pageCnt�� 1 ���� (���� �ݺ��� ������ ���ο� �ݺ��� ���۵Ǹ� �ʱ�ȭ��)
					k33_totalAcc++;											//totalAcc�� 1 ����
				}
			} catch (Exception k33_e) {										//try - catch
				
			}
			System.out.printf("==================================================\n");				//���ڿ� ===���
			System.out.printf("%s\n", "����������");												//"����������" ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", k33_korSum, k33_engSum, k33_matSum, k33_totalSum, k33_totalAvg);
																									//������ korSum, engSum, matSum, totalSum, totalAvg ���		
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "���", k33_korSum/k33_pageCnt, k33_engSum/k33_pageCnt, k33_matSum/k33_pageCnt, k33_totalSum/k33_pageCnt, k33_totalAvg/k33_pageCnt);
																									//������ korSum, engSum, matSum, totalSum, totalAvg��
																									//count�� pageCnt�� ���� ��� ���Ѵ��� ���
			System.out.printf("==================================================\n");				//���ڿ� ===���
			System.out.printf("%s\n", "����������");												//"����������" ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "�հ�", k33_korAcc, k33_engAcc, k33_matAcc, k33_totalSumAcc, k33_totalAvgAcc);
																									//�� ���� ����, ����, ����, ����, ��� ���
			System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n\n", "���", k33_korAcc/k33_totalAcc, k33_engAcc/k33_totalAcc, 
					k33_matAcc/k33_totalAcc, k33_totalSumAcc/k33_totalAcc, k33_totalAvgAcc/k33_totalAcc);
																									//�� ������ ����, ����, ����, ����, ����� 
																									//count�� totalAcc�� ���� ��� ���Ѵ��� ���
			k33_pageNum++;																			//������ ���� ���ϴ� pageNum�� 1 ����
		}
	}
}
