package hw0421_Wed_ch6;

public class k33_ch6_6_3_TvRemocon2 { 	//별2
	/*
	 * Constructor(생성자), 소멸자, 이벤트
	 */
	int limit_up_Channel;				//정수형 변수 limit_up_Channel 정의
	int limit_down_Channel;				//정수형 변수 limit_down_Channel 정의
	int limit_up_Vol;					//정수형 변수 limit_up_Vol 정의
	int limit_down_Vol;					//정수형 변수 limit_down_Vol 정의
	int Channel;						//정수형 변수 Channel 정의
	int Vol;							//정수형 변수 limit_up_Channel 정의
	String help;						//문자열 help 정의
	
	k33_ch6_6_3_TvRemocon2() {			//생성자 정의
		limit_up_Channel = 10;			//limit_up_Channel을 10으로 정의
		limit_down_Channel = 0;			//limit_down_Channel을 0으로 정의
		limit_up_Vol = 5;				//limit_up_Vol을 5로 정의
		limit_down_Vol = 0;				//limit_down_Vol을 0으로 정의
		Channel = 1;					//Channel을 1로 정의
		Vol = 1;						//Vol을 1로 정의
		help = "TV 기본 설정 완료";		//help를 "TV 기본 설정 완료"로 정의
	}
	
	k33_ch6_6_3_TvRemocon2(int up_Channel, int down_Channel, 
			int up_Vol,	int down_Vol, int in_Channel, int in_Vol) {		//인자를 받는 생성자 정의
		limit_up_Channel = up_Channel;			//limit_up_Channel을 up_Channel로 정의
		limit_down_Channel = down_Channel;		//limit_down_Channel을 down_Channel로 정의
		limit_up_Vol = up_Vol;					//limit_up_Vol을 up_Vol으로 정의
		limit_down_Vol = down_Vol;				//limit_down_Vol을 down_Vol으로 정의
		Channel = in_Channel;					//Channel을 in_Channel로 정의
		Vol = in_Vol;							//Vol을 in_Vol로 정의
		help = "TV 맞춤 설정 완료";				//help를 "TV 맞춤 설정 완료"로 정의
	}		
	
	void Volup() {													//리턴값이 없는 메소드 Volup 정의
		if (Vol == limit_up_Vol) {									//조건문 : Vol이 limit_up_Vol이면
			help = "최대음량입니다.";								//help를 "최대음량입니다."로 정의
		} else {													//그렇지 않으면 (Vol이 limit_up_Vol이 아니면)
			Vol++;													//Vol 1 더하기
			help = String.format("현재 음량은 %d입니다.", Vol);		//help를 "현재음량은 (Vol)입니다."로 정의
		}
	} 
	
	void Voldown() {												//리턴값이 없는 메소드 Voldown 정의
		if (Vol == limit_down_Vol) {								//조건문 : Vol이 limit_down_Vol이면
			help = "최저음량입니다.";								//help를 "최저음량입니다."로 정의
		} else {													//그렇지 않으면 (Vol이 limit_down_Vol이 아니면)
			Vol--;													//Vol 1 빼기
			help = String.format("현재 음량은 %d입니다.", Vol);		//help를 "현재음량은 (Vol)입니다."로 정의
		}
	}
	
	void Channelup() {												//리턴값이 없는 메소드 Channelup 정의
		if (Channel == limit_up_Channel) {							//조건문 : Channel이 limit_up_Channel이면
			help = "마지막 채널입니다.";							//help를 "마지막 채널입니다."로 정의
		} else {													//그렇지 않으면 (Channel이 limit_up_Channel이 아니면)
			Channel++;												//Channel 1 더하기
			help = String.format("%d번입니다.", Channel);			//help를 "(Channel)번입니다."로 정의
		}
	} 
	
	void Channeldown() {											//리턴값이 없는 메소드 Channeldown 정의
		if (Channel == limit_down_Channel) {						//조건문 : Channel이 limit_down_Channel이면
			help = "처음 채널입니다.";								//help를 "처음 채널입니다."로 정의
		} else {													//그렇지 않으면 (Channel이 limit_down_Channel이 아니면)
			Channel--;												//Channel 1 빼기
			help = String.format("%d번입니다.", Channel);			//help를 "(Channel)번입니다."로 정의
		}
	}
	
	void Volup(int u) {												//리턴값이 없고 인자를 정수형 변수 u로 받는 Volup 메소드 정의
		for (int i = 0; i < u; i++) this.Volup();					//반복문 : 정수형 변수 i는 0이고, i는 u전까지 1씩 증가하며 Volup메소드 반복
	}
	
	void Voldown(int u) {											//리턴값이 없고 인자를 정수형 변수 u로 받는 Voldown 메소드 정의
		for (int i = 0; i < u; i++) this.Voldown();					//반복문 : 정수형 변수 i는 0이고, i는 u전까지 1씩 증가하며 Voldown메소드 반복
	}
	
	void Channelup(int u) {											//리턴값이 없고 인자를 정수형 변수 u로 받는 Channelup 메소드 정의
		for (int i = 0; i < u; i++) this.Channelup();				//반복문 : 정수형 변수 i는 0이고, i는 u전까지 1씩 증가하며 Channelup메소드 반복
	}
	
	void Channeldown(int u) {										//리턴값이 없고 인자를 정수형 변수 u로 받는 Channeldown 메소드 정의
		for (int i = 0; i < u; i++) this.Channeldown();				//반복문 : 정수형 변수 i는 0이고, i는 u전까지 1씩 증가하며 Channeldown메소드 반복
	}
	

	void Volmsg(String id) {										//리턴값이 없고 인자를 문자열 변수 id로 받는 Volmsg 메소드 정의
		System.out.printf("%s=>[%s] 최대음량[%d] 최소음량[%d] 현재음량[%d]\n",
				id, help, limit_up_Vol, limit_down_Vol, Vol);		//id, help, limit_up_Vol, limit_down_Vol, Vol 값 문자열에 맞춰서 출력
	}
	
	void Channelmsg(String id) {									//리턴값이 없고 인자를 문자열 변수 id로 받는 Channelmsg 메소드 정의
		System.out.printf("%s=>[%s] 마지막채널[%d] 처음채널[%d] 현재채널[%d]\n",
				id, help, limit_up_Channel, limit_down_Channel, Channel);	//id, help, limit_up_Channel, limit_down_Channel, Channel 값 문자열에 맞춰서 출력
	}
	
}
