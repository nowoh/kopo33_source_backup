package hw0421_Wed_ch6;

public class k33_ch6_8_1_Elevater3 extends k33_ch6_6_1_Elevater2 { //��1
	/*
	 * Overrinding
	 */
	void Repair() {
		help = String.format("�������Դϴ�.");
	}
	
	void up() {
		if (floor >= limit_up_floor) {
			help = "���������Դϴ�.";
		} else {
			floor = floor + 2;
			help = String.format("%d���Դϴ�.", floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("Ŭ���� �ȿ��� ����ִ� MSG [%s]\n", this.help);
		//this.down(); ���ȣ��� ������ ��
	}
}
