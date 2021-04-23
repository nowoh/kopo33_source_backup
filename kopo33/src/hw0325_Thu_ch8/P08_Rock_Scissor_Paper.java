package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P08_Rock_Scissor_Paper extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		P08_Rock_Scissor_Paper thread = new P08_Rock_Scissor_Paper();
		
		System.out.println("<Please Choose Number (in 3 seconds)>");
		System.out.println("1 = Rock \n2 = Scissor \n3 = Paper");
		Thread.sleep(3000);
		System.out.println();
		System.out.println("CountDown Start!");
		thread.start();
		
		int myRps = scan.nextInt();
		System.out.println("User : " + myRpsResult(myRps));	
		
		
	}
	
	public void run() {
		int cnt = 5;
		while (true) {
			if (cnt == 0) {
				String ret = "";
				int randomNumber = (int)(Math.random() * 3);
				if (randomNumber == 0) {
					ret = "Rock";
				} else if (randomNumber == 1) {
					ret = "Paper";
				} else {
					ret = "Scissor";
				}
				System.out.println("Computer : " + ret);
				break;
			}
			try {
				System.out.println(cnt);
				Thread.sleep(1000);
				cnt--;
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}
	}
	
	public static String myRpsResult(int a) {
		String ret = "";
		if (a == 1) {
			ret = "Rock";
		} else if (a == 2) {
			ret = "Scissor";
		} else if (a == 3) {
			ret = "Paper";
		} else {
			ret = "error";
		}
		return ret;
	}
}
	
	
	
