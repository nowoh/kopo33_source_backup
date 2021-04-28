package hw0427_Tue_ch7;

public class k33_ch7_12_Class_ArrayList200 {		
	
	private int k33_student_id;
	private String k33_name;
	private int k33_kor;
	private int k33_eng;
	private int k33_mat;
	
	public k33_ch7_12_Class_ArrayList200(int k33_student_id, String k33_name, int k33_kor, int k33_eng, int k33_mat) {
		this.k33_student_id = k33_student_id;
		this.k33_name = k33_name;
		this.k33_kor = k33_kor;
		this.k33_eng = k33_eng;
		this.k33_mat = k33_mat;
	}
	
	public int k33_student_id() {return this.k33_student_id;};
	public String name() {return this.k33_name;};
	public int k33_kor() {return this.k33_kor;};
	public int k33_eng() {return this.k33_eng;};
	public int k33_mat() {return this.k33_mat;};
	public int k33_sum() {return this.k33_kor + this.k33_eng + this.k33_mat;};
	public double k33_avg() {return this.k33_sum() / 3.0;};
}
