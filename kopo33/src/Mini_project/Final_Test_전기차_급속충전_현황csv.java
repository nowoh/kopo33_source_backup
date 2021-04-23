package Mini_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Final_Test_전기차_급속충전_현황csv {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\한국환경공단_전기차 충전기 현황_환경부 공공급속충전기_20200629.csv"));
		String line;
		int n = 0;
		int sum10 = 0, sum11 = 0, sum12 = 0, sum13 = 0, sum14 = 0, sum15 = 0, 
				sum16 = 0, sum17 = 0, sum18 = 0, sum19 = 0;
		int min10 = 10000, min11 = 10000, min12 = 10000, min13 = 10000, min14 = 10000, 
				min15 = 10000, min16 = 10000, min17 = 10000, min18 = 10000, min19 = 10000; 
		int max10 = 0, max11 = 0, max12 = 0, max13 = 0, max14 = 0, max15 = 0, 
				max16 = 0, max17 = 0, max18 = 0, max19 = 0;
		int count10 = 0, count11 = 0, count12 = 0, count13 = 0, count14 = 0, count15 = 0,
				count16 = 0, count17 = 0, count18 = 0, count19 = 0;
		
		while ((line = reader.readLine()) != null) {
			String[] lines = line.split(",");
			if (lines[3].equals("2010")) {
				n = Integer.parseInt(lines[2]);
				sum10 += n;
				count10++;
				if (min10 > n) {
					min10 = n;
				} 
				if (max10 < n) {
					max10 = n;
				}
			} else if (lines[3].equals("2011")) {
				n = Integer.parseInt(lines[2]);
				sum11 += n;
				count11++;
				if (min11 > n) {
					min11 = n;
				} 
				if (max11 < n) {
					max11 = n;
				}
			} else if (lines[3].equals("2012")) {
				n = Integer.parseInt(lines[2]);
				sum12 += n;
				count12++;
				if (min12 > n) {
					min12 = n;
				} 
				if (max12 < n) {
					max12 = n;
				}
			} else if (lines[3].equals("2013")) {
				n = Integer.parseInt(lines[2]);
				sum13 += n;
				count13++;
				if (min13 > n) {
					min13 = n;
				} 
				if (max13 < n) {
					max13 = n;
				}
			} else if (lines[3].equals("2014")) {
				n = Integer.parseInt(lines[2]);
				sum14 += n;
				count14++;
				if (min14 > n) {
					min14 = n;
				} 
				if (max14 < n) {
					max14 = n;
				}
			} else if (lines[3].equals("2015")) {
				n = Integer.parseInt(lines[2]);
				sum15 += n;
				count15++;
				if (min15 > n) {
					min15 = n;
				} 
				if (max15 < n) {
					max15 = n;
				}
			} else if (lines[3].equals("2016")) {
				n = Integer.parseInt(lines[2]);
				sum16 += n;
				count16++;
				if (min16 > n) {
					min16 = n;
				} 
				if (max16 < n) {
					max16 = n;
				}
			} else if (lines[3].equals("2017")) {
				n = Integer.parseInt(lines[2]);
				sum17 += n;
				count17++;
				if (min17 > n) {
					min17 = n;
				} 
				if (max17 < n) {
					max17 = n;
				}
			} else if (lines[3].equals("2018")) {
				n = Integer.parseInt(lines[2]);
				sum18 += n;
				count18++;
				if (min18 > n) {
					min18 = n;
				} 
				if (max18 < n) {
					max18 = n;
				}
			} else if (lines[3].equals("2019")) {
				n = Integer.parseInt(lines[2]);
				sum19 += n;
				count19++;
				if (min19 > n) {
					min19 = n;
				} 
				if (max19 < n) {
					max19 = n;
				}
			}
		}
		System.out.println("2010년도 합계 : " + sum10);
		System.out.println("2010년도 1회 설치 시 평균 충전기 수 : " + sum10/count10);
		System.out.println("2010년도 1회 설치 시 최소 충전기 수 : " + min10);
		System.out.println("2010년도 1회 설치 시 최대 충전기 수 : " + max10 + "\n");
		System.out.println("2011년도 합계 : " + sum11);
		System.out.println("2011년도 1회 설치 시 평균 충전기 수 : " + sum11/count11);
		System.out.println("2011년도 1회 설치 시 최소 충전기 수 : " + min11);
		System.out.println("20v년도 1회 설치 시 최대 충전기 수 : " + max11 + "\n");
		System.out.println("2012년도 합계 : " + sum12);
		System.out.println("2012년도 1회 설치 시 평균 충전기 수 : " + sum12/count12);
		System.out.println("2012년도 1회 설치 시 최소 충전기 수 : " + min12);
		System.out.println("2012년도 1회 설치 시 최대 충전기 수 : " + max12 + "\n");
		System.out.println("2013년도 합계 : " + sum13);
		System.out.println("2013년도 1회 설치 시 평균 충전기 수 : " + sum13/count13);
		System.out.println("2013년도 1회 설치 시 최소 충전기 수 : " + min13);
		System.out.println("2013년도 1회 설치 시 최대 충전기 수 : " + max13 + "\n");
		System.out.println("2014년도 합계 : " + sum14);
		System.out.println("2014년도 1회 설치 시 평균 충전기 수 : " + sum14/count14);
		System.out.println("2014년도 1회 설치 시 최소 충전기 수 : " + min14);
		System.out.println("2014년도 1회 설치 시 최대 충전기 수 : " + max14 + "\n");
		System.out.println("2015년도 합계 : " + sum15);
		System.out.println("2015년도 1회 설치 시 평균 충전기 수 : " + sum15/count15);
		System.out.println("2015년도 1회 설치 시 최소 충전기 수 : " + min15);
		System.out.println("2015년도 1회 설치 시 최대 충전기 수 : " + max15 + "\n");
		System.out.println("2016년도 합계 : " + sum16);
		System.out.println("2016년도 1회 설치 시 평균 충전기 수 : " + sum16/count16);
		System.out.println("2016년도 1회 설치 시 최소 충전기 수 : " + min16);
		System.out.println("2016년도 1회 설치 시 최대 충전기 수 : " + max16 + "\n");
		System.out.println("2017년도 합계 : " + sum17);
		System.out.println("2017년도 1회 설치 시 평균 충전기 수 : " + sum17/count17);
		System.out.println("2017년도 1회 설치 시 최소 충전기 수 : " + min17);
		System.out.println("2017년도 1회 설치 시 최대 충전기 수 : " + max17 + "\n");
		System.out.println("2018년도 합계 : " + sum18);
		System.out.println("2018년도 1회 설치 시 평균 충전기 수 : " + sum18/count18);
		System.out.println("2018년도 1회 설치 시 최소 충전기 수 : " + min18);
		System.out.println("2018년도 1회 설치 시 최대 충전기 수 : " + max18 + "\n");
		System.out.println("2019년도 합계 : " + sum19);
		System.out.println("2019년도 1회 설치 시 평균 충전기 수 : " + sum19/count19);
		System.out.println("2019년도 1회 설치 시 최소 충전기 수 : " + min19);
		System.out.println("2019년도 1회 설치 시 최대 충전기 수 : " + max19 + "\n");
	}
}
