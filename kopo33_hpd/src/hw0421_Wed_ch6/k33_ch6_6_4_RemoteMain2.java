package hw0421_Wed_ch6;

public class k33_ch6_6_4_RemoteMain2 {	//��2
	/*
	 * Constructor(������), �Ҹ���, �̺�Ʈ
	 */
	static k33_ch6_6_3_TvRemocon2 rmt1;			//k33_ch6_6_3_TvRemocon2 Ŭ���� rmt1�� ����
	static k33_ch6_6_3_TvRemocon2 rmt2;			//k33_ch6_6_3_TvRemocon2 Ŭ���� rmt2�� ����
	static k33_ch6_6_3_TvRemocon2 rmt3;			//k33_ch6_6_3_TvRemocon2 Ŭ���� rmt3�� ����
	
	public static void main(String[] args) {					//�����Լ�
		rmt1 = new k33_ch6_6_3_TvRemocon2();					//rmt1�� k33_ch6_6_3_TvRemocon2() �����ڷ� ��ü ������ ������ ����
		rmt2 = new k33_ch6_6_3_TvRemocon2(15, 0, 15, 0, 5, 10);	//rmt1�� k33_ch6_6_3_TvRemocon2(15, 0, 15, 0, 5, 10) �����ڷ� ��ü ������ ������ ����
		rmt3 = new k33_ch6_6_3_TvRemocon2(5, 1, 10, 1, 2, 3);	//rmt1�� k33_ch6_6_3_TvRemocon2(5, 1, 10, 1, 2, 3) �����ڷ� ��ü ������ ������ ����

		for (int i = 0; i < 10; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			rmt1.Channelup(); rmt1.Channelmsg("1��TV ä�� 1���� �ø���");	//k33_ch6_6_3_TvRemocon2 Ŭ������ Channelup() �޼ҵ� ���� ��
		}														//k33_ch6_6_3_TvRemocon2 Ŭ������ Channelmsg �޼ҵ忡 "1��TV ä�� 1���� �ø���"���� �޾Ƽ� ����
		
		for (int i = 0; i < 5; i++) {							//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			rmt1.Volup(); rmt1.Volmsg("1��TV ���� 1�� �ø���");	//k33_ch6_6_3_TvRemocon2 Ŭ������ Volup() �޼ҵ� ���� ��
		}														//k33_ch6_6_3_TvRemocon2 Ŭ������ Volmsg �޼ҵ忡 "1��TV ���� 1�� �ø���"���� �޾Ƽ� ����
		
		for (int i = 0; i < 10; i++) {										//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			rmt1.Channelup(2); rmt1.Channelmsg("1��TV ä�� 2���� �ø���");	//k33_ch6_6_3_TvRemocon2 Ŭ������ Channelup(2) �޼ҵ� ���� ��
		}																	//k33_ch6_6_3_TvRemocon2 Ŭ������ Channelmsg �޼ҵ忡 "1��TV ä�� 2���� �ø���"���� �޾Ƽ� ����
		
		for (int i = 0; i < 5; i++) {										//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			rmt1.Volup(2); rmt1.Volmsg("1��TV ���� 2�� �ø���");			//k33_ch6_6_3_TvRemocon2 Ŭ������ Volup(2) �޼ҵ� ���� ��
		}																	//k33_ch6_6_3_TvRemocon2 Ŭ������ Volmsg �޼ҵ忡 "1��TV ���� 2�� �ø���"���� �޾Ƽ� ����
		
		for (int i = 0; i < 10; i++) {										//�ݺ��� : ������ ���� i�� 0�̰�, i�� 10������ 1�� �����ϸ� �ݺ�
			rmt1.Channeldown(3); rmt1.Channelmsg("1��TV ä�� 3���� ������");	//k33_ch6_6_3_TvRemocon2 Ŭ������ Channeldown(3) �޼ҵ� ���� ��
		}																	//k33_ch6_6_3_TvRemocon2 Ŭ������ Channelmsg �޼ҵ忡 "1��TV ä�� 3���� ������"���� �޾Ƽ� ����
		
		for (int i = 0; i < 5; i++) {										//�ݺ��� : ������ ���� i�� 0�̰�, i�� 5������ 1�� �����ϸ� �ݺ�
			rmt1.Voldown(3); rmt1.Volmsg("1��TV ���� 3�� ������");			//k33_ch6_6_3_TvRemocon2 Ŭ������ Voldown(3) �޼ҵ� ���� ��
		}																	//k33_ch6_6_3_TvRemocon2 Ŭ������ Volmsg �޼ҵ忡 "1��TV ���� 3�� ������"���� �޾Ƽ� ����
	}

}
