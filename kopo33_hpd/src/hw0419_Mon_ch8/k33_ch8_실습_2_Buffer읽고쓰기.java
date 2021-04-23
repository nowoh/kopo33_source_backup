package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_�ǽ�_2_Buffer�а��� {

	public static void k33_FileWriter() throws IOException {		//FileWriter �޼ҵ� ����, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");		//k33.txt���� f���Ϸ� �ҷ����� (������ �ҷ�����)
		BufferedWriter k33_bw = new BufferedWriter(new FileWriter(k33_f));	//f���� BufferedWriter ��ü �����Ͽ� ����
		
		k33_bw.write("�ȳ� ����");											//bw�� ���ڿ� ����
		k33_bw.newLine();													//�� �ٲٱ�
		k33_bw.write("hello ���");											//bw�� ���ڿ� ����
		k33_bw.newLine();													//�� �ٲٱ�
		
		k33_bw.close();														//BufferedWriter ����
	}
	
	public static void k33_FileRead() throws IOException {			//FileRead �޼ҵ� ����, error ���� ó�� ����
		File k33_f = new File("C:\\Users\\Howon\\Desktop\\k33.txt");	//k33.txt���� f���Ϸ� �ҷ����� (������ �ҷ�����)
		BufferedReader k33_br = new BufferedReader (new FileReader(k33_f));	//f���� BufferedReader ��ü �����Ͽ� �б�
		
		String k33_readtxt;											//���ڿ� readtxt ����
		
		while ((k33_readtxt = k33_br.readLine()) != null) {			//�ݺ��� : readtxt�� �� ���� �о null�� �ƴϸ� �ݺ�
			System.out.printf("%s\n", k33_readtxt);					//readtxt ���
		}
		k33_br.close();												//BufferedWriter ����
	}
	public static void main(String[] args) throws IOException {		//�����Լ�, error ���� ó�� ����
		k33_FileWriter();											//FileWriter �޼ҵ� ����
		k33_FileRead();												//FileReader �޼ҵ� ����
	}
}
