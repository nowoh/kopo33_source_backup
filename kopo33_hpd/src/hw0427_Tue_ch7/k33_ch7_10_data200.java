package hw0427_Tue_ch7;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class k33_ch7_10_data200 {	//별1

	static ArrayList<k33_ch7_10_Class_ArrayList200> k33_ArrayOneRec = new ArrayList <k33_ch7_10_Class_ArrayList200>();
	
	static int k33_sumkor;
	static int k33_sumeng;
	static int k33_summat;
	static int k33_sumsum;
	static double k33_sumavg;
	static int k33_korAcc = 0;
	static int k33_engAcc = 0;
	static int k33_matAcc = 0;
	static int k33_sumAcc = 0;
	static double k33_avgAcc = 0;
	static int k33_pageNum = 1; 
	static int k33_totalAcc = 0;	
	static int k33_pageCnt;
	static final int k33_iPerson = 200;
	
	
	public static void main(String[] args) {
		k33_dataSet();
		for (int k33_i = 0; k33_i < k33_ArrayOneRec.size(); k33_i += 30) {
			k33_HeaderPrint();
			
			k33_pageCnt = 0;
			k33_sumkor = 0; k33_sumeng = 0; k33_summat = 0; k33_sumsum = 0; k33_sumavg = 0;
			try {
				for(int k33_j = k33_i; k33_j < k33_i+30; k33_j++) {
					k33_ItemPrint(k33_j);
					k33_pageCnt++;
					k33_totalAcc++;
				}
			} catch (Exception k33_e) {
				
			}
			k33_TailPrint();
			k33_pageNum++;
		}
		
	}
	
	public static void k33_dataSet() {
		for (int k33_i = 0; k33_i < k33_iPerson; k33_i++) {
			String k33_name = String.format("홍길%02d", k33_i+1);
			int k33_kor = (int)(Math.random() * 100);
			int k33_eng = (int)(Math.random() * 100);
			int k33_mat = (int)(Math.random() * 100);
			k33_ArrayOneRec.add(new k33_ch7_10_Class_ArrayList200(k33_i+1, k33_name, k33_kor, k33_eng, k33_mat));
		}
	}
	
	public static void k33_HeaderPrint() {
		SimpleDateFormat k33_sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");	//SimpleDateFormat 객체 생성
		Date k33_date = new Date();	
		
		System.out.printf("%25s\n\n", "성적집계표");
		System.out.printf("%-4s%-11d%9s%s\n", "PAGE : ", k33_pageNum, "출력일자 : ", k33_sdf.format(k33_date));	
		System.out.printf("****************************************************\n");
		System.out.printf("%-4s%-6s%-6s%-6s%-6s%-6s%-6s\n", "번호", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("****************************************************\n");
	}
	
	public static void k33_ItemPrint(int k33_i) {
		k33_ch7_10_Class_ArrayList200 k33_rec;
		
		k33_rec = k33_ArrayOneRec.get(k33_i);
		System.out.printf("%03d%8s%5d%8d%8d%8d%8.0f\n", k33_rec.k33_student_id(), k33_rec.k33_name(),k33_rec.k33_kor(), k33_rec.k33_eng(), 
				k33_rec.k33_mat(), k33_rec.k33_sum(), k33_rec.k33_avg());
		
		k33_sumkor += k33_rec.k33_kor();
		k33_sumeng += k33_rec.k33_eng();
		k33_summat += k33_rec.k33_mat();
		k33_sumsum += k33_rec.k33_sum();
		k33_sumavg += k33_rec.k33_avg();
		
		k33_korAcc += k33_rec.k33_kor();
		k33_engAcc += k33_rec.k33_eng();
		k33_matAcc += k33_rec.k33_mat();
		k33_sumAcc += k33_rec.k33_sum();
		k33_avgAcc += k33_rec.k33_avg();
	}
	
	public static void k33_TailPrint() {
		System.out.printf("****************************************************\n");
		System.out.printf("현재페이지\n");
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", k33_sumkor, k33_sumeng, k33_summat, k33_sumsum, k33_sumavg);
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "평균", k33_sumkor/k33_pageCnt, k33_sumeng/k33_pageCnt, k33_summat/k33_pageCnt, k33_sumsum/k33_pageCnt, k33_sumavg/k33_pageCnt);
		System.out.printf("****************************************************\n");
		System.out.printf("누적페이지\n");
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n", "합계", k33_korAcc, k33_engAcc, k33_matAcc, k33_sumAcc, k33_avgAcc);
		System.out.printf("%-11s%5d%8d%8d%8d%8.0f\n\n", "평균", k33_korAcc/k33_totalAcc, k33_engAcc/k33_totalAcc, k33_matAcc/k33_totalAcc, k33_sumAcc/k33_totalAcc, k33_avgAcc/k33_totalAcc);
	}
}
