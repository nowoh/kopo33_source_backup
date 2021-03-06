package hw0421_Wed_ch6;

public class k33_ch6_6_4_RemoteMain2 {
	/*
	 * Constructor(생성자), 소멸자, 이벤트
	 */
	static k33_ch6_6_3_TvRemocon2 k33_rmt1;			//k33_ch6_6_3_TvRemocon2 클래스 rmt1로 선언
	static k33_ch6_6_3_TvRemocon2 k33_rmt2;			//k33_ch6_6_3_TvRemocon2 클래스 rmt2로 선언
	static k33_ch6_6_3_TvRemocon2 k33_rmt3;			//k33_ch6_6_3_TvRemocon2 클래스 rmt3로 선언
	
	public static void main(String[] args) {								//메인함수
		k33_rmt1 = new k33_ch6_6_3_TvRemocon2();							//rmt1을 k33_ch6_6_3_TvRemocon2() 생성자로 객체 생성한 것으로 정의
		k33_rmt2 = new k33_ch6_6_3_TvRemocon2(15, 0, 15, 0, 5, 10);			//rmt1을 k33_ch6_6_3_TvRemocon2(15, 0, 15, 0, 5, 10) 생성자로 객체 생성한 것으로 정의
		k33_rmt3 = new k33_ch6_6_3_TvRemocon2(5, 1, 10, 1, 2, 3);			//rmt1을 k33_ch6_6_3_TvRemocon2(5, 1, 10, 1, 2, 3) 생성자로 객체 생성한 것으로 정의

		for (int k33_i = 0; k33_i < 10; k33_i++) {											//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_rmt1.k33_Channelup(); k33_rmt1.k33_Channelmsg("1번TV 채널 1개씩 올리기");	//k33_ch6_6_3_TvRemocon2 클래스의 Channelup() 메소드 실행 후
		}																					//k33_ch6_6_3_TvRemocon2 클래스의 Channelmsg 메소드에 "1번TV 채널 1개씩 올리기"인자 받아서 실행
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {											//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_rmt1.k33_Volup(); k33_rmt1.k33_Volmsg("1번TV 음량 1씩 올리기");				//k33_ch6_6_3_TvRemocon2 클래스의 Volup() 메소드 실행 후
		}																					//k33_ch6_6_3_TvRemocon2 클래스의 Volmsg 메소드에 "1번TV 음량 1씩 올리기"인자 받아서 실행
			
		for (int k33_i = 0; k33_i < 10; k33_i++) {											//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_rmt1.k33_Channelup(2); k33_rmt1.k33_Channelmsg("1번TV 채널 2개씩 올리기");	//k33_ch6_6_3_TvRemocon2 클래스의 Channelup(2) 메소드 실행 후
		}																					//k33_ch6_6_3_TvRemocon2 클래스의 Channelmsg 메소드에 "1번TV 채널 2개씩 올리기"인자 받아서 실행
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {											//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_rmt1.k33_Volup(2); k33_rmt1.k33_Volmsg("1번TV 음량 2씩 올리기");			//k33_ch6_6_3_TvRemocon2 클래스의 Volup(2) 메소드 실행 후
		}																					//k33_ch6_6_3_TvRemocon2 클래스의 Volmsg 메소드에 "1번TV 음량 2씩 올리기"인자 받아서 실행
		
		for (int k33_i = 0; k33_i < 10; k33_i++) {												//반복문 : 정수형 변수 i는 0이고, i는 10전까지 1씩 증가하며 반복
			k33_rmt1.k33_Channeldown(3); k33_rmt1.k33_Channelmsg("1번TV 채널 3개씩 내리기");	//k33_ch6_6_3_TvRemocon2 클래스의 Channeldown(3) 메소드 실행 후
		}																						//k33_ch6_6_3_TvRemocon2 클래스의 Channelmsg 메소드에 "1번TV 채널 3개씩 내리기"인자 받아서 실행
		
		for (int k33_i = 0; k33_i < 5; k33_i++) {												//반복문 : 정수형 변수 i는 0이고, i는 5전까지 1씩 증가하며 반복
			k33_rmt1.k33_Voldown(3); k33_rmt1.k33_Volmsg("1번TV 음량 3씩 내리기");				//k33_ch6_6_3_TvRemocon2 클래스의 Voldown(3) 메소드 실행 후
		}																						//k33_ch6_6_3_TvRemocon2 클래스의 Volmsg 메소드에 "1번TV 음량 3씩 내리기"인자 받아서 실행
	}

}
