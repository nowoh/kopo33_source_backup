package hw0426_Mon_everland_project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileWrite {
	//주문 내역 파일로 출력
	public void orderFilePrint(int totalPrice, int position, int orderList[][], int filePosition) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();
		
		FileWriter fw = new FileWriter(FixedValue.SAVE_ROUTE, true);
		BufferedReader fr = new BufferedReader(new FileReader(FixedValue.SAVE_ROUTE));
		
		for (int i = 0; i < position; i++) {
			String line;
			if (filePosition == 0) {	
				if ((line = fr.readLine()) == null) {
					String head = "날짜," + "권종," + "연령구분," + "수량," + "가격," + "우대사항";
					fw.write(head + "\n");
				}
			}
			filePosition++;
			
			fw.write(sdf.format(date) + ",");
			
			switch(orderList[i][0]) {
				case 1 :
					fw.write("주간권,");
					break;
				case 2 :
					fw.write("야간권,");
					break;
				default :
					break;
			}
			
			if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.BABY) {
				fw.write("유아,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.CHILD) {
				fw.write("어린이,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.TEEN) {
				fw.write("청소년,");
			} else if (CalPrice.calcAgeGroup(orderList[i][1]) == FixedValue.ADULT) {
				fw.write("어른,");
			} else {
				fw.write("노인,");
			}
			
			fw.write(orderList[i][2] + ",");
			fw.write(orderList[i][3] + ",");
			
			switch(orderList[i][4]) {
				case 1 :
					fw.write("없음\n");
					break;
				case 2 :
					fw.write("장애인\n");
					break;
				case 3 :
					fw.write("국가유공자\n");
					break;
				case 4 :
					fw.write("다자녀\n");
					break;
				case 5 :
					fw.write("임산부\n");
					break;
				default :
					break;
			}
			
		}
		fw.close();

	}
}
