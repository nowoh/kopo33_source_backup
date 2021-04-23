package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_�ǽ�_4_���������3_final {
	/*
	 * ������ ���3	(����ü ����)
	 */
	public static void main(String[] args) { 								//�����Լ�
		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");  		//DecimalFormat ��ü ����
		Calendar k33_cal = Calendar.getInstance();							//����ð����� Calendar ����
		SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	//SimpleDateFormat ��ü ����1
		SimpleDateFormat k33_sdf2 = new SimpleDateFormat("YYYYMMdd");				//SimpleDateFormat ��ü ����2
		SimpleDateFormat k33_sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm");		//SimpleDateFormat ��ü ����3
		k33_cal.add(Calendar.HOUR_OF_DAY, -1);										//cal.add�� ���� �ð����� 1�ð� ����
		Date k33_date = new Date();													//���� ��¥ ��ü ����
		
		String[] k33_itemname = {"��������", "�ٳ�������", "���������500g�����ٶ�", "�������ֽ�", "���ڿ���", "���Թٳ���", "�������õ��1kg", "������", "������ݺ�����ġ��ȹ", "�޹�",
				"�η縶������", "����������Ĩ", "�ǵκ�", "ũ����", "���䷹��1.5L", "��� �Ŷ�� 5����", "��Ǫ����Ʈ", "û�����", "�ƽ�ȭ��Ʈ ���ͽ�", "�𳪹̺��� 0.7mm",
				"����ũ ź�θ� �߰�����", "����", "��������", "��Ϲ���Ĩ", "�����ƻ��ᳪ��", "�����ܾƸ��", "����400", "���������500ml", "���̳���500ml", "�ķ�������200ml"};
																										//���ڿ� �迭 itemname ���� (��ǰ��)
		int[] k33_price = {1000, 1500, 4000, 2000, 1000, 2000, 1500, 2000, 2000, 1500, 
				4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
				1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};								//������ �迭 price ���� (��ǰ����)
		int[] k33_num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
				1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
				3, 2, 4, 1, 2, 2, 3, 2, 2, 3};															//������ �迭 num ���� (��ǰ����)
		boolean[] k33_taxfree = {false, false, true, false, false, true, true, false, false, false, 
				false, false, true, false, false, false, false, true, false, false,
				false, true, false, false, true, false, false, false, false, true};						//boolean �迭 taxfree ���� (true=�鼼, false=����)
		
		double k33_tax_rate = 0.1;																		//�Ǽ��� ���� tax_rate 0.1�� ���� (����)
		int k33_tax_item_sum = 0;																		//������ ���� tax_item_sum 0���� �ʱ�ȭ (���� ��ǰ �ݾ� �հ�)
		int k33_free_item_sum = 0;																		//������ ���� free_item_sum 0���� �ʱ�ȭ (�鼼 ��ǰ �ݾ� �հ�)

		
		System.out.printf("%-12s%s\n", "emart", "�̸�Ʈ ������ (031) 888-1234");						//���ڿ� 2�� 12�ڸ� Ȯ���ϰ� ��������, �ٷ� �ٿ��� ������ ���
		System.out.printf("%-12s%s\n", "","206-86-50913 ����");										//���ڿ� 2�� 12�ڸ� Ȯ���ϰ� ��������, �ٷ� �ٿ��� ������ ���
		System.out.printf("%-12s%s\n", "","���� ������ ������� 552");									//���ڿ� 2�� 12�ڸ� Ȯ���ϰ� ��������, �ٷ� �ٿ��� ������ ���
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");									//���ڿ� 1�� ���
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");								//���ڿ� 1�� ���
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");							//���ڿ� 1�� ���
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");						//���ڿ� 1�� ���, �� �� �� �ٲٱ�
		System.out.printf("%5s%-19s %14s\n", "[�� ��]", k33_sdf3.format(k33_date), "POS:0011-9861");	//���ڿ� 3�� 5�ڸ� Ȯ���ϰ� ��������, 19�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		System.out.printf("  �� ǰ ��          ��  �� ����     �� ��\n");								//���ڿ� 1�� ���
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		for (int k33_i = 0; k33_i < k33_itemname.length; k33_i++) {					//�ݺ��� : ������ ���� i�� 0�̰�, i�� itemname���� ������ 1�� �����ϸ� �ݺ�
			int k33_sum = k33_price[k33_i] * k33_num[k33_i];						//������ ���� sum�� price �迭�� num �迭�� i��°������ ���� ���� ���� ������ ���� (�� ǰ���� �ݾ� �հ�)
			String k33_temp = k33_itemname[k33_i];									//���ڿ�  temp�� itemname �迭�� i��° ��ҷ� ����
			
			if (k33_taxfree[k33_i] == true) {										//���ǹ� : taxfree�迭�� i��° ���� true�� (�鼼�̸�)
				System.out.printf("* %s%10s%3s%10s\n", k33_cutStr(k33_temp,16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));
																					//���ڿ� 4�� ��� (temp�� cutStr �޼ҵ�� 16Byte���̷�  ó��, ��ǰ����, ����, �հ� ���)
				k33_free_item_sum += k33_sum;										//free_item_sum�� sum �����ֱ�
			} else if (k33_taxfree[k33_i] == false) {								//���ǹ� : taxfree�迭�� i��° ���� false�� (�����̸�)
				System.out.printf("  %s%10s%3s%10s\n", k33_cutStr(k33_temp, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));
																					//���ڿ� 4�� ��� (temp�� cutStr �޼ҵ�� 16Byte���̷�  ó��, ��ǰ����, ����, �հ� ���)
				k33_tax_item_sum += k33_sum;										//tax_item_sum�� sum �����ֱ�
			}
			
			if ((k33_i+1) % 5 == 0) {												//���ǹ�  : i+1�� 5�� ���� �������� 0�̸�
				System.out.printf("-----------------------------------------\n");	//���ڿ� 1�� ���
			}																		//5�� ���� �� �׾��ֱ�
			
		}
		System.out.println();																			//�� �ٲٱ�
		System.out.printf("%22s%14d\n", "�� ǰ�� ����", k33_itemname.length);							//���ڿ� 1�� 22�ڸ� Ȯ���ϰ� ��������, ���� 14�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (itemname�迭 ����)
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k33_df.format(k33_free_item_sum));			//���ڿ� 2�� 23�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�鼼 ��ǰ �ݾ� �հ�)
		
		int k33_net_price = (int)(k33_tax_item_sum/(1+k33_tax_rate));									//������ ���� net_price�� tax_item_sum/(1+tax_rate) �� ������ ����
																										//net_price�� ���������� �ǹ�, ���������� �Һ��ڰ���/(�Һ��ڰ���+����)�� ���� �� ����
																										//������ �Ǽ����� ������ ������ ���;��ϹǷ� ���� �� integer�� �� ��ȯ����
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k33_df.format(k33_net_price));					//���ڿ� 2�� 23�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���� ��ǰ ���� �ݾ� �հ�)
		
		int k33_tax_sum = k33_tax_item_sum - k33_net_price;												//������ ���� tax_sum�� tax_item_sum���� net_price ���� ������ ����
																										//���� �հ� ����(�Һ��� ����)���� ���� ������ �� �� = ���� (�ΰ���)
		System.out.printf("%24s%14s\n", "��   ��   ��", k33_df.format(k33_tax_sum));					//���ڿ� 2�� 24�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���� ��ǰ �ΰ��� �հ�)
		
		int k33_total_sum = k33_tax_item_sum + k33_free_item_sum;										//������ ���� total_sum�� tax_item_sum�� free_item_sum ���� ������ ���� (�� ��ǰ �ݾ� �հ�)
		
		System.out.printf("%25s%14s\n", "��        ��", k33_df.format(k33_total_sum));					//���ڿ� 2�� 25�ڸ� Ȯ���ϰ� ��������, 14�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�� ��ǰ �ݾ� �հ�)
		System.out.printf("%-20s%15s\n", "�� �� �� �� �� ��", k33_df.format(k33_total_sum));			//���ڿ� 2�� 20�ڸ� Ȯ���ϰ� ��������, 15�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�� ��ǰ �ݾ� �հ�)
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		System.out.printf("%-18s%18s\n", "0012 KEB �ϳ�", "541707**0484/35860658");						//���ڿ� 2�� 18�ڸ� Ȯ���ϰ� ��������, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-14s%20s\n", "ī�����(IC)", "�Ͻú� / " + k33_df.format(k33_total_sum));	//���ڿ� 2�� 14�ڸ� Ȯ���ϰ� ��������, 20�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�� ��ǰ �ݾ� �հ�)
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		System.out.printf("%21s\n", "[�ż�������Ʈ ����]");												//���ڿ� 1�� 21�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");									//���ڿ� 1�� ���
		
		int k33_ePoint = 5473;																			//������ ���� ePoint�� 5473d���� ���� (���� ����Ʈ)			
	    int k33_ocPoint = (int)(k33_total_sum/1000);													//������ ���� ocPoint�� total_sum/1000���� ���� (���� �ݾ��� 0.1%�� �߻� ����Ʈ�� ����, �Ҽ������� ����)
		int k33_acPoint = k33_ocPoint + k33_ePoint;														//������ ���� acPoint�� ocPoint�� ePoint ���� ������ ���� (���� ����Ʈ�� ���� ����Ʈ�� �߻� ����Ʈ�� ���� ��)
		
		System.out.printf("%-14s%8s%10s\n", "��ȸ�߻�����Ʈ", "9350**9995", k33_df.format(k33_ocPoint));	//���ڿ� 3�� 14�ڸ� Ȯ���ϰ� ��������, 8�ڸ� Ȯ���ϰ� ��������, 10�ڸ� Ȯ���ϰ� ���������Ͽ� ���
																											//(�߻� ����Ʈ ���)
		System.out.printf("%-14s%10s%10s\n", "����(����)����Ʈ", k33_df.format(k33_acPoint)+"(", k33_df.format(k33_ePoint) + ")");
																										//���ڿ� 3�� 14�ڸ� Ȯ���ϰ� ��������, 10�ڸ� Ȯ���ϰ� ��������, 10�ڸ� Ȯ���ϰ� ���������Ͽ� ���
																										//(���� ����Ʈ, ���� ����Ʈ ���)
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");								//���ڿ� 1�� ���
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");								//���ڿ� 1�� 22�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-18s%18s\n", "������ȣ : ", "34��****");									//���ڿ� 2�� 18�ڸ� Ȯ���ϰ� ��������, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-18s%18s\n", "�����ð� : ", k33_sdf1.format(k33_cal.getTime()));			//���ڿ� 2�� 18�ڸ� Ȯ���ϰ� ��������, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (1�ð� �� �ð����� ���, ���Ƿ� ����)
		System.out.printf("-----------------------------------------\n");								//���ڿ� 1�� ���
		System.out.printf("%-20s%18s\n", "ĳ��:084599 ��00 ", "1150");									//���ڿ� 2�� 20�ڸ� Ȯ���ϰ� ��������, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("\n");																		//�� �ٲٱ�	
		for (int k33_i =0; k33_i < 3; k33_i++) {														//�ݺ��� : ������ ���� i�� 0�̰�, 3 ������ 1�� �����ϸ� �ݺ�
			System.out.println("        ||||||||||||||||||||||||||      ");								//���ڵ� ���
		}
		System.out.printf("%15s%10s\n", k33_sdf2.format(k33_date),"/00119861/00164980/31");				//���ڿ� 2�� 15�ڸ� Ȯ���ϰ� ��������, 10�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���ڵ� ��ȣ ���� ó���� ���� ��¥)
		
	}
	public static String k33_cutStr(String k33_inputStr, int k33_maxByte) {	//������ ������ �� �ְ� ������ cutStr �޼ҵ� ���� (���ڸ� string inputStr�� integer maxByte�� �ް� string�� ����) 
		for (int k33_i = 0; k33_i <= k33_maxByte; k33_i++) {				//�ݺ��� : ������ ���� i�� 0�̰�, i�� maxByte���� 1�� �����ϸ鼭 �ݺ�
			k33_inputStr += " "; 											//inputStr�� " "�߰� (inputStr�� �� �ڸ� ���ڵ� maxByte �� ��ŭ " " ä����)
		}
		byte[] k33_inputByte = k33_inputStr.getBytes();						//byte �迭 inputByte�� inputStr.getBytes()�� ���� => inputStr�� ����Ʈ �迭 ��������
		StringBuffer k33_buf = new StringBuffer(k33_inputStr);				//StringBuffer buf�� inputStr�� ���ڷ� �޾Ƽ� ����
		int k33_cutByte = 0;												//������ ���� cutByte�� 0���� ����
		for (int k33_i = 0; k33_i < k33_inputStr.length() -1; k33_i++) {
																//�ݺ��� : ������ ���� i�� 0�̰�, inputStr����-1 ������ 1�� �����ϸ鼭 �ݺ� (i�� 0���� �����ϱ� ������ inputStr����-1�� ����)
			if (k33_includeKr(k33_inputStr.substring(k33_i, k33_i + 1))) {	//���ǹ� : inputStr�� i��° ���ڰ� includeKr �޼ҵ忡 ���� true�� (i��° ���ڰ� �ѱ��̸�)
				if (k33_cutByte + 1 == k33_maxByte) {						//���ǹ� : cutByte +1 �� ���� maxByte�� ������ (�ѱ��� maxByte���� ��Ȯ�� ������ �ʴ� ���)
					k33_buf.insert(k33_i, "    ");							//buf�� i��° ���� �ڿ� "    " �߰�����
					k33_inputStr = k33_buf.toString();						//inputStr�� ���ڿ� �߰����� buf�� String���� �� ��ȯ�� ������ ������ 
					k33_inputByte = k33_inputStr.getBytes();				//�������� inputStr�� getBytes()�� inputByte ������
					k33_cutByte += 1;										//cutByte�� 1 ������ 
																			//�ѱ��� maxByte�� ���ļ� ©���� �Ǹ� cutByte�� maxByte-1�̹Ƿ� 1�� ���������ν� maxByte�� ���� �������
					break;													//break
				} else if (k33_cutByte == k33_maxByte) {					//���ǹ� : cutByte���� maxByte�� ������ (�ѱ��� maxByte���� ��Ȯ�� ������ ���)
					break;													//break
				}
				k33_cutByte += 2;											//(cutByte+1�� cutByte�� maxByte�� ���� ������) cutByte�� 2 ������ (�ѱ��� ��� 2����Ʈ�� �����ִ� ��)
			} else {														//�׷��� ������ (i��° ���ڰ� �ѱ��� �ƴϸ�)
				if (k33_cutByte + 1 > k33_maxByte) {						//���ǹ� : cutByte�� 1 ���� ���� maxByte���� ũ��
					break;													//break
				}
				k33_cutByte += 1;											//(cutByte�� 1 ���� ���� maxByte���� ũ�� ������) cutByte�� 1�� ������ (�ѱ��� �ƴ� ��쿣 1����Ʈ�� �����ִ� ��)
			} 
			
		}	
		return new String (k33_inputByte, 0, k33_cutByte);					//inputByte�� Byte�� ���� ���ڿ��� 0~cutByte Byte���� ���ο� ���ڿ��� ����
	}
	
	public static boolean k33_includeKr(String k33_input) {					//������ ������ �� �ְ� ������ includeKr �޼ҵ� ���� (���ڸ� string input���� �ް� boolean�� ����)
		for (int k33_k = 0; k33_k < k33_input.length(); k33_k++) {			//�ݺ��� : k�� 0�̰�, k�� input ���� ������ 1�� �����ϸ鼭 �ݺ�
			if (Character.getType(k33_input.charAt(k33_k)) == Character.OTHER_LETTER) {	//���ǹ� : input�� k��° ���ھ��� type�� �ƽ�Ű�ڵ尡 �ƴ� ���ڸ� (ex: �ѱ�)
				return true;																//true ����
			}																				
		}
		return false;														//for������ return���� �� ������ for�� �������ͼ� false ����
	}
}
