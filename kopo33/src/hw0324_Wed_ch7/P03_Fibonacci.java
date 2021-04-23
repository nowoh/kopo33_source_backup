package hw0324_Wed_ch7;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P03_Fibonacci {

	public static void main(String[] args) {
		ArrayList<Integer> fib = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		try {
			int n = scanner.nextInt(); 
			int[] N = new int[n];
			N[0] = 0;
			fib.add(N[0]);
			N[1] = 1;
			fib.add(N[1]);
			for (int i = 2; i < N.length; i++) {
				N[i] = N[i-2] + N[i-1];
				fib.add(N[i]);
			}
			System.out.println(fib);
		} catch (InputMismatchException e) {
			System.out.println("Input Number! ");
		} catch (Exception e) {
			System.out.println("Please Input Natural Number.");
			e.printStackTrace();
		}
	}
}
