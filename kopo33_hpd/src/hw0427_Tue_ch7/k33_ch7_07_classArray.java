package hw0427_Tue_ch7;

public class k33_ch7_07_classArray {
	
	private String k33_name;		//�� Ŭ���������� ���� ������ ���ڿ� name�� ���������� ����
	private int k33_kor;			//�� Ŭ���������� ���� ������ ������ ���� kor�� ���������� ����
	private int k33_eng;			//�� Ŭ���������� ���� ������ ������ ���� eng�� ���������� ����
	private int k33_mat;			//�� Ŭ���������� ���� ������ ������ ���� mat�� ���������� ����
	
	public k33_ch7_07_classArray(String k33_name, int k33_kor, int k33_eng, int k33_mat) {	//4���� ���ڸ� �޴� ������ ����
		this.k33_name = k33_name;		//�������� name�� �������� ���� name���� ���� (set)
		this.k33_kor = k33_kor;			//�������� kor�� �������� ���� kor�� ���� (set)
		this.k33_eng = k33_eng;			//�������� eng�� �������� ���� eng�� ���� (set)
		this.k33_mat = k33_mat;			//�������� mat�� �������� ���� mat�� ���� (set)
	}
	//public���� Ŭ���� �ۿ����� ���� �����ϵ��� ��
	public String k33_name() {return this.k33_name;};	//���ڿ��� ���ϰ����� �ִ� �޼ҵ� name ����	(get �Լ�)
	public int k33_kor() {return this.k33_kor;};		//integer�� ���ϰ��� �ִ� �޼ҵ� kor ���� (get �Լ�)
	public int k33_eng() {return this.k33_eng;};		//integer�� ���ϰ��� �ִ� �޼ҵ� eng ���� (get �Լ�)
	public int k33_mat() {return this.k33_mat;};		//integer�� ���ϰ��� �ִ� �޼ҵ� mat ���� (get �Լ�)
	public int k33_sum() {return this.k33_kor + this.k33_eng + this.k33_mat;};	//integer�� ���ϰ��� �ִ� �޼ҵ� sum ���� (get �Լ�)
	public double k33_avg() {return this.k33_sum() / 3.0;};						//integer�� ���ϰ��� �ִ� �޼ҵ� avg ���� (get �Լ�)
}
