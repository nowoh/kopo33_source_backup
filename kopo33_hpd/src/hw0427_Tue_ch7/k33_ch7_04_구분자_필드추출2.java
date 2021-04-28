package hw0427_Tue_ch7;

public class k33_ch7_04_구분자_필드추출2 {

	public static void main(String[] args) {
		String[] k33_oneRec = {
				"설치장소,소재지도로명주소,소재지지번주소,설치일자,운영시간(평일),운영시간(주말),운영시간(공휴일),도서적재수량(일반도서),도서적재수량(어린이도서),관리기관,전화번호,데이터기준일자",
				"성남시청 1층 로비,경기도 성남시 중원구 성남대로 997,경기도 성남시 중원구 여수동 200,2018-01-17,07:00~22:00,07:00~22:00,07:00~22:00,265,65,성남시 중앙도서관,031-729-4633,2021-01-29",
				"탄천종합운동장 체육회관 1층 로비,경기도 성남시 분당구 탄천로215,경기도 성남시 분당구 야탑동 486,2017-12-04,00:00~23:59,00:00~23:59,00:00~23:59,211,179,성남시 중원도서관,031-724-0689,2021-01-29",
				"중앙지하상가 8호선 신흥역 출입구,경기도 성남시 수정구 산성대로280,경기도 성남시 중원구 신흥동 2467,2019-11-22,00:00~23:59,00:00~23:59,00:00~23:59,391,81,성남시 중원도서관,031-724-0689,2021-01-29",
				"황새울국민체육센터 2층 로비,경기도 성남시 분당구 황새울로 273,경기도 성남시 분당구 수내동 43,2020-12-11,09:00~21:00,09:00~18:00,휴관,250,250,성남시 중원도서관,031-724-0689,2021-01-29",
				"수정구청 종합민원실,경기도 성남시 수정구 수정로 283,경기도 성남시 수정구 신흥동 30,2018-11-20,09:00~21:00,휴관,휴관,283,117,성남시 수정도서관,031-724-0644,2021-01-29",
				"성남시의료원 로비(지하1층),경기도 성남시 수정구 수정로171번길 10,경기도 성남시 수정구 태평동 3309,2020-12-07,00:00~23:59,00:00~23:59,00:00~23:59,420,86,성남시 수정도서관,031-724-0644,2021-01-29"};

		String[] k33_field_name = k33_oneRec[0].split(",");
		
		for (int k33_i = 1; k33_i < k33_oneRec.length - 1; k33_i++) {
			String[] k33_field = k33_oneRec[k33_i].split(",");
			System.out.println("**************************************************************************************");
	
			for (int k33_j = 0; k33_j < k33_field_name.length; k33_j++) {
				if (k33_j == 7 || k33_j == 8) {
					k33_field[k33_j] = k33_numberCnt(k33_field[k33_j]);
				}
				System.out.printf(" %s : %s\n", k33_field_name[k33_j], k33_field[k33_j]);
			}
			
			System.out.println("**************************************************************************************");
			 
		}
	}
	public static String k33_numberCnt (String k33_aa) {
		String k33_sNumVal = k33_aa;
		String k33_sNumVoice = "";			
		String[] k33_units = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
		
		String[] k33_unitx = {"", "십", "백", "천", "만", "십", "백"};
		
		int k33_i = 0;	
		int k33_j = k33_sNumVal.length()-1;	
		
		while (true) {	
			if (k33_i >= k33_sNumVal.length()) break;	
			
			if (k33_sNumVal.substring(k33_i, k33_i+1).equals("0")) {	
				if (k33_unitx[k33_j].equals("억")) {
					k33_sNumVoice = k33_sNumVoice + "" + k33_unitx[k33_j];
					
				} else if (k33_unitx[k33_j].equals("만")) {
					if (k33_sNumVal.substring(k33_i-3, k33_i).equals("000")) {
						
					} else {
						k33_sNumVoice = k33_sNumVoice + "" + k33_unitx[k33_j];
					}
				} else {
					
				}
			} else {	
				k33_sNumVoice = k33_sNumVoice 
						+ k33_units[Integer.parseInt(k33_sNumVal.substring(k33_i, k33_i+1))] 
						+ k33_unitx[k33_j];
				
			}
			k33_i++; k33_j--;	
		}
		return k33_sNumVoice;
	}

}
