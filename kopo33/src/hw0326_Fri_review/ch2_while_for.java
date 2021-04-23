package hw0326_Fir_review;

public class ch2_while_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;						//for while은 대체 가능.
		}
		if (i > 0 && i < 1000) {
			System.out.println("small");
		} else {
			System.out.println("big or small");
		}
		switch (i)	{
		case (1) :
			System.out.println("small");
		case								//if switch는 대체 불가.
		}
	}

}
