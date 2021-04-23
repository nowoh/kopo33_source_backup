package hw0402_Fri;

import java.util.Scanner;

public class main_kyd_MoneyConverter {


	public static void main(String[] args) {	//static main method는 현 class에 소속되어 있지 않음
		Scanner scan = new Scanner(System.in);
		int type = 0; 		//외화 선택
		double won;

		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		
		do {
			won = inputConsole.inputWon();
			type = inputConsole.inputType();
			
			if (type == CostValueClass.EX_TYPE_USD) {
				pc.exchangeUSD(won);
				pc.resultWon();
			} else if (type == CostValueClass.EX_TYPE_EURO) {
				pc.exchangeEURO(won);
				pc.resultWon();
			} else if (type == CostValueClass.EX_TYPE_JPY) {
				pc.exchangeJPY(won);
				pc.resultWon();
			} else if (type == CostValueClass.EX_TYPE_EXIT) {
				break;
			} else {
				System.out.println("ERROR. Please choose right type.");
			}
			
		} while (type != CostValueClass.EX_TYPE_EXIT);
		scan.close();
	}
}