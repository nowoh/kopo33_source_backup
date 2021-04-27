package hw0427_Tue_ch7;

import java.text.DecimalFormat;

public class k33_ch7_02_고정길이_필드추출 {		//별2

	public static void main(String[] args) {
		DecimalFormat k33_dcf = new DecimalFormat("###,###,###");
		
		String[] k33_oneRec = {
				"01  초코파이             1,000  1    10,000",
				"02  바나나우유           1,500  4     6,000",
				"03* 국내산삼겹살500g     4,000  1     4,000",
				"04  오렌지주스           2,000  2    40,000",
				"05  초코에몽             1,000  4     4,000",
				"06* 수입바나나           2,000  1     2,000",
				"07* 유기농이천쌀1kg      1,500  9    13,500",
				"08  오예스               2,000  2     4,000",
				"09  동원양반볶음김치     2,000  4     8,000",
				"10  햇반                 1,500  5     7,500",
				"11  두루마리휴지         4,000  1     4,000",
				"12  촉촉한초코칩         2,500  1     2,500",
				"13* 판두부               1,500  2     3,000",
				"14  크림빵                 800  3     2,400",
				"15  게토레이1.5L         2,400  1     2,400",
				"16  농심 신라면 5개      4,000  1     4,000",
				"17  콘푸러스트           5,000  1     5,000",
				"18* 청양고추             3,500  5    17,500",
				"19  맥심화이트 골드     12,000  1    12,000",
				"20  모나미볼펜 0.7mm       800 10     8,000",
				"21  피코크 탄두리 닭     1,500  3     4,500",
				"22* 깻잎                 1,500  2     3,000",
				"23  닥터페퍼             1,200  4     4,800",
				"24  허니버터칩           1,500  1     1,500",
				"25* 강릉아삭콩나물       2,200  2     4,400",
				"26  월드콘아몬드         1,500  2     3,000",
				"27  진로400              1,200  3     3,600",
				"28  버드와이저500ml      2,500  2     5,000",
				"29  하이네켄500ml        2,500  2     5,000",
				"30* 후레쉬우유200ml        900  3     2,700"};
		
		for (int k33_i = 0; k33_i < k33_oneRec.length; k33_i++) {
			k33_oneRec[k33_i] = k33_oneRec[k33_i].replaceAll(","," ");		//총 43바이트에서 43바이트로 맞춰야 콤마(,)가 없는 숫자도 변함없이
															//정해진 바이트로 자르기 가능
			byte[] k33_b = k33_oneRec[k33_i].getBytes();
			
			String k33_name = new String(k33_b, 4, 16);										//상품명
			String k33_num = new String(k33_b,0, 3);										//상품 번호
			int k33_price = Integer.parseInt(new String(k33_b, 23, 8).replace(" ", ""));	//상품 가격
			int k33_cnt = Integer.parseInt(new String(k33_b, 31, 3).replace(" ", ""));		//수량
			int k33_sum = Integer.parseInt(new String(k33_b, 34, 9).replace(" ", ""));		//합계
			int k33_mod = k33_price * k33_cnt;													//수정 결과
			
			if (k33_price * k33_cnt != k33_sum) {
				System.out.printf("**************************************************\n");
				System.out.printf("%s[%s%s%10s%5d%10s]\n", "오류", k33_num, k33_name, k33_dcf.format(k33_price), k33_cnt, k33_dcf.format(k33_sum));
				System.out.printf("%s[%s%s%10s%5d%10s]\n", "수정", k33_num, k33_name, k33_dcf.format(k33_price), k33_cnt, k33_dcf.format(k33_mod));
				System.out.printf("**************************************************\n");
			} else {
				//아무것도 하지 않음
			}
		}
	}
}
