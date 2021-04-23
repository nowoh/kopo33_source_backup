package hw0421_Wed_ch6;

public class k33_ch6_4_2_mytest { 
	/*
	 * 클래스, 객체, 인스턴스
	 */
	private static int k33_inVal;
	public static void k33_up() {
		k33_inVal++;
		System.out.printf("난 그냥 메소드[%d]\n", k33_inVal);
	}
	public static void main(String[] args) {
		k33_inVal = 0;
		k33_ch6_4_1_Elevater k33_elev;
		
		k33_elev = new k33_ch6_4_1_Elevater();
		
		k33_up();
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_elev.k33_up();
			
			System.out.printf("MSG [%s]\n", k33_elev.k33_help);
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_elev.k33_down();
			
			System.out.printf("MSG [%s]\n", k33_elev.k33_help);
		}
	}

}
