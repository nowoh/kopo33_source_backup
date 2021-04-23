package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_6_4_����2015 {
	
	public static void main(String[] args) throws IOException {		//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\day_data\\\\THTSKS010H00.dat");	//dat���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));							//f���� BufferedReader ��ü �����Ͽ� �б�
		
		File k33_f1 = new File("C:\\Users\\Howon\\Desktop\\howon\\����2015.csv");					//csv���� File ��ü �����Ͽ� �ҷ�����
		BufferedWriter k33_bw1 = new BufferedWriter(new FileWriter(k33_f1));						//f���� BufferedWriter ��ü �����Ͽ� ����
		
		String k33_readtxt;																			//���ڿ� readtxt ����
		
		int k33_cnt = 0; int k33_wcnt = 0;															//������ ���� cnt�� wcnt ���� 0���� ����		
		while ((k33_readtxt = k33_br.readLine()) != null) {											//�ݺ��� : readtxt�� �� �پ� �о null�� �ƴϸ� �ݺ�
			StringBuffer k33_s = new StringBuffer();												//StringBuffer s ��ü ����
			String[] k33_field = k33_readtxt.split("%_%");											//���ڿ� �迭 field�� readtxt�� %_%�������� ���� �͵��� ��ҷ� �޾Ƽ� ������
			//dat������ %_%�� �������� �и��� �� ����
			if(k33_field.length > 2 && k33_field[2].replace("^", "").trim().equals("A005930") && k33_field[1].replace("^", "").trim().substring(0, 4).equals("2015")) {
			//���ǹ� : field �迭�� ���̰� 2���� ũ�� field�迭�� [2]��° ����� ^�� ���ְ� �յ� ������ ���� ���� ���ڿ��� A005930�� ������ ���ÿ�
			//field�迭�� [1]��° ����� ^�� ���ְ� �յ� ������ ���� ���� ���ڿ��� 20150112�� ������ true (�� ���� ��� ������Ű�� ��)
			//A005930�� �Ｚ������ �����ڵ��̰� 20150112�� 2015�� 1�� 12�Ͽ� �ŷ��Ǿ��ٴ� ���� �ǹ��ϴ� ����
				
				k33_s.append(k33_field[0].replace("^","").trim());									//StringBuffer s�� field�迭 [0]��° ��� ^�� ���ְ� ������ ���� ���� �ٿ��ֱ�
																									//ù ���� �޸�(,)�� �� �־��ֱ� ������ ���� ���� ��������
				for (int k33_j = 1; k33_j < k33_field.length; k33_j++) {							//�ݺ��� : ������ ���� j�� 1�̰�, j�� field�迭�� ���������� 1�� �����ϸ� �ݺ�
					k33_s.append("," + k33_field[k33_j].replace("^","").trim());					//StringBuffer s�� �޸�(,)�� field�迭 [j]��° ��� ^�� ���ְ� ������ ���� ���� �ٿ��ֱ�
				}
				k33_bw1.write(k33_s.toString()); k33_bw1.newLine();									//bw1�� ���� s�� ���ڿ��� ����ȯ ���ش��� ������ ���� ���� �ٲ���
				k33_wcnt++;																			//wcnt�� 1�� ������
			}
			k33_cnt++;																				//cnt�� 1�� ������
		}
		k33_br.close();																				//BufferedReader ����
		k33_bw1.close();																			//BufferedWriter ����
		
		System.out.printf("Program End[%d][%d]records\n", k33_cnt, k33_wcnt);						//���ڿ��� cnt���� wcnt���� ���� ���
	}																								//wcnt�� �� Ƚ��, cnt�� ���� Ƚ��
}
