package hw0421_Wed_ch6;

public class k33_ch6_5_6_AvgMain {
	/*
	 * �޼ҵ� �����ε�
	 */
	public static void main(String[] args) {
		k33_ch6_5_5_ScoreAvg k33_sa = new k33_ch6_5_5_ScoreAvg();
		
		System.out.printf("%s\n", "3�� ����ǥ");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%5s\n", "�̸�", "����", "����", "����", "����", "���");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%7.1f\n\n", "������", 100, 100, 100, k33_sa.k33_sum(100, 100, 100), k33_sa.k33_avg(100, 100, 100));
		
		System.out.printf("%s\n", "4�� ����ǥ");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%3s%5s\n", "�̸�", "����", "����", "����", "����",  "����", "���");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%5d%7.1f\n\n", "������", 100, 100, 100, 100, k33_sa.k33_sum(100, 100, 100, 100), k33_sa.k33_avg(100, 100, 100, 100));
		
		System.out.printf("%s\n", "5�� ����ǥ");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%3s%3s%5s\n", "�̸�", "����", "����", "����", "����", "��ȸ", "����", "���");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%5d%5d%7.1f\n\n", "������", 100, 100, 100, 100, 100, k33_sa.k33_sum(100, 100, 100, 100, 100), k33_sa.k33_avg(100, 100, 100, 100, 100));
		
	}

}
