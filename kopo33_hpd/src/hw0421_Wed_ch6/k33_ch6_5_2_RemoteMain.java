package hw0421_Wed_ch6;

public class k33_ch6_5_2_RemoteMain { //��2 �ּ� �ʿ�
	/*
	 * Ŭ����, ��ü, �ν��Ͻ�
	 */
	public static void main(String[] args) {					//���� �Լ�
		k33_ch6_5_1_TvRemocon k33_remot;						//k33_ch6_5_1_TvRemoconŬ���� remot�� ����
		
		k33_remot = new k33_ch6_5_1_TvRemocon();				//remot�� k33_ch6_5_1_TvRemocon() ��ü ������ ������ ����
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			k33_remot.k33_Channelup();								//k33_ch6_5_1_TvRemocon Ŭ������ Channelup �޼ҵ� ����
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon Ŭ������ help �� ���
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			k33_remot.k33_Channeldown();							//k33_ch6_5_1_TvRemocon Ŭ������ Channeldown �޼ҵ� ����
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon Ŭ������ help �� ���
		}
		System.out.println();								//�� �ٲٱ�
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			k33_remot.k33_Volup();									//k33_ch6_5_1_TvRemocon Ŭ������ Volup �޼ҵ� ����
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon Ŭ������ help �� ���
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			k33_remot.k33_Voldown();								//k33_ch6_5_1_TvRemocon Ŭ������ Voldown �޼ҵ� ����
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon Ŭ������ help �� ���
		}
	}
}
