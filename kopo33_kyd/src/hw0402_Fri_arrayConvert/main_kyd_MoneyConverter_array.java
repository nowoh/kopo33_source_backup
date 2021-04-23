package hw0402_Fri_arrayConvert;

import java.util.Scanner;

import hw0402_Fri.CostValueClass;
import hw0402_Fri.InputFromConsoleClass;

public class main_kyd_MoneyConverter_array {	//변경전
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		int type = 0; //외화 선택
		
		ConvertProcessing cp = new ConvertProcessing();
		Input_Class inputConsole = new Input_Class();
		
		do {
			won = inputConsole.inputWon();
			type = inputConsole.inputType();
			
			if (type == CostValue.EX_TYPE_USD) {
				cp.exchangeUSD(won);
				cp.resultWon();
			} else if (type == CostValue.EX_TYPE_EURO) {
				cp.exchangeEURO(won);
				cp.resultWon();
			} else if (type == CostValue.EX_TYPE_JPY) {
				cp.exchangeJPY(won);
				cp.resultWon();
			} else if (type == CostValue.EX_TYPE_EXIT) {
				break;
			} else {
				System.out.println("ERROR. Please choose right type.");
			}
		} while (type != CostValue.EX_TYPE_EXIT);
		scan.close();
	}
}