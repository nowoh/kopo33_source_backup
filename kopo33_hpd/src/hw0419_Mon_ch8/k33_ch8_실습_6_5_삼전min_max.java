package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class k33_ch8_�ǽ�_6_5_����min_max {
	
	public static void main(String[] args) throws IOException {						//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\����2015.csv");	//csv���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));		//f���� BufferedReader ��ü �����Ͽ� �б�
		DecimalFormat df = new DecimalFormat("###,###,###,###");				//DecimalFormat df ��ü ����
		
		String k33_readtxt;														//���ڿ� readtxt ����
		
		int k33_min = Integer.MAX_VALUE;										//������ ���� min�� Integer�� �ִ밪���� ����
		int k33_max = Integer.MIN_VALUE;										//������ ���� max�� Integer�� �ּҰ����� ����
		String k33_min_date = null;												//���ڿ� min_date�� null�� ����
		String k33_max_date = null;												//���ڿ� max_date�� null�� ����
		
		int k33_cnt = 0;														//������ ���� cnt�� 0���� ���� (cnt�� �ŷ��Ǽ�)
		while ((k33_readtxt = k33_br.readLine()) != null) {						//�ݺ��� : readtxt�� �� ���� �о null�� �ƴϸ� �ݺ�
			
			String[] k33_field = k33_readtxt.split(",");						//���ڿ� �迭 field�� readtxt�� �޸�(,)�� ���� �͵��� ��ҷ� �޾Ƽ� ������
			
			int k33_price = Integer.parseInt(k33_field[3]);						//������ ���� price�� field�迭�� [3]��° ��Ҹ� Integer�� �� ��ȯ���� ������ ����	
			
			if (k33_min > k33_price) {											//���ǹ� : min�� price���� ũ��
				k33_min = k33_price;											//min�� price�� �������ְ�
				k33_min_date = k33_field[1];									//�� ���� field�迭 [1] ���� min_date�� �������� 
			} else if (k33_max < k33_price) {									//���ǹ� : max�� price���� ������
				k33_max = k33_price;											//max�� price�� �������ְ�
				k33_max_date = k33_field[1];									//�� ���� field�迭 [1] ���� max_date�� �������� 
			}
			k33_cnt++;															//cnt�� 1�� ������
		}
		System.out.printf("�� �ŷ��Ǽ� : %s��\n", k33_cnt);
		System.out.printf("%s : %s �� (%s : %s)\n", "�ּ� ������", df.format(k33_min), "�ŷ� ����", k33_min_date);	//�ּ������� min���� �� �ŷ����� min_date ���
		System.out.printf("%s : %s �� (%s : %s)\n", "�ִ� ������", df.format(k33_max), "�ŷ� ����", k33_max_date);	//�ּ������� min���� �� �ŷ����� min_date ���
		k33_br.close();																								//BufferedReader ����
	}
}
