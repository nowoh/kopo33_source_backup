package hw0402_Fri_arrayConvert;

public class Print_arrayConvert {
	public static void printUsd() {
		for (int i = 0; i < usdArr.length; i ++) {
			usdCount = usdCurrent / usdArr[i];
			System.out.printf(usdArr[i] + "달러 : " + usdCount + "장\t");
			usdCurrent -= usdArr[i] * usdCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
	}	
	}
	
	public static void printEuro() {
		for (int i = 0; i < euroArr.length; i ++) {
			euroCount = euroCurrent / euroArr[i];
			System.out.printf(euroArr[i] + "유로 : " + euroCount + "장\t");
			euroCurrent -= euroArr[i] * euroCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
		
	}
	
	public static void printJPY() {
		for (int i = 0; i < jpyArr.length; i ++) {
			jpyCount = jpyCurrent / jpyArr[i];
			System.out.printf(jpyArr[i] + "엔 : " + jpyCount + "장\t");
			jpyCurrent -= jpyArr[i] * jpyCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public static void printWon(int wonCount, int[] wonArr, int wonCurrent) {
		System.out.println("\n\n원화 거스름돈 지급 : " +changeWonResult+"원");
		wonCurrent = changeWonResult;
		for (int i = 0; i < wonArr.length; i ++) {
			wonCount = wonCurrent / wonArr[i];
			if (wonArr[i] == 5000 || wonArr[i] == 1000) {
				System.out.printf(wonArr[i] + "원 : " + wonCount + "장\t");
			} else {
				System.out.printf(wonArr[i] + "원 : " + wonCount + "개\t");
			}
			wonCurrent -= wonArr[i] * wonCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}	
	}
}
