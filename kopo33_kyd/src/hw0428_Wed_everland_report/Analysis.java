package hw0428_Wed_everland_report;

import java.util.ArrayList;
import java.util.Collections;

public class Analysis {
	
	//일자별 분석
	public static void date_analysis(Value vl) {
		Collections.sort(vl.dateArr);
		for (int j = 0; j < vl.dateArr.size(); j++) {
			if (vl.orderList[0][0] != null) {
				for (int i = 0; i < vl.orderList.length; i++) {
					if (vl.dateArr.get(j).equals(vl.orderList[i][0])) {
						vl.dateSales += Integer.parseInt(vl.orderList[i][4]);
					}
				}
			}
			vl.dateArrSales.add(Integer.toString(vl.dateSales));
			vl.dateSales = 0;
		}
	}
	
	
	//권종별 분석
	public static void day_night_sales(Value vl) {
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] != null) {
				if (vl.orderList[i][1].equals("주간권")) {
					if (vl.orderList[i][2].equals("유  아")) {
						vl.dayBaby += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("어린이")) {
						vl.dayChild += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("청소년")) {
						vl.dayTeen += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("어  른")) {
						vl.dayAdult += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("노  인")) {
						vl.dayOld += Integer.parseInt(vl.orderList[i][3]);
					}
					vl.day += Integer.parseInt(vl.orderList[i][3]);
					vl.daySales += Integer.parseInt(vl.orderList[i][4]);
				} else if (vl.orderList[i][1].equals("야간권")) {
					if (vl.orderList[i][2].equals("유  아")) {
						vl.nightBaby += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("어린이")) {
						vl.nightChild += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("청소년")) {
						vl.nightTeen += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("어  른")) {
						vl.nightAdult += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("노  인")) {
						vl.nightOld += Integer.parseInt(vl.orderList[i][3]);
					}
					vl.night += Integer.parseInt(vl.orderList[i][3]);
					vl.nightSales += Integer.parseInt(vl.orderList[i][4]);
				}
			} else {
				
			}
		}
	}
	
	//우대권 분석
	public static void discount(Value vl) {
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] != null) {
				if (vl.orderList[i][5].equals("없음")) {
					vl.none += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("장애인")) {
					vl.disable += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("국가유공자")) {
					vl.merit += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("다자녀")) {
					vl.multichild += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("임산부")) {
					vl.pregnant += Integer.parseInt(vl.orderList[i][3]);
				}
				vl.totalcnt += Integer.parseInt(vl.orderList[i][3]);
			} else {
				
			}
		}
	}
}
