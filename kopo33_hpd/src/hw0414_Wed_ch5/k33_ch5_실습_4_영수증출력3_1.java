package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_�ǽ�_4_���������3_1 {
	/*
	 * ������ ���3	(����ü ����)
	 */
	public static void main(String[] args) { 
		DecimalFormat df = new DecimalFormat("###,###,###,###"); 
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYYMMdd");
		Date date = new Date();
		
		String[] itemname = {"��������", "�ٳ�������", "���������500g�����ٶ�", "�������ֽ�", "���ڿ���", "���Թٳ���", "�������õ��1kg", "������", "������ݺ�����ġ��ȹ", "�޹�",
				"�η縶������", "����������Ĩ", "�ǵκ�", "ũ����", "���䷹��1.5L", "��� �Ŷ�� 5����", "��Ǫ����Ʈ", "û�����", "�ƽ�ȭ��Ʈ ���ͽ�", "�𳪹̺��� 0.7mm",
				"����ũ ź�θ� �߰�����", "����", "��������", "��Ϲ���Ĩ", "�����ƻ��ᳪ��", "�����ܾƸ��", "����400", "���������500ml", "���̳���500ml", "�ķ�������200ml"};
		int[] price = {1000, 1500, 4000, 2000, 1000, 2000, 1500000, 2000, 2000, 1500, 
				4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
				1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};
		int[] num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
				1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
				3, 2, 4, 1, 2, 2, 3, 2, 2, 3};
		boolean[] taxfree = {false, false, true, false, false, true, true, false, false, false, 
				false, false, true, false, false, false, false, true, false, false,
				false, true, false, false, true, false, false, false, false, true};
		
		double tax_rate = 0.1;
		
		int tax_item_sum = 0;
		int free_item_sum = 0;
		
		System.out.printf("%s\n", "�̸�Ʈ ������ (031) 888-1234");
		System.out.printf("%s\n", "206-86-50913 ����");
		System.out.printf("%s\n", "���� ������ ������� 552");
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳���(�ż� 7��)");
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");
		System.out.printf("%5s%19s %14s\n", "[�� ��]", sdf1.format(date), "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  �� ǰ ��          ��  �� ����     �� ��\n");
		System.out.printf("-----------------------------------------\n");
		for (int i = 0; i < itemname.length; i++) {
			int sum = price[i] * num[i];
			
			String temp = itemname[i] + "                     ";
//			String temp2 =cutStr(temp, 2, 16);
//			byte[] bb = temp.getBytes();
//			temp = new String(bb, 0, 16);
//			if (cutStr(temp, 2, 16).length() == 16) {
//				temp2 = cutStr(temp, 2, 16);
//			} else if (cutStr(temp, 2, 16).length() == 15){
//				temp2 = cutStr(temp, 2, 16) + " ";
//			}
			
			if (taxfree[i] == true) {
				System.out.printf("* %s%10s%3s%10s\n", cutStr(temp, 2, 16), df.format(price[i]), df.format(num[i]), df.format(price[i]*num[i]));
				free_item_sum += sum;
			} else if (taxfree[i] == false) {
				System.out.printf("  %s%10s%3s%10s\n", cutStr(temp, 2, 16), df.format(price[i]), df.format(num[i]), df.format(price[i]*num[i]));
				tax_item_sum += sum;
			}
			
			if ((i+1) % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
			
		}
		System.out.println();
		System.out.printf("%21s%15d\n", "�� ǰ�� ����", itemname.length);
		 
		System.out.printf("%22s%15s\n", "(*)�� ��  �� ǰ", df.format(free_item_sum));
		int net_price = (int)(tax_item_sum/(1+tax_rate));
		System.out.printf("%22s%15s\n", "�� ��  �� ǰ", df.format(net_price));
		int tax_sum = tax_item_sum - net_price;
		System.out.printf("%23s%15s\n", "��   ��   ��", df.format(tax_sum));
		int total_sum = tax_item_sum + free_item_sum;
		System.out.printf("%24s%15s\n", "��        ��", df.format(total_sum));
		System.out.printf("%-20s%15s\n", "�� �� �� �� �� ��", df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-18s%18s\n", "0012 KEB �ϳ�", "541707**0484/35860658");
		System.out.printf("%-13s%5s%15s\n", "ī�����(IC)", "�Ͻú� / ", df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21s\n", "[�ż�������Ʈ ����]");
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");
		System.out.printf("%-14s%8s%10s\n", "��ȸ�߻�����Ʈ", "9350**9995", df.format(total_sum/1000));
		System.out.printf("%-16s%18s\n", "����(���)����Ʈ", "5,637(  5,473)");
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");
		System.out.printf("%-18s%18s\n", "������ȣ : ", "34��****");
		System.out.printf("%-18s%18s\n", "�����ð� : ", sdf1.format(date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-20s%18s\n", "ĳ��:084599 ��00 ", "1150");
		System.out.printf("\n");
		System.out.printf("%14s%10s\n", sdf2.format(date),"/00119861/00164980/31");
		
	}
	public static String cutStr(String inputStr, int strByte, int maxByte) {
		byte[] inputByte = inputStr.getBytes();
		int cutByte = 0;
		for (int i = 0; i < inputStr.length() -1; i++) {
			if (includeKr(inputStr.substring(i, i + 1))) {
				if (cutByte + strByte > maxByte) {
					break;
				}
				cutByte += strByte;
			} else {
				if (cutByte + 1 > maxByte) {
					break;
				}
				cutByte += 1;
			}
		}
//		inputStr = new String (inputByte, 0, cutByte);
//		if (inputStr.length() == maxByte) {
//			inputStr = new String (inputByte, 0, cutByte);
//		} else if (inputStr.length() == (maxByte-1)) {
//			inputStr =new String (inputByte, 0, cutByte) + " ";
//		}
//		return inputStr;
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
//	public static String incod(String str, int cutnum) {
//		if (!str.isEmpty()) {
//			str = str.trim();
//			if (str.getBytes().length <= cutnum) {
//				return str;
//			} else {
//				StringBuffer sbStr = new StringBuffer(cutnum);
//				int nCnt = 0;
//				for (char ch: str.toCharArray()) {
//					nCnt += String.valueOf(ch).getBytes().length;
//					if (nCnt > cutnum) break;
//					sbStr.append(ch);
//				}
//				return sbStr.toString();
//			}
//		} else {
//			return "";
//		}
//	}
//	public static String incod2(String str) {
//		byte[] bb = str.getBytes();
//		str = new String(bb, 0, 20);
//		return str;
//	}
}
