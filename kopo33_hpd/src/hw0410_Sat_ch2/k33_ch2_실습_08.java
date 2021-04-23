package hw0410_Sat_ch2;

public class k33_ch2_½Ç½À_08 {
	/*
	 * OverflowEx
	 */
	public static void main(String[] args) {
		short k33_sMin = -32768; 	
		short k33_sMax = 32767; 	
		char k33_cMin = 0; 			
		char k33_cMax = 65535; 		
		
		System.out.println("k33_sMin = " + k33_sMin);
		System.out.println("k33_sMin-1= " + (short)(k33_sMin-1));
		System.out.println("k33_sMax = " + k33_sMax);
		System.out.println("k33_sMax+1= " + (short)(k33_sMax+1));
		System.out.println("k33_cMin = " + (int)k33_cMin);
		System.out.println("k33_cMin-1 = " + (int)--k33_cMin);
		System.out.println("k33_cMax = " + (int)k33_cMax);
		System.out.println("k33_cMax+1= " + (int)++k33_cMax);
	}
}
