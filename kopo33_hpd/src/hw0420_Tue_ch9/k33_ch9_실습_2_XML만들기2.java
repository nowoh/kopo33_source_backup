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

public class k33_ch9_�ǽ�_2_XML�����2 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
																						//�����Լ�, ����ó�� ����
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
																						//DocumentBuilder ����
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\Howon\\Desktop\\howon\\queryDFS.xml"));
																						//xml���� Document�� �ҷ�����
		Element k33_root = k33_doc.getDocumentElement();								//doc�� ��� �޾ƿ��� (��ǻ� ���ǹ�, ���� ����� �̿�)
		
		NodeList k33_tag_001 = k33_doc.getElementsByTagName("data");					//NodeList tag_001�� doc�� TagName data�� ã�Ƽ� �־��ֱ�
		
		String k33_seq = "";	//48�ð� �� �� ��°���� ����Ŵ
		String k33_hour = "";	//���׿��� 3�ð� ����
		String k33_day = "";	//1 ��° �� (0:���� / 1:���� / 2:��)
		String k33_temp = "";	//���� �ð� �µ�
		String k33_tmx = "";	//�ְ� �µ�
		String k33_tmn = "";	//���� �µ�
		String k33_sky = "";	//�ϴ� ���� �ڵ� (1:���� / 2:�������� / 3:�������� / 4:�帲)
		String k33_pty = "";	//���� ���� �ڵ� (0:���� / 1:�� / 2:��/�� / 3:��/�� / 4:��)
		String k33_wfKor = "";	//���� �ѱ���
		String k33_wfEn = "";	//���� ����
		String k33_pop = "";	//���� Ȯ��(%)
		String k33_r12 = "";	//12�ð� ���� ������
		String k33_s12 = "";	//12�ð� ���� ������
		String k33_ws = "";		//ǳ�� (m/s)
		String k33_wd = "";		//ǳ�� (0~7:��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k33_wdKor = "";	//ǳ�� �ѱ���
		String k33_wdEn = "";	//ǳ�� ����
		String k33_reh = "";	//����(%)
		String k33_r06 = "";	//6�ð� ���� ������
		String k33_s06 = "";	//6�ð� ���� ������
		
		for (int k33_i = 0; k33_i < k33_tag_001.getLength(); k33_i++) {									//�ݺ��� : ������ ���� i�� 0�̰�, i�� tag_001�� ���������� 1�������ϸ� �ݺ�
			Element k33_elmt = (Element)k33_tag_001.item(k33_i);										//Element elmt�� �����Ͽ� tag_001�� i��° item�� ��������
																										
			k33_seq = k33_tag_001.item(k33_i).getAttributes().getNamedItem("seq").getNodeValue();		//seq�� tag_001�� TagName data���� seq�� value�� ������ ������ ����
			k33_hour = k33_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();	//hour�� elmt�� TagName hour�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_day = k33_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();		//day�� elmt�� TagName day�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_temp = k33_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();	//temp�� elmt�� TagName temp�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_tmx = k33_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();		//tmx�� elmt�� TagName tmx�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_tmn = k33_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();		//tmn�� elmt�� TagName tmn�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_sky = k33_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();		//sky�� elmt�� TagName sky�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_pty = k33_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();		//pty�� elmt�� TagName pty�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_wfKor = k33_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();	//wfKor�� elmt�� TagName wfKor�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_wfEn = k33_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();	//wfEn�� elmt�� TagName wfEn�� ã�Ƽ� ù ��° value�� ������ ������ ����	
			k33_pop = k33_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();		//pop�� elmt�� TagName pop�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_r12 = k33_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();		//r12�� elmt�� TagName r12�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_s12 = k33_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();		//s12�� elmt�� TagName s12�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_ws = k33_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();		//ws�� elmt�� TagName ws�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_wd = k33_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();		//wd�� elmt�� TagName wd�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_wdKor = k33_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();	//wdKor�� elmt�� TagName wdKor�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_wdEn = k33_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();	//wdEn�� elmt�� TagName wdEn�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_reh = k33_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();		//reh�� elmt�� TagName reh�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_r06 = k33_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();		//r06�� elmt�� TagName r06�� ã�Ƽ� ù ��° value�� ������ ������ ����
			k33_s06 = k33_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();		//s06�� elmt�� TagName s06�� ã�Ƽ� ù ��° value�� ������ ������ ����
			System.out.printf("*************************************************\n");					//���ڿ� ���
			System.out.printf("%s : [%s��°]\n", "����", k33_seq);										//seq ��� (����)
			System.out.printf("%s : %s��\n", "�ð�", k33_hour);											//hour ���	(�ð�)
			System.out.printf("%s : %s\n", "����", k33_day_cvt(k33_day));								//day�� day_cvt �޼ҵ忡 �־ ���� ��� �� ��� (����: ����, ����, ��)
			System.out.printf("%s : %s��\n", "����µ�", k33_temp);										//temp ��� (����µ�)
			System.out.printf("%s : %s��\n", "�ְ�µ�", k33_tmx);										//tmt ��� (�ְ�µ�)		 
			System.out.printf("%s : %s��\n", "�����µ�", k33_tmn);										//tmn ��� (�����µ�)
			System.out.printf("%s : %s\n", "�ϴû���", k33_sky_cvt(k33_sky));							//sky�� sky_cvt �޼ҵ忡 �־ ���� ��� �� ��� (�ϴû���)
			System.out.printf("%s : %s\n", "��������", k33_pty_cvt(k33_pty));							//pty�� pty_cvt �޼ҵ忡 �־ ���� ��� �� ��� (��������)
			System.out.printf("%s : %s\n", "����(�ѱ���)", k33_wfKor);									//wfKor ��� (���� �ѱ���)
			System.out.printf("%s : %s\n", "����(����)", k33_wfEn);										//wfEn ��� (���� ����)
			System.out.printf("%s : %s%%\n", "����Ȯ��", k33_pop);										//pop ��� (����Ȯ��)
			System.out.printf("%s : %smm\n", "12�ð����󰭼���", k33_r12);								//r12 ��� (12�ð� ���� ������)
			System.out.printf("%s : %smm\n", "12�ð�����������", k33_s12);								//s12 ��� (12�ð� ���� ������)
			System.out.printf("%s : %sm/s\n","ǳ��", k33_ws);											//ws ��� (ǳ��)
			System.out.printf("%s : %s\n", "ǳ��", k33_wd_cvt(k33_wd));									//wd�� wd_cvt �޼ҵ忡 �־ ���� ��� �� ��� (ǳ��)
			System.out.printf("%s : %s\n", "ǳ��(�ѱ���)", k33_wdKor);									//wdKor ��� (ǳ�� �ѱ���)
			System.out.printf("%s : %s\n", "ǳ��(����)", k33_wdEn);										//wdEn ��� (ǳ�� ����)
			System.out.printf("%s : %s%%\n", "����", k33_reh);											//reh ��� (����)
			System.out.printf("%s : %smm\n", "6�ð����󰭼���", k33_r06);								//r06 ��� (6�ð� ���� ������)
			System.out.printf("%s : %scm \n", "6�ð�����������", k33_s06);							//s06 ��� (6�ð� ���� ������)
			
		}
		System.out.printf("*************************************************\n");						//���ڿ� ���
	}
	public static String k33_day_cvt (String k33_num) {													//���ڸ� ���ڿ� num���� �ް� return���� ���ڿ��� �������� �޼ҵ� day_cvt ����
		if (k33_num.equals("0")) k33_num = "����"; 														//num�� 0�̸� num�� "����"
		else if (k33_num.equals("1")) k33_num = "����";													//num�� 1�̸� num�� "����"
		else if (k33_num.equals("2")) k33_num = "��";													//num�� 2�� num�� "��"
		
		return k33_num;																					//return������ num�� ��
	}
	
	public static String k33_sky_cvt (String k33_num) {													//���ڸ� ���ڿ� num���� �ް� return���� ���ڿ��� �������� �޼ҵ� day_cvt ����
		if (k33_num.equals("1")) k33_num = "����"; 														//num�� 1�̸� num�� "����"
		else if (k33_num.equals("2")) k33_num = "��������";												//num�� 2�� num�� "��������"
		else if (k33_num.equals("3")) k33_num = "��������";												//num�� 3�̸� num�� "��������"
		else if (k33_num.equals("4")) k33_num = "�帲";													//num�� 4�̸� num�� "�帲"
		
		return k33_num;																					//return������ num�� ��
	}
		
	public static String k33_pty_cvt (String k33_num) {													//���ڸ� ���ڿ� num���� �ް� return���� ���ڿ��� �������� �޼ҵ� day_cvt ����
		if (k33_num.equals("0")) k33_num = "����"; 														//num�� 0�̸� num�� "����"
		else if (k33_num.equals("1")) k33_num = "��";													//num�� 1�̸� num�� "��"
		else if (k33_num.equals("2")) k33_num = "��/��";												//num�� 2�� num�� "��/��"
		else if (k33_num.equals("3")) k33_num = "��/��";												//num�� 3�̸� num�� "��/��"
		else if (k33_num.equals("4")) k33_num = "��";													//num�� 4�̸� num�� "��"
		
		return k33_num;																					//return������ num�� ��
	}	
	
	public static String k33_wd_cvt (String k33_num) {													//���ڸ� ���ڿ� num���� �ް� return���� ���ڿ��� �������� �޼ҵ� day_cvt ����
		if (k33_num.equals("0")) k33_num = "��"; 														//num�� 0�̸� num�� "��"
		else if (k33_num.equals("1")) k33_num = "�ϵ�";													//num�� 1�̸� num�� "�ϵ�"
		else if (k33_num.equals("2")) k33_num = "��";													//num�� 2�� num�� "��"												
		else if (k33_num.equals("3")) k33_num = "����";													//num�� 3�̸� num�� "����"
		else if (k33_num.equals("4")) k33_num = "��";													//num�� 4�̸� num�� "��"
		else if (k33_num.equals("5")) k33_num = "����";													//num�� 5�� num�� "����"
		else if (k33_num.equals("6")) k33_num = "��";													//num�� 6�̸� num�� "��"
		else if (k33_num.equals("7")) k33_num = "�ϼ�";													//num�� 7�̸� num�� "�ϼ�"
		
		return k33_num;																					//return������ num�� ��
	}

}
