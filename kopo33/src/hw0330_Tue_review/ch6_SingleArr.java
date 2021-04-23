package hw0330_Tue_review;

import java.util.ArrayList;

public class ch6_SingleArr {

	public static void main(String[] args) {
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 10; i++) {
			arrInt.add(0);
		}
		for (int j = 0; j < arrInt.size(); j++) {
			System.out.println(arrInt.get(j));
		}
		ArrayList<String> arrSt = new ArrayList<String>();
		
		arrSt.add("kim");
		arrSt.add("lee");
		arrSt.add("park");
		
		for (int k = 0; k < arrSt.size(); k++) {
			System.out.println(arrSt.get(k));
		}
	}

}
