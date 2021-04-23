package hw0322_Mon_ch5;

import java.util.Scanner;

public class Price {
	int applePrice, StrawberryPrice, GrapePrice, WatermelonPrice;
	
	public Price (int applePrice, int StrawberryPrice, int GrapePrice, int WatermelonPrice) {
		this.applePrice = applePrice;
		this.StrawberryPrice = StrawberryPrice;
		this.GrapePrice = GrapePrice;
		this.WatermelonPrice = WatermelonPrice;
	}
	
	public void printMenu() {
		System.out.println("#Price");
		System.out.println("1. Apple");
		System.out.println("2. Strawberry");
		System.out.println("3. Grape");
		System.out.println("4. Watermelon");
		System.out.print("--> ");
	}
	
	public void getPrice(int num) {
		switch (num) {
			case 1 :
				System.out.println(applePrice);
				System.out.println();
				break;
			case 2 :
				System.out.println(StrawberryPrice);
				System.out.println();
				break;
			case 3 :
				System.out.println(GrapePrice);
				System.out.println();
				break;
			case 4 : 
				System.out.println(WatermelonPrice);
				System.out.println();
				break;
			default :
				System.out.println("Error!!!!!");
				System.out.println();
				break;
		
			
		}
	}
}
