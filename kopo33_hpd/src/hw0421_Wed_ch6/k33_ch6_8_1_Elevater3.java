package hw0421_Wed_ch6;

public class k33_ch6_8_1_Elevater3 extends k33_ch6_6_1_Elevater2 { //별1
	/*
	 * Overrinding
	 */
	void Repair() {
		help = String.format("수리중입니다.");
	}
	
	void up() {
		if (floor >= limit_up_floor) {
			help = "마지막층입니다.";
		} else {
			floor = floor + 2;
			help = String.format("%d층입니다.", floor);
		}
		this.down();
	}
	
	void down() {
		super.down();
		System.out.printf("클래스 안에서 찍고있는 MSG [%s]\n", this.help);
		//this.down(); 재귀호출시 뺑뺑이 돔
	}
}
