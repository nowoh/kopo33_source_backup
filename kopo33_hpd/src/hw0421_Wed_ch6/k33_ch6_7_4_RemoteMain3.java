package hw0421_Wed_ch6;

public class k33_ch6_7_4_RemoteMain3 {
	/*
	 * inheritance
	 */
	public static void main(String[] args) {
		k33_ch6_7_3_TvRemoconX k33_rmt3;								//k33_ch6_6_3_TvRemocon2를 상속받은 
																		//k33_ch6_7_3_TvRemoconX 클래스 rmt3로 선언
		k33_rmt3 = new k33_ch6_7_3_TvRemoconX();						//rmt3를 k33_ch6_7_3_TvRemoconX() 객체 생성한 것으로 정의
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_rmt3.k33_Channelup();									//k33_ch6_7_3_TvRemoconX 클래스의 Channelup 메소드 실행
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX 클래스의 help 출력
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_rmt3.k33_Channeldown();									//k33_ch6_7_3_TvRemoconX 클래스의 Channeldown 메소드 실행
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX 클래스의 help 출력
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_rmt3.k33_Volup();										//k33_ch6_7_3_TvRemoconX 클래스의 Volup 메소드 실행
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX 클래스의 help 출력
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_rmt3.k33_Voldown();										//k33_ch6_7_3_TvRemoconX 클래스의 Voldown 메소드 실행
			System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);		//k33_ch6_7_3_TvRemoconX 클래스의 help 출력
		}
		
		k33_rmt3.k33_Repair();											//k33_ch6_7_3_TvRemoconX 클래스의 Repair 메소드 실행
		System.out.printf("MSG rmt3[%s]\n", k33_rmt3.k33_help);			//k33_ch6_7_3_TvRemoconX 클래스의 help 출력ㄴ
	}
}
