package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_4_�Ÿ����1 {
	
	public static void main(String[] args) throws IOException {		//�����Լ�, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\howon\\�������������������.txt");	//txt���� File ��ü �����Ͽ� �ҷ�����
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));				//f���� BufferedReader ��ü �����Ͽ� �б�
		
		String k33_readtxt;																//���ڿ� readtxt ����
		
		if ((k33_readtxt = k33_br.readLine()) == null) {								//readtxt�� �� �� �о null�̸�
			System.out.printf("�� �����Դϴ�.\n");										//���ڿ� ����ϰ�
			return;																		//���� �Լ� ��
		}
		String[] k33_field_name = k33_readtxt.split("\t");								//���ڿ� �迭 field_name�� readtxt�� \t���� ���� �͵��� ��ҷ� �޾Ƽ� ������
																						//txt������ \t���� �� ��ҵ��� ���еǾ���
																						//�� if������ br.readLine���� �� ���� readtxt�� �־ �о��� ������
																						//field_name �迭�� txt������ ù ��(�׸��̸�)�� �޾ƿ� ��
		double k33_lat = 37.3860521;													//�Ǽ��� ���� lat 37.3860521���� ���� (lat�� �д������ ����)
		double k33_lng = 127.1214038;													//�Ǽ��� ���� lng 127.1214038�� ���� (lng�� �д������ �浵)
			
		int k33_LineCnt = 1;								//������ ���� LineCnt�� 1���� ���� (LineCnt�� �� ���� ī��Ʈ �� ��)									
		double k33_min = Double.MAX_VALUE;					//�Ǽ��� ���� min�� Double�� �ִ밪���� ����
		double k33_max = Double.MIN_VALUE;					//�Ǽ��� ���� max�� Double�� �ּҰ����� ����
		String k33_min_field = null;						//���ڿ� ���� min_field�� null ������ ����
		String k33_max_field = null;						//���ڿ� ���� max_field�� null ������ ����
		String k33_min_lat = null;							//���ڿ� ���� min_lat�� null ������ ����
		String k33_min_lng = null;							//���ڿ� ���� min_lng�� null ������ ����
		String k33_max_lat = null;							//���ڿ� ���� max_lat�� null ������ ����
		String k33_max_lng = null;							//���ڿ� ���� max_lng_field�� null ������ ����
		
		while ((k33_readtxt = k33_br.readLine()) != null) {	//�ݺ��� : readtxt�� �� ���� �о null�� �ƴϸ� �ݺ� (field_name���� ���� �� ���� �ٺ��� read)
			
			String[] k33_field = k33_readtxt.split("\t");	//���ڿ� �迭 field�� readtxt�� \t���� ���� �͵��� ��ҷ� �޾Ƽ� ������
															//txt������ \t���� �� ��ҵ��� ���еǾ���
			System.out.printf("**[%d��° �׸�]*****************\n", k33_LineCnt);	//�� �� ���
			System.out.printf(" %s : %s\n", k33_field_name[9], k33_field[9]);		//field_name�迭�� 9��° ��ҿ� field�迭�� 9��° ��� ��� (���������θ��ּ� ���)
			System.out.printf(" %s : %s\n", k33_field_name[13], k33_field[13]);		//field_name�迭�� 13��° ��ҿ� field�迭�� 13��° ��� ��� (���� ���)
			System.out.printf(" %s : %s\n", k33_field_name[14], k33_field[14]);		//field_name�迭�� 14��° ��ҿ� field�迭�� 14��° ��� ��� (�浵 ���)
			double k33_dist = Math.sqrt( Math.pow(Double.parseDouble(k33_field[13])-k33_lat, 2)	//Math.sqrt�� Math.pow �̿��Ͽ� �д�������� �� ���θ��ּ��� ���� �浵 ���Ͽ� 
					+ Math.pow(Double.parseDouble(k33_field[14])-k33_lng, 2));					//�д���������� �Ÿ��� ���Ѵ��� ���� ���� �Ǽ��� ���� dist�� ����
			System.out.printf(" ���������� �Ÿ� : %f\n",k33_dist);								//�д���������� �Ÿ� ���
			System.out.printf("********************************\n");							//���ڿ� ���

			if (k33_min > k33_dist) {															//���ǹ� : min�� dist���� ũ��
				k33_min = k33_dist;																//min�� dist�� �������ϰ� (�ּҰŸ�)
				k33_min_field = k33_field[9];													//min_field�� field �迭�� 9��° ��ҷ� ������ (�ּҰŸ��� �ּ�)
				k33_min_lat = k33_field[13];													//min_lat�� field �迭�� 13��° ��ҷ� ������ (�ּҰŸ��� ����)
				k33_min_lng = k33_field[14];													//min_lng�� field �迭�� 14��° ��ҷ� ������ (�ּҰŸ��� �浵)
			} else if (k33_max < k33_dist) {													//���ǹ� : max�� dist���� ������
				k33_max = k33_dist;																//max�� dist�� �������ϰ� (�ִ�Ÿ�)
				k33_max_field = k33_field[9];													//max_field�� field �迭�� 9��° ��ҷ� ������ (�ִ�Ÿ��� �ּ�)
				k33_max_lat = k33_field[13];													//max_lat�� field �迭�� 13��° ��ҷ� ������ (�ִ�Ÿ��� ����)
				k33_max_lng = k33_field[14];													//max_lng�� field �迭�� 14��° ��ҷ� ������ (�ִ�Ÿ��� �浵)
				
			}	
			k33_LineCnt++;																		//�� �� 1 �����ֱ�
		}
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "�ּҰŸ�����", k33_min_field, "����", k33_min_lat, "�浵", k33_min_lng, "�Ÿ�", k33_min);	
																								//���� �ּҰŸ����� ���θ��ּҿ� ����, �浵, �д���������� �Ÿ� ���
		System.out.printf("%s : %s\n%s : %s\n%s : %s\n%s : %f\n", "�ִ�Ÿ�����", k33_max_field, "����", k33_max_lat, "�浵", k33_max_lng, "�Ÿ�", k33_max);	
																								//���� �ִ�Ÿ����� ���θ��ּҿ� ����, �浵, �д���������� �Ÿ� ���
		k33_br.close();																			//BufferedReader ����
	}
}
