package hw0421_Wed_ch6;

public class k33_ch6_7_4_RemoteMain3 { //��2
	/*
	 * inheritance
	 */
	public static void main(String[] args) {
		k33_ch6_7_3_TvRemoconX rmt3;							//k33_ch6_6_3_TvRemocon2�� ��ӹ��� 
																//k33_ch6_7_3_TvRemoconX Ŭ���� rmt3�� ����
		rmt3 = new k33_ch6_7_3_TvRemoconX();					//rmt3�� k33_ch6_7_3_TvRemoconX() ��ü ������ ������ ����
		
		for (int i = 0; i < 10; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			rmt3.Channelup();									//k33_ch6_7_3_TvRemoconX Ŭ������ Channelup �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", rmt3.help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int i = 0; i < 10; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			rmt3.Channeldown();									//k33_ch6_7_3_TvRemoconX Ŭ������ Channeldown �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", rmt3.help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int i = 0; i < 5; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			rmt3.Volup();										//k33_ch6_7_3_TvRemoconX Ŭ������ Volup �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", rmt3.help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		for (int i = 0; i < 5; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			rmt3.Voldown();										//k33_ch6_7_3_TvRemoconX Ŭ������ Voldown �޼ҵ� ����
			System.out.printf("MSG rmt3[%s]\n", rmt3.help);		//k33_ch6_7_3_TvRemoconX Ŭ������ help ���
		}
		
		rmt3.Repair();											//k33_ch6_7_3_TvRemoconX Ŭ������ Repair �޼ҵ� ����
		System.out.printf("MSG rmt3[%s]\n", rmt3.help);			//k33_ch6_7_3_TvRemoconX Ŭ������ help ��¤�
	}
}
