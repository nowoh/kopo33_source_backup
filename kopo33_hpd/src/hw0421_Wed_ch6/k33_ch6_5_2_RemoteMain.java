package hw0421_Wed_ch6;

public class k33_ch6_5_2_RemoteMain { //별2 주석 필요
	/*
	 * 클래스, 객체, 인스턴스
	 */
	public static void main(String[] args) {					//메인 함수
		k33_ch6_5_1_TvRemocon k33_remot;						//k33_ch6_5_1_TvRemocon클래스 remot로 선언
		
		k33_remot = new k33_ch6_5_1_TvRemocon();				//remot를 k33_ch6_5_1_TvRemocon() 객체 생성한 것으로 정의
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_remot.k33_Channelup();								//k33_ch6_5_1_TvRemocon 클래스의 Channelup 메소드 실행
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon 클래스의 help 값 출력
		}
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_remot.k33_Channeldown();							//k33_ch6_5_1_TvRemocon 클래스의 Channeldown 메소드 실행
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon 클래스의 help 값 출력
		}
		System.out.println();								//행 바꾸기
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_remot.k33_Volup();									//k33_ch6_5_1_TvRemocon 클래스의 Volup 메소드 실행
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon 클래스의 help 값 출력
		}
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {						//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_remot.k33_Voldown();								//k33_ch6_5_1_TvRemocon 클래스의 Voldown 메소드 실행
			System.out.printf("MSG [%s]\n", k33_remot.k33_help);	//k33_ch6_5_1_TvRemocon 클래스의 help 값 출력
		}
	}
}
