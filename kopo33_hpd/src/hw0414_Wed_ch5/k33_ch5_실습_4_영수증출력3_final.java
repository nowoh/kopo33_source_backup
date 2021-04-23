package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_실습_4_영수증출력3_final {
	/*
	 * 영수증 출력3	(굴림체 기준)
	 */
	public static void main(String[] args) { 								//메인함수
		DecimalFormat k33_df = new DecimalFormat("###,###,###,###");  		//DecimalFormat 객체 생성
		Calendar k33_cal = Calendar.getInstance();							//현재시간으로 Calendar 선언
		SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	//SimpleDateFormat 객체 생성1
		SimpleDateFormat k33_sdf2 = new SimpleDateFormat("YYYYMMdd");				//SimpleDateFormat 객체 생성2
		SimpleDateFormat k33_sdf3 = new SimpleDateFormat("YYYY-MM-dd HH:mm");		//SimpleDateFormat 객체 생성3
		k33_cal.add(Calendar.HOUR_OF_DAY, -1);										//cal.add로 현재 시간에서 1시간 빼줌
		Date k33_date = new Date();													//현재 날짜 객체 생성
		
		String[] k33_itemname = {"초코파이", "바나나우유", "국내산삼겹살500g가나다라", "오렌지주스", "초코에몽", "수입바나나", "유기농이천쌀1kg", "오예스", "동원양반볶음김치기획", "햇반",
				"두루마리휴지", "촉촉한초코칩", "판두부", "크림빵", "게토레이1.5L", "농심 신라면 5개봉", "콘푸러스트", "청양고추", "맥심화이트 골드믹스", "모나미볼펜 0.7mm",
				"피코크 탄두리 닭가슴살", "깻잎", "닥터페퍼", "허니버터칩", "강릉아삭콩나물", "월드콘아몬드", "진로400", "버드와이저500ml", "하이네켄500ml", "후레쉬우유200ml"};
																										//문자열 배열 itemname 정의 (물품명)
		int[] k33_price = {1000, 1500, 4000, 2000, 1000, 2000, 1500, 2000, 2000, 1500, 
				4000, 2500, 1500, 800, 2400, 4000, 5000, 3500, 12000, 800, 
				1500, 1500, 1200, 1500, 2200, 1500, 1200, 2500, 2500, 900};								//정수형 배열 price 정의 (물품가격)
		int[] k33_num = {1, 4, 1, 2, 4, 1, 9, 2, 4, 5, 
				1, 1, 2, 3, 1, 1, 1, 5, 1, 10, 
				3, 2, 4, 1, 2, 2, 3, 2, 2, 3};															//정수형 배열 num 정의 (물품수량)
		boolean[] k33_taxfree = {false, false, true, false, false, true, true, false, false, false, 
				false, false, true, false, false, false, false, true, false, false,
				false, true, false, false, true, false, false, false, false, true};						//boolean 배열 taxfree 정의 (true=면세, false=과세)
		
		double k33_tax_rate = 0.1;																		//실수형 변수 tax_rate 0.1로 정의 (세율)
		int k33_tax_item_sum = 0;																		//정수형 변수 tax_item_sum 0으로 초기화 (과세 물품 금액 합계)
		int k33_free_item_sum = 0;																		//정수형 변수 free_item_sum 0으로 초기화 (면세 물품 금액 합계)

		
		System.out.printf("%-12s%s\n", "emart", "이마트 죽점점 (031) 888-1234");						//문자열 2개 12자리 확보하고 좌측정렬, 바로 붙여서 나머지 출력
		System.out.printf("%-12s%s\n", "","206-86-50913 강희석");										//문자열 2개 12자리 확보하고 좌측정렬, 바로 붙여서 나머지 출력
		System.out.printf("%-12s%s\n", "","용인 수지구 포은대로 552");									//문자열 2개 12자리 확보하고 좌측정렬, 바로 붙여서 나머지 출력
		System.out.printf("%s\n", "영수증 미지참시 교환/환불 불가");									//문자열 1개 출력
		System.out.printf("%s\n", "정상상품에 한함, 30일 이내(신선 7일)");								//문자열 1개 출력
		System.out.printf("%s\n", "※일부 브랜드매장 제외(매장 고지물참조)");							//문자열 1개 출력
		System.out.printf("%s\n\n", "교환/환불 구매점에서 가능(결제카드 지참)");						//문자열 1개 출력, 행 두 번 바꾸기
		System.out.printf("%5s%-19s %14s\n", "[구 매]", k33_sdf3.format(k33_date), "POS:0011-9861");	//문자열 3개 5자리 확보하고 우측정렬, 19자리 확보하고 좌측정렬, 14자리 확보하고 우측정렬하여 출력
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		System.out.printf("  상 품 명          단  가 수량     금 액\n");								//문자열 1개 출력
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		for (int k33_i = 0; k33_i < k33_itemname.length; k33_i++) {					//반복문 : 정수형 변수 i는 0이고, i는 itemname길이 전까지 1씩 증가하며 반복
			int k33_sum = k33_price[k33_i] * k33_num[k33_i];						//정수형 변수 sum은 price 배열과 num 배열의 i번째끼리의 값을 곱한 연산 값으로 정의 (각 품목의 금액 합계)
			String k33_temp = k33_itemname[k33_i];									//문자열  temp를 itemname 배열의 i번째 요소로 정의
			
			if (k33_taxfree[k33_i] == true) {										//조건문 : taxfree배열의 i번째 값이 true면 (면세이면)
				System.out.printf("* %s%10s%3s%10s\n", k33_cutStr(k33_temp,16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));
																					//문자열 4개 출력 (temp를 cutStr 메소드로 16Byte길이로  처리, 물품가격, 수량, 합계 출력)
				k33_free_item_sum += k33_sum;										//free_item_sum에 sum 더해주기
			} else if (k33_taxfree[k33_i] == false) {								//조건문 : taxfree배열의 i번째 값이 false면 (과세이면)
				System.out.printf("  %s%10s%3s%10s\n", k33_cutStr(k33_temp, 16), k33_df.format(k33_price[k33_i]), k33_df.format(k33_num[k33_i]), k33_df.format(k33_sum));
																					//문자열 4개 출력 (temp를 cutStr 메소드로 16Byte길이로  처리, 물품가격, 수량, 합계 출력)
				k33_tax_item_sum += k33_sum;										//tax_item_sum에 sum 더해주기
			}
			
			if ((k33_i+1) % 5 == 0) {												//조건문  : i+1을 5로 나눈 나머지가 0이면
				System.out.printf("-----------------------------------------\n");	//문자열 1개 출력
			}																		//5줄 마다 선 그어주기
			
		}
		System.out.println();																			//행 바꾸기
		System.out.printf("%22s%14d\n", "총 품목 수량", k33_itemname.length);							//문자열 1개 22자리 확보하고 우측정렬, 정수 14자리 확보하고 우측정렬하여 출력 (itemname배열 길이)
		System.out.printf("%23s%14s\n", "(*)면 세  물 품", k33_df.format(k33_free_item_sum));			//문자열 2개 23자리 확보하고 우측정렬, 14자리 확보하고 우측정렬하여 출력 (면세 물품 금액 합계)
		
		int k33_net_price = (int)(k33_tax_item_sum/(1+k33_tax_rate));									//정수형 변수 net_price를 tax_item_sum/(1+tax_rate) 한 값으로 정의
																										//net_price는 세전가격을 의미, 세전가격은 소비자가격/(소비자가격+세율)로 구할 수 있음
																										//세율은 실수지만 가격은 정수로 나와야하므로 연산 후 integer로 형 변환해줌
		System.out.printf("%23s%14s\n", "과 세  물 품", k33_df.format(k33_net_price));					//문자열 2개 23자리 확보하고 우측정렬, 14자리 확보하고 우측정렬하여 출력 (과세 물품 세전 금액 합계)
		
		int k33_tax_sum = k33_tax_item_sum - k33_net_price;												//정수형 변수 tax_sum을 tax_item_sum에서 net_price 빼준 값으로 정의
																										//과세 합계 가격(소비자 가격)에서 세전 가격을 뺀 것 = 세금 (부가세)
		System.out.printf("%24s%14s\n", "부   가   세", k33_df.format(k33_tax_sum));					//문자열 2개 24자리 확보하고 우측정렬, 14자리 확보하고 우측정렬하여 출력 (과세 물품 부가세 합계)
		
		int k33_total_sum = k33_tax_item_sum + k33_free_item_sum;										//정수형 변수 total_sum을 tax_item_sum과 free_item_sum 더한 값으로 정의 (총 물품 금액 합계)
		
		System.out.printf("%25s%14s\n", "합        계", k33_df.format(k33_total_sum));					//문자열 2개 25자리 확보하고 우측정렬, 14자리 확보하고 우측정렬하여 출력 (총 물품 금액 합계)
		System.out.printf("%-20s%15s\n", "결 제 대 상 금 액", k33_df.format(k33_total_sum));			//문자열 2개 20자리 확보하고 좌측정렬, 15자리 확보하고 우측정렬하여 출력 (총 물품 금액 합계)
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		System.out.printf("%-18s%18s\n", "0012 KEB 하나", "541707**0484/35860658");						//문자열 2개 18자리 확보하고 좌측정렬, 18자리 확보하고 우측정렬하여 출력
		System.out.printf("%-14s%20s\n", "카드결제(IC)", "일시불 / " + k33_df.format(k33_total_sum));	//문자열 2개 14자리 확보하고 좌측정렬, 20자리 확보하고 우측정렬하여 출력 (총 물품 금액 합계)
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		System.out.printf("%21s\n", "[신세계포인트 적립]");												//문자열 1개 21자리 확보하고 우측정렬하여 출력
		System.out.printf("%s\n", "홍*두 고객님의 포인트 현황입니다.");									//문자열 1개 출력
		
		int k33_ePoint = 5473;																			//정수형 변수 ePoint를 5473d으로 정의 (기존 포인트)			
	    int k33_ocPoint = (int)(k33_total_sum/1000);													//정수형 변수 ocPoint를 total_sum/1000으로 정의 (결제 금액의 0.1%를 발생 포인트로 정의, 소수점이하 버림)
		int k33_acPoint = k33_ocPoint + k33_ePoint;														//정수형 변수 acPoint를 ocPoint에 ePoint 더한 값으로 정의 (누적 포인트는 기존 포인트에 발생 포인트를 더한 것)
		
		System.out.printf("%-14s%8s%10s\n", "금회발생포인트", "9350**9995", k33_df.format(k33_ocPoint));	//문자열 3개 14자리 확보하고 좌측정렬, 8자리 확보하고 우측정렬, 10자리 확보하고 우측정렬하여 출력
																											//(발생 포인트 출력)
		System.out.printf("%-14s%10s%10s\n", "누계(가용)포인트", k33_df.format(k33_acPoint)+"(", k33_df.format(k33_ePoint) + ")");
																										//문자열 3개 14자리 확보하고 좌측정렬, 10자리 확보하고 우측정렬, 10자리 확보하고 우측정렬하여 출력
																										//(누적 포인트, 기존 포인트 출력)
		System.out.printf("%s\n", "*신세계포인트 유효기간은 2년입니다.");								//문자열 1개 출력
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		System.out.printf("%22s\n", "구매금액기준 무료주차시간 자동부여");								//문자열 1개 22자리 확보하고 우측정렬하여 출력
		System.out.printf("%-18s%18s\n", "차량번호 : ", "34저****");									//문자열 2개 18자리 확보하고 좌측정렬, 18자리 확보하고 우측정렬하여 출력
		System.out.printf("%-18s%18s\n", "입차시간 : ", k33_sdf1.format(k33_cal.getTime()));			//문자열 2개 18자리 확보하고 좌측정렬, 18자리 확보하고 우측정렬하여 출력 (1시간 뺀 시간으로 출력, 임의로 설정)
		System.out.printf("-----------------------------------------\n");								//문자열 1개 출력
		System.out.printf("%-20s%18s\n", "캐셔:084599 양00 ", "1150");									//문자열 2개 20자리 확보하고 좌측정렬, 18자리 확보하고 우측정렬하여 출력
		System.out.printf("\n");																		//행 바꾸기	
		for (int k33_i =0; k33_i < 3; k33_i++) {														//반복문 : 정수형 변수 i는 0이고, 3 전까지 1씩 증가하며 반복
			System.out.println("        ||||||||||||||||||||||||||      ");								//바코드 출력
		}
		System.out.printf("%15s%10s\n", k33_sdf2.format(k33_date),"/00119861/00164980/31");				//문자열 2개 15자리 확보하고 우측정렬, 10자리 확보하고 우측정렬하여 출력 (바코드 번호 제일 처음은 현재 날짜)
		
	}
	public static String k33_cutStr(String k33_inputStr, int k33_maxByte) {	//누구나 접근할 수 있고 정적인 cutStr 메소드 생성 (인자를 string inputStr과 integer maxByte로 받고 string을 리턴) 
		for (int k33_i = 0; k33_i <= k33_maxByte; k33_i++) {				//반복문 : 정수형 변수 i는 0이고, i는 maxByte까지 1씩 증가하면서 반복
			k33_inputStr += " "; 											//inputStr에 " "추가 (inputStr이 몇 자리 문자든 maxByte 수 만큼 " " 채워줌)
		}
		byte[] k33_inputByte = k33_inputStr.getBytes();						//byte 배열 inputByte를 inputStr.getBytes()로 정의 => inputStr의 바이트 배열 가져오기
		StringBuffer k33_buf = new StringBuffer(k33_inputStr);				//StringBuffer buf를 inputStr을 인자로 받아서 생성
		int k33_cutByte = 0;												//정수형 변수 cutByte를 0으로 정의
		for (int k33_i = 0; k33_i < k33_inputStr.length() -1; k33_i++) {
																//반복문 : 정수형 변수 i는 0이고, inputStr길이-1 전까지 1씩 증가하면서 반복 (i는 0부터 시작하기 때문에 inputStr길이-1을 해줌)
			if (k33_includeKr(k33_inputStr.substring(k33_i, k33_i + 1))) {	//조건문 : inputStr의 i번째 문자가 includeKr 메소드에 들어가서 true면 (i번째 문자가 한글이면)
				if (k33_cutByte + 1 == k33_maxByte) {						//조건문 : cutByte +1 한 값이 maxByte와 같으면 (한글이 maxByte에서 정확히 끝나지 않는 경우)
					k33_buf.insert(k33_i, "    ");							//buf의 i번째 문자 뒤에 "    " 추가해줌
					k33_inputStr = k33_buf.toString();						//inputStr을 문자열 추가해준 buf를 String으로 형 변환한 것으로 재정의 
					k33_inputByte = k33_inputStr.getBytes();				//재정의한 inputStr의 getBytes()로 inputByte 재정의
					k33_cutByte += 1;										//cutByte에 1 더해줌 
																			//한글이 maxByte에 걸쳐서 짤리게 되면 cutByte가 maxByte-1이므로 1을 더해줌으로써 maxByte와 같게 만들어줌
					break;													//break
				} else if (k33_cutByte == k33_maxByte) {					//조건문 : cutByte값이 maxByte와 같으면 (한글이 maxByte에서 정확히 끝나는 경우)
					break;													//break
				}
				k33_cutByte += 2;											//(cutByte+1과 cutByte이 maxByte와 같지 않으면) cutByte에 2 더해줌 (한글일 경우 2바이트를 더해주는 것)
			} else {														//그렇지 않으면 (i번째 문자가 한글이 아니면)
				if (k33_cutByte + 1 > k33_maxByte) {						//조건문 : cutByte에 1 더한 값이 maxByte보다 크면
					break;													//break
				}
				k33_cutByte += 1;											//(cutByte에 1 더한 값이 maxByte보다 크지 않으면) cutByte에 1일 더해줌 (한글이 아닐 경우엔 1바이트를 더해주는 것)
			} 
			
		}	
		return new String (k33_inputByte, 0, k33_cutByte);					//inputByte의 Byte를 가진 문자열의 0~cutByte Byte까지 새로운 문자열로 리턴
	}
	
	public static boolean k33_includeKr(String k33_input) {					//누구나 접근할 수 있고 정적인 includeKr 메소드 생성 (인자를 string input으로 받고 boolean을 리턴)
		for (int k33_k = 0; k33_k < k33_input.length(); k33_k++) {			//반복문 : k는 0이고, k는 input 길이 전까지 1씩 증가하면서 반복
			if (Character.getType(k33_input.charAt(k33_k)) == Character.OTHER_LETTER) {	//조건문 : input의 k번째 문자어의 type이 아스키코드가 아닌 문자면 (ex: 한글)
				return true;																//true 리턴
			}																				
		}
		return false;														//for문에서 return값이 안 나오면 for문 빠져나와서 false 리턴
	}
}
