package hw0324_Wed_ch7;
import java.util.Scanner;

public class P02_pf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // first input number
		int[] nums = new int[n]; // initialize the array with the user input
		
		int i = 0;
		while (true) {
			try {
				nums[i++] = scanner.nextInt();
			} catch(Exception e) {
				System.out.println("error");
				break;
			}
			
		}
	}

}
