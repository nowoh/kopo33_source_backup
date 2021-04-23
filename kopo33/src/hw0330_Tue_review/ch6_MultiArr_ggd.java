package hw0330_Tue_review;

import java.util.ArrayList;

public class ch6_MultiArr_ggd {

	public static void main(String[] args) {
		String [][] ggd = new String [8][8];
		int a = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				ggd [i][j] = (j+2) + " * " + (i+2) + " = " + (j+2) * (i+2);
				System.out.print(ggd[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
