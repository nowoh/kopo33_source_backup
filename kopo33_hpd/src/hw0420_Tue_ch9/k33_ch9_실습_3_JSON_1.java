package hw0420_Tue_ch9;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class k33_ch9_�ǽ�_3_JSON_1 {

	public static JSONObject k33_oneRec(String k33_name, int k33_studentid, int k33_kor, int k33_eng, int k33_mat) {
															//���ڷ� ���ڿ� 1���� ������ ���� 4���� �ް� JSONObject�� return�ϴ� �Լ� oneRec ����
															//���ڿ� 1�� = �̸�, ������ ���� 4���� ���� �й�, ����&����&���� ����
		JSONObject k33_dataObject = new JSONObject();		//JSONObject dataObject ��ü ����
		k33_dataObject.put("name",  k33_name);				//dataObject�� data �̸� "name"�� �־��ְ� �����ٰ� �Է¹��� name�� �־���
		k33_dataObject.put("studentid", k33_studentid);		//dataObject�� data �̸� "studentid"�� �־��ְ� �����ٰ� �Է¹��� studentid�� �־���
		
		JSONArray k33_score = new JSONArray();				//JSONArray score �迭 ����
		k33_score.add(k33_kor); k33_score.add(k33_eng); k33_score.add(k33_mat);		//score �迭�� 90, 100, 95�� �־���
		k33_dataObject.put("score", k33_score);				//dataObject�� data �̸� "score"�� �־��ְ� �����δ� score�迭 ���� �־���
		
		return k33_dataObject;								//dataObject ����
	}
	
	
	public static void main(String[] args) {				//���� �Լ�
		JSONObject k33_jsonObject = new JSONObject();		//JSONObject jsonObject ��ü ����
		JSONArray k33_datasArray = new JSONArray();			//JSONArray datasArray �迭 ����
		
		JSONObject k33_dataObject = new JSONObject();		//JSONObject dataObject ��ü ����	
		k33_dataObject.put("name",  "����");				//dataObject�� data �̸� "name"�� �� "����"�� �־���
		k33_dataObject.put("studentid",  209901);			//dataObject�� data �̸� "studentid"�� �� "209901"�� �־���
															//JSON������ ū����ǥ ���� ���ڸ� ���� ���ڷ� �νĵ�
		JSONArray k33_score = new JSONArray();				//JSONArray score �迭 ����
		k33_score.add(90); k33_score.add(100); k33_score.add(95);	//score �迭�� 90, 100, 95�� �־���
		k33_dataObject.put("score", k33_score);						//dataObject�� data �̸� "score"�� �־��ְ� �����δ� score�迭 ���� �־���
		k33_datasArray.add(k33_dataObject);							//datasArray �迭�� dataObject�� �־���
																	//�ϳ��� �ֱ� ���������� ���� �Լ��� �ϳ� �����Ͽ� ������ �����ϰ� ��
		
		k33_datasArray.add(k33_oneRec("����", 209902, 100, 85, 75));	//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("���", 209903, 90, 95, 65));		//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("�糪", 209904, 95, 80, 100));	//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("��ȿ", 209905, 85, 100, 60));	//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("�̳�", 209906, 95, 95, 95));		//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("����", 209907, 80, 85, 85));		//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("ä��", 209908, 90, 100, 100));	//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		k33_datasArray.add(k33_oneRec("����", 209909, 75, 65, 80));		//datasArray�� oneRec�޼ҵ� ���ϰ��� �־��� (�̸�,�й�, ������ ����)
		
		try {																						//try
			FileWriter k33_file = new FileWriter("C:\\Users\\Howon\\Desktop\\howon\\test.json");	//FileWriter file �����Ͽ� test.json���� �ҷ�����
																									//������ ������ �����ϰ� �ҷ�����
			k33_file.write(k33_datasArray.toJSONString());											//file�� datasArray���� ���ڿ��� �� ��ȯ �� �ٿ�����
			k33_file.flush();																		//file�� �޸�(����)�� �ִ� ���� �޸𸮿� ����
			k33_file.close();																		//FileWriter ����
		} catch(IOException k33_e) {																//catch ����ó��
			k33_e.printStackTrace();																//error �����Ͽ� ���
		}
		System.out.println("JSON ����� : " + k33_datasArray);										//datasArray ���
	}

}
