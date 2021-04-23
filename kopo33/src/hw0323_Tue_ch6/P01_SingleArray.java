package hw0323_Tue_ch6;

public class P01_SingleArray {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		//int[] numbers = {1, 2, 2, 3, 4};
		String[] name = {"kim", "lee", "park"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		/*for (int i = 0; i < 9; i++) {
			numbers[i] = i;
			System.out.println(numbers[i]);
		}
		/*for (int i =0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}*/
		
	}

}
