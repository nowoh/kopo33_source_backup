package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class A_05 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] vm = {500, 1000, 700}; 
		int[] cnt = {0, 0, 0};
		int balance = 2000;
		
		while(true) {
			int type = printMenu(vm, balance, cnt);
			if(type == 1) {
				balance = cal1(vm, balance, cnt);
			} else if(type == 2) {
				balance = cal2(vm, balance, cnt);
			} else if(type == 3) {
				balance = cal3(vm, balance, cnt);
			} else if(type == 4) {
				balance = cal4(cnt, balance);	
			} else if (balance < 0) {
				break;
			}
		}
	}
	
	public static int printMenu(int[] vm, int balance,int[] cnt) {
		System.out.printf("#Vending machine\n");
		System.out.printf("1. Coke - %d\n", vm[0]);
		System.out.printf("2. Juice - %d\n", vm[1]);
		System.out.printf("3. Milk - %d\n", vm[2]);
		System.out.printf("4. Cancel All\n");
		System.out.printf("*Balance : %d\n", balance);
		System.out.printf("Coke[%d}, Juice[%d], Milk[%d]", cnt[0], cnt[1], cnt[2]);
		return scanner.nextInt();
	}
	
	public static int cal1(int[] vm, int balance,int[] cnt) {
		cnt[0]++;
		balance -= vm[0];
		return balance;
	}
	
	public static int cal2(int[] vm, int balance,int[] cnt) {
		cnt[1]++;
		balance -= vm[1];
		return balance;
	}
	
	public static int cal3(int[] vm, int balance,int[] cnt) {
		cnt[2]++;
		balance -= vm[2];
		return balance;
	}
	
	public static int cal4(int[] cnt, int balance) {
		for(int i = 0; i < 3; i++) {
			cnt[i] = 0;
		}
		return balance = 2000;
	}
}
