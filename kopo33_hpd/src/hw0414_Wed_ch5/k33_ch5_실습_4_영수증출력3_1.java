package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_실습_4_영수증출력3_1 {
	/*
	 * 영수증 출력3	(굴림체 기준)
	 */
	public static void main(String[] args) { 
		DecimalFormat df = new DecimalFormat("###,###,###,###"); 
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYYMMdd");
		Date date = new Date();
		
		String[] itemname = {"초코파이", "바나나우유", "국내산삼겹살500g가나다라", "오렌지주스", "초코에몽", "수입바나나", "유기농이천쌀1kg", "오예스", "동원양반볶음김치기획", "햇반",
				"두루마리휴지", "촉촉한초코칩", "판두부", "크림빵", "게토레이1.5L", "농심 신라면 5개봉", "콘푸러스트", "청양고추", "맥심화이트 골드믹스", "모나미볼펜 0.7mm",
				"피코크 탄두리 닭가슴살", "깻잎", "닥터페퍼", "허니버터칩", "강릉아삭콩나물", "월드콘아몬드", "진로400", "버드와이저500ml", "하이네켄500ml", "후레쉬우유200ml"};
		int[] price = {1000, 1500, 4000, 2000, 1000, 2000, 1500000, 2000, 2000, 1500, 
				4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
				1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};
		int[] num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
				1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
				3, 2, 4, 1, 2, 2, 3, 2, 2, 3};
		boolean[] taxfree = {false, false, true, false, false, true, true, false, false, false, 
				false, false, true, false, false, false, false, true, false, false,
				false, true, false, false, true, false, false, false, false, true};
		
		double tax_rate = 0.1;
		
		int tax_item_sum = 0;
		int free_item_sum = 0;
		
		System.out.printf("%s\n", "이마트 죽점점 (031) 888-1234");
		System.out.printf("%s\n", "206-86-50913 강희석");
		System.out.printf("%s\n", "용인 수지구 포은대로 552");
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내에(신선 7일)");
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");
		System.out.printf("%5s%19s %14s\n", "[구 매]", sdf1.format(date), "POS:0011-9861");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("  상 품 명          단  가 수량     금 액\n");
		System.out.printf("-----------------------------------------\n");
		for (int i = 0; i < itemname.length; i++) {
			int sum = price[i] * num[i];
			
			String temp = itemname[i] + "                     ";
//			String temp2 =cutStr(temp, 2, 16);
//			byte[] bb = temp.getBytes();
//			temp = new String(bb, 0, 16);
//			if (cutStr(temp, 2, 16).length() == 16) {
//				temp2 = cutStr(temp, 2, 16);
//			} else if (cutStr(temp, 2, 16).length() == 15){
//				temp2 = cutStr(temp, 2, 16) + " ";
//			}
			
			if (taxfree[i] == true) {
				System.out.printf("* %s%10s%3s%10s\n", cutStr(temp, 2, 16), df.format(price[i]), df.format(num[i]), df.format(price[i]*num[i]));
				free_item_sum += sum;
			} else if (taxfree[i] == false) {
				System.out.printf("  %s%10s%3s%10s\n", cutStr(temp, 2, 16), df.format(price[i]), df.format(num[i]), df.format(price[i]*num[i]));
				tax_item_sum += sum;
			}
			
			if ((i+1) % 5 == 0) {
				System.out.printf("-----------------------------------------\n");
			}
			
		}
		System.out.println();
		System.out.printf("%21s%15d\n", "총 품목 수량", itemname.length);
		 
		System.out.printf("%22s%15s\n", "(*)면 세  물 품", df.format(free_item_sum));
		int net_price = (int)(tax_item_sum/(1+tax_rate));
		System.out.printf("%22s%15s\n", "과 세  물 품", df.format(net_price));
		int tax_sum = tax_item_sum - net_price;
		System.out.printf("%23s%15s\n", "부   가   세", df.format(tax_sum));
		int total_sum = tax_item_sum + free_item_sum;
		System.out.printf("%24s%15s\n", "합        계", df.format(total_sum));
		System.out.printf("%-20s%15s\n", "결 제 대 상 금 액", df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-18s%18s\n", "0012 KEB 하나", "541707**0484/35860658");
		System.out.printf("%-13s%5s%15s\n", "카드결제(IC)", "일시불 / ", df.format(total_sum));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%21s\n", "[신세계포인트 적립]");
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");
		System.out.printf("%-14s%8s%10s\n", "금회발생포인트", "9350**9995", df.format(total_sum/1000));
		System.out.printf("%-16s%18s\n", "누계(기용)포인트", "5,637(  5,473)");
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");
		System.out.printf("%-18s%18s\n", "차량번호 : ", "34저****");
		System.out.printf("%-18s%18s\n", "입차시간 : ", sdf1.format(date));
		System.out.printf("-----------------------------------------\n");
		System.out.printf("%-20s%18s\n", "캐셔:084599 양00 ", "1150");
		System.out.printf("\n");
		System.out.printf("%14s%10s\n", sdf2.format(date),"/00119861/00164980/31");
		
	}
	public static String cutStr(String inputStr, int strByte, int maxByte) {
		byte[] inputByte = inputStr.getBytes();
		int cutByte = 0;
		for (int i = 0; i < inputStr.length() -1; i++) {
			if (includeKr(inputStr.substring(i, i + 1))) {
				if (cutByte + strByte > maxByte) {
					break;
				}
				cutByte += strByte;
			} else {
				if (cutByte + 1 > maxByte) {
					break;
				}
				cutByte += 1;
			}
		}
//		inputStr = new String (inputByte, 0, cutByte);
//		if (inputStr.length() == maxByte) {
//			inputStr = new String (inputByte, 0, cutByte);
//		} else if (inputStr.length() == (maxByte-1)) {
//			inputStr =new String (inputByte, 0, cutByte) + " ";
//		}
//		return inputStr;
		return new String (inputByte, 0, cutByte);
	}
	
	public static boolean includeKr(String input) {
		for (int k = 0; k < input.length(); k++) {
			if (Character.getType(input.charAt(k)) == Character.OTHER_LETTER) {
				return true;
			}
		}
		return false;
	}
//	public static String incod(String str, int cutnum) {
//		if (!str.isEmpty()) {
//			str = str.trim();
//			if (str.getBytes().length <= cutnum) {
//				return str;
//			} else {
//				StringBuffer sbStr = new StringBuffer(cutnum);
//				int nCnt = 0;
//				for (char ch: str.toCharArray()) {
//					nCnt += String.valueOf(ch).getBytes().length;
//					if (nCnt > cutnum) break;
//					sbStr.append(ch);
//				}
//				return sbStr.toString();
//			}
//		} else {
//			return "";
//		}
//	}
//	public static String incod2(String str) {
//		byte[] bb = str.getBytes();
//		str = new String(bb, 0, 20);
//		return str;
//	}
}
