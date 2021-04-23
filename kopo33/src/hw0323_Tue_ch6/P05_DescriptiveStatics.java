package hw0323_Tue_ch6;

import java.util.Scanner;

public class P05_DescriptiveStatics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String [][] stat = {{"Jeong", "70", "80", "100"}, {"Pyo", "60", "70", "86"}, {"Choi", "70", "100", "82"}, {"Mike", "60", "95", "79"}};
		
		while (true) {
			mainMenu{};
		}
		
		int n = scan.nextInt();
		/*System.out.println("Summation : " + sumSub(stat, n));
		System.out.println("Average : " + aveSub(stat, n));*/
		System.out.println(sumName(stat,n));
		
	}
	
	public static void mainMenu() {
		System.out.println("#Menu ");
	}
	
	public static int sumSub(String [][] score,int n) {
		int sum = 0;
		int scores = 0;
		for (int i = 0; i < score.length; i++) {
			scores = Integer.parseInt(score[i][n]);
			sum = sum + scores;
		}
		return sum;
	}
	
	public static int sumName(String [][] score,int n) {
		int sum = 0;
		int scores = 0;
		for (int i = 0; i < score.length; i++) {
			scores = Integer.parseInt(score[n][i]);
			sum = sum + scores;
		}
		return sum;
	}
	
	public static int aveSub(String [][] score, int n) {
		int sum = 0;
		int scores = 0;
		int ave = 0;
		for (int i = 0; i < score.length; i++) {
			scores = Integer.parseInt(score[i][n]);
			sum = sum + scores;
			ave = sum / score.length;
		}
		return ave;
	}
	
	public static int minSub(String [][] score, int n) {
		int min;
		min = Interger.parseINt(score[0][0]);
		int scores = 0;
		int min = 0;
		for (int i = 0; i < score.length; i++) {
			scores = Integer.parseInt(score[i][n]);
			
			
		}
		return ave;
	}
}
