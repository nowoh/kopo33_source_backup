package hw0318_Thu_ch3;

public class P3 {

	final static String[] CHO = {"��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��"};
	final static String[] JOONG = {"��","��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��","��"}; 
	final static String[] JONG = {"","��","��","��","��","��","��","��","��","��","��","��", "��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��"}; 
	
	public static void main(String[] args) { 
		String text = "�ȳ��ϼ���"; 
		
		for(int i = 0; i < text.length(); i++) { 
			char uniVal = text.charAt(i); 
			
			// �ѱ��� ��츸 �����ؾ� �ϱ� ������ 0xAC00���� �Ʒ��� ������ �����Ѵ� 
			if(uniVal >= 0xAC00) { 
				uniVal = (char)(uniVal - 0xAC00); 
				
				char cho = (char)(uniVal/28/21); 
				char joong = (char) ((uniVal)/28%21); 
				char jong = (char) (uniVal % 28); // ������ ù��°�� ä���̱� ������ 
				
				System.out.print(CHO[cho] + JOONG[joong] + JONG[jong]); 
			} else { 
				System.out.println(uniVal + "=>" + uniVal);
			}
		}
	}
}



