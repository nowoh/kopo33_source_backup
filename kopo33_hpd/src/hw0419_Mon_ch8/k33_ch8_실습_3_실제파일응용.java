package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_3_������������ {

	public static void main(String[] args) throws IOException {		//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\�������������������.csv");	//csv���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));						//f���� BufferedReader ��ü �����Ͽ� �б�
		
		String k33_readtxt;																		//���ڿ� readtxt ����
		
		if ((k33_readtxt = k33_br.readLine()) == null) {										//readtxt�� �� �� �о null�̸�
			System.out.printf("�� �����Դϴ�.\n");												//���ڿ� ����ϰ�
			return;																				//���� �Լ� ��
		}
		String[] k33_field_name = k33_readtxt.split(",");			//���ڿ� �迭 field_name�� readtxt�� ,�� ���� �͵��� ��ҷ� �޾Ƽ� ������
																	//csv������ ,�� �� ��ҵ��� ���еǾ���
																	//�� if������ br.readLine���� �� ���� readtxt�� �־ �о��� ������
																	//field_name �迭�� csv������ ù ��(�׸��̸�)�� �޾ƿ� ��
		int k33_LineCnt = 0;										//������ ���� LineCnt�� 0���� ���� (LineCnt�� �� ���� ī��Ʈ �� ��)
		while ((k33_readtxt = k33_br.readLine()) != null) {			//�ݺ��� : readtxt�� �� ���� �о null�� �ƴϸ� �ݺ� (field_name���� ���� �� ���� �ٺ��� read)
			String[] k33_field = k33_readtxt.split(",");			//���ڿ� �迭 field�� readtxt�� ,�� ���� �͵��� ��ҷ� �޾Ƽ� ������
																	//csv������ ,�� �� ��ҵ��� ���еǾ���
			System.out.printf("**[%d��° �׸�]*****************\n", k33_LineCnt);	//�� �� ���
			for (int j = 0; j < k33_field_name.length; j++) {						
														//�ݺ��� : ������ ���� j�� 0�̰�, j�� field_name �迭 ũ�� ������ 1�� �����ϸ� �ݺ�
				System.out.printf(" %s : %s\n", k33_field_name[j], k33_field[j]);
			}											//field_name�迭�� j��°, field �迭�� j��° ��� ���
			System.out.printf("***********************************\n");		//���ڿ� ���
			if (k33_LineCnt == 100) break;									//LineCnt�� 100�̸� �ݺ��� break
			k33_LineCnt++;													//LineCnt 1 �����ֱ�
		}
		
		k33_br.close();														//BufferedReader ����
	}
}
