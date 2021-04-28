package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Print {
	
	public static void printCsv(Value vl) throws IOException {
		vl.br = new BufferedReader(new FileReader(vl.SAVE_ROUTE));
		
		String line;
		System.out.println("====================report.csv====================");
		if ((line = vl.br.readLine()) != null) {
			System.out.printf("%4s%6s%5s%3s%5s  %-10s\n", "��¥", "����", "���ɱ���", "����", "����", "������" );
		}
		
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] !=null) {
				//�־߰� ����
				if (vl.orderList[i][1].equals("�ְ���")) {
					vl.orderList[i][1] = vl.DAY;
				} else if (vl.orderList[i][1].equals("�߰���")) {
					vl.orderList[i][1] = vl.NIGHT;
				}
				//���ɱ���
				if (vl.orderList[i][2].equals("��  ��")) {
					vl.orderList[i][2] = vl.BABY;
				} else if (vl.orderList[i][2].equals("���")) {
					vl.orderList[i][2] = vl.CHILD;
				} else if (vl.orderList[i][2].equals("û�ҳ�")) {
					vl.orderList[i][2] = vl.TEEN;
				} else if (vl.orderList[i][2].equals("��  ��")) {
					vl.orderList[i][2] = vl.ADULT;
				} else if (vl.orderList[i][2].equals("��  ��")) {
					vl.orderList[i][2] = vl.OLD;
				}
				//������ ����
				if (vl.orderList[i][5].equals("����")) {
					vl.orderList[i][5] = vl.TYPE_NONE;
				} else if (vl.orderList[i][5].equals("�����")) {
					vl.orderList[i][5] = vl.TYPE_DISABLE;
				} else if (vl.orderList[i][5].equals("����������")) {
					vl.orderList[i][5] = vl.TYPE_MERIT;
				} else if (vl.orderList[i][5].equals("���ڳ�")) {
					vl.orderList[i][5] = vl.TYPE_MULTICHILD;
				} else if (vl.orderList[i][5].equals("�ӻ��")) {
					vl.orderList[i][5] = vl.TYPE_PREGNANT;
				}
				System.out.printf("%-10s%4s%6s%7s%8s%9s\n", vl.orderList[i][0], vl.orderList[i][1], vl.orderList[i][2],
						vl.orderList[i][3], vl.orderList[i][4], vl.orderList[i][5]);
				
			}
		}
		System.out.println("--------------------------------------------------\n");
	}
	//������ ���
	public static void day_night_print(Value vl) {
		System.out.println("=====================������ �Ǹ���Ȳ=====================");
		System.out.printf("�ְ��� �� %d��\n", vl.day);
		System.out.printf("���� %2d��, ��� %2d��, û�ҳ� %2d��, � %2d��, ���� %2d��\n", 
				vl.dayBaby, vl.dayChild, vl.dayTeen, vl.dayAdult, vl.dayOld);
		System.out.printf("�ְ��� ���� : %d��\n\n\n", vl.daySales);
		System.out.printf("�߰��� �� %d��\n", vl.night);
		System.out.printf("���� %2d��, ��� %2d��, û�ҳ� %2d��, � %2d��, ���� %2d��\n", 
				vl.nightBaby, vl.nightChild, vl.nightTeen, vl.nightAdult, vl.nightOld);
		System.out.printf("�߰��� ���� : %d��\n", vl.nightSales);
		System.out.println("---------------------------------------------------------\n\n");
	}
	
	//���ں� ���
	public static void date_analysis_print(Value vl) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		System.out.println("========���ں� ���� ��Ȳ========");
		for (int i = 0; i < vl.dateArr.size(); i++) {
			System.out.printf("%s : �� ���� %10s��\n", vl.dateArr.get(i), vl.dateArrSales.get(i));
		}
		System.out.println("--------------------------------\n");
	}
	
	//���Ǻ� ���
	public static void discount_print(Value vl) {
		System.out.println("======���� �Ǹ� ��Ȳ======");
		System.out.printf("%-11s : %5d��\n", "�� �Ǹ� Ƽ�� ��", vl.totalcnt);
		System.out.printf("%-13s : %5d��\n", "��� ����", vl.none);
		System.out.printf("%-14s : %5d��\n", "�����", vl.disable);
		System.out.printf("%-12s : %5d��\n", "����������", vl.merit);
		System.out.printf("%-14s : %5d��\n", "���ڳ�", vl.multichild);
		System.out.printf("%-14s : %5d��\n", "�ӻ��", vl.pregnant);
		System.out.println("----------------------------\n");
		
	}
	
}
