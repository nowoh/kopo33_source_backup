package hw0414_Wed_ch5;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class k33_ch5_실습_3_영수증출력2 {
	/*
	 * 영수증 출력2	(굴림체 기준)
	 */	
	public static void main(String[] args) { 							//메인함수
		DecimalFormat k33_df = new DecimalFormat("###,###,###"); 		//DecimalFormat 객체 생성
		Calendar k33_cal = Calendar.getInstance();						//현재시간으로 Calendar 선언
		SimpleDateFormat k33_sdf1 = new SimpleDateFormat("YYYY.MM.dd HH:mm:ss");	//SimpleDateFormat 객체 생성1
		SimpleDateFormat k33_sdf2 = new SimpleDateFormat("MM월dd일");				//SimpleDateFormat 객체 생성2
		k33_cal.add(Calendar.DAY_OF_MONTH, 14);						//cal.add로 현재 월의 일자에서 14일 더해줌			
		Date k33_date = new Date();										//현재 날짜 객체 생성
				
		
		String k33_itemname1 = "퓨어에어 비말차단용마스크(최고급형)";	//문자열 itemname1 정의 (물품이름)
		String k33_itemcode1 = "1031615";								//문자열 itemcode1 정의	(물품코드)
		int k33_price1 = 31000;											//정수형 변수 price1 정의 (물품가격)
		int k33_amount1 = 10;											//정수형 변수 amount1 정의 (물품수량)
		
		String k33_itemname2 = "슬라이드식명찰(가로형)(100호)";			//문자열 itemname2 정의 (물품이름)
		String k33_itemcode2 = "11008152";								//문자열 itemcode2 정의	(물품코드)
		int k33_price2 = 1000;											//정수형 변수 price2 정의 (물품가격)
		int k33_amount2 = 1;											//정수형 변수 amount2 정의 (물품수량)
		
		String k33_itemname3 = "매직흡착 인테리어후크(알루미늄타입)";	//문자열 itemname3 정의 (물품이름)
		String k33_itemcode3 = "1020800";								//문자열 itemcode3 정의	(물품코드)
		int k33_price3 = 1000;											//정수형 변수 price3 정의 (물품가격)
		int k33_amount3 = 1;											//정수형 변수 amount3 정의 (물품수량)
		
		int k33_sum_price = k33_price1*k33_amount1 + k33_price2*k33_amount2 + k33_price3*k33_amount3;
													//정수형 변수 sum_price를 각 물품의 금액과 수량을 곱한 값으로 정의 (합계 가격)
		double k33_tax_rate = 0.1;					//실수형 변수 tax_rate(세율)를 0.1로 정의
		int k33_net_price = (int)(k33_sum_price/(1+k33_tax_rate));	//정수형 변수 net_price를 sum_price/(1+tax_rate) 한 값으로 정의
																	//net_price는 세전가격을 의미, 세전가격은 소비자가격/(소비자가격+세율)로 구할 수 있음
																	//세율은 실수지만 가격은 정수로 나와야하므로 연산 후 integer로 형 변환해줌
		int k33_tax = k33_sum_price - k33_net_price;			//정수형 변수 tax를 sum_price에서 net_price 빼준 값으로 정의
																//합계 가격(소비자 가격)에서 세전 가격을 뺀 것 = 세금 (부가세)
		System.out.printf("%22s\n","\"국민가게, 다이소\"");							//문자열 1개 22자리 확보하고 우측정렬하여 출력
		System.out.printf("%s\n", "(주)아성다이소_분당서현점");						//문자열 1개 출력
		System.out.printf("전화:031-702-6016\n");									//문자열 1개 출력
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");			//문자열 1개 출력
		System.out.printf("대표:박정부, 신호섭 213-81-52063\n");					//문자열 1개 출력
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현동)\n");	//문자열 1개 출력
		System.out.printf("=========================================\n");			//문자열 1개 출력
		System.out.printf("%25s", "소비자중심경영(CCM) 인증기업\n");				//문자열 1개 25자리 확보하고 우측정렬하여 출력
		System.out.printf("%26s", "ISO 9001 품질경영시스템 인증기업\n");			//문자열 1개 26자리 확보하고 우측정렬하여 출력
		System.out.printf("=========================================\n");			//문자열 1개 출력
		System.out.printf("%16s%5s%4s", "교환/환불 14일(", k33_sdf2.format(k33_cal.getTime()), ")이내,\n");		
															//문자열 3개 16자리, 5자리, 4자리 확보하고 우측정렬하여 출력 (14일 더한 일자 출력)
		System.out.printf("%24s", "(전자)영수증, 결제카드 지참 후\n");				//문자열 1개 24자리 확보하고 우측정렬하여 출력
		System.out.printf("%22s", "구입매장에서 가능\n");							//문자열 1개 22자리 확보하고 우측정렬하여 출력
		System.out.printf("%25s", "포장/가격 택 훼손시 교환/환불 불가\n");			//문자열 1개 25자리 확보하고 우측정렬하여 출력
		System.out.printf("%25s", "체크카드 취소 시 최대 7일 소요\n");				//문자열 1개 25자리 확보하고 우측정렬하여 출력
		System.out.printf("=========================================\n");			//문자열 1개 출력
		System.out.printf("%-21s%20s\n","[POS 1058231]", k33_sdf1.format(k33_date));	
														//문자열 2개 21자리 확보하고 좌측정렬, 20자리 확보하고 우측정렳하여 출력 (현재 날짜 출력)
		System.out.printf("=========================================\n");			//문자열 1개 출력
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname1,18), k33_df.format(k33_price1), k33_amount1, k33_df.format(k33_price1*k33_amount1));
																	//문자열 4개 출력 (itemname1을 cutStr메소드로 18byte길이로 처리, 물품가격, 수량, 합계 출력)
		System.out.printf("[%s]\n", k33_itemcode1);					//itemcode1 출력
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname2,18), k33_df.format(k33_price2), k33_amount2, k33_df.format(k33_price2*k33_amount2));
																	//문자열 4개 출력 (itemname1을 cutStr메소드로 18byte길이로 처리, 물품가격, 수량, 합계 출력)
		System.out.printf("[%s]\n", k33_itemcode2);					//itemcode2 출력
		System.out.printf("%s%10s%3d%10s\n", k33_cutStr(k33_itemname3,18), k33_df.format(k33_price3), k33_amount3, k33_df.format(k33_price3*k33_amount3));
																	//문자열 4개 출력 (itemname1을 cutStr메소드로 18byte길이로 처리, 물품가격, 수량, 합계 출력)
		System.out.printf("[%s]\n", k33_itemcode3);					//itemcode3 출력
		System.out.printf("%18s %18s\n", "과세합계", k33_df.format(k33_net_price));		//문자열 2개 18자리, 18자리 확보하고 우측정렬하여 출력 (세전 가격)
		System.out.printf("%19s %18s\n", "부가세", k33_df.format(k33_tax));				//문자열 2개 19자리, 18자리 확보하고 우측정렬하여 출력 (부가세)
		System.out.printf("-----------------------------------------\n");				//문자열 1개 출력
		System.out.printf("%-20s%17s\n", "판매합계", k33_df.format(k33_sum_price));		//문자열 2개 20자리 확보하고 좌측정렬, 17자리 확보하고 우측정렬하여 출력 (합계 가격)
		System.out.printf("=========================================\n");				//문자열 1개 출력
		System.out.printf("%-20s%17s\n", "신용카드", k33_df.format(k33_sum_price));		//문자열 2개 20자리 확보하고 좌측정렬, 17자리 확보하고 우측정렬하여 출력 (합계 가격)
		System.out.printf("-----------------------------------------\n");				//문자열 1개 출력
		System.out.printf("%-20s%17s\n", "우리카드", "538720**********");				//문자열 2개 20자리 확보하고 좌측정렬, 17자리 확보하고 우측정렬하여 출력
		System.out.printf("%-18s%15s\n", "승인번호 77982843(0)", "승인금액 " + k33_df.format(k33_sum_price));	//문자열 2개 18자리 확보하고 좌측정렬, 15자리 확보하고 우측정렬하여 출력 (합계 가격)
		System.out.printf("=========================================\n");			//문자열 1개 출력
		System.out.printf("%24s %5s\n", k33_sdf1.format(k33_date), "분당서현점");	//문자열 2개 24자리, 5자리 확보하고 우측정렬하여 출력 (현재 시간)
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");						//문자열 1개 출력
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");			//문자열 1개 출력
		for (int k33_i =0; k33_i < 3; k33_i++) {									//반복문 : 정수형 변수 i는 0이고, 3 전까지 1씩 증가하며 반복
			System.out.println("       ||||||||||||||||||||||||||      ");			//바코드 출력
		}
		System.out.printf("%28s\n", "2112820610158231");							//문자열 1개 28자리 확보하고 우측정렬하여 출력
		System.out.printf("-----------------------------------------\n");			//문자열 1개 출력
		System.out.printf("◈ 다이소 멤버십 앱 또는 홈페이지에 접속\n");			//문자열 1개 출력
		System.out.printf("   하셔서 회원가입 후 다양한 혜택을 누려\n");			//문자열 1개 출력
		System.out.printf("   보세요! ◈\n");										//문자열 1개 출력
		
		
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
		for (int k = 0; k < k33_input.length(); k++) {						//반복문 : k는 0이고, k는 input 길이 전까지 1씩 증가하면서 반복
			if (Character.getType(k33_input.charAt(k)) == Character.OTHER_LETTER) {	//조건문 : input의 k번째 문자어의 type이 아스키코드가 아닌 문자면 (ex. 한글)
				return true;															//true 리턴
			}
		}
		return false;														//for문에서 return값이 안 나오면 for문 빠져나와서 false 리턴
	}
}
