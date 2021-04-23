package hw0323_Tue_ch6;

import java.util.Scanner;

public class P06_2_count_char {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      String sentence = scan.nextLine(); //원하는 문장 입력
	      sentence  = sentence.toLowerCase(); //대소문자 구분 없애기 위해 소문자로 변환
	      String words = scan.nextLine();	//원하는 검색 단어 입력
	      words = words.toLowerCase();		
	       
	       int min = 999999999; //int를 초과하는 글자수 검색 x
	       
	       for(int i = 0; i < words.length(); i++){		//검색 단어 길이만큼 돌려서
	          int  cnt = 0;	// 카운트 초기화
	          for(int j = 0; j < sentence.length(); j++){	// 문장 안에서 찾기.
	             if(words.charAt(i) == sentence.charAt(j))	//같으면 
	                cnt++;									//카운트.
	          }
	          if(cnt < min)
	             min = cnt;									//단어 길이만큼 돌린 카운트들 비교하여 min구하기.
	       }
	       
	       System.out.println(min);							//결국 여러 카운드들 중 최소로 반복된 알파벳 기준으로 출력.
	    }
}
