package hw0325_Thu_ch8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class P08_Rock_Scissor_Paper2 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		P08_Rock_Scissor_Paper2 thread = new P08_Rock_Scissor_Paper2();
		
		System.out.println("<Please Choose Number (in 3 seconds)>");
		System.out.println("1 = Rock \n2 = Scissor \n3 = Paper");
		Thread.sleep(3000);
		System.out.println();
		System.out.println("CountDown Start!");
		thread.start();
		
		int myRps = scan.nextInt();
		System.out.println("User : " + myRpsResult(myRps));
		
		String com = rpsResult();						
		System.out.println("Computer : " + com);
		
		String cc = null; //Computer Choose
		switch (myRps) {
			case 1 : //Rock
				if (com.equals("Rock")) {
					cc = "Draw";
				} else if (com.equals("Scissor")) {
					cc = "User Win";
				} else if (com.equals("Paper")) {
					cc = "Computer Win";
				}
				break;
			case 2 : //Scissor
				if (com.equals("Rock")) {
					cc = "Computer Win";
				} else if (com.equals("Scissor")) {
					cc = "Draw";
				} else if (com.equals("Paper")) {
					cc = "User Win";
				}
				break;
			case 3 : //Paper
				if (com.equals("Rock")) {
					cc = "User Win";
				} else if (com.equals("Scissor")) {
					cc = "Computer Win";
				} else if (com.equals("Paper")) {
					cc = "Draw";
					
				}
				break;
			default :
				cc = "error";
			
		}
		System.out.println(cc);
		
	}
	
	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int)(Math.random() * 3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
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
	
	public void run() {
		int cnt = 5;
		while (true) {
			if (cnt == 0) {
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
}
	
	
	
