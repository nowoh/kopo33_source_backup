package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Print {
	
	public static void printCsv(Value vl) throws IOException {
		vl.br = new BufferedReader(new FileReader(vl.SAVE_ROUTE));
		
		String line;
		System.out.println("====================report.csv====================");
		if ((line = vl.br.readLine()) != null) {
			System.out.printf("%4s%6s%5s%3s%5s  %-10s\n", "날짜", "권종", "연령구분", "수량", "가격", "우대사항" );
		}
		
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] !=null) {
				//주야간 구분
				if (vl.orderList[i][1].equals("주간권")) {
					vl.orderList[i][1] = vl.DAY;
				} else if (vl.orderList[i][1].equals("야간권")) {
					vl.orderList[i][1] = vl.NIGHT;
				}
				//연령구분
				if (vl.orderList[i][2].equals("유  아")) {
					vl.orderList[i][2] = vl.BABY;
				} else if (vl.orderList[i][2].equals("어린이")) {
					vl.orderList[i][2] = vl.CHILD;
				} else if (vl.orderList[i][2].equals("청소년")) {
					vl.orderList[i][2] = vl.TEEN;
				} else if (vl.orderList[i][2].equals("어  른")) {
					vl.orderList[i][2] = vl.ADULT;
				} else if (vl.orderList[i][2].equals("노  인")) {
					vl.orderList[i][2] = vl.OLD;
				}
				//우대사항 구분
				if (vl.orderList[i][5].equals("없음")) {
					vl.orderList[i][5] = vl.TYPE_NONE;
				} else if (vl.orderList[i][5].equals("장애인")) {
					vl.orderList[i][5] = vl.TYPE_DISABLE;
				} else if (vl.orderList[i][5].equals("국가유공자")) {
					vl.orderList[i][5] = vl.TYPE_MERIT;
				} else if (vl.orderList[i][5].equals("다자녀")) {
					vl.orderList[i][5] = vl.TYPE_MULTICHILD;
				} else if (vl.orderList[i][5].equals("임산부")) {
					vl.orderList[i][5] = vl.TYPE_PREGNANT;
				}
				System.out.printf("%-10s%4s%6s%7s%8s%9s\n", vl.orderList[i][0], vl.orderList[i][1], vl.orderList[i][2],
						vl.orderList[i][3], vl.orderList[i][4], vl.orderList[i][5]);
				
			}
		}
		System.out.println("--------------------------------------------------\n");
	}
	//권종별 출력
	public static void day_night_print(Value vl) {
		System.out.println("=====================권종별 판매현황=====================");
		System.out.printf("주간권 총 %d매\n", vl.day);
		System.out.printf("유아 %2d매, 어린이 %2d매, 청소년 %2d매, 어른 %2d매, 노인 %2d매\n", 
				vl.dayBaby, vl.dayChild, vl.dayTeen, vl.dayAdult, vl.dayOld);
		System.out.printf("주간권 매출 : %d원\n\n\n", vl.daySales);
		System.out.printf("야간권 총 %d매\n", vl.night);
		System.out.printf("유아 %2d매, 어린이 %2d매, 청소년 %2d매, 어른 %2d매, 노인 %2d매\n", 
				vl.nightBaby, vl.nightChild, vl.nightTeen, vl.nightAdult, vl.nightOld);
		System.out.printf("야간권 매출 : %d원\n", vl.nightSales);
		System.out.println("---------------------------------------------------------\n\n");
	}
	
	//일자별 출력
	public static void date_analysis_print(Value vl) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("========일자별 매출 현황========");
		for (int i = 0; i < vl.dateArr.size(); i++) {
			System.out.printf("%s : 총 매출 %10s원\n", vl.dateArr.get(i), vl.dateArrSales.get(i));
		}
		System.out.println("--------------------------------\n");
	}
	
	//우대권별 출력
	public static void discount_print(Value vl) {
		System.out.println("======우대권 판매 현황======");
		System.out.printf("%-11s : %5d매\n", "총 판매 티켓 수", vl.totalcnt);
		System.out.printf("%-13s : %5d매\n", "우대 없음", vl.none);
		System.out.printf("%-14s : %5d매\n", "장애인", vl.disable);
		System.out.printf("%-12s : %5d매\n", "국가유공자", vl.merit);
		System.out.printf("%-14s : %5d매\n", "다자녀", vl.multichild);
		System.out.printf("%-14s : %5d매\n", "임산부", vl.pregnant);
		System.out.println("----------------------------\n");
		
	}
	
}
