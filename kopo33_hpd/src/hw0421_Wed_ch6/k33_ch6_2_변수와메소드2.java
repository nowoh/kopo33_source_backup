package hw0421_Wed_ch6;

public class k33_ch6_2_�����͸޼ҵ�2 {	
	/*
	 * MethodTest
	 */
	
	static int k33_iStatic; 				//Ŭ���� �� ���� ���� static���� ����
	
	public static void k33_add(int k33_i) {
		k33_iStatic++;
		k33_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k33_i);
	}
	
	public static int k33_add2(int k33_i) {
		k33_iStatic++;
		k33_i++;
		System.out.printf("add�޼ҵ忡��->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("add�޼ҵ忡��->i=[%d]\n", k33_i);
		return k33_i;
	}
	
	public static void main(String[] args) {
		int k33_iMain;
		k33_iMain = 1;
		k33_iStatic = 1;
		
		System.out.printf("*************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");

		k33_add(k33_iMain);
		
		System.out.printf("*************************\n");
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("�޼ҵ�ȣ���� ���ο���->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");
		
		k33_iMain = k33_add2(k33_iMain);
		
		System.out.printf("*************************\n");
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("�޼ҵ� add2ȣ���� ���ο���->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");
	}
	
	
}
