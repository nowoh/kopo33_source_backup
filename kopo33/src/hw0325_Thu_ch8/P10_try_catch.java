package hw0325_Thu_ch8;

public class P10_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		String temp = null;
		
		try {
			//System.out.println(numbers[3]); //ArrayIndexOutOfBoundsException
			System.out.println(temp.length()); //NullPointerException
		} catch (Exception e) {
			System.out.println("exception");
			//e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("1");
//		} catch (Exception e) {
//			System.out.println("2");
		}	finally {
			System.out.println("fanally");
		}
	}

}
