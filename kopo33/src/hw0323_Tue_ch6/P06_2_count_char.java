package hw0323_Tue_ch6;

import java.util.Scanner;

public class P06_2_count_char {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      String sentence = scan.nextLine(); //���ϴ� ���� �Է�
	      sentence  = sentence.toLowerCase(); //��ҹ��� ���� ���ֱ� ���� �ҹ��ڷ� ��ȯ
	      String words = scan.nextLine();	//���ϴ� �˻� �ܾ� �Է�
	      words = words.toLowerCase();		
	       
	       int min = 999999999; //int�� �ʰ��ϴ� ���ڼ� �˻� x
	       
	       for(int i = 0; i < words.length(); i++){		//�˻� �ܾ� ���̸�ŭ ������
	          int  cnt = 0;	// ī��Ʈ �ʱ�ȭ
	          for(int j = 0; j < sentence.length(); j++){	// ���� �ȿ��� ã��.
	             if(words.charAt(i) == sentence.charAt(j))	//������ 
	                cnt++;									//ī��Ʈ.
	          }
	          if(cnt < min)
	             min = cnt;									//�ܾ� ���̸�ŭ ���� ī��Ʈ�� ���Ͽ� min���ϱ�.
	       }
	       
	       System.out.println(min);							//�ᱹ ���� ī���� �� �ּҷ� �ݺ��� ���ĺ� �������� ���.
	    }
}
