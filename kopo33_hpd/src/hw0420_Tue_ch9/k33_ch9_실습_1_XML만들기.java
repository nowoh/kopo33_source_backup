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

public class k33_ch9_�ǽ�_1_XML����� {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
																				//�����Լ�, ����ó�� ����
		DocumentBuilder k33_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
																				//DocumentBuilder ����
		Document k33_doc = k33_docBuilder.parse(new File("C:\\Users\\Howon\\Desktop\\howon\\score.xml"));
																				//xml���� Document�� �ҷ�����
		Element k33_root = k33_doc.getDocumentElement();						//doc�� ��� �޾ƿ��� (��ǻ� ���ǹ�, ���� ����� �̿�)
		
		NodeList k33_tag_name = k33_doc.getElementsByTagName("name");			//NodeList tag_name�� doc�� TagName name�� ã�Ƽ� �־��ֱ�
		NodeList k33_tag_studentid = k33_doc.getElementsByTagName("studentid");	//NodeList tag_studentid�� doc�� TagName studentid�� ã�Ƽ� �־��ֱ�
		NodeList k33_tag_kor = k33_doc.getElementsByTagName("kor");				//NodeList tag_kor�� doc�� TagName kor�� ã�Ƽ� �־��ֱ�
		NodeList k33_tag_eng = k33_doc.getElementsByTagName("eng");				//NodeList tag_eng�� doc�� TagName eng�� ã�Ƽ� �־��ֱ�
		NodeList k33_tag_mat = k33_doc.getElementsByTagName("mat");				//NodeList tag_mat�� doc�� TagName mat�� ã�Ƽ� �־��ֱ�	
		
		System.out.printf("*******************************************\n");		//���ڿ� ���
		for (int k33_i = 0; k33_i < k33_tag_name.getLength(); k33_i++) {		//�ݺ��� : ������ ���� i�� 0�̰�, i�� tag_name�� ���� ������ 1�� �����ϸ� �ݺ�
			System.out.printf("�̸� : %s\n", k33_tag_name.item(k33_i).getFirstChild().getNodeValue());		//tag_name�� i��° NodeList�� value�� ���
			System.out.printf("�й� : %s\n", k33_tag_studentid.item(k33_i).getFirstChild().getNodeValue());	//tag_studentid�� i��° NodeList�� value�� ���	
			System.out.printf("���� : %s\n", k33_tag_kor.item(k33_i).getFirstChild().getNodeValue());		//tag_kor�� i��° NodeList�� value�� ���
			System.out.printf("���� : %s\n", k33_tag_eng.item(k33_i).getFirstChild().getNodeValue());		//tag_eng�� i��° NodeList�� value�� ���
			System.out.printf("���� : %s\n", k33_tag_mat.item(k33_i).getFirstChild().getNodeValue());		//tag_mat�� i��° NodeList�� value�� ���
			System.out.printf("*******************************************\n");
		}
	}

}
