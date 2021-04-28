package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {
	static Value vl;
	public static void main(String[] args) throws IOException {
		Save_data sd = new Save_data();
		Analysis as = new Analysis();
		Print pr = new Print();
		FileWrite fwt = new FileWrite();
		vl = new Value();
		vl.dateHash = new HashSet<String>();
		
		//데이터 저장
		sd.save(vl);
		
		vl.dateArr = new ArrayList<String>(vl.dateHash);
		vl.dateArrSales = new ArrayList<String>();
		vl.datedate = new ArrayList<String[]>();
		
		//데이터 분석
		as.date_analysis(vl);
		as.day_night_sales(vl);
		as.discount(vl);
		
		//프린트
		pr.printCsv(vl);
		pr.day_night_print(vl);
		pr.date_analysis_print(vl);
		pr.discount_print(vl);
		
		//파일 쓰기
		fwt.dateHeader();
		fwt.dateWrite(vl);
		
		fwt.day_night_Header();
		fwt.day_night_Write(vl);
		
		fwt.discountHeader();
		fwt.discountWrite(vl);


	}
}
