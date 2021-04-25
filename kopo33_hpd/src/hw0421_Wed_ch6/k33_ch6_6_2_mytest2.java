package hw0421_Wed_ch6;

public class k33_ch6_6_2_mytest2 {
	/*
	 * Constructor(»ı¼ºÀÚ), ¼Ò¸êÀÚ, ÀÌº¥Æ®
	 */
	static k33_ch6_6_1_Elevater2 k33_elev1;
	static k33_ch6_6_1_Elevater2 k33_elev2;
	static k33_ch6_6_1_Elevater2 k33_elev3;
	
	public static void main(String[] args) {
		k33_elev1 = new k33_ch6_6_1_Elevater2();
		k33_elev2 = new k33_ch6_6_1_Elevater2(20, 1, 8);
		k33_elev3 = new k33_ch6_6_1_Elevater2(50, -3, 5);
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_up(); k33_elev1.k33_msg("1¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
//			elev2.up(); elev2.msg("2¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
//			elev3.up(); elev3.msg("3¹ø¿¤·¹ ÇÑÃş ¿À¸£±â");
		}
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_up(2); k33_elev1.k33_msg("1¹ø¿¤·¹ 2Ãş ¿À¸£±â");
//			elev2.up(2); elev2.msg("2¹ø¿¤·¹ 2Ãş ¿À¸£±â");
//			elev3.up(2); elev3.msg("3¹ø¿¤·¹ 2Ãş ¿À¸£±â");
		}
		
		for (int k33_i = 0; k33_i < 20; k33_i++) {
			k33_elev1.k33_down(3); k33_elev1.k33_msg("1¹ø¿¤·¹ 3Ãş ¿À¸£±â");
//			elev2.down(3); elev2.msg("2¹ø¿¤·¹ 3Ãş ¿À¸£±â");
//			elev3.down(3); elev3.msg("3¹ø¿¤·¹ 3Ãş ¿À¸£±â");
		}
	}

}
