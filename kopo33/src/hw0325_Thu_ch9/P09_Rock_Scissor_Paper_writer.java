package hw0325_Thu_ch9;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hw0325_Thu_ch8.P08_Rock_Scissor_Paper2;

public class P09_Rock_Scissor_Paper_writer {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		//P09_Rock_Scissor_Paper_writer thread = new P09_Rock_Scissor_Paper_writer();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		
		while (true) {
			int myRps = scan.nextInt();
			try {
				String users = myRpsResult(myRps);
				System.out.println("User : " + users);

				String com = rpsResult();						
				System.out.println("Computer : " + com);

				String rst = Result(myRps, com);
				System.out.println(rst);

				FileWriter fw = new FileWriter("C:\\Users\\Howon\\Desktop\\rcp.txt", true);
				fw.write("User : " + users + "\n");
				fw.write("Computer : " + com + "\n");
				fw.write("Result : " + rst + "\n");
				fw.write("Time : " + dateFormat.format(date) + "\n\n");
				fw.close();
			} catch (IOException e) {
				System.out.println("Wrong Number!");
			}
		}
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
	
	public static String Result (int a, String b) {
		String cc = null; //Computer Choose
		switch (a) {
			case 1 : //Rock
				if (b.equals("Rock")) {
					cc = "Draw";
				} else if (b.equals("Scissor")) {
					cc = "User Win";
				} else if (b.equals("Paper")) {
					cc = "Computer Win";
				}
				break;
			case 2 : //Scissor
				if (b.equals("Rock")) {
					cc = "Computer Win";
				} else if (b.equals("Scissor")) {
					cc = "Draw";
				} else if (b.equals("Paper")) {
					cc = "User Win";
				}
				break;
			case 3 : //Paper
				if (b.equals("Rock")) {
					cc = "User Win";
				} else if (b.equals("Scissor")) {
					cc = "Computer Win";
				} else if (b.equals("Paper")) {
					cc = "Draw";
					
				}
				break;
			default :
				cc = "error";
			
		}
		return cc;
	}
}
	
	
	
