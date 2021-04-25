package hw0421_Wed_ch6;

public class k33_ch6_9_4_InputData30 {	
	String[] k33_name;			//���ڿ� �迭 name ���������� ����
	int[] k33_kor;				//������ �迭 kor ���������� ����
	int[] k33_eng;				//������ �迭 eng ���������� ����
	int[] k33_mat;				//������ �迭 mat ���������� ����
	int[] k33_sum;				//������ �迭 sum ���������� ����
	double[] k33_avg;			//�Ǽ��� �迭 avg ���������� ����
	
	k33_ch6_9_4_InputData30(int k33_iPerson) {		//���ڷ� ������ ���� iPerson�� �޴� ������ ����
		k33_name = new String[k33_iPerson];			//�迭 name�� ũ�⸦ iPerson���� ����
		k33_kor = new int[k33_iPerson];				//�迭 kor�� ũ�⸦ iPerson���� ����
		k33_eng = new int[k33_iPerson];				//�迭 eng�� ũ�⸦ iPerson���� ����
		k33_mat = new int[k33_iPerson];				//�迭 mat�� ũ�⸦ iPerson���� ����
		k33_sum = new int[k33_iPerson];				//�迭 sum�� ũ�⸦ iPerson���� ����
		k33_avg = new double[k33_iPerson];			//�迭 avg�� ũ�⸦ iPerson���� ����
		
	}
	public void k33_SetData(int k33_i, String k33_name, int k33_kor, int k33_eng, int k33_mat) {	
												//���ϰ��� ���� ������ ���� 4���� ���ڿ� ���� 1���� ���ڷ� �޴� SetData �޼ҵ� ����
												//�迭�� �� ��Ҹ� �������ִ� �޼ҵ�
		this.k33_name[k33_i] = k33_name;		//�迭 name�� i��° ��Ҹ� name���� ����
		this.k33_kor[k33_i] = k33_kor;			//�迭 kor�� i��° ��Ҹ� kor�� ����
		this.k33_eng[k33_i] = k33_eng;			//�迭 eng�� i��° ��Ҹ� eng���� ����
		this.k33_mat[k33_i] = k33_mat;			//�迭 mat�� i��° ��Ҹ� mat���� ����
		this.k33_sum[k33_i] = k33_kor + k33_eng + k33_mat;						//�迭 sum�� i��° ��Ҹ� kor + eng + mat���� ����
		this.k33_avg[k33_i] = (double) ((k33_kor + k33_eng + k33_mat) / 3.0);	//�迭 avg�� i��° ��Ҹ� ((kor + eng + mat) / 3.0)���� ����
	}
}