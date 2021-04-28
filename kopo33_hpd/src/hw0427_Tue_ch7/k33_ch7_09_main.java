package hw0427_Tue_ch7;

import java.util.ArrayList;

public class k33_ch7_09_main {		
	static ArrayList<k33_ch7_09_Class_ArrayList> k33_ArrayOneRec = new ArrayList <k33_ch7_09_Class_ArrayList>();
											//ArrayList�� Ŭ�������·� �޾Ƽ� �������� ���� �� ���� 
	static int k33_sumkor = 0;				//������ ���� sumkor�� 0���� ���� (��������)
	static int k33_sumeng = 0;				//������ ���� sumeng�� 0���� ���� (��������)
	static int k33_summat = 0;				//������ ���� summat�� 0���� ���� (��������)
	static int k33_sumsum = 0;				//������ ���� sumsum�� 0���� ���� (��������)
	static int k33_sumavg = 0;				//������ ���� sumavg�� 0���� ���� (��������)
	static final int k33_iPerson = 20;		//������ ���� iPerson�� 0���� ���� (��������, final�� �����Ͽ� ���� �Ұ�)
	
	public static void main(String[] args) {							//���� �Լ�
		k33_dataSet();													//dataSet �Լ� ����
		k33_HeaderPrint();												//HeaderPrint �Լ� ����
		for(int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i++) {	//�ݺ��� : ������ ���� i�� 0�̰�, i�� ArrayOneRecũ�� ������ 1�� �����ϸ� �ݺ�
			k33_ItemPrint(k33_i);										//ArrayOneRec �迭�� i��° ��� ItemPrint�� �°� ����ϱ�
		}
		k33_TailPrint();												//TailPrint �Լ� ����
	}
	
	public static void k33_dataSet() {									//�����͸� set�ϴ� �޼ҵ� dataSet ����
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {			//�ݺ��� : ������ ���� i�� 0�̰�, i�� iPerson������ 1�� �����ϸ� �ݺ�
			String k33_name = String.format("ȫ��%02d", k33_i);			//���ڿ� ���� name�� "ȫ��i"�� ���ڿ��� ��ȯ�� ������ ����
			int k33_kor = (int)(Math.random()*100);						//������ ���� kor�� 0~100������ ���� ������ ����
			int k33_eng = (int)(Math.random()*100);						//������ ���� eng�� 0~100������ ���� ������ ����
			int k33_mat = (int)(Math.random()*100);						//������ ���� mat�� 0~100������ ���� ������ ����
			k33_ArrayOneRec.add(new k33_ch7_09_Class_ArrayList(k33_i, k33_name, k33_kor, k33_eng, k33_mat)); 
		}									//ArrayOneRec �迭�� k33_ch7_09_Class_ArrayList Ŭ������ �޼ҵ� (set �Լ�) ���� ����
	}
	
	public static void k33_HeaderPrint() {										//head Ÿ��Ʋ�� ������ִ� �޼ҵ� HeaderPrint ����
		System.out.printf("*****************************************\n");		//���ڿ� ���
		System.out.printf("%2s %4s %2s %2s %2s  %2s    %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");
																				//Ÿ��Ʋ ���
		System.out.printf("*****************************************\n");		//���ڿ� ���
	}
	
	public static void k33_ItemPrint(int k33_i) {								//Item�� ��� �ϴ� �޼ҵ� ItemPrint ���� (integer�� ���ڷ� ����)
		k33_ch7_09_Class_ArrayList k33_rec;										//Class_ArrayList rec ����
		
		k33_rec = k33_ArrayOneRec.get(k33_i);									//ArrayOneRec�迭�� i��° ��Ҹ� rec���� ����
		System.out.printf("%3d %5s %3d %4d %5d   %3d  %6.2f\n", k33_rec.k33_student_id(), k33_rec.k33_name(),k33_rec.k33_kor(), k33_rec.k33_eng(), 
				k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_avg());
											//k33_ch7_07_classArray�� �޼ҵ�(get �Լ�) �����ͼ� �й�, �̸�, ���� ����, ���� ����, ���� ����, ����, ��� ���
		k33_sumkor += k33_rec.k33_kor();	//sumkor�� ���� ���� �����ϱ�
		k33_sumeng += k33_rec.k33_eng();	//sumeng�� ���� ���� �����ϱ�
		k33_summat += k33_rec.k33_mat();	//summat�� ���� ���� �����ϱ�
		k33_sumsum += k33_rec.k33_sum();	//sumsum�� ���� �����ϱ�
		k33_sumavg += k33_rec.k33_avg();	//sumavg�� ��� ���� �����ϱ�
	}
	
	public static void k33_TailPrint() {										//������ �հ� ��� ����ϴ� �޼ҵ� TailPrint ����
		System.out.printf("*****************************************\n");		//���ڿ� ���
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_sumkor, k33_sumkor / (double)k33_ArrayOneRec.size());	//������ ���� �հ�, ��� ���
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_sumeng, k33_sumeng / (double)k33_ArrayOneRec.size());	//������ ���� �հ�, ��� ���
		System.out.printf("�����հ� %6d   ������� : %6.2f\n", k33_summat, k33_summat / (double)k33_ArrayOneRec.size());	//������ ���� �հ�, ��� ���
		System.out.printf("*****************************************\n");													//���ڿ� ���
		System.out.printf("������հ� %4d   ����� : %6.2f\n", k33_sumavg, k33_sumavg / (double)k33_ArrayOneRec.size());	//������ ����� �հ�, ����� ���
	}
}
