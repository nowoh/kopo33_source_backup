package hw0421_Wed_ch6;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch6_3_영수증분리 {	
	/*
	 * 영수증 출력  메소드 분리	(굴림체 기준)
	 */
	static DecimalFormat k33_df = new DecimalFormat("###,###,###,###");
	static SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
	static SimpleDateFormat k33_sdf2 = new SimpleDateFormat("YYYYMMdd");
	static SimpleDateFormat k33_sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm");
	static Date k33_date = new Date();
	static double k33_tax_rate = 0.1;	
	static String[] k33_itemname = {"초코파이", "바나나우유", "국내산삼겹살500g가나다라", "오렌지주스", "초코에몽", "수입바나나", "유기농이천쌀1kg", "오예스", "동원양반볶음김치기획", "햇반",
			"두루마리휴지", "촉촉한초코칩", "판두부", "크림빵", "게토레이1.5L", "농심 신라면 5개봉", "콘푸러스트", "청양고추", "맥심화이트 골드믹스", "모나미볼펜 0.7mm",
			"피코크 탄두리 닭가슴살", "깻잎", "닥터페퍼", "허니버터칩", "강릉아삭콩나물", "월드콘아몬드", "진로400", "버드와이저500ml", "하이네켄500ml", "후레쉬우유200ml"};																								
	static int[] k33_price = {1000, 1500, 4000, 2000, 1000, 2000, 1500, 2000, 2000, 1500, 
			4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
			1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};								
	static int[] k33_num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
			1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
			3, 2, 4, 1, 2, 2, 3, 2, 2, 3};															
	static boolean[] k33_taxfree = {false, false, true, false, false, true, true, false, false, false, 
			false, false, true, false, false, false, false, true, false, false,
			false, true, false, false, true, false, false, false, false, true};	
	
	public static void main(String[] args) { 				//메인함수				
		int k33_itemCount = k33_itemname.length;
		k33_TitlePrint();
		k33_TimeStemp();
		k33_HeaderPrint();
										
													
		for (int k33_i = 0; k33_i < k33_itemCount; k33_i++) {					
			k33_ItemPrint(k33_i);
		}
		k33_TotalPrint();
		
	}
	
	public static void k33_TitlePrint() {		//영수증 상단 안내사항 출력 메소드
		System.out.printf("%-12s%s\n", "emart", "이마트 죽점점 (031) 888-1234");						
		System.out.printf("%-12s%s\n", "","206-86-50913 강희석");										
		System.out.printf("%-12s%s\n", "","용인 수지구 포은대로 552");									
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");									
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");								
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");							
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");						
										
	}
	
	public static void k33_TimeStemp() {		//구매 시간 출력 메소드
		System.out.printf("%5s%-19s %14s\n", "[구 매]", k33_sdf3.format(k33_date), "POS:0011-9861");	
	}
	
	public static void k33_HeaderPrint() {		//상단 헤더 출력 메소드
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("  상 품 명          단  가 수량     금 액\n");								
		System.out.printf("-----------------------------------------\n");			
	}
	
	public static void k33_ItemPrint(int k33_i) {				//품목 단가 수량 품목별 합계금액 출력 메소드																									
		int k33_sum = k33_price[k33_i] * k33_num[k33_i];
		String k33_temp = k33_itemname[k33_i];									
		
		if (k33_taxfree[k33_i] == true) {										
			System.out.printf("* %s%10s%3s%10s\n", k33_cutStr(k33_temp,16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));																									
		} else if (k33_taxfree[k33_i] == false) {								
			System.out.printf("  %s%10s%3s%10s\n", k33_cutStr(k33_temp, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));																								
		}
		
		if ((k33_i+1) % 5 == 0) {												
			System.out.printf("-----------------------------------------\n");	
		}			
		
	}
	
	public static void k33_TotalPrint() {					//과세 면세 합계 금액 및 나머지 기타 사항 출력 메소드
		Calendar k33_cal = Calendar.getInstance();
		k33_cal.add(Calendar.HOUR_OF_DAY, -1);		
		int k33_tax_item_sum = 0;																		
		int k33_free_item_sum = 0;
		
		
		for(int k33_i = 0; k33_i < k33_itemname.length; k33_i++) {
			int k33_sum = k33_price[k33_i] * k33_num[k33_i];
			if (k33_taxfree[k33_i] == true) {																										
				k33_free_item_sum += k33_sum;										
			} else if (k33_taxfree[k33_i] == false) {																								
				k33_tax_item_sum += k33_sum;										
			}
		}
		
		System.out.println();																			
		System.out.printf("%22s%14d\n", "총 품목 수량", k33_itemname.length);							
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k33_df.format(k33_free_item_sum));			
		
		int k33_net_price = (int)(k33_tax_item_sum/(1+k33_tax_rate));									
																										
																										
		System.out.printf("%23s%14s\n", "과 세  물 품", k33_df.format(k33_net_price));					
		
		int k33_tax_sum = k33_tax_item_sum - k33_net_price;												
																										
		System.out.printf("%24s%14s\n", "부   가   세", k33_df.format(k33_tax_sum));					
		
		int k33_total_sum = k33_tax_item_sum + k33_free_item_sum;										
		
		System.out.printf("%25s%14s\n", "합        계", k33_df.format(k33_total_sum));					
		System.out.printf("%-20s%15s\n", "결 제 대 상 금 액", k33_df.format(k33_total_sum));			
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%-18s%18s\n", "0012 KEB 하나", "541707**0484/35860658");						
		System.out.printf("%-14s%20s\n", "카드결제(IC)", "일시불 / " + k33_df.format(k33_total_sum));	
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%21s\n", "[신세계포인트 적립]");												
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");									
		
		int k33_ePoint = 5473;																					
	    int k33_ocPoint = (int)(k33_total_sum/1000);													
		int k33_acPoint = k33_ocPoint + k33_ePoint;														
		
		System.out.printf("%-14s%8s%10s\n", "금회발생포인트", "9350**9995", k33_df.format(k33_ocPoint));	
																											
		System.out.printf("%-14s%10s%10s\n", "누계(가용)포인트", k33_df.format(k33_acPoint)+"(", k33_df.format(k33_ePoint) + ")");
																										
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");								
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");								
		System.out.printf("%-18s%18s\n", "차량번호 : ", "34저****");									
		System.out.printf("%-18s%18s\n", "입차시간 : ", k33_sdf1.format(k33_cal.getTime()));			
		System.out.printf("-----------------------------------------\n");								
		System.out.printf("%-20s%18s\n", "캐셔:084599 양00 ", "1150");									
		System.out.printf("\n");																			
		for (int k33_i =0; k33_i < 3; k33_i++) {														
			System.out.println("        ||||||||||||||||||||||||||      ");								
		}
		System.out.printf("%15s%10s\n", k33_sdf2.format(k33_date),"/00119861/00164980/31");				
	}
	
	public static String k33_cutStr(String k33_inputStr, int k33_maxByte) {	 	//품목 byte맞춰서 한글 안 깨지도록 하는 메소드
		for (int k33_i = 0; k33_i <= k33_maxByte; k33_i++) {				
			k33_inputStr += " "; 											
		}
		byte[] k33_inputByte = k33_inputStr.getBytes();						
		StringBuffer k33_buf = new StringBuffer(k33_inputStr);				
		int k33_cutByte = 0;												
		for (int k33_i = 0; k33_i < k33_inputStr.length() -1; k33_i++) {
																
			if (k33_includeKr(k33_inputStr.substring(k33_i, k33_i + 1))) {	
				if (k33_cutByte + 1 == k33_maxByte) {						
					k33_buf.insert(k33_i, "    ");							
					k33_inputStr = k33_buf.toString();						 
					k33_inputByte = k33_inputStr.getBytes();				
					k33_cutByte += 1;										 
																			
					break;													
				} else if (k33_cutByte == k33_maxByte) {					
					break;													
				}
				k33_cutByte += 2;											
			} else {														
				if (k33_cutByte + 1 > k33_maxByte) {						
					break;													
				}
				k33_cutByte += 1;											
			} 
			
		}	
		return new String (k33_inputByte, 0, k33_cutByte);					
	}
	
	public static boolean k33_includeKr(String k33_input) {					//한글인지 아닌지 판별하는 메소드		
		for (int k33_k = 0; k33_k < k33_input.length(); k33_k++) {			
			if (Character.getType(k33_input.charAt(k33_k)) == Character.OTHER_LETTER) {	
				return true;																
			}																				
		}
		return false;														
	}
}
