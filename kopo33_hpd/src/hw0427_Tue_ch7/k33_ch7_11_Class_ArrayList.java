package hw0427_Tue_ch7;

public class k33_ch7_11_Class_ArrayList {
	
	private int k33_student_id;		//본 클래스에서만 접근 가능한 정수형 변수 student_id를 전역변수로 선언
	private String k33_name;		//본 클래스에서만 접근 가능한 문자열 name을 전역변수로 선언
	private int k33_kor;			//본 클래스에서만 접근 가능한 정수형 변수 kor을 전역변수로 선언
	private int k33_eng;			//본 클래스에서만 접근 가능한 정수형 변수 eng를 전역변수로 선언
	private int k33_mat;			//본 클래스에서만 접근 가능한 정수형 변수 mat을 전역변수로 선언
	
	public k33_ch7_11_Class_ArrayList(int k33_student_id, String k33_name, int k33_kor, int k33_eng, int k33_mat) {
		this.k33_student_id = k33_student_id;	//전역변수 student_id를 생성자의 인자 student_id로 정의 (set)
		this.k33_name = k33_name;				//전역변수 name을 생성자의 인자 name으로 정의 (set)
		this.k33_kor = k33_kor;					//전역변수 kor을 생성자의 인자 kor로 정의 (set)
		this.k33_eng = k33_eng;					//전역변수 eng를 생성자의 인자 eng로 정의 (set)
		this.k33_mat = k33_mat;					//전역변수 mat을 생성자의 인자 mat로 정의 (set)
	}
	
	public int k33_student_id() {return this.k33_student_id;};	//integer로 리턴값을 주는 메소드 student_id 정의 (get 함수)
	public String k33_name() {return this.k33_name;};			//문자열을 리턴값으로 주는 메소드 name 정의	(get 함수)
	public int k33_kor() {return this.k33_kor;};				//integer로 리턴값을 주는 메소드 kor 정의 (get 함수)
	public int k33_eng() {return this.k33_eng;};				//integer로 리턴값을 주는 메소드 eng 정의 (get 함수)
	public int k33_mat() {return this.k33_mat;};				//integer로 리턴값을 주는 메소드 mat 정의 (get 함수)
	public int k33_sum() {return this.k33_kor + this.k33_eng + this.k33_mat;};	//integer로 리턴값을 주는 메소드 sum 정의 (get 함수)
	public double k33_avg() {return this.k33_sum() / 3.0;};						//integer로 리턴값을 주는 메소드 avg 정의 (get 함수)
}
