package hw0410_Sat_ch2;

public class k33_ch2_실습_04 {
	/*
	 * SpecialCharEx
	 */
	public static void main(String[] args) {	//메인함수
		System.out.println('\'');	//\이용하여 작은따옴표 출력
		System.out.println("abc\t123\b456");	//\t으로 tab하고 \b으로 백스페이스하여 출력
												//그러나 \b가 지워지지 않고 출력됨
		System.out.println('\n');				//println과 \n으로 두 줄이 띄어짐
		System.out.println("\"Hello\"");		//\"으로 큰따옴표와 함께 Hello 출력
		System.out.println("c:\\");				//\\로 \와 c: 함께 출력
	}
}
