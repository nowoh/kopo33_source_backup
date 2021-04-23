package hw0421_Wed_ch6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch6_3_�������и� {	
	/*
	 * ������ ���  �޼ҵ� �и�	(����ü ����)
	 */
	static DecimalFormat k33_df = new DecimalFormat("###,###,###,###");
	static SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	static SimpleDateFormat k33_sdf2 = new SimpleDateFormat("YYYYMMdd");
	static SimpleDateFormat k33_sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	static Date k33_date = new Date();
	static double k33_tax_rate = 0.1;	
	static String[] k33_itemname = {"��������", "�ٳ�������", "���������500g�����ٶ�", "�������ֽ�", "���ڿ���", "���Թٳ���", "�������õ��1kg", "������", "������ݺ�����ġ��ȹ", "�޹�",
			"�η縶������", "����������Ĩ", "�ǵκ�", "ũ����", "���䷹��1.5L", "��� �Ŷ�� 5����", "��Ǫ����Ʈ", "û�����", "�ƽ�ȭ��Ʈ ���ͽ�", "�𳪹̺��� 0.7mm",
			"����ũ ź�θ� �߰�����", "����", "��������", "��Ϲ���Ĩ", "�����ƻ��ᳪ��", "�����ܾƸ��", "����400", "���������500ml", "���̳���500ml", "�ķ�������200ml"};																								
	static int[] k33_price = {1000, 1500, 4000, 2000, 1000, 2000, 1500, 2000, 2000, 1500, 
			4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
			1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};								
	static int[] k33_num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
			1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
			3, 2, 4, 1, 2, 2, 3, 2, 2, 3};															
	static boolean[] k33_taxfree = {false, false, true, false, false, true, true, false, false, false, 
			false, false, true, false, false, false, false, true, false, false,
			false, true, false, false, true, false, false, false, false, true};	
	
	public static void main(String[] args) { 				//�����Լ�				
		int k33_itemCount = k33_itemname.length;
		k33_TitlePrint();
		k33_TimeStemp();
		k33_HeaderPrint();
										
													
		for (int k33_i = 0; k33_i < k33_itemCount; k33_i++) {					
			k33_ItemPrint(k33_i);
		}
		k33_TotalPrint();
		
	}
	
	public static void k33_TitlePrint() {		//������ ��� �ȳ����� ��� �޼ҵ�
		System.out.printf("%-12s%s\n", "emart", "�̸�Ʈ ������ (031) 888-1234");						
		System.out.printf("%-12s%s\n", "","206-86-50913 ����");										
		System.out.printf("%-12s%s\n", "","���� ������ ������� 552");									
		System.out.printf("%s\n", "������ �������� ��ȯ/ȯ�� �Ұ�");									
		System.out.printf("%s\n", "�����ǰ�� ����, 30�� �̳�(�ż� 7��)");								
		System.out.printf("%s\n", "���Ϻ� �귣����� ����(���� ����������)");							
		System.out.printf("%s\n\n", "��ȯ/ȯ�� ���������� ����(����ī�� ����)");						
										
	}
	
	public static void k33_TimeStemp() {		//���� �ð� ��� �޼ҵ�
		System.out.printf("%5s%-19s %14s\n", "[�� ��]", k33_sdf3.format(k33_date), "POS:0011-9861");	
	}
	
	public static void k33_HeaderPrint() {		//��� ��� ��� �޼ҵ�
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("  �� ǰ ��          ��  �� ����     �� ��\n");								
		System.out.printf("-----------------------------------------\n");			
	}
	
	public static void k33_ItemPrint(int k33_i) {				//ǰ�� �ܰ� ���� ǰ�� �հ�ݾ� ��� �޼ҵ�																									
		int k33_sum = k33_price[k33_i] * k33_num[k33_i];
		String k33_temp = k33_itemname[k33_i];									
		
		if (k33_taxfree[k33_i] == true) {										
			System.out.printf("* %s%10s%3s%10s\n", k33_cutStr(k33_temp,16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));																									
		} else if (k33_taxfree[k33_i] == false) {								
			System.out.printf("  %s%10s%3s%10s\n", k33_cutStr(k33_temp, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));																								
		}
		
		if ((k33_i+1) % 5 == 0) {												
			System.out.printf("-----------------------------------------\n");	
		}			
		
	}
	
	public static void k33_TotalPrint() {					//���� �鼼 �հ� �ݾ� �� ������ ��Ÿ ���� ��� �޼ҵ�
		Calendar k33_cal = Calendar.getInstance();
		k33_cal.add(Calendar.HOUR_OF_DAY, -1);		
		int k33_tax_item_sum = 0;																		
		int k33_free_item_sum = 0;
		
		
		for(int k33_i = 0; k33_i < k33_itemname.length; k33_i++) {
			int k33_sum = k33_price[k33_i] * k33_num[k33_i];
			if (k33_taxfree[k33_i] == true) {																										
				k33_free_item_sum += k33_sum;										
			} else if (k33_taxfree[k33_i] == false) {																								
				k33_tax_item_sum += k33_sum;										
			}
		}
		
		System.out.println();																			
		System.out.printf("%22s%14d\n", "�� ǰ�� ����", k33_itemname.length);							
		System.out.printf("%23s%14s\n", "(*)�� ��  �� ǰ", k33_df.format(k33_free_item_sum));			
		
		int k33_net_price = (int)(k33_tax_item_sum/(1+k33_tax_rate));									
																										
																										
		System.out.printf("%23s%14s\n", "�� ��  �� ǰ", k33_df.format(k33_net_price));					
		
		int k33_tax_sum = k33_tax_item_sum - k33_net_price;												
																										
		System.out.printf("%24s%14s\n", "��   ��   ��", k33_df.format(k33_tax_sum));					
		
		int k33_total_sum = k33_tax_item_sum + k33_free_item_sum;										
		
		System.out.printf("%25s%14s\n", "��        ��", k33_df.format(k33_total_sum));					
		System.out.printf("%-20s%15s\n", "�� �� �� �� �� ��", k33_df.format(k33_total_sum));			
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%-18s%18s\n", "0012 KEB �ϳ�", "541707**0484/35860658");						
		System.out.printf("%-14s%20s\n", "ī�����(IC)", "�Ͻú� / " + k33_df.format(k33_total_sum));	
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%21s\n", "[�ż�������Ʈ ����]");												
		System.out.printf("%s\n", "ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");									
		
		int k33_ePoint = 5473;																					
	    int k33_ocPoint = (int)(k33_total_sum/1000);													
		int k33_acPoint = k33_ocPoint + k33_ePoint;														
		
		System.out.printf("%-14s%8s%10s\n", "��ȸ�߻�����Ʈ", "9350**9995", k33_df.format(k33_ocPoint));	
																											
		System.out.printf("%-14s%10s%10s\n", "����(����)����Ʈ", k33_df.format(k33_acPoint)+"(", k33_df.format(k33_ePoint) + ")");
																										
		System.out.printf("%s\n", "*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.");								
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%22s\n", "���űݾױ��� ���������ð� �ڵ��ο�");								
		System.out.printf("%-18s%18s\n", "������ȣ : ", "34��****");									
		System.out.printf("%-18s%18s\n", "�����ð� : ", k33_sdf1.format(k33_cal.getTime()));			
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%-20s%18s\n", "ĳ��:084599 ��00 ", "1150");									
		System.out.printf("\n");																			
		for (int k33_i =0; k33_i < 3; k33_i++) {														
			System.out.println("        ||||||||||||||||||||||||||      ");								
		}
		System.out.printf("%15s%10s\n", k33_sdf2.format(k33_date),"/00119861/00164980/31");				
	}
	
	public static String k33_cutStr(String k33_inputStr, int k33_maxByte) {	 	//ǰ�� byte���缭 �ѱ� �� �������� �ϴ� �޼ҵ�
		for (int k33_i = 0; k33_i <= k33_maxByte; k33_i++) {				
			k33_inputStr += " "; 											
		}
		byte[] k33_inputByte = k33_inputStr.getBytes();						
		StringBuffer k33_buf = new StringBuffer(k33_inputStr);				
		int k33_cutByte = 0;												
		for (int k33_i = 0; k33_i < k33_inputStr.length() -1; k33_i++) {
																
			if (k33_includeKr(k33_inputStr.substring(k33_i, k33_i + 1))) {	
				if (k33_cutByte + 1 == k33_maxByte) {						
					k33_buf.insert(k33_i, "    ");							
					k33_inputStr = k33_buf.toString();						 
					k33_inputByte = k33_inputStr.getBytes();				
					k33_cutByte += 1;										 
																			
					break;													
				} else if (k33_cutByte == k33_maxByte) {					
					break;													
				}
				k33_cutByte += 2;											
			} else {														
				if (k33_cutByte + 1 > k33_maxByte) {						
					break;													
				}
				k33_cutByte += 1;											
			} 
			
		}	
		return new String (k33_inputByte, 0, k33_cutByte);					
	}
	
	public static boolean k33_includeKr(String k33_input) {					//�ѱ����� �ƴ��� �Ǻ��ϴ� �޼ҵ�		
		for (int k33_k = 0; k33_k < k33_input.length(); k33_k++) {			
			if (Character.getType(k33_input.charAt(k33_k)) == Character.OTHER_LETTER) {	
				return true;																
			}																				
		}
		return false;														
	}
}
