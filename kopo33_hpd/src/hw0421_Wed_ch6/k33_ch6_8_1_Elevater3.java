package hw0421_Wed_ch6;

public class k33_ch6_8_1_Elevater3 extends k33_ch6_6_1_Elevater2 {
	/*
	 * Overrinding
	 */
	void k33_Repair() {
		k33_help = String.format("�������Դϴ�.");
	}
	
	void k33_up() {
		if (k33_floor >= k33_limit_up_floor) {
			k33_help = "���������Դϴ�.";
		} else {
			k33_floor = k33_floor + 2;
			k33_help = String.format("%d���Դϴ�.", k33_floor);
		}
		this.k33_down();
	}
	
	void k33_down() {
		super.k33_down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.k33_help);
		//this.down(); ���ȣ��� ������ ��
	}
}
