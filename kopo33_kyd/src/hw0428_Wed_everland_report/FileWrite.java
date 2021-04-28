package hw0428_Wed_everland_report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import hw0426_Mon_everland_project.FixedValue;

public class FileWrite {
	File file1 = new File(Value.SAVE_ROUTE1);
	File file2 = new File(Value.SAVE_ROUTE2);
	File file3 = new File(Value.SAVE_ROUTE3);
	private FileWriter fw;
	private FileOutputStream fo;
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	
	//���ں� ���� ��� ����
	public void dateHeader() throws IOException {
		if(file1.exists() == false) {
			fo = new FileOutputStream(file1, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "����," + "�� ����";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	//������ ���� ��� ����
	public void day_night_Header() throws IOException {
		if(file2.exists() == false) {
			fo = new FileOutputStream(file2, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "����," + "�ְ���," + "�߰���";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	//���Ǻ� ���� ��� ����
	public void discountHeader() throws IOException {
		if(file3.exists() == false) {
			fo = new FileOutputStream(file3, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "����," + "�Ǹż�";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	
	//���ں� ���� ����
	public void dateWrite(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE1, true);
		for (int i = 0; i < vl.dateArr.size(); i++) {
			fw.write(vl.dateArr.get(i) + "," + vl.dateArrSales.get(i) + "\n");
		}
		fw.close();
	}
	
	//������ ���� ����
	public void day_night_Write(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE2, true);
		fw.write("����," + vl.dayBaby + "," + vl.nightBaby + "\n");
		fw.write("���," + vl.dayChild + "," + vl.nightChild + "\n");
		fw.write("û�ҳ�," + vl.dayTeen + "," + vl.nightTeen + "\n");
		fw.write("�," + vl.dayAdult + "," + vl.nightTeen + "\n");
		fw.write("����," + vl.dayOld + "," + vl.nightOld + "\n");
		fw.write("�հ�," + vl.day + "," + vl.night + "\n");
		fw.write("����," + vl.daySales + "," + vl.nightSales + "\n");
		fw.close();
	}
	
	//���Ǻ� ���� ����
	public void discountWrite(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE3, true);
		fw.write("�� �Ǹ� Ƽ�� ��," + vl.totalcnt + "\n");
		fw.write("��� ����," + vl.none + "\n");
		fw.write("�����," + vl.disable + "\n");
		fw.write("����������," + vl.merit + "\n");
		fw.write("���ڳ�," + vl.multichild + "\n");
		fw.write("�ӻ��," + vl.pregnant + "\n");
		fw.close();
	}
}
