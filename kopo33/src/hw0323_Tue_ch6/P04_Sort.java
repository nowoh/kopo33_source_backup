package hw0323_Tue_ch6;

public class P04_Sort {

	public static void main(String[] args) {
		int[] numbers = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int temp = 0;
		//ascending
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
				
			}
			System.out.print(numbers[i] +" ");
		}
		System.out.println();
		
		
	}
	/*public static int min(int n[]) {
		int min = n[0];
		
		for (int i = 1; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		return min;
	}*/

}
