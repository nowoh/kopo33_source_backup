package hw0421_Wed_ch6;

public class k33_ch6_8_2_mytest3 {
	/*
	 * Overrinding
	 */
	public static void main(String[] args) {
		k33_ch6_8_1_Elevater3 k33_elev3;
		k33_elev3 = new k33_ch6_8_1_Elevater3();
		
		for (int k33_ = 0; k33_ < 10; k33_++) {
			k33_elev3.k33_up();
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {
			k33_elev3.k33_down();
			System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);
		}
		k33_elev3.k33_Repair();
		System.out.printf("MSG elev3[%s]\n", k33_elev3.k33_help);
	}
}
