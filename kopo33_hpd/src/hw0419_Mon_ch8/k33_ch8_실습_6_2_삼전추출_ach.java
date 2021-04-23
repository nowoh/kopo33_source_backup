package hw0419_Mon_ch8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class k33_ch8_실습_6_2_삼전추출_ach {
	

	 public static void main(String[] args) throws IOException {
	      // TODO Auto-generated method stub
	      File f = new File ("C:\\Users\\Howon\\Desktop\\howon\\StockDailPrice.csv");
	      BufferedReader br = new BufferedReader (new FileReader(f));
	         File f1 = new File ("C:\\Users\\Howon\\Desktop\\howon\\Samsung.csv");
	      
	      BufferedWriter bw1 = new BufferedWriter (new FileWriter(f1));   
	      String readtxt;
	      
	      int cnt = 0; int wcnt = 0;
	      while((readtxt =br.readLine())!= null) {
	         StringBuffer s = new StringBuffer();
	         String[] field = readtxt.split(",");
	         
	         if (field.length>2 && field[2].equals("A005930")) {
	            
	            for (int j = 0; j < field.length; j++) {
	               if (j == 0) s.append(field[j]); 
	               else s.append(","+field[j]);
	            }
	            
	            bw1.write(s.toString()); bw1.newLine();
	            wcnt++;
	         }
	         
	         cnt ++;
	      }
	      
	      br.close();
	      bw1.close();
	      System.out.printf("Program End [%d][%d] records",cnt,wcnt);
	   }

}
