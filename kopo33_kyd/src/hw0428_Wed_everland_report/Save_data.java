package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Save_data {
	
	public static void save(Value vl) throws IOException {
		File file = new File(Value.SAVE_ROUTE);
		FileInputStream fi = new FileInputStream(file);
		InputStreamReader ir = new InputStreamReader(fi, "MS949");
		vl.br = new BufferedReader(ir);
		
		String line;
		if ((line = vl.br.readLine()) == null) {
			System.out.println("비어 있는 파일입니다.");
		}
		
		while ((line = vl.br.readLine()) != null) {
			String[] lines = line.split(",");
			saveOrderList(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], vl.position, vl.orderList);
			vl.dateHash.add(lines[0]);
			vl.position++;
			
		}

	}
	public static void saveOrderList(String date, String ticketSelect, String age, String orderCount,
			String priceResult, String discountSelect, int position, String orderList[][]) {
		orderList[position][0] = date;
		orderList[position][1] = ticketSelect;
		orderList[position][2] = age;
		orderList[position][3] = orderCount;
		orderList[position][4] = priceResult;
		orderList[position][5] = discountSelect;
		
	}
}
