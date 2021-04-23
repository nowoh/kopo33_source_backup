package hw0322_Mon_ch5;

public class Inter implements InterPrice {

	public static void main(String[] args) {
		Inter m = new Inter();
		m.getPriceA(10100);
		m.getPriceB(100);
	}
	@Override
	public void getPriceA(int price) {
		// TODO Auto-generated method stub
		System.out.println(price);
	}
	
	@Override
	public void getPriceB(int price) {
		System.out.println(price + 1000);
	}
	
}
