package hw0428_Wed_everland_report;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import hw0426_Mon_everland_project.FixedValue;

public class FileWrite {
	File file1 = new File(Value.SAVE_ROUTE1);
	File file2 = new File(Value.SAVE_ROUTE2);
	File file3 = new File(Value.SAVE_ROUTE3);
	private FileWriter fw;
	private FileOutputStream fo;
	private OutputStreamWriter ow;
	private BufferedWriter bw;
	
	//일자별 매출 헤더 쓰기
	public void dateHeader() throws IOException {
		if(file1.exists() == false) {
			fo = new FileOutputStream(file1, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "일자," + "총 매출";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	//권종별 매출 헤더 쓰기
	public void day_night_Header() throws IOException {
		if(file2.exists() == false) {
			fo = new FileOutputStream(file2, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "구분," + "주간권," + "야간권";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	//우대권별 매출 헤더 쓰기
	public void discountHeader() throws IOException {
		if(file3.exists() == false) {
			fo = new FileOutputStream(file3, true);
			ow = new OutputStreamWriter(fo, "MS949");
			bw = new BufferedWriter(ow);
			String head = "구분," + "판매수";
			bw.write(head);
			bw.newLine();
			bw.flush();
			bw.close();
		}		
	}
	
	//일자별 매출 쓰기
	public void dateWrite(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE1, true);
		for (int i = 0; i < vl.dateArr.size(); i++) {
			fw.write(vl.dateArr.get(i) + "," + vl.dateArrSales.get(i) + "\n");
		}
		fw.close();
	}
	
	//권종별 매출 쓰기
	public void day_night_Write(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE2, true);
		fw.write("유아," + vl.dayBaby + "," + vl.nightBaby + "\n");
		fw.write("어린이," + vl.dayChild + "," + vl.nightChild + "\n");
		fw.write("청소년," + vl.dayTeen + "," + vl.nightTeen + "\n");
		fw.write("어른," + vl.dayAdult + "," + vl.nightTeen + "\n");
		fw.write("노인," + vl.dayOld + "," + vl.nightOld + "\n");
		fw.write("합계," + vl.day + "," + vl.night + "\n");
		fw.write("매출," + vl.daySales + "," + vl.nightSales + "\n");
		fw.close();
	}
	
	//우대권별 매출 쓰기
	public void discountWrite(Value vl) throws IOException {
		fw = new FileWriter(Value.SAVE_ROUTE3, true);
		fw.write("총 판매 티켓 수," + vl.totalcnt + "\n");
		fw.write("우대 없음," + vl.none + "\n");
		fw.write("장애인," + vl.disable + "\n");
		fw.write("국가유공자," + vl.merit + "\n");
		fw.write("다자녀," + vl.multichild + "\n");
		fw.write("임산부," + vl.pregnant + "\n");
		fw.close();
	}
}
