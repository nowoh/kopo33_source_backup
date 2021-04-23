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

public class k33_ch9_실습_1_XML만들기 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
																				//메인함수, 예외처리 포함
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
																				//DocumentBuilder 생성
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\Howon\\Desktop\\howon\\score.xml"));
																				//xml파일 Document로 불러오기
		Element k33_root = k33_doc.getDocumentElement();						//doc의 요소 받아오기 (사실상 무의미, 밑의 방법을 이용)
		
		NodeList k33_tag_name = k33_doc.getElementsByTagName("name");			//NodeList tag_name에 doc의 TagName name을 찾아서 넣어주기
		NodeList k33_tag_studentid = k33_doc.getElementsByTagName("studentid");	//NodeList tag_studentid에 doc의 TagName studentid를 찾아서 넣어주기
		NodeList k33_tag_kor = k33_doc.getElementsByTagName("kor");				//NodeList tag_kor에 doc의 TagName kor를 찾아서 넣어주기
		NodeList k33_tag_eng = k33_doc.getElementsByTagName("eng");				//NodeList tag_eng에 doc의 TagName eng를 찾아서 넣어주기
		NodeList k33_tag_mat = k33_doc.getElementsByTagName("mat");				//NodeList tag_mat에 doc의 TagName mat을 찾아서 넣어주기	
		
		System.out.printf("*******************************************\n");		//문자열 출력
		for (int k33_i = 0; k33_i < k33_tag_name.getLength(); k33_i++) {		//반복문 : 정수형 변수 i는 0이고, i는 tag_name의 길이 전까지 1씩 증가하며 반복
			System.out.printf("이름 : %s\n", k33_tag_name.item(k33_i).getFirstChild().getNodeValue());		//tag_name의 i번째 NodeList의 value를 출력
			System.out.printf("학번 : %s\n", k33_tag_studentid.item(k33_i).getFirstChild().getNodeValue());	//tag_studentid의 i번째 NodeList의 value를 출력	
			System.out.printf("국어 : %s\n", k33_tag_kor.item(k33_i).getFirstChild().getNodeValue());		//tag_kor의 i번째 NodeList의 value를 출력
			System.out.printf("영어 : %s\n", k33_tag_eng.item(k33_i).getFirstChild().getNodeValue());		//tag_eng의 i번째 NodeList의 value를 출력
			System.out.printf("수학 : %s\n", k33_tag_mat.item(k33_i).getFirstChild().getNodeValue());		//tag_mat의 i번째 NodeList의 value를 출력
			System.out.printf("*******************************************\n");
		}
	}

}
