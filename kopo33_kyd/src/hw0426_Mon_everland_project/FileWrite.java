package hw0426_Mon_everland_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWrite {
	File file = new File(FixedValue.SAVE_ROUTE);
	private FileWriter fw;
	private FileOutputStream fo;
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	
	//��� ����
	public void headerWrite() throws IOException {
		if(file.exists() == false) {
			fo = new FileOutputStream(file, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "��¥," + "����," + "���ɱ���," + "����," + "����," + "������";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	
	//�ֹ� ���� ���Ϸ� ���
	public void orderFilePrint(int totalPrice, int position, int orderList[][]) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		
		FileWriter fw = new FileWriter(FixedValue.SAVE_ROUTE, true);

		
		for (int i = 0; i < position; i++) {
			//filePosition++;
			
			fw.write(sdf.format(date) + ",");
			
			switch(orderList[i][0]) {
				case 1 :
					fw.write("�ְ���,");
					break;
				case 2 :
					fw.write("�߰���,");
					break;
				default :
					break;
			}
			
			if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.BABY) {
				fw.write("��  ��,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.CHILD) {
				fw.write("���,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.TEEN) {
				fw.write("û�ҳ�,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.ADULT) {
				fw.write("��  ��,");
			} else {
				fw.write("��  ��,");
			}
			
			fw.write(orderList[i][2] + ",");
			fw.write(orderList[i][3] + ",");
			
			switch(orderList[i][4]) {
				case 1 :
					fw.write("����\n");
					break;
				case 2 :
					fw.write("�����\n");
					break;
				case 3 :
					fw.write("����������\n");
					break;
				case 4 :
					fw.write("���ڳ�\n");
					break;
				case 5 :
					fw.write("�ӻ��\n");
					break;
				default :
					break;
			}
			
		}
		fw.close();

	}
}
