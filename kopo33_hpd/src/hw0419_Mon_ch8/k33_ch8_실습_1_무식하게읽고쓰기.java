package hw0419_Mon_ch8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class k33_ch8_�ǽ�_1_�����ϰ��а��� {

	public static void main(String[] args) {	//�����Լ�
		try {									//try ����
			File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");	//k33.txt���� f���Ϸ� �ҷ����� (������ ����)	
			FileWriter k33_fw = new FileWriter(k33_f);						//f ���Ͽ� FileWriter ��ü �����Ͽ� ����
			
			k33_fw.write("�ȳ� ����\n");									//fw�� ���ڿ� ����
			k33_fw.write("hello ���\n");									//fw�� ���ڿ� ����
			
			k33_fw.close();													//FileWriter ����
			
			FileReader k33_fr = new FileReader(k33_f);						//FileReader�� f ���� �б�
			
			int k33_n = -1;													//������ ���� n�� -1�� ���� (-1�� ���� ���� ���ٴ� �ǹ�)
			char[] k33_ch;													//char �迭 ch ����
			
			while (true) {													//�ݺ��� : ���� loop
				k33_ch = new char [100];									//���ھ� �迭 ch �����Ͽ� �� ���� 100���� �е�����
				k33_n = k33_fr.read(k33_ch);								//���� ������ ���� ���� �������, ����� �о����� ǥ��
				
				if (k33_n == -1) break;										//�� �̻� ���� ���� ������ break
				
				for (int k33_i = 0; k33_i < k33_n; k33_i++) {				//�ݺ��� : ������ ���� i�� 0�̰�, i�� n������ 1�� �����ϸ� �ݺ�
					System.out.printf("%c", k33_ch[k33_i]);					//�迭 ch�� �ִ� ���ھ� ������� ���
				}
			}
			k33_fr.close();													//FileReader ����
			
			System.out.printf("\n FILE READ END ");							//���ڿ� ���
		} catch (Exception k33_e) {											//���ܹ� (catch)		
			System.out.printf("�� ����[%s]\n", k33_e);						//error�� ���� ���ڿ� ����ϰ� error ���� ���
		}
	}
}
