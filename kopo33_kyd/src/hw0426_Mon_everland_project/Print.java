package hw0426_Mon_everland_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hw0422_Thu_exchange_project.CostValueClass;

public class Print {
	Scanner scan = null;
	Print() {
		scan = new Scanner(System.in);
	}
	protected void finalize() {
		scan.close();
	}
	
	//Ƽ�� ���� ���
	public void pricePrint(int priceResult) {
		System.out.printf("������ %s �� �Դϴ�.\n", priceResult);
		System.out.printf("�����մϴ�.\n");
	}
	
	//�ֹ� ���� ���
	public void orderPrint(int totalPrice, int position, int orderList[][]) {
		System.out.printf("Ƽ�� �߱��� �����մϴ�. �����մϴ�. \n");
		System.out.println();
		System.out.printf("===============��������===============\n");
		
		for (int index = 0; index < position; index++) {
			switch(orderList[index][0]) {
				case 1 : 
					System.out.printf("�ְ��� ");
					break;
				case 2 : 
					System.out.printf("�߰��� ");
					break;
				default : 
					break;
			}
			
			if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.BABY) {
				System.out.printf("��  �� ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.CHILD) {
				System.out.printf("��� ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.TEEN) {
				System.out.printf("û�ҳ� ");
			} else if (CalPrice.calcAgeGroup(orderList[index][1]) == FixedValue.ADULT) {
				System.out.printf("��  �� ");
			} else {
				System.out.printf("��  �� ");
			}
			
			System.out.printf("X %3d", orderList[index][2]);
			System.out.printf("%8d  ", orderList[index][3]);
			
			switch(orderList[index][4]) {
			case 1 :
				System.out.printf("*������� ����\n");
				break;
			case 2 :
				System.out.printf("*����� �������\n");
				break;
			case 3 : 
				System.out.printf("*���� ������ �������\n");
				break;
			case 4 :
				System.out.printf("*���ڳ� �������\n");
				break;
			case 5 :
				System.out.printf("*�ӻ�� �������\n");
				break;
			default : 
				break;
			}
		}
		System.out.println();
		System.out.printf("����� �Ѿ��� %d �� �Դϴ�.\n", totalPrice);
		System.out.printf("======================================\n");
		System.out.println();
	}
	
	//�̾ �ֹ� or �ֹ� ���� ��� �� ����
	public int orderContinue() {
		int continueNumber = 0;
		
		System.out.printf("��� �߱� �Ͻðڽ��ϱ�?\n");
		System.out.printf("1. Ƽ�� �߱�\n");
		System.out.printf("2. ����\n");
		
		while(true) {
			continueNumber = scan.nextInt();
			
			if(continueNumber == 1 || continueNumber == 2) {
				break;
			} else {
				System.out.printf("%s", FixedValue.ERROR_MSG);
			}
		}
		return continueNumber;
	}
	
	
	
	
	
	
	

}
