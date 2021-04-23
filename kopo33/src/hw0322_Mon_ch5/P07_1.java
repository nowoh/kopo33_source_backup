package hw0322_Mon_ch5;

import java.util.ArrayList;
import java.util.Scanner;

import hw0317_Wed_ch2.string;

public class P07_1 {

	 public static void main(String[] args)
	  {
	    Scanner scan = new Scanner(System.in);
	    
	    String input;
	    int menuNum;
	    
	    ArrayList<String> names = new ArrayList<String>();
	    ArrayList<Double> koreanScore = new ArrayList<Double>();
	    ArrayList<Double> englishScore = new ArrayList<Double>();
	    ArrayList<Double> mathScore = new ArrayList<Double>();
	    
	    while(true){
	      menuNum = scan.nextInt();
	      scan.nextLine();
	      
	      if(menuNum == 1){
	        input = scan.nextLine();
	        String[] inputs = input.split(",");
	        names.add(inputs[0]);
	        koreanScore.add(Double.parseDouble(inputs[1]));
	        englishScore.add(Double.parseDouble(inputs[2]));
	        mathScore.add(Double.parseDouble(inputs[3]));
	      }
	      
	      else if(menuNum == 2){
	        System.out.println("Number of Students : " + names.size());
	        
	        System.out.print("Korean(Avg,  Min, Max) : ");
	        PrintStatistic(koreanScore);
	          
	        System.out.print("English(Avg,  Min, Max) : ");
	        PrintStatistic(englishScore);
	        
	        System.out.print("Math(Avg,  Min, Max) : ");
	        PrintStatistic(mathScore);
	      }
	      
	      else{
	        System.out.println("Name / koreanScore / EnglishScore / MathScore");
	        for(int i = 0; i < names.size(); i++){
	           System.out.println(names.get(i) + " / " + koreanScore.get(i) + " / " + englishScore.get(i) + " / " + mathScore.get(i));
	        }
	      }
	    }
	  }
	  
	  public static void PrintStatistic(ArrayList list){
	    double min = 100.0, max = 0.0, average = 0.0;
	    
	    for(int i = 0; i < list.size(); i++){
	      if((double)list.get(i) < min) min = (double)list.get(i);
	      if((double)list.get(i) > max) max = (double)list.get(i);
	      average += (double)list.get(i);
	    }
	    average /= list.size();
	    
	    System.out.print(String.format("%.1f", average) + ", ");
	    System.out.print(String.format("%.1f", min) + ", ");
	    System.out.println(String.format("%.1f", max));
	  }
}