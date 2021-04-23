package hw0421_Wed_ch6;

public class k33_ch6_6_3_TvRemocon2 { 	//��2
	/*
	 * Constructor(������), �Ҹ���, �̺�Ʈ
	 */
	int limit_up_Channel;				//������ ���� limit_up_Channel ����
	int limit_down_Channel;				//������ ���� limit_down_Channel ����
	int limit_up_Vol;					//������ ���� limit_up_Vol ����
	int limit_down_Vol;					//������ ���� limit_down_Vol ����
	int Channel;						//������ ���� Channel ����
	int Vol;							//������ ���� limit_up_Channel ����
	String help;						//���ڿ� help ����
	
	k33_ch6_6_3_TvRemocon2() {			//������ ����
		limit_up_Channel = 10;			//limit_up_Channel�� 10���� ����
		limit_down_Channel = 0;			//limit_down_Channel�� 0���� ����
		limit_up_Vol = 5;				//limit_up_Vol�� 5�� ����
		limit_down_Vol = 0;				//limit_down_Vol�� 0���� ����
		Channel = 1;					//Channel�� 1�� ����
		Vol = 1;						//Vol�� 1�� ����
		help = "TV �⺻ ���� �Ϸ�";		//help�� "TV �⺻ ���� �Ϸ�"�� ����
	}
	
	k33_ch6_6_3_TvRemocon2(int up_Channel, int down_Channel, 
			int up_Vol,	int down_Vol, int in_Channel, int in_Vol) {		//���ڸ� �޴� ������ ����
		limit_up_Channel = up_Channel;			//limit_up_Channel�� up_Channel�� ����
		limit_down_Channel = down_Channel;		//limit_down_Channel�� down_Channel�� ����
		limit_up_Vol = up_Vol;					//limit_up_Vol�� up_Vol���� ����
		limit_down_Vol = down_Vol;				//limit_down_Vol�� down_Vol���� ����
		Channel = in_Channel;					//Channel�� in_Channel�� ����
		Vol = in_Vol;							//Vol�� in_Vol�� ����
		help = "TV ���� ���� �Ϸ�";				//help�� "TV ���� ���� �Ϸ�"�� ����
	}		
	
	void Volup() {													//���ϰ��� ���� �޼ҵ� Volup ����
		if (Vol == limit_up_Vol) {									//���ǹ� : Vol�� limit_up_Vol�̸�
			help = "�ִ������Դϴ�.";								//help�� "�ִ������Դϴ�."�� ����
		} else {													//�׷��� ������ (Vol�� limit_up_Vol�� �ƴϸ�)
			Vol++;													//Vol 1 ���ϱ�
			help = String.format("���� ������ %d�Դϴ�.", Vol);		//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	} 
	
	void Voldown() {												//���ϰ��� ���� �޼ҵ� Voldown ����
		if (Vol == limit_down_Vol) {								//���ǹ� : Vol�� limit_down_Vol�̸�
			help = "���������Դϴ�.";								//help�� "���������Դϴ�."�� ����
		} else {													//�׷��� ������ (Vol�� limit_down_Vol�� �ƴϸ�)
			Vol--;													//Vol 1 ����
			help = String.format("���� ������ %d�Դϴ�.", Vol);		//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	}
	
	void Channelup() {												//���ϰ��� ���� �޼ҵ� Channelup ����
		if (Channel == limit_up_Channel) {							//���ǹ� : Channel�� limit_up_Channel�̸�
			help = "������ ä���Դϴ�.";							//help�� "������ ä���Դϴ�."�� ����
		} else {													//�׷��� ������ (Channel�� limit_up_Channel�� �ƴϸ�)
			Channel++;												//Channel 1 ���ϱ�
			help = String.format("%d���Դϴ�.", Channel);			//help�� "(Channel)���Դϴ�."�� ����
		}
	} 
	
	void Channeldown() {											//���ϰ��� ���� �޼ҵ� Channeldown ����
		if (Channel == limit_down_Channel) {						//���ǹ� : Channel�� limit_down_Channel�̸�
			help = "ó�� ä���Դϴ�.";								//help�� "ó�� ä���Դϴ�."�� ����
		} else {													//�׷��� ������ (Channel�� limit_down_Channel�� �ƴϸ�)
			Channel--;												//Channel 1 ����
			help = String.format("%d���Դϴ�.", Channel);			//help�� "(Channel)���Դϴ�."�� ����
		}
	}
	
	void Volup(int u) {												//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Volup �޼ҵ� ����
		for (int i = 0; i < u; i++) this.Volup();					//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Volup�޼ҵ� �ݺ�
	}
	
	void Voldown(int u) {											//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Voldown �޼ҵ� ����
		for (int i = 0; i < u; i++) this.Voldown();					//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Voldown�޼ҵ� �ݺ�
	}
	
	void Channelup(int u) {											//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Channelup �޼ҵ� ����
		for (int i = 0; i < u; i++) this.Channelup();				//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Channelup�޼ҵ� �ݺ�
	}
	
	void Channeldown(int u) {										//���ϰ��� ���� ���ڸ� ������ ���� u�� �޴� Channeldown �޼ҵ� ����
		for (int i = 0; i < u; i++) this.Channeldown();				//�ݺ��� : ������ ���� i�� 0�̰�, i�� u������ 1�� �����ϸ� Channeldown�޼ҵ� �ݺ�
	}
	

	void Volmsg(String id) {										//���ϰ��� ���� ���ڸ� ���ڿ� ���� id�� �޴� Volmsg �޼ҵ� ����
		System.out.printf("%s=>[%s] �ִ�����[%d] �ּ�����[%d] ��������[%d]\n",
				id, help, limit_up_Vol, limit_down_Vol, Vol);		//id, help, limit_up_Vol, limit_down_Vol, Vol �� ���ڿ��� ���缭 ���
	}
	
	void Channelmsg(String id) {									//���ϰ��� ���� ���ڸ� ���ڿ� ���� id�� �޴� Channelmsg �޼ҵ� ����
		System.out.printf("%s=>[%s] ������ä��[%d] ó��ä��[%d] ����ä��[%d]\n",
				id, help, limit_up_Channel, limit_down_Channel, Channel);	//id, help, limit_up_Channel, limit_down_Channel, Channel �� ���ڿ��� ���缭 ���
	}
	
}
