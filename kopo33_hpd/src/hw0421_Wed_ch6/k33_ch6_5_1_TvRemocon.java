package hw0421_Wed_ch6;

public class k33_ch6_5_1_TvRemocon {
	/*
	 * Ŭ����, ��ü, �ν��Ͻ�
	 */
	int k33_limit_up_Channel = 10;		//������ ���� limit_up_Channel 10���� ����
	int k33_limit_down_Channel = 0;		//������ ���� limit_down_Channel 0���� ����
	int k33_limit_up_Vol = 5;			//������ ���� limit_up_Vol 5�� ����
	int k33_limit_down_Vol = 0;			//������ ���� limit_down_Vol 0���� ����
	int k33_Channel = 1;				//������ ���� Channel 1�� ����
	int k33_Vol = 1;					//������ ���� limit_up_Channel 10���� ����
	String k33_help;					//���ڿ� help ����
	
	void k33_Volup() {													//���ϰ��� ���� �޼ҵ� Volup ����
		if (k33_Vol == k33_limit_up_Vol) {								//���ǹ� : Vol�� limit_up_Vol�̸�
			k33_help = "�ִ������Դϴ�.";								//help�� "�ִ������Դϴ�."�� ����
		} else {														//�׷��� ������ (Vol�� limit_up_Vol�� �ƴϸ�)
			k33_Vol++;													//Vol 1 ���ϱ�
			k33_help = String.format("���� ������ %d�Դϴ�.", k33_Vol);	//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	} 
	
	void k33_Voldown() {												//���ϰ��� ���� �޼ҵ� Voldown ����
		if (k33_Vol == k33_limit_down_Vol) {							//���ǹ� : Vol�� limit_down_Vol�̸�
			k33_help = "���������Դϴ�.";								//help�� "���������Դϴ�."�� ����
		} else {												  		//�׷��� ������ (Vol�� limit_down_Vol�� �ƴϸ�)
			k33_Vol--;													//Vol 1 ����
			k33_help = String.format("���� ������ %d�Դϴ�.", k33_Vol);	//help�� "���������� (Vol)�Դϴ�."�� ����
		}
	}
	
	void k33_Channelup() {												//���ϰ��� ���� �޼ҵ� Channelup ����
		if (k33_Channel == k33_limit_up_Channel) {						//���ǹ� : Channel�� limit_up_Channel�̸�
			k33_help = "������ ä���Դϴ�.";							//help�� "������ ä���Դϴ�."�� ����
		} else {														//�׷��� ������ (Channel�� limit_up_Channel�� �ƴϸ�)
			k33_Channel++;												//Channel 1 ���ϱ�
			k33_help = String.format("%d���Դϴ�.", k33_Channel);		//help�� "(Channel)���Դϴ�."�� ����
		}
	} 
	
	void k33_Channeldown() {											//���ϰ��� ���� �޼ҵ� Channeldown ����
		if (k33_Channel == k33_limit_down_Channel) {					//���ǹ� : Channel�� limit_down_Channel�̸�
			k33_help = "ó�� ä���Դϴ�.";								//help�� "ó�� ä���Դϴ�."�� ����
		} else {														//�׷��� ������ (Channel�� limit_down_Channel�� �ƴϸ�)
			k33_Channel--;												//Channel 1 ����
			k33_help = String.format("%d���Դϴ�.", k33_Channel);		//help�� "(Channel)���Դϴ�."�� ����
		}
	}
}
