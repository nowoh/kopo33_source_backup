package hw0420_Tue_ch9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class k33_ch9_�ǽ�_4_JSON_Parsing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {	//�����Լ�, ����ó�� ����
		JSONParser parser = new JSONParser();		//JSONParser parser ��ü ����
		
		Object obj = parser.parse(new FileReader("C:\\Users\\Howon\\Desktop\\howon\\test.json"));	//test.json���� �о�ͼ� Object obj����
		
		JSONArray array = (JSONArray)obj;	//JSONArray array�� ���� obj�� �迭�� ����
		
		System.out.println("******************************************");	//���ڿ� ���
		for (int i = 0; i < array.size(); i++) {						//�ݺ��� : ������ ���� i�� 0�̰�, i�� array�迭�� ũ�������� 1�� �����ϸ� �ݺ�
			JSONObject result = (JSONObject) array.get(i);				//JSONObject result�� array�迭�� i��° ��Ҹ� �����ͼ� ��������
			System.out.println("�̸� : " + result.get("name"));			//JSONObject result���� name�� �����ͼ� ���
			System.out.println("�й� : " + result.get("studentid"));	//JSONObject result���� studentid�� �����ͼ� ���
			JSONArray score = (JSONArray) result.get("score");			//JSONArray score�� ���� result�� score�� �迭�� ����
			long kor = (long)score.get(0);								//score�� [0]��° ��Ҹ� long���� �� ��ȯ �� kor�� ����
			long eng = (long)score.get(1);								//score�� [1]��° ��Ҹ� long���� �� ��ȯ �� eng�� ����
			long mat = (long)score.get(2);								//score�� [2]��° ��Ҹ� long���� �� ��ȯ �� mat�� ����	
			
			System.out.println("���� : " + kor);						//kor ��� (���� ����)
			System.out.println("���� : " + eng);						//eng ��� (���� ����)
			System.out.println("���� : " + mat);						//mat ��� (���� ����)
			System.out.println("���� : " + (kor+eng+mat));				//kor�� eng�� mat�� ��� ���ؼ� ���� ���
			System.out.println("��� : " + ((kor+eng+mat)/3));			//������ 3���� ����� ��� ���
			System.out.println("******************************************");	//���ڿ� ���	
		}	
	}
}
	