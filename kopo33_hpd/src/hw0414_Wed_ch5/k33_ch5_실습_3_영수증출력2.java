package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_�ǽ�_3_���������2 {
	/*
	 * ������ ���2	(����ü ����)
	 */	
	public static void main(String[] args) { 							//�����Լ�
		DecimalFormat k33_df = new DecimalFormat("###,###,###"); 		//DecimalFormat ��ü ����
		Calendar k33_cal = Calendar.getInstance();						//����ð����� Calendar ����
		SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	//SimpleDateFormat ��ü ����1
		SimpleDateFormat k33_sdf2 = new SimpleDateFormat("MM��dd��");				//SimpleDateFormat ��ü ����2
		k33_cal.add(Calendar.DAY_OF_MONTH, 14);						//cal.add�� ���� ���� ���ڿ��� 14�� ������			
		Date k33_date = new Date();										//���� ��¥ ��ü ����
				
		
		String k33_itemname1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";	//���ڿ� itemname1 ���� (��ǰ�̸�)
		String k33_itemcode1 = "1031615";								//���ڿ� itemcode1 ����	(��ǰ�ڵ�)
		int k33_price1 = 31000;											//������ ���� price1 ���� (��ǰ����)
		int k33_amount1 = 10;											//������ ���� amount1 ���� (��ǰ����)
		
		String k33_itemname2 = "�����̵�ĸ���(������)(100ȣ)";			//���ڿ� itemname2 ���� (��ǰ�̸�)
		String k33_itemcode2 = "11008152";								//���ڿ� itemcode2 ����	(��ǰ�ڵ�)
		int k33_price2 = 1000;											//������ ���� price2 ���� (��ǰ����)
		int k33_amount2 = 1;											//������ ���� amount2 ���� (��ǰ����)
		
		String k33_itemname3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";	//���ڿ� itemname3 ���� (��ǰ�̸�)
		String k33_itemcode3 = "1020800";								//���ڿ� itemcode3 ����	(��ǰ�ڵ�)
		int k33_price3 = 1000;											//������ ���� price3 ���� (��ǰ����)
		int k33_amount3 = 1;											//������ ���� amount3 ���� (��ǰ����)
		
		int k33_sum_price = k33_price1*k33_amount1 + k33_price2*k33_amount2 + k33_price3*k33_amount3;
													//������ ���� sum_price�� �� ��ǰ�� �ݾװ� ������ ���� ������ ���� (�հ� ����)
		double k33_tax_rate = 0.1;					//�Ǽ��� ���� tax_rate(����)�� 0.1�� ����
		int k33_net_price = (int)(k33_sum_price/(1+k33_tax_rate));	//������ ���� net_price�� sum_price/(1+tax_rate) �� ������ ����
																	//net_price�� ���������� �ǹ�, ���������� �Һ��ڰ���/(�Һ��ڰ���+����)�� ���� �� ����
																	//������ �Ǽ����� ������ ������ ���;��ϹǷ� ���� �� integer�� �� ��ȯ����
		int k33_tax = k33_sum_price - k33_net_price;			//������ ���� tax�� sum_price���� net_price ���� ������ ����
																//�հ� ����(�Һ��� ����)���� ���� ������ �� �� = ���� (�ΰ���)
		System.out.printf("%22s\n","\"���ΰ���, ���̼�\"");							//���ڿ� 1�� 22�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%s\n", "(��)�Ƽ����̼�_�д缭����");						//���ڿ� 1�� ���
		System.out.printf("��ȭ:031-702-6016\n");									//���ڿ� 1�� ���
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");			//���ڿ� 1�� ���
		System.out.printf("��ǥ:������, ��ȣ�� 213-81-52063\n");					//���ڿ� 1�� ���
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (������)\n");	//���ڿ� 1�� ���
		System.out.printf("=========================================\n");			//���ڿ� 1�� ���
		System.out.printf("%25s", "�Һ����߽ɰ濵(CCM) �������\n");				//���ڿ� 1�� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%26s", "ISO 9001 ǰ���濵�ý��� �������\n");			//���ڿ� 1�� 26�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("=========================================\n");			//���ڿ� 1�� ���
		System.out.printf("%16s%5s%4s", "��ȯ/ȯ�� 14��(", k33_sdf2.format(k33_cal.getTime()), ")�̳�,\n");		
															//���ڿ� 3�� 16�ڸ�, 5�ڸ�, 4�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (14�� ���� ���� ���)
		System.out.printf("%24s", "(����)������, ����ī�� ���� ��\n");				//���ڿ� 1�� 24�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%22s", "���Ը��忡�� ����\n");							//���ڿ� 1�� 22�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%25s", "����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");			//���ڿ� 1�� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%25s", "üũī�� ��� �� �ִ� 7�� �ҿ�\n");				//���ڿ� 1�� 25�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("=========================================\n");			//���ڿ� 1�� ���
		System.out.printf("%-21s%20s\n","[POS 1058231]", k33_sdf1.format(k33_date));	
														//���ڿ� 2�� 21�ڸ� Ȯ���ϰ� ��������, 20�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���� ��¥ ���)
		System.out.printf("=========================================\n");			//���ڿ� 1�� ���
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname1,18), k33_df.format(k33_price1), k33_amount1, k33_df.format(k33_price1*k33_amount1));
																	//���ڿ� 4�� ��� (itemname1�� cutStr�޼ҵ�� 18byte���̷� ó��, ��ǰ����, ����, �հ� ���)
		System.out.printf("[%s]\n", k33_itemcode1);					//itemcode1 ���
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname2,18), k33_df.format(k33_price2), k33_amount2, k33_df.format(k33_price2*k33_amount2));
																	//���ڿ� 4�� ��� (itemname1�� cutStr�޼ҵ�� 18byte���̷� ó��, ��ǰ����, ����, �հ� ���)
		System.out.printf("[%s]\n", k33_itemcode2);					//itemcode2 ���
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname3,18), k33_df.format(k33_price3), k33_amount3, k33_df.format(k33_price3*k33_amount3));
																	//���ڿ� 4�� ��� (itemname1�� cutStr�޼ҵ�� 18byte���̷� ó��, ��ǰ����, ����, �հ� ���)
		System.out.printf("[%s]\n", k33_itemcode3);					//itemcode3 ���
		System.out.printf("%18s %18s\n", "�����հ�", k33_df.format(k33_net_price));		//���ڿ� 2�� 18�ڸ�, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���� ����)
		System.out.printf("%19s %18s\n", "�ΰ���", k33_df.format(k33_tax));				//���ڿ� 2�� 19�ڸ�, 18�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�ΰ���)
		System.out.printf("-----------------------------------------\n");				//���ڿ� 1�� ���
		System.out.printf("%-20s%17s\n", "�Ǹ��հ�", k33_df.format(k33_sum_price));		//���ڿ� 2�� 20�ڸ� Ȯ���ϰ� ��������, 17�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�հ� ����)
		System.out.printf("=========================================\n");				//���ڿ� 1�� ���
		System.out.printf("%-20s%17s\n", "�ſ�ī��", k33_df.format(k33_sum_price));		//���ڿ� 2�� 20�ڸ� Ȯ���ϰ� ��������, 17�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�հ� ����)
		System.out.printf("-----------------------------------------\n");				//���ڿ� 1�� ���
		System.out.printf("%-20s%17s\n", "�츮ī��", "538720**********");				//���ڿ� 2�� 20�ڸ� Ȯ���ϰ� ��������, 17�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("%-18s%15s\n", "���ι�ȣ 77982843(0)", "���αݾ� " + k33_df.format(k33_sum_price));	//���ڿ� 2�� 18�ڸ� Ȯ���ϰ� ��������, 15�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (�հ� ����)
		System.out.printf("=========================================\n");			//���ڿ� 1�� ���
		System.out.printf("%24s %5s\n", k33_sdf1.format(k33_date), "�д缭����");	//���ڿ� 2�� 24�ڸ�, 5�ڸ� Ȯ���ϰ� ���������Ͽ� ��� (���� �ð�)
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");						//���ڿ� 1�� ���
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");			//���ڿ� 1�� ���
		for (int k33_i =0; k33_i < 3; k33_i++) {									//�ݺ��� : ������ ���� i�� 0�̰�, 3 ������ 1�� �����ϸ� �ݺ�
			System.out.println("       ||||||||||||||||||||||||||      ");			//���ڵ� ���
		}
		System.out.printf("%28s\n", "2112820610158231");							//���ڿ� 1�� 28�ڸ� Ȯ���ϰ� ���������Ͽ� ���
		System.out.printf("-----------------------------------------\n");			//���ڿ� 1�� ���
		System.out.printf("�� ���̼� ����� �� �Ǵ� Ȩ�������� ����\n");			//���ڿ� 1�� ���
		System.out.printf("   �ϼż� ȸ������ �� �پ��� ������ ����\n");			//���ڿ� 1�� ���
		System.out.printf("   ������! ��\n");										//���ڿ� 1�� ���
		
		
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
		for (int k = 0; k < k33_input.length(); k++) {						//�ݺ��� : k�� 0�̰�, k�� input ���� ������ 1�� �����ϸ鼭 �ݺ�
			if (Character.getType(k33_input.charAt(k)) == Character.OTHER_LETTER) {	//���ǹ� : input�� k��° ���ھ��� type�� �ƽ�Ű�ڵ尡 �ƴ� ���ڸ� (ex. �ѱ�)
				return true;															//true ����
			}
		}
		return false;														//for������ return���� �� ������ for�� �������ͼ� false ����
	}
}
