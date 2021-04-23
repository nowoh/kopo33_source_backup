package hw0323_Tue_ch6;

public class P05_±³¼ö´Ô {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = {{1,2,3}, {4,5,6},{7,8,9}};
		int [] temp = new int[3];
		temp[0] = 1;
		temp[1] = 2;
		temp[2] = 3;
		
		System.out.println(sum(temp));
	}
	
	public static int sum(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		return sum;
	}

}
