package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_5_�����Ⱦ�� {

	public static void main(String[] args) throws IOException {		//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\day_data\\THTSKS010H00.dat");	//dat���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));						//f���� BufferedReader ��ü �����Ͽ� �б�
		
		String k33_readtxt;								//���ڿ� readtxt ����
		int k33_LineCnt = 0;							//������ ���� LineCnt�� 0���� ���� (LineCnt�� �� ���� ī��Ʈ �� ��)
		int k33_n = -1;									//������ ���� n�� -1�� ���� (-1�� ���� ���� ���ٴ� �ǹ�)
		StringBuffer k33_s = new StringBuffer();		//StringBuffer s ��ü ����
		while (true) {									//�ݺ��� : ���� loop
			char[] k33_ch = new char[1000];				//���ھ� �迭 ch �����Ͽ� �� ���� 1000���� �е�����
			k33_n = k33_br.read(k33_ch);				//���� ������ ���� ���� �������, ����� �о����� ǥ��
			if (k33_n == -1) break;						//�� �̻� ���� ���� ������ break
			
			for (char k33_c : k33_ch) {					//�ݺ��� : ���ھ� c�� ch �迭��ŭ �ݺ�
				if (k33_c == '\n') {					//���ھ ���๮�ڸ�
					System.out.printf("[%s]***\n", k33_s.toString());	//StringBuffer s ���ڿ��� ��ȯ �� ��� ��
					k33_s.delete(0, k33_s.length());					//���±��� �߰����� ���ھ� ��� ����
				} else {								//���ھ ���๮�ڰ� �ƴϸ�
					k33_s.append(k33_c);				//StringBuffer s�� ���ھ� c�߰�����
				}
			}
			k33_LineCnt++;								//�� �� 1 �����ֱ�
		}
		System.out.printf("[%s]***\n", k33_s.toString());	//������ ���� ���๮�ڰ� �����Ƿ� �������� �߰��� s ���ڿ��� ��ȯ �� ���
		k33_br.close();										//BufferedReader ����
		
	}
}
