package hw0317_Wed_ch2;

import java.util.Scanner;

public class ¿Ã¡ﬂπÆp11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 2;
		int a = scan.nextInt();
		switch (a) {
			case 1 :
				while (i < 10) {
					int j = 1;
					while (j < 10) {
						System.out.println(i + " X " + j + " = " + (i * j));
						j++;
					}
					i++;
				}
		
		}
		scan.close();
	}	
}
