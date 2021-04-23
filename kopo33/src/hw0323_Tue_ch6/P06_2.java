package hw0323_Tue_ch6;

import java.util.Scanner;

public class P06_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      String sentence = scan.nextLine();
	      sentence  = sentence.toLowerCase();
	      String words = scan.nextLine();
	       
	       int min = 999999999;
	       
	       for(int i = 0; i < words.length(); i++){
	          int  cnt = 0;
	          for(int j = 0; j < sentence.length(); j++){
	             if(words.charAt(i) == sentence.charAt(j))
	                cnt++;
	          }
	          if(cnt < min)
	             min = cnt;
	       }
	       
	       System.out.println(min);
	    }
}
