package hw0428_Wed_everland_report;

import java.util.ArrayList;
import java.util.Collections;

public class Analysis {
	
	//���ں� �м�
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
	
	
	//������ �м�
	public static void day_night_sales(Value vl) {
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] != null) {
				if (vl.orderList[i][1].equals("�ְ���")) {
					if (vl.orderList[i][2].equals("��  ��")) {
						vl.dayBaby += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("���")) {
						vl.dayChild += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("û�ҳ�")) {
						vl.dayTeen += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("��  ��")) {
						vl.dayAdult += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("��  ��")) {
						vl.dayOld += Integer.parseInt(vl.orderList[i][3]);
					}
					vl.day += Integer.parseInt(vl.orderList[i][3]);
					vl.daySales += Integer.parseInt(vl.orderList[i][4]);
				} else if (vl.orderList[i][1].equals("�߰���")) {
					if (vl.orderList[i][2].equals("��  ��")) {
						vl.nightBaby += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("���")) {
						vl.nightChild += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("û�ҳ�")) {
						vl.nightTeen += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("��  ��")) {
						vl.nightAdult += Integer.parseInt(vl.orderList[i][3]);
					} else if (vl.orderList[i][2].equals("��  ��")) {
						vl.nightOld += Integer.parseInt(vl.orderList[i][3]);
					}
					vl.night += Integer.parseInt(vl.orderList[i][3]);
					vl.nightSales += Integer.parseInt(vl.orderList[i][4]);
				}
			} else {
				
			}
		}
	}
	
	//���� �м�
	public static void discount(Value vl) {
		for (int i = 0; i < vl.orderList.length; i++) {
			if (vl.orderList[i][0] != null) {
				if (vl.orderList[i][5].equals("����")) {
					vl.none += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("�����")) {
					vl.disable += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("����������")) {
					vl.merit += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("���ڳ�")) {
					vl.multichild += Integer.parseInt(vl.orderList[i][3]);
				} else if (vl.orderList[i][5].equals("�ӻ��")) {
					vl.pregnant += Integer.parseInt(vl.orderList[i][3]);
				}
				vl.totalcnt += Integer.parseInt(vl.orderList[i][3]);
			} else {
				
			}
		}
	}
}
