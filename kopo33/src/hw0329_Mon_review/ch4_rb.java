package hw0329_Mon_review;

import java.util.Scanner;

public class ch4_rb {
	 public static void main(String[] args) {
	      int[] a = {1, 2, 3, 4, 5};
	      
	      for(int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      
	      returnArray(a);
	      System.out.println();
	      
	      for(int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	   }
	   
	   public static int[] returnArray(int[] a) {
	      for(int i = 0; i < a.length; i++) {
	         a[i] += 1;
	      }
	      return a;
	   }


}
