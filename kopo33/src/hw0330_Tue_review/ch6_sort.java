package hw0330_Tue_review;

import java.util.Arrays;
import java.util.Collections;

public class ch6_sort {

	public static void main(String[] args) {
		int[] numbers = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(numbers, Collections.reverseOrder()); //�׳� �������� ����ص� ���� ��
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

}
