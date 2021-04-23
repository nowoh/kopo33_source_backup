package hw0410_Sat_ch2;

public class k33_ch2_½Ç½À_02 {
	/*
	 * VarEx2
	 */
	public static void main(String[] args) {	
		int k33_x = 10;	
		int k33_y = 20;	 
		int k33_tmp = 0;  
		
		System.out.println("k33_x : " + k33_x + " k33_y : " + k33_y); 
		
		k33_tmp = k33_x;	 
		k33_x = k33_y;		
		k33_y = k33_tmp;	
		
		System.out.println("k33_x : " + k33_x + " k33_y :" + k33_y);	
	}

}
