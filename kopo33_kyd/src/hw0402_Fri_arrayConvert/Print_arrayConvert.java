package hw0402_Fri_arrayConvert;

public class Print_arrayConvert {
	public static void printUsd() {
		for (int i = 0; i < usdArr.length; i ++) {
			usdCount = usdCurrent / usdArr[i];
			System.out.printf(usdArr[i] + "�޷� : " + usdCount + "��\t");
			usdCurrent -= usdArr[i] * usdCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
	}	
	}
	
	public static void printEuro() {
		for (int i = 0; i < euroArr.length; i ++) {
			euroCount = euroCurrent / euroArr[i];
			System.out.printf(euroArr[i] + "���� : " + euroCount + "��\t");
			euroCurrent -= euroArr[i] * euroCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
		
	}
	
	public static void printJPY() {
		for (int i = 0; i < jpyArr.length; i ++) {
			jpyCount = jpyCurrent / jpyArr[i];
			System.out.printf(jpyArr[i] + "�� : " + jpyCount + "��\t");
			jpyCurrent -= jpyArr[i] * jpyCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}
	}
	
	public static void printWon(int wonCount, int[] wonArr, int wonCurrent) {
		System.out.println("\n\n��ȭ �Ž����� ���� : " +changeWonResult+"��");
		wonCurrent = changeWonResult;
		for (int i = 0; i < wonArr.length; i ++) {
			wonCount = wonCurrent / wonArr[i];
			if (wonArr[i] == 5000 || wonArr[i] == 1000) {
				System.out.printf(wonArr[i] + "�� : " + wonCount + "��\t");
			} else {
				System.out.printf(wonArr[i] + "�� : " + wonCount + "��\t");
			}
			wonCurrent -= wonArr[i] * wonCount;
			if ((i+1) % 4 == 0) {
				System.out.printf("\n");
			}
		}	
	}
}
