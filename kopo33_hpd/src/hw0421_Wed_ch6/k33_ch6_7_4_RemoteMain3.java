package hw0421_Wed_ch6;

public class k33_ch6_7_4_RemoteMain3 {
	/*
	 * inheritance
	 */
	public static void main(String[] args) {
		k33_ch6_7_3_TvRemoconX k33_rmt3;								//k33_ch6_6_3_TvRemocon2�� ��ӹ��� 
																		//k33_ch6_7_3_TvRemoconX Ŭ���� rmt3�� ����
		k33_rmt3 = new k33_ch6_7_3_TvRemoconX();						//rmt3�� k33_ch6_7_3_TvRemoconX() ��ü ������ ������ ����
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			k33_rmt3.k33_Channelup();									//k33_ch6_7_3_TvRemoconX Ŭ������ Channelup �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			k33_rmt3.k33_Channeldown();									//k33_ch6_7_3_TvRemoconX Ŭ������ Channeldown �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			k33_rmt3.k33_Volup();										//k33_ch6_7_3_TvRemoconX Ŭ������ Volup �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			k33_rmt3.k33_Voldown();										//k33_ch6_7_3_TvRemoconX Ŭ������ Voldown �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		k33_rmt3.k33_Repair();											//k33_ch6_7_3_TvRemoconX Ŭ������ Repair �޼ҵ� ����
		System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);			//k33_ch6_7_3_TvRemoconX Ŭ������ help ��¤�
	}
}
