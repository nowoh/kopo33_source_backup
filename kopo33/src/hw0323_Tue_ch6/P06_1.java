package hw0323_Tue_ch6;

import java.util.Scanner;

public class P06_1 {

	public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner scanner = new Scanner(System.in);
	      String words = scanner.nextLine();
	      String compare = scanner.next();
	      String[] names = words.split("");
	      String[] comparenames = compare.split("");
	      
	      if (compare.length() == 1) {
	         System.out.println(count(charat(words),charat(compare)));
	      } else if (compare.length() == 2) {
	         System.out.println(two(charat(words),charat(compare)[0], charat(compare)[1]));
	      }


	   }
	   
	   public static char[] charat(String input) {
	      char [] p = new char [input.length()];
	      for (int i=0; i<input.length(); i++) {
	         p[i] = input.charAt(i);
	      }
	      return p;
	      
	   }
	   
	   public static int count(char[]a, char[]b) {
	      int count = 0;
	      for (int i = 0; i < a.length; i++) {
	         for (int j = 0; j < b.length; j++) {
	            if(a[i] == b[j]) {
	               count++;
	            }
	         }
	      }
	      return count;
	   }
	   
	   public static int two(char[]a, char b, char c) {
	      int count1 = 0;
	      int count2 = 0;
	      int min = 0;
	      
	      for (int i = 0; i < a.length; i++) {
	         for (int j = 0; j < 1; j++) {
	            if(a[i] == b) {
	               count1++;
	            }
	         }
	      }
	      
	      for (int i = 0; i < a.length; i++) {
	         for (int j = 0; j < 1; j++) {
	            if(a[i] == c) {
	               count2++;
	            }
	         }
	      }
	      if (count1 > count2) {
	         min = count2;
	      } else if (count1 < count2) {
	         min = count1;
	      }
	      return min;
	      
	   }
	}

