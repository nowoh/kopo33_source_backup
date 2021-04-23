package hw0420_Tue_ch9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class k33_ch9_실습_4_JSON_Parsing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {	//메인함수, 예외처리 해줌
		JSONParser parser = new JSONParser();		//JSONParser parser 객체 생성
		
		Object obj = parser.parse(new FileReader("C:\\Users\\Howon\\Desktop\\howon\\test.json"));	//test.json파일 읽어와서 Object obj생성
		
		JSONArray array = (JSONArray)obj;	//JSONArray array를 만들어서 obj를 배열에 넣음
		
		System.out.println("******************************************");	//문자열 출력
		for (int i = 0; i < array.size(); i++) {						//반복문 : 정수형 변수 i는 0이고, i는 array배열의 크기전까지 1씩 증가하며 반복
			JSONObject result = (JSONObject) array.get(i);				//JSONObject result에 array배열의 i번째 요소를 가져와서 정의해줌
			System.out.println("이름 : " + result.get("name"));			//JSONObject result에서 name을 가져와서 출력
			System.out.println("학번 : " + result.get("studentid"));	//JSONObject result에서 studentid를 가져와서 출력
			JSONArray score = (JSONArray) result.get("score");			//JSONArray score를 만들어서 result의 score를 배열에 넣음
			long kor = (long)score.get(0);								//score의 [0]번째 요소를 long으로 형 변환 후 kor로 정의
			long eng = (long)score.get(1);								//score의 [1]번째 요소를 long으로 형 변환 후 eng로 정의
			long mat = (long)score.get(2);								//score의 [2]번째 요소를 long으로 형 변환 후 mat로 정의	
			
			System.out.println("국어 : " + kor);						//kor 출력 (국어 점수)
			System.out.println("영어 : " + eng);						//eng 출력 (영어 점수)
			System.out.println("수학 : " + mat);						//mat 출력 (수학 점수)
			System.out.println("총점 : " + (kor+eng+mat));				//kor과 eng와 mat을 모두 더해서 총점 출력
			System.out.println("평균 : " + ((kor+eng+mat)/3));			//총점을 3으로 나누어서 평균 출력
			System.out.println("******************************************");	//문자열 출력	
		}	
	}
}
	