package hw0421_Wed_ch6;

public class k33_ch6_6_3_TvRemocon2 { 	
	/*
	 * Constructor(������), �Ҹ���, �̺�Ʈ
	 */
	int k33_limit_up_Channel;				//������ ���� limit_up_Channel ����
	int k33_limit_down_Channel;				//������ ���� limit_down_Channel ����
	int k33_limit_up_Vol;					//������ ���� limit_up_Vol ����
	int k33_limit_down_Vol;					//������ ���� limit_down_Vol ����
	int k33_Channel;						//������ ���� Channel ����
	int k33_Vol;							//������ ���� limit_up_Channel ����
	String k33_help;						//���ڿ� help ����
	
	k33_ch6_6_3_TvRemocon2() {				//������ ����
		k33_limit_up_Channel = 10;			//limit_up_Channel�� 10���� ����
		k33_limit_down_Channel = 0;			//limit_down_Channel�� 0���� ����
		k33_limit_up_Vol = 5;				//limit_up_Vol�� 5�� ����
		k33_limit_down_Vol = 0;				//limit_down_Vol�� 0���� ����
		k33_Channel = 1;					//Channel�� 1�� ����
		k33_Vol = 1;						//Vol�� 1�� ����
		k33_help = "TV �⺻ ���� �Ϸ�";		//help�� "TV �⺻ ���� �Ϸ�"�� ����
	}
	
	k33_ch6_6_3_TvRemocon2(int k33_up_Channel, int k33_down_Channel, 
			int k33_up_Vol,	int k33_down_Vol, int k33_in_Channel, int k33_in_Vol) {		//���ڸ� �޴� ������ ����
		k33_limit_up_Channel = k33_up_Channel;			//limit_up_Channel�� up_Channel�� ����
		k33_limit_down_Channel = k33_down_Channel;		//limit_down_Channel�� down_Channel�� ����
		k33_limit_up_Vol = k33_up_Vol;					//limit_up_Vol�� up_Vol���� ����
		k33_limit_down_Vol = k33_down_Vol;				//limit_down_Vol�� down_Vol���� ����
		k33_Channel = k33_in_Channel;					//Channel�� in_Channel�� ����
		k33_Vol = k33_in_Vol;							//Vol�� in_Vol�� ����
		k33_help = "TV ���� ���� �Ϸ�";					//help�� "TV ���� ���� �Ϸ�"�� ����
	}		
	
	void k33_Volup() {														//���ϰ��� ���� �޼ҵ� Volup ����
		if (k33_Vol == k33_limit_up_Vol) {									//���ǹ� : Vol�� limit_up_Vol�̸�
			k33_help = "�ִ������Դϴ�.";									//help�� "�ִ������Դϴ�."�� ����
		} else {															//�׷��� ������ (Vol�� limit_up_Vol�� �ƴϸ�)
			k33_Vol++;														//Vol 1 ���ϱ�
			k33_help = String.format("���� ������ %d�Դϴ�.", k33_Vol);		//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	} 
	
	void k33_Voldown() {													//���ϰ��� ���� �޼ҵ� Voldown ����
		if (k33_Vol == k33_limit_down_Vol) {								//���ǹ� : Vol�� limit_down_Vol�̸�
			k33_help = "���������Դϴ�.";									//help�� "���������Դϴ�."�� ����
		} else {															//�׷��� ������ (Vol�� limit_down_Vol�� �ƴϸ�)
			k33_Vol--;														//Vol 1 ����
			k33_help = String.format("���� ������ %d�Դϴ�.", k33_Vol);		//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	}
	
	void k33_Channelup() {													//���ϰ��� ���� �޼ҵ� Channelup ����
		if (k33_Channel == k33_limit_up_Channel) {							//���ǹ� : Channel�� limit_up_Channel�̸�
			k33_help = "������ ä���Դϴ�.";								//help�� "������ ä���Դϴ�."�� ����
		} else {															//�׷��� ������ (Channel�� limit_up_Channel�� �ƴϸ�)
			k33_Channel++;													//Channel 1 ���ϱ�
			k33_help = String.format("%d���Դϴ�.", k33_Channel);			//help�� "(Channel)���Դϴ�."�� ����
		}
	} 
	
	void k33_Channeldown() {												//���ϰ��� ���� �޼ҵ� Channeldown ����
		if (k33_Channel == k33_limit_down_Channel) {						//���ǹ� : Channel�� limit_down_Channel�̸�
			k33_help = "ó�� ä���Դϴ�.";									//help�� "ó�� ä���Դϴ�."�� ����
		} else {															//�׷��� ������ (Channel�� limit_down_Channel�� �ƴϸ�)
			k33_Channel--;													//Channel 1 ����
			k33_help = String.format("%d���Դϴ�.", k33_Channel);			//help�� "(Channel)���Դϴ�."�� ����
		}
	}
	
	void k33_Volup(int k33_u) {												//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Volup �޼ҵ� ����
		for (int k33_i = 0; k33_i < k33_u; k33_i++) this.k33_Volup();		//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Volup�޼ҵ� �ݺ�
	}
	
	void k33_Voldown(int k33_u) {											//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Voldown �޼ҵ� ����
		for (int k33_i = 0; k33_i < k33_u; k33_i++) this.k33_Voldown();		//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Voldown�޼ҵ� �ݺ�
	}
	
	void k33_Channelup(int k33_u) {											//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Channelup �޼ҵ� ����
		for (int k33_i = 0; k33_i < k33_u; k33_i++) this.k33_Channelup();	//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Channelup�޼ҵ� �ݺ�
	}
	
	void k33_Channeldown(int k33_u) {													//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Channeldown �޼ҵ� ����
		for (int k33_k33_i = 0; k33_k33_i < k33_u; k33_k33_i++) this.k33_Channeldown();	//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Channeldown�޼ҵ� �ݺ�
	}
	

	void k33_Volmsg(String k33_id) {													//���ϰ��� ���� ���ڸ� ���ڿ� ���� id�� �޴� Volmsg �޼ҵ� ����
		System.out.printf("%s=>[%s] �ִ�����[%d] �ּ�����[%d] ��������[%d]\n",
				k33_id, k33_help, k33_limit_up_Vol, k33_limit_down_Vol, k33_Vol);		//id, help, limit_up_Vol, limit_down_Vol, Vol �� ���ڿ��� ���缭 ���
	}
	
	void k33_Channelmsg(String k33_id) {														//���ϰ��� ���� ���ڸ� ���ڿ� ���� id�� �޴� Channelmsg �޼ҵ� ����
		System.out.printf("%s=>[%s] ������ä��[%d] ó��ä��[%d] ����ä��[%d]\n",
				k33_id, k33_help, k33_limit_up_Channel, k33_limit_down_Channel, k33_Channel);	//id, help, limit_up_Channel, limit_down_Channel, Channel �� ���ڿ��� ���缭 ���
	}
	
}
