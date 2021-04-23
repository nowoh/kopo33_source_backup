package hw0323_Tue_ch6;

public class P09_split {

	public static void main(String[] args) {
		String words1 = "kim,lee,park";
		String[] names1 = words1.split(",");
		String words2 = "choi son gwon";
		String[] names2 = words2.split(" ");
		
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}
		System.out.println();
		
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
	}
}
