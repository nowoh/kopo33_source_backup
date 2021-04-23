package hw0413_Tue_ch4;

public class k33_ch4_실습_02_switch {
	/*
	 * switch
	 */
	public static void main(String[] args) {
		String k33_jumin = "123456-1234567";	//문자형 변수 jumin를 123456-1234567로 정의
		
		switch (k33_jumin.charAt(7)) {	//jumin에서 7번째(0부터 시작) 문자어 가져오기 = '-' 다음 1. 
			case '1' :					//가져온 문자어가 1이면
				System.out.printf("21세기 전 태어난 남자 사람\n");	//21세기 전 태어난 남자 사람 출력하고 행 바꾸기	
			case '2' :					//가져온 문자어가 2이면
				System.out.printf("21세기 전 태어난 여자 사람\n");	//21세기 전 태어난 여자 사람 출력하고 행 바꾸기	
				break;					//조건 만족 시키면 break (멈춤)
			case '3' :					//가져온 문자어가 3이면
				System.out.printf("21세기 후 태어난 남자 사람\n");	//21세기 후 태어난 남자 사람 출력하고 행 바꾸기	
				break;					//조건 만족 시키면 break (멈춤)
			case '4' :					//가져온 문자어가 4이면
				System.out.printf("21세기 후 태어난 여자 사람\n");	//21세기 후 태어난 여자 사람 출력하고 행 바꾸기	
				break;					//조건 만족 시키면 break (멈춤)
			default :					//위 조건에 맞는 것이 하나도 없다면
				System.out.printf("사람\n");	//사람 출력하고 행 바꾸기
				break;					//조건 만족 시키면 break (멈춤)
		}
	}
}
