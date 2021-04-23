package hw0420_Tue_ch9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class k33_ch9_실습_3_JSON_1 {

	public static JSONObject k33_oneRec(String k33_name, int k33_studentid, int k33_kor, int k33_eng, int k33_mat) {
															//인자로 문자열 1개와 정수형 변수 4개를 받고 JSONObject를 return하는 함수 oneRec 생성
															//문자열 1개 = 이름, 정수형 변수 4개는 각각 학번, 국어&영어&수학 점수
		JSONObject k33_dataObject = new JSONObject();		//JSONObject dataObject 객체 생성
		k33_dataObject.put("name",  k33_name);				//dataObject에 data 이름 "name"을 넣어주고 값에다가 입력받은 name을 넣어줌
		k33_dataObject.put("studentid", k33_studentid);		//dataObject에 data 이름 "studentid"를 넣어주고 값에다가 입력받은 studentid를 넣어줌
		
		JSONArray k33_score = new JSONArray();				//JSONArray score 배열 생성
		k33_score.add(k33_kor); k33_score.add(k33_eng); k33_score.add(k33_mat);		//score 배열에 90, 100, 95를 넣어줌
		k33_dataObject.put("score", k33_score);				//dataObject에 data 이름 "score"를 넣어주고 값으로는 score배열 값을 넣어줌
		
		return k33_dataObject;								//dataObject 리턴
	}
	
	
	public static void main(String[] args) {				//메인 함수
		JSONObject k33_jsonObject = new JSONObject();		//JSONObject jsonObject 객체 생성
		JSONArray k33_datasArray = new JSONArray();			//JSONArray datasArray 배열 생성
		
		JSONObject k33_dataObject = new JSONObject();		//JSONObject dataObject 객체 생성	
		k33_dataObject.put("name",  "나연");				//dataObject에 data 이름 "name"과 값 "나연"을 넣어줌
		k33_dataObject.put("studentid",  209901);			//dataObject에 data 이름 "studentid"와 값 "209901"을 넣어줌
															//JSON에서는 큰따옴표 없이 숫자만 쓰면 숫자로 인식됨
		JSONArray k33_score = new JSONArray();				//JSONArray score 배열 생성
		k33_score.add(90); k33_score.add(100); k33_score.add(95);	//score 배열에 90, 100, 95를 넣어줌
		k33_dataObject.put("score", k33_score);						//dataObject에 data 이름 "score"를 넣어주고 값으로는 score배열 값을 넣어줌
		k33_datasArray.add(k33_dataObject);							//datasArray 배열에 dataObject를 넣어줌
																	//하나씩 넣기 불편함으로 위에 함수를 하나 선언하여 과정을 간단하게 함
		
		k33_datasArray.add(k33_oneRec("정연", 209902, 100, 85, 75));	//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("모모", 209903, 90, 95, 65));		//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("사나", 209904, 95, 80, 100));	//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("지효", 209905, 85, 100, 60));	//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("미나", 209906, 95, 95, 95));		//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("다현", 209907, 80, 85, 85));		//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("채영", 209908, 90, 100, 100));	//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		k33_datasArray.add(k33_oneRec("쯔위", 209909, 75, 65, 80));		//datasArray에 oneRec메소드 리턴값을 넣어줌 (이름,학번, 국영수 점수)
		
		try {																						//try
			FileWriter k33_file = new FileWriter("C:\\Users\\Howon\\Desktop\\howon\\test.json");	//FileWriter file 생성하여 test.json파일 불러오기
																									//파일이 없으면 생성하고 불러오기
			k33_file.write(k33_datasArray.toJSONString());											//file에 datasArray값을 문자열로 형 변환 후 붙여쓰기
			k33_file.flush();																		//file의 메모리(버퍼)에 있는 것을 메모리에 쓰기
			k33_file.close();																		//FileWriter 종료
		} catch(IOException k33_e) {																//catch 예외처리
			k33_e.printStackTrace();																//error 추적하여 출력
		}
		System.out.println("JSON 만든거 : " + k33_datasArray);										//datasArray 출력
	}

}
