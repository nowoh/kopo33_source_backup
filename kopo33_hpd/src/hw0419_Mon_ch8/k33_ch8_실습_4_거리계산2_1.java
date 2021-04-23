package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_4_�Ÿ����2_1 {
	/*
	 * ���� ������� �츮�� ���� �Ÿ� ���
	 */

	public static void main(String[] args) throws IOException {			//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\��������������ǥ�ص�����.txt");	//txt���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));			//f���� BufferedReader ��ü �����Ͽ� �б�
		
		String k33_readtxt;															//���ڿ� readtxt ����
		
		if ((k33_readtxt = k33_br.readLine()) == null) {							//readtxt�� �� �� �о null�̸�
			System.out.printf("�� �����Դϴ�.\n");									//���ڿ� ����ϰ�
			return;																	//���� �Լ� ��
		}
		String[] k33_field_name = k33_readtxt.split("\t");							//���ڿ� �迭 field_name�� readtxt�� \t���� ���� �͵��� ��ҷ� �޾Ƽ� ������
																					//txt������ \t���� �� ��ҵ��� ���еǾ���
																					//�� if������ br.readLine���� �� ���� readtxt�� �־ �о��� ������
																					//field_name �迭�� txt������ ù ��(�׸��̸�)�� �޾ƿ� ��
		double k33_lat = 37.4053477;							//�Ǽ��� ���� lat 37.4053477���� ���� (lat�� �Ǳ��� 654(k33_��) ����)
		double k33_lng = 127.1448235;							//�Ǽ��� ���� lng 127.1448235�� ���� (lng�� �Ǳ��� 654(k33_��) �浵)
		
		int k33_LineCnt = 1;									//������ ���� LineCnt�� 1���� ���� (LineCnt�� �� ���� ī��Ʈ �� ��)
		double k33_min = Double.MAX_VALUE;						//�Ǽ��� ���� min�� Double�� �ִ밪���� ����
		double k33_max = Double.MIN_VALUE;						//�Ǽ��� ���� max�� Double�� �ּҰ����� ����
		String k33_min_field = null;							//���ڿ� ���� min_field�� null ������ ����
		String k33_max_field = null;							//���ڿ� ���� max_field�� null ������ ����
		String k33_min_adr = null;								//���ڿ� ���� min_adr�� null ������ ����
		String k33_max_adr = null;								//���ڿ� ���� max_adr�� null ������ ����
		
		while ((k33_readtxt = k33_br.readLine()) != null) {		//�ݺ��� : readtxt�� �� ���� �о null�� �ƴϸ� �ݺ� (field_name���� ���� �� ���� �ٺ��� read)
			
			String[] k33_field = k33_readtxt.split("\t");		//���ڿ� �迭 field�� readtxt�� \t���� ���� �͵��� ��ҷ� �޾Ƽ� ������
																//txt������ \t���� �� ��ҵ��� ���еǾ���
			if (k33_field[28] == "" || k33_field[29] == "") {	//field �迭�� 21��° ��ҳ� 20��° ��Ұ� �����̸� 
																//2 ���� �� �ϳ��� �����ϸ� �ƹ��͵� ���� ����
			} else {											//�׷��� ������ (field �迭�� 21��° ��ҿ� 20��° ��Ұ� �� �� ������ �ƴϸ�)
				System.out.printf("**[%d��° �׸�]*****************\n", k33_LineCnt);	//�� �� ���
				System.out.printf(" %s : %s\n", k33_field_name[1], k33_field[1]);		//field_name�迭�� 1��° ��ҿ� field�迭�� 1��° ��� ��� (�����������ּ� ���)
				System.out.printf(" %s : %s\n", k33_field_name[28], k33_field[28]);		//field_name�迭�� 28��° ��ҿ� field�迭�� 28��° ��� ��� (���� ���)
				System.out.printf(" %s : %s\n", k33_field_name[29], k33_field[29]);		//field_name�迭�� 29��° ��ҿ� field�迭�� 29��° ��� ��� (�浵 ���)
				
				double k33_dist = Math.sqrt( Math.pow(Double.parseDouble(k33_field[28])-k33_lat, 2)	//Math.sqrt�� Math.pow �̿��Ͽ� k33_���� �� ���θ��ּ��� ���� �浵 ���Ͽ�
						+ Math.pow(Double.parseDouble(k33_field[29])-k33_lng, 2));					//k33_������ �Ÿ��� ���Ѵ��� ���� ���� �Ǽ��� ���� dist�� ����
				System.out.printf(" ���������� �Ÿ� : %f\n",k33_dist);								//k33_������ �Ÿ� ���
				System.out.printf("********************************\n");							//���ڿ� ���

				if (k33_min > k33_dist) {						//���ǹ� : min�� dist���� ũ��
					k33_min = k33_dist;							//min�� dist�� �������ϰ�
					k33_min_field = k33_field[1];				//min_field�� field �迭�� 1��° ��ҷ� ������
					k33_min_adr = k33_field[4];
				} else if (k33_max < k33_dist) {				//���ǹ� : max�� dist���� ������
					k33_max = k33_dist;							//max�� dist�� �������ϰ�
					k33_max_field = k33_field[1];				//max_field�� field �迭�� 1��° ��ҷ� ������
					k33_max_adr = k33_field[4];
				}
			}
			k33_LineCnt++;									//�� �� 1 �����ֱ�
		}
		System.out.printf("%s : %s\n%s : %s\n%s : %f\n", "�ּҰŸ����� ������", k33_min_field, "������ �ּ�", k33_min_adr, "�Ÿ�", k33_min);	
																	//���� �ּҰŸ����� �������� ������ �ּҿ� k33_������ �Ÿ� ���
		System.out.printf("%s : %s\n%s : %s\n%s : %f\n", "�ִ�Ÿ����� ������", k33_max_field, "������ �ּ�", k33_max_adr, "�Ÿ�", k33_max);	
																	//���� �ִ�Ÿ����� �������� ������ �ּҿ� k33_������ �Ÿ� ���
		k33_br.close();																				//BufferedReader ����
	}
}
