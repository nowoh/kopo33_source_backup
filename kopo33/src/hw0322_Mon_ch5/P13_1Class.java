package hw0322_Mon_ch5;

import java.util.Scanner;

public class P13_1Class {

	public static double Convert(int beforeUnit, int afterUnit, double num){
	      double beforeScale = GetScale(beforeUnit);
	      double afterScale = GetScale(afterUnit);
	      
	      return num * afterScale / beforeScale;
	   }
	   
	   public static double GetScale(int unit){
	      switch(unit){
	         case 1 : return 100;      // 1m = 100cm
	         case 2 : return 1;        // 1m = 1m
	         case 3 : return 1000;     // 1m = 1000mm
	         case 4 : return 0.001;    // 1m = 0.001km
	         case 5 : return 0.000621; // 1m = 0.000621mile
	      }
	      return 0;
	   }
	
}
