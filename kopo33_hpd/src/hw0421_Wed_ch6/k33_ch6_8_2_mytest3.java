package hw0421_Wed_ch6;

public class k33_ch6_8_2_mytest3 {	//º°1
	/*
	 * Overrinding
	 */
	public static void main(String[] args) {
		k33_ch6_8_1_Elevater3 elev3;
		elev3 = new k33_ch6_8_1_Elevater3();
		
		for (int i = 0; i < 10; i++) {
			elev3.up();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		
		for (int i = 0; i < 10; i++) {
			elev3.down();
			System.out.printf("MSG elev3[%s]\n", elev3.help);
		}
		elev3.Repair();
		System.out.printf("MSG elev3[%s]\n", elev3.help);
	}
}
