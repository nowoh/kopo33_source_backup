package hw0428_Wed_everland_report;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Value {

	//������ ī��Ʈ
	int day=0, night=0;
	int dayBaby=0, dayChild=0, dayTeen=0, dayAdult=0, dayOld=0;
	int nightBaby=0, nightChild=0, nightTeen=0, nightAdult=0, nightOld=0;
	int daySales=0, nightSales=0;
	
	//���� ī��Ʈ
	int totalcnt=0;
	int none=0, disable=0, merit=0, multichild=0, pregnant=0;
	
	//���ں� ī��Ʈ
	int dateSales=0;
	
	//csv���� ������ �迭 ����
	String[][] orderList = new String[100][6];
	
	//�迭 �� ��ȣ
	int position=0;
	
	//���� ��ġ
	static final String SAVE_ROUTE = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\everland_project.csv";
	static final String SAVE_ROUTE1 = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\date_report.csv";
	static final String SAVE_ROUTE2 = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\day_night_report.csv";
	static final String SAVE_ROUTE3 = "C:\\Users\\Howon\\eclipse-workspace\\kopo33_kyd\\discount_report.csv";
	
	//�迭
	HashSet<String> dateHash;				//���� �ߺ� ���ֱ�
	ArrayList<String> dateArr;				//hashset arraylist�� �ֱ�
	ArrayList<String> dateArrSales;			
	ArrayList<String[]> datedate;
	String[][] result;
	
	//�б�
	public BufferedReader br;
	
	final static String DAY = "1", NIGHT = "2", BABY = "1", CHILD = "2", TEEN = "3", ADULT = "4", OLD = "5",
			TYPE_NONE = "1", TYPE_DISABLE = "2", TYPE_MERIT = "3", TYPE_MULTICHILD = "4", TYPE_PREGNANT = "5";
}
