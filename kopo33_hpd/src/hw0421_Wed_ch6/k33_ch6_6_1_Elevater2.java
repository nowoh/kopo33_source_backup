package hw0421_Wed_ch6;

public class k33_ch6_6_1_Elevater2 { //별1
	/*
	 * Constructor(생성자), 소멸자, 이벤트
	 */
	int limit_up_floor;
	int limit_down_floor;
	int floor;
	String help;

	k33_ch6_6_1_Elevater2() {
		limit_up_floor = 10;
		limit_down_floor = 1;
		floor = 1;
		help = "엘레베이터 기본 준공완료";
	}
	
	k33_ch6_6_1_Elevater2(int up_floor, int d_floor, int in_floor) {
		limit_up_floor = up_floor;
		limit_down_floor = d_floor;
		floor = in_floor;
		help = "엘레베이터 맞춤 준공완료";
	}
	
	void up() {
		if (floor == limit_up_floor) {
			help = "마지막 층입니다.";
		} else {
			floor++;
			help = String.format("[%d] 층입니다.", floor);
		}
	}
	
	void down() {
		if (floor == limit_down_floor) {
			help = "처음 층입니다.";
		} else {
			floor--;
			help = String.format("[%d] 층입니다.", floor);
		}
	}
	
	void up(int u) {
		for (int i = 0; i < u; i++) this.up();
	}
	
	void down(int u) {
		for (int i = 0; i < u; i++) down();
	}

	void msg(String id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				id, help, limit_up_floor, limit_down_floor, floor);
	}

}
