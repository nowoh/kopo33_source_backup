package hw0421_Wed_ch6;

public class k33_ch6_9_6_InputData200 {
	String[] name;			//���ڿ� �迭 name ���������� ����
	int[] kor;				//������ �迭 kor ���������� ����
	int[] eng;				//������ �迭 eng ���������� ����
	int[] mat;				//������ �迭 mat ���������� ����
	int[] sum;				//������ �迭 sum ���������� ����
	double[] avg;			//�Ǽ��� �迭 avg ���������� ����
	
	k33_ch6_9_6_InputData200(int iPerson) {	//���ڷ� ������ ���� iPerson�� �޴� ������ ����
		name = new String[iPerson];			//�迭 name�� ũ�⸦ iPerson���� ����
		kor = new int[iPerson];				//�迭 kor�� ũ�⸦ iPerson���� ����
		eng = new int[iPerson];				//�迭 eng�� ũ�⸦ iPerson���� ����
		mat = new int[iPerson];				//�迭 mat�� ũ�⸦ iPerson���� ����
		sum = new int[iPerson];				//�迭 sum�� ũ�⸦ iPerson���� ����
		avg = new double[iPerson];			//�迭 avg�� ũ�⸦ iPerson���� ����
		
	}
	public void SetData(int i, String name, int kor, int eng, int mat) {	
									//���ϰ��� ���� ������ ���� 4���� ���ڿ� ���� 1���� ���ڷ� �޴� SetData �޼ҵ� ����
									//�迭�� �� ��Ҹ� �������ִ� �޼ҵ�
		this.name[i] = name;		//�迭 name�� i��° ��Ҹ� name���� ����
		this.kor[i] = kor;			//�迭 kor�� i��° ��Ҹ� kor�� ����
		this.eng[i] = eng;			//�迭 eng�� i��° ��Ҹ� eng���� ����
		this.mat[i] = mat;			//�迭 mat�� i��° ��Ҹ� mat���� ����
		this.sum[i] = kor + eng + mat;						//�迭 sum�� i��° ��Ҹ� kor + eng + mat���� ����
		this.avg[i] = (double) ((kor + eng + mat) / 3.0);	//�迭 avg�� i��° ��Ҹ� ((kor + eng + mat) / 3.0)���� ����
	}
}
