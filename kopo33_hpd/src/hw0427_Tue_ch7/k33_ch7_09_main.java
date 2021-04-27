package hw0427_Tue_ch7;

import java.util.ArrayList;

public class k33_ch7_09_main {		//��2
	static ArrayList<k33_ch7_09_Class_ArrayList> k33_ArrayOneRec = new ArrayList <k33_ch7_09_Class_ArrayList>();
	
	static int k33_sumkor = 0;
	static int k33_sumeng = 0;
	static int k33_summat = 0;
	static int k33_sumsum = 0;
	static int k33_sumavg = 0;
	static final int k33_iPerson = 20;
	
	public static void main(String[] args) {
		k33_dataSet();
		k33_HeaderPrint();
		for(int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i++) {
			k33_ItemPrint(k33_i);
		}
		k33_TailPrint();
	}
	
	public static void k33_dataSet() {
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("ȫ��%02d", k33_i);
			int k33_kor = (int)(Math.random() * 100);
			int k33_eng = (int)(Math.random() * 100);
			int k33_mat = (int)(Math.random() * 100);
			k33_ArrayOneRec.add(new k33_ch7_09_Class_ArrayList(k33_i, k33_name, k33_kor, k33_eng, k33_mat));
		}
	}
	
	public static void k33_HeaderPrint() {
		System.out.printf("*****************************************\n");
		System.out.printf("%2s %4s %2s %2s %2s  %2s    %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
		System.out.printf("*****************************************\n");
	}
	
	public static void k33_ItemPrint(int i) {
		k33_ch7_09_Class_ArrayList k33_rec;
		
		k33_rec = k33_ArrayOneRec.get(i);
		System.out.printf("%3d %5s %3d %4d %5d   %3d  %6.2f\n", k33_rec.k33_student_id(), k33_rec.k33_name(),k33_rec.k33_kor(), k33_rec.k33_eng(), 
				k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_avg());
		
		k33_sumkor += k33_rec.k33_kor();
		k33_sumeng += k33_rec.k33_eng();
		k33_summat += k33_rec.k33_mat();
		k33_sumsum += k33_rec.k33_sum();
		k33_sumavg += k33_rec.k33_avg();
	}
	
	public static void k33_TailPrint() {
		System.out.printf("*****************************************\n");
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_sumkor, k33_sumkor / (double)k33_ArrayOneRec.size());
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_sumeng, k33_sumeng / (double)k33_ArrayOneRec.size());
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_summat, k33_summat / (double)k33_ArrayOneRec.size());
		System.out.printf("*****************************************\n");
		System.out.printf("������հ� %4d   ����� : %6.2f\n", k33_sumavg, k33_sumavg / (double)k33_ArrayOneRec.size());
	}
}
