package Mini_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Final_Test_������_�޼�����_��Ȳcsv {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\�ѱ�ȯ�����_������ ������ ��Ȳ_ȯ��� �����޼�������_20200629.csv"));
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
		System.out.println("2010�⵵ �հ� : " + sum10);
		System.out.println("2010�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum10/count10);
		System.out.println("2010�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min10);
		System.out.println("2010�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max10 + "\n");
		System.out.println("2011�⵵ �հ� : " + sum11);
		System.out.println("2011�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum11/count11);
		System.out.println("2011�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min11);
		System.out.println("20v�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max11 + "\n");
		System.out.println("2012�⵵ �հ� : " + sum12);
		System.out.println("2012�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum12/count12);
		System.out.println("2012�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min12);
		System.out.println("2012�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max12 + "\n");
		System.out.println("2013�⵵ �հ� : " + sum13);
		System.out.println("2013�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum13/count13);
		System.out.println("2013�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min13);
		System.out.println("2013�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max13 + "\n");
		System.out.println("2014�⵵ �հ� : " + sum14);
		System.out.println("2014�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum14/count14);
		System.out.println("2014�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min14);
		System.out.println("2014�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max14 + "\n");
		System.out.println("2015�⵵ �հ� : " + sum15);
		System.out.println("2015�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum15/count15);
		System.out.println("2015�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min15);
		System.out.println("2015�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max15 + "\n");
		System.out.println("2016�⵵ �հ� : " + sum16);
		System.out.println("2016�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum16/count16);
		System.out.println("2016�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min16);
		System.out.println("2016�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max16 + "\n");
		System.out.println("2017�⵵ �հ� : " + sum17);
		System.out.println("2017�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum17/count17);
		System.out.println("2017�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min17);
		System.out.println("2017�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max17 + "\n");
		System.out.println("2018�⵵ �հ� : " + sum18);
		System.out.println("2018�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum18/count18);
		System.out.println("2018�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min18);
		System.out.println("2018�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max18 + "\n");
		System.out.println("2019�⵵ �հ� : " + sum19);
		System.out.println("2019�⵵ 1ȸ ��ġ �� ��� ������ �� : " + sum19/count19);
		System.out.println("2019�⵵ 1ȸ ��ġ �� �ּ� ������ �� : " + min19);
		System.out.println("2019�⵵ 1ȸ ��ġ �� �ִ� ������ �� : " + max19 + "\n");
	}
}
