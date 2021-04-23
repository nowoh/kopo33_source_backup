package hw0421_Wed_ch6;

public class k33_ch6_2_변수와메소드2 {	
	/*
	 * MethodTest
	 */
	
	static int k33_iStatic; 				//클래스 내 전역 변수 static으로 선언
	
	public static void k33_add(int k33_i) {
		k33_iStatic++;
		k33_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", k33_i);
	}
	
	public static int k33_add2(int k33_i) {
		k33_iStatic++;
		k33_i++;
		System.out.printf("add메소드에서->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("add메소드에서->i=[%d]\n", k33_i);
		return k33_i;
	}
	
	public static void main(String[] args) {
		int k33_iMain;
		k33_iMain = 1;
		k33_iStatic = 1;
		
		System.out.printf("*************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");

		k33_add(k33_iMain);
		
		System.out.printf("*************************\n");
		System.out.printf("메소드호출전 메인에서->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("메소드호출전 메인에서->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");
		
		k33_iMain = k33_add2(k33_iMain);
		
		System.out.printf("*************************\n");
		System.out.printf("메소드 add2호출후 메인에서->iStatic=[%d]\n", k33_iStatic);
		System.out.printf("메소드 add2호출후 메인에서->iMain=[%d]\n", k33_iMain);
		System.out.printf("*************************\n");
	}
	
	
}
