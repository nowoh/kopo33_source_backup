package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_�ǽ�_4_���������3_2 {
	/*
	 * ������ ���3	(����ü ����)
	 */
	public static void main(String[] args) { 
		DecimalFormat k33_df = new DecimalFormat("###,###,###,###"); 
		Calendar k33_cal = Calendar.getInstance();
		SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat k33_sdf2 = new SimpleDateFormat("YYYYMMdd");
		Date k33_date = new Date();
		
		String[] k33_itemname = {"��������", "�ٳ�������", "���������500g�����ٶ�", "�������ֽ�", "���ڿ���", "���Թٳ���", "�������õ��1kg", "������", "������ݺ�����ġ��ȹ", "�޹�",
				"�η縶������", "����������Ĩ", "�ǵκ�", "ũ����", "���䷹��1.5L", "��� �Ŷ�� 5����", "��Ǫ����Ʈ", "û�����", "�ƽ�ȭ��Ʈ ���ͽ�", "�𳪹̺��� 0.7mm",
				"����ũ ź�θ� �߰�����", "����", "��������", "��Ϲ���Ĩ", "�����ƻ��ᳪ��", "�����ܾƸ��", "����400", "���������500ml", "���̳���500ml", "�ķ�������200ml"};
		int[] k33_price = {1000, 1500, 4000, 2000, 1000, 2000, 1500000, 2000, 2000, 1500, 
				4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
				1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};
		int[] k33_num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
				1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
				3, 2, 4, 1, 2, 2, 3, 2, 2, 3};
		boolean[] k33_taxfree = {false, false, true, false, false, true, true, false, false, false, 
				false, false, true, false, false, false, false, true, false, false,
				false, true, false, false, true, false, false, false, false, true};
		
		double k33_tax_rate = 0.1;
		
		int k33_tax_item_sum = 0;
		int k33_free_item_sum = 0;
		
		
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳���(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("%5s%19s %14s\n", "[�� ��]", k33_sdf1.format(k33_date), "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  �� ǰ ��          ��  �� ����     �� ��\n");
		System.out.printf("-----------------------------------------\n");
		for (int k33_i = 0; k33_i < k33_itemname.length; k33_i++) {
			int k33_sum = k33_price[k33_i] * k33_num[k33_i];
		
			String k33_temp = k33_itemname[k33_i] + "                     ";
//			cutStr(temp,2, 16);
//			byte[] bb = cutStr(temp,2, 16).getBytes();
//			temp = new String(bb, 0, 16);
	
		
					
			if (k33_taxfree[k33_i] == true) {
				System.out.printf("* %s%10s%3s%10s\n", cutStr(k33_temp,2, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_price[k33_i]*k33_num[k33_i]));
				k33_free_item_sum += k33_sum;
			} else if (k33_taxfree[k33_i] == false) {
				System.out.printf("  %s%10s%3s%10s\n", cutStr(k33_temp,2, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_price[k33_i]*k33_num[k33_i]));
				k33_tax_item_sum += k33_sum;
			}
			
			if ((k33_i+1) % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
			
		}
			
		
		System.out.println();
		System.out.printf("%21s%15d\n", "�� ǰ�� ����", k33_itemname.length);
		 
		System.out.printf("%22s%15s\n", "(*)�� ��  �� ǰ", k33_df.format(k33_free_item_sum));
		int k33_net_price = (int)(k33_tax_item_sum/(1+k33_tax_rate));
		System.out.printf("%22s%15s\n", "�� ��  �� ǰ", k33_df.format(k33_net_price));
		int tax_sum = k33_tax_item_sum - k33_net_price;
		System.out.printf("%23s%15s\n", "��   ��   ��", k33_df.format(tax_sum));
		int total_sum = k33_tax_item_sum + k33_free_item_sum;
		System.out.printf("%24s%15s\n", "��        ��", k33_df.format(total_sum));
		System.out.printf("%-20s%15s\n", "�� �� �� �� �� ��", k33_df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-18s%18s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%-13s%5s%15s\n", "ī�����(IC)", "�Ͻú� / ", k33_df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%-16s%18s\n", "��ȸ�߻�����Ʈ", "9350**9995    164");
		System.out.printf("%-16s%18s\n", "����(���)����Ʈ", "5,637(  5,473)");
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%-18s%18s\n", "������ȣ : ", "34��****");
		System.out.printf("%-18s%18s\n", "�����ð� : ", k33_sdf1.format(k33_date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-20s%18s\n", "ĳ��:084599 ��00 ", "1150");
		System.out.printf("\n");
		System.out.printf("%14s%10s\n", k33_sdf2.format(k33_date),"/00119861/00164980/31");
		
	}
	public static String cutStr(String inputStr, int KrByte, int maxByte) {
		byte[] inputByte = inputStr.getBytes();
		int cutByte = 0;
		for (int i = 0; i < inputStr.length() -1; i++) {
			if (includeKr(inputStr.substring(i, i + 1))) {
				if (cutByte + KrByte > maxByte) {
					//cutByte += 2;
					break;
				}
				cutByte += KrByte;
			} else {
				if (cutByte + 1 > maxByte) {
					break;
				}
				cutByte += 1;
			}
		}
		if (cutByte < maxByte) {
			cutByte += 1;
		}
		return new String (inputByte, 0, cutByte);
	}
	
	public static boolean includeKr(String input) {
		for (int k = 0; k < input.length(); k++) {
			if (Character.getType(input.charAt(k)) == Character.OTHER_LETTER) {
				return true;
			}
		}
		return false;
	}

}
