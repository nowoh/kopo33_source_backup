package hw0421_Wed_ch6;

public class k33_ch6_4_1_Elevater {
	/*
	 * 클래스, 객체, 인스턴스
	 */
	int k33_limit_up_floor = 10;
	int k33_limit_down_floor = 0;
	int k33_floor =1;
	String k33_help;
	
	void k33_up() {
		if (k33_floor == k33_limit_up_floor) {
			k33_help = "마지막층입니다.";
		} else {
			k33_floor++;
			k33_help = String.format("%d층입니다.", k33_floor);
		}
	} 
	
	void k33_down() {
		if (k33_floor == k33_limit_down_floor) {
			k33_help = "처음층입니다.";
		} else {
			k33_floor--;
			k33_help = String.format("%d층입니다.", k33_floor);
		}
	}
}
