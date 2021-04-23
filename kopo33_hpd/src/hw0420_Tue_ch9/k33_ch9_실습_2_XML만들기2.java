package hw0420_Tue_ch9;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class k33_ch9_실습_2_XML만들기2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
																						//메인함수, 예외처리 포함
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
																						//DocumentBuilder 생성
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\Howon\\Desktop\\howon\\queryDFS.xml"));
																						//xml파일 Document로 불러오기
		Element k33_root = k33_doc.getDocumentElement();								//doc의 요소 받아오기 (사실상 무의미, 밑의 방법을 이용)
		
		NodeList k33_tag_001 = k33_doc.getElementsByTagName("data");					//NodeList tag_001에 doc의 TagName data를 찾아서 넣어주기
		
		String k33_seq = "";	//48시간 중 몇 번째인지 가리킴
		String k33_hour = "";	//동네예보 3시간 단위
		String k33_day = "";	//1 번째 날 (0:오늘 / 1:내일 / 2:모레)
		String k33_temp = "";	//현재 시간 온도
		String k33_tmx = "";	//최고 온도
		String k33_tmn = "";	//최저 온도
		String k33_sky = "";	//하늘 상태 코드 (1:맑음 / 2:구름조금 / 3:구름많음 / 4:흐림)
		String k33_pty = "";	//강수 상태 코드 (0:없음 / 1:비 / 2:비/눈 / 3:눈/비 / 4:눈)
		String k33_wfKor = "";	//날씨 한국어
		String k33_wfEn = "";	//날씨 영어
		String k33_pop = "";	//강수 확률(%)
		String k33_r12 = "";	//12시간 예상 강수량
		String k33_s12 = "";	//12시간 예상 적설량
		String k33_ws = "";		//풍속 (m/s)
		String k33_wd = "";		//풍향 (0~7:북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k33_wdKor = "";	//풍향 한국어
		String k33_wdEn = "";	//풍향 영어
		String k33_reh = "";	//습도(%)
		String k33_r06 = "";	//6시간 예상 강수량
		String k33_s06 = "";	//6시간 예상 적설량
		
		for (int k33_i = 0; k33_i < k33_tag_001.getLength(); k33_i++) {									//반복문 : 정수형 변수 i는 0이고, i는 tag_001의 길이전까지 1씩증가하며 반복
			Element k33_elmt = (Element)k33_tag_001.item(k33_i);										//Element elmt를 선언하여 tag_001의 i번째 item을 가져오기
																										
			k33_seq = k33_tag_001.item(k33_i).getAttributes().getNamedItem("seq").getNodeValue();		//seq를 tag_001의 TagName data에서 seq의 value를 가져온 값으로 정의
			k33_hour = k33_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();	//hour를 elmt의 TagName hour를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_day = k33_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();		//day를 elmt의 TagName day를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_temp = k33_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();	//temp를 elmt의 TagName temp를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_tmx = k33_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();		//tmx를 elmt의 TagName tmx를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_tmn = k33_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();		//tmn를 elmt의 TagName tmn를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_sky = k33_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();		//sky를 elmt의 TagName sky를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_pty = k33_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();		//pty를 elmt의 TagName pty를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_wfKor = k33_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();	//wfKor를 elmt의 TagName wfKor를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_wfEn = k33_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();	//wfEn를 elmt의 TagName wfEn를 찾아서 첫 번째 value를 가져온 값으로 정의	
			k33_pop = k33_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();		//pop을 elmt의 TagName pop을 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_r12 = k33_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();		//r12를 elmt의 TagName r12를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_s12 = k33_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();		//s12를 elmt의 TagName s12를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_ws = k33_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();		//ws를 elmt의 TagName ws를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_wd = k33_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();		//wd를 elmt의 TagName wd를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_wdKor = k33_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();	//wdKor를 elmt의 TagName wdKor를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_wdEn = k33_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();	//wdEn을 elmt의 TagName wdEn을 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_reh = k33_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();		//reh를 elmt의 TagName reh를 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_r06 = k33_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();		//r06을 elmt의 TagName r06을 찾아서 첫 번째 value를 가져온 값으로 정의
			k33_s06 = k33_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();		//s06을 elmt의 TagName s06을 찾아서 첫 번째 value를 가져온 값으로 정의
			System.out.printf("*************************************************\n");					//문자열 출력
			System.out.printf("%s : [%s번째]\n", "순서", k33_seq);										//seq 출력 (순서)
			System.out.printf("%s : %s시\n", "시간", k33_hour);											//hour 출력	(시간)
			System.out.printf("%s : %s\n", "일자", k33_day_cvt(k33_day));								//day를 day_cvt 메소드에 넣어서 나온 결과 값 출력 (일자: 오늘, 내일, 모레)
			System.out.printf("%s : %s도\n", "현재온도", k33_temp);										//temp 출력 (현재온도)
			System.out.printf("%s : %s도\n", "최고온도", k33_tmx);										//tmt 출력 (최고온도)		 
			System.out.printf("%s : %s도\n", "최저온도", k33_tmn);										//tmn 출력 (최저온도)
			System.out.printf("%s : %s\n", "하늘상태", k33_sky_cvt(k33_sky));							//sky를 sky_cvt 메소드에 넣어서 나온 결과 값 출력 (하늘상태)
			System.out.printf("%s : %s\n", "강수상태", k33_pty_cvt(k33_pty));							//pty를 pty_cvt 메소드에 넣어서 나온 결과 값 출력 (강수상태)
			System.out.printf("%s : %s\n", "날씨(한국어)", k33_wfKor);									//wfKor 출력 (날씨 한국어)
			System.out.printf("%s : %s\n", "날씨(영어)", k33_wfEn);										//wfEn 출력 (날씨 영어)
			System.out.printf("%s : %s%%\n", "강수확률", k33_pop);										//pop 출력 (강수확률)
			System.out.printf("%s : %smm\n", "12시간예상강수량", k33_r12);								//r12 출력 (12시간 예상 강수량)
			System.out.printf("%s : %smm\n", "12시간예상적설량", k33_s12);								//s12 출력 (12시간 예상 적설량)
			System.out.printf("%s : %sm/s\n","풍속", k33_ws);											//ws 출력 (풍속)
			System.out.printf("%s : %s\n", "풍향", k33_wd_cvt(k33_wd));									//wd를 wd_cvt 메소드에 넣어서 나온 결과 값 출력 (풍향)
			System.out.printf("%s : %s\n", "풍향(한국어)", k33_wdKor);									//wdKor 출력 (풍향 한국어)
			System.out.printf("%s : %s\n", "풍향(영어)", k33_wdEn);										//wdEn 출력 (풍향 영어)
			System.out.printf("%s : %s%%\n", "습도", k33_reh);											//reh 출력 (습도)
			System.out.printf("%s : %smm\n", "6시간예상강수량", k33_r06);								//r06 출력 (6시간 예상 강수량)
			System.out.printf("%s : %scm \n", "6시간예상적설량", k33_s06);							//s06 출력 (6시간 예상 적설량)
			
		}
		System.out.printf("*************************************************\n");						//문자열 출력
	}
	public static String k33_day_cvt (String k33_num) {													//인자를 문자열 num으로 받고 return값을 문자열로 내보내는 메소드 day_cvt 생성
		if (k33_num.equals("0")) k33_num = "오늘"; 														//num이 0이면 num은 "오늘"
		else if (k33_num.equals("1")) k33_num = "내일";													//num이 1이면 num은 "내일"
		else if (k33_num.equals("2")) k33_num = "모레";													//num이 2면 num은 "모레"
		
		return k33_num;																					//return값으로 num을 줌
	}
	
	public static String k33_sky_cvt (String k33_num) {													//인자를 문자열 num으로 받고 return값을 문자열로 내보내는 메소드 day_cvt 생성
		if (k33_num.equals("1")) k33_num = "맑음"; 														//num이 1이면 num은 "맑음"
		else if (k33_num.equals("2")) k33_num = "구름조금";												//num이 2면 num은 "구름조금"
		else if (k33_num.equals("3")) k33_num = "구름많음";												//num이 3이면 num은 "구름많음"
		else if (k33_num.equals("4")) k33_num = "흐림";													//num이 4이면 num은 "흐림"
		
		return k33_num;																					//return값으로 num을 줌
	}
		
	public static String k33_pty_cvt (String k33_num) {													//인자를 문자열 num으로 받고 return값을 문자열로 내보내는 메소드 day_cvt 생성
		if (k33_num.equals("0")) k33_num = "없음"; 														//num이 0이면 num은 "없음"
		else if (k33_num.equals("1")) k33_num = "비";													//num이 1이면 num은 "비"
		else if (k33_num.equals("2")) k33_num = "비/눈";												//num이 2면 num은 "비/눈"
		else if (k33_num.equals("3")) k33_num = "눈/비";												//num이 3이면 num은 "눈/비"
		else if (k33_num.equals("4")) k33_num = "눈";													//num이 4이면 num은 "눈"
		
		return k33_num;																					//return값으로 num을 줌
	}	
	
	public static String k33_wd_cvt (String k33_num) {													//인자를 문자열 num으로 받고 return값을 문자열로 내보내는 메소드 day_cvt 생성
		if (k33_num.equals("0")) k33_num = "북"; 														//num이 0이면 num은 "북"
		else if (k33_num.equals("1")) k33_num = "북동";													//num이 1이면 num은 "북동"
		else if (k33_num.equals("2")) k33_num = "동";													//num이 2면 num은 "동"												
		else if (k33_num.equals("3")) k33_num = "남동";													//num이 3이면 num은 "남동"
		else if (k33_num.equals("4")) k33_num = "남";													//num이 4이면 num은 "남"
		else if (k33_num.equals("5")) k33_num = "남서";													//num이 5면 num은 "남서"
		else if (k33_num.equals("6")) k33_num = "서";													//num이 6이면 num은 "서"
		else if (k33_num.equals("7")) k33_num = "북서";													//num이 7이면 num은 "북서"
		
		return k33_num;																					//return값으로 num을 줌
	}

}
