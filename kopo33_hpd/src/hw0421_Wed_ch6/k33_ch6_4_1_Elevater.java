package hw0421_Wed_ch6;

public class k33_ch6_4_1_Elevater {
	/*
	 * Ŭ����, ��ü, �ν��Ͻ�
	 */
	int k33_limit_up_floor = 10;
	int k33_limit_down_floor = 0;
	int k33_floor =1;
	String k33_help;
	
	void k33_up() {
		if (k33_floor == k33_limit_up_floor) {
			k33_help = "���������Դϴ�.";
		} else {
			k33_floor++;
			k33_help = String.format("%d���Դϴ�.", k33_floor);
		}
	} 
	
	void k33_down() {
		if (k33_floor == k33_limit_down_floor) {
			k33_help = "ó�����Դϴ�.";
		} else {
			k33_floor--;
			k33_help = String.format("%d���Դϴ�.", k33_floor);
		}
	}
}
