package hw0325_Thu_ch9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class P01_1_BufferedReader_��������_ysy {

	public static void main(String[] args) throws IOException {
	      BufferedReader reader = new BufferedReader(
	      new FileReader("C:\\Users\\Howon\\Desktop\\���α������_�ñ����� ���� ������ ���_20191231.csv"));
	      String line = reader.readLine();

	      int i;
	      int row = 0;

	      String[][] data = new String[2743][8];

	      int[][] data_int = new int[2743][8];

	      while ((line = reader.readLine()) != null) {
	         String[] token = line.split(",");
	         for (i = 0; i < 8; i++)
	            data[row][i] = token[i];

	         for (i = 0; i < 8; i++) {
	            System.out.print(data[row][i] + " ");
	         }
	         System.out.println("");

	         row++;
	      }

	      int sum = 0;
	      int min = 0;
	      int max = 0;

	      for (int j = 3; j < data.length; j++) {
	         for (int k = 3; k < data[j].length; k++) {
	            data_int[j][k] = Integer.parseInt(data[j][k]);
	            sum += data_int[j][k];
	            if (min > data_int[j][k]) {
	               min = data_int[j][k];
	            }
	            if (max < data_int[j][k]) {
	               max = data_int[j][k];
	            }
	         }
	      }
	      System.out.println(sum);
	      System.out.println(sum / data.length);
	      System.out.println(min);
	      System.out.println(max);

	   }
}
