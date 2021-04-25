package hw0421_Wed_ch6;

public class k33_ch6_6_1_Elevater2 {
	/*
	 * Constructor(생성자), 소멸자, 이벤트
	 */
	int k33_limit_up_floor;
	int k33_k33_limit_down_floor;
	int k33_floor;
	String k33_help;

	k33_ch6_6_1_Elevater2() {
		k33_limit_up_floor = 10;
		k33_k33_limit_down_floor = 1;
		k33_floor = 1;
		k33_help = "엘레베이터 기본 준공완료";
	}
	
	k33_ch6_6_1_Elevater2(int k33_up_floor, int k33_d_floor, int k33_in_floor) {
		k33_limit_up_floor = k33_up_floor;
		k33_k33_limit_down_floor = k33_d_floor;
		k33_floor = k33_in_floor;
		k33_help = "엘레베이터 맞춤 준공완료";
	}
	
	void k33_up() {
		if (k33_floor == k33_limit_up_floor) {
			k33_help = "마지막 층입니다.";
		} else {
			k33_floor++;
			k33_help = String.format("[%d] 층입니다.", k33_floor);
		}
	}
	
	void k33_down() {
		if (k33_floor == k33_k33_limit_down_floor) {
			k33_help = "처음 층입니다.";
		} else {
			k33_floor--;
			k33_help = String.format("[%d] 층입니다.", k33_floor);
		}
	}
	
	void k33_up(int k33_u) {
		for (int k33_i = 0; k33_i < k33_u; k33_i++) this.k33_up();
	}
	
	void k33_down(int k33_u) {
		for (int k33_i = 0; k33_i < k33_u; k33_i++) k33_down();
	}

	void k33_msg(String k33_id) {
		System.out.printf("%s=>[%s] 최대층[%d] 최소층[%d] 현재층[%d]\n",
				k33_id, k33_help, k33_limit_up_floor, k33_k33_limit_down_floor, k33_floor);
	}

}
