package hw0412_Mon_dailyTest;

import java.util.Scanner;

public class A_06 implements A_06_interface{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] numbers = new double[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextDouble();
		}
		A_06 main = new A_06();
		System.out.println(main.getMaxNumber(numbers));
		System.out.println(main.getMinNumber(numbers));
	}

	@Override
	public double getMaxNumber(double[] numbers) {
		
		double max = Double.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	@Override
	public double getMinNumber(double[] numbers) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
