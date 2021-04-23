package hw0421_Wed_ch6;

public class k33_ch6_5_1_TvRemocon {
	/*
	 * 클래스, 객체, 인스턴스
	 */
	int k33_limit_up_Channel = 10;		//정수형 변수 limit_up_Channel 10으로 정의
	int k33_limit_down_Channel = 0;		//정수형 변수 limit_down_Channel 0으로 정의
	int k33_limit_up_Vol = 5;			//정수형 변수 limit_up_Vol 5로 정의
	int k33_limit_down_Vol = 0;			//정수형 변수 limit_down_Vol 0으로 정의
	int k33_Channel = 1;				//정수형 변수 Channel 1로 정의
	int k33_Vol = 1;					//정수형 변수 limit_up_Channel 10으로 정의
	String k33_help;					//문자열 help 정의
	
	void k33_Volup() {													//리턴값이 없는 메소드 Volup 정의
		if (k33_Vol == k33_limit_up_Vol) {								//조건문 : Vol이 limit_up_Vol이면
			k33_help = "최대음량입니다.";								//help를 "최대음량입니다."로 정의
		} else {														//그렇지 않으면 (Vol이 limit_up_Vol이 아니면)
			k33_Vol++;													//Vol 1 더하기
			k33_help = String.format("현재 음량은 %d입니다.", k33_Vol);	//help를 "현재음량은 (Vol)입니다."로 정의
		}
	} 
	
	void k33_Voldown() {												//리턴값이 없는 메소드 Voldown 정의
		if (k33_Vol == k33_limit_down_Vol) {							//조건문 : Vol이 limit_down_Vol이면
			k33_help = "최저음량입니다.";								//help를 "최저음량입니다."로 정의
		} else {												  		//그렇지 않으면 (Vol이 limit_down_Vol이 아니면)
			k33_Vol--;													//Vol 1 빼기
			k33_help = String.format("현재 음량은 %d입니다.", k33_Vol);	//help를 "현재음량은 (Vol)입니다."로 정의
		}
	}
	
	void k33_Channelup() {												//리턴값이 없는 메소드 Channelup 정의
		if (k33_Channel == k33_limit_up_Channel) {						//조건문 : Channel이 limit_up_Channel이면
			k33_help = "마지막 채널입니다.";							//help를 "마지막 채널입니다."로 정의
		} else {														//그렇지 않으면 (Channel이 limit_up_Channel이 아니면)
			k33_Channel++;												//Channel 1 더하기
			k33_help = String.format("%d번입니다.", k33_Channel);		//help를 "(Channel)번입니다."로 정의
		}
	} 
	
	void k33_Channeldown() {											//리턴값이 없는 메소드 Channeldown 정의
		if (k33_Channel == k33_limit_down_Channel) {					//조건문 : Channel이 limit_down_Channel이면
			k33_help = "처음 채널입니다.";								//help를 "처음 채널입니다."로 정의
		} else {														//그렇지 않으면 (Channel이 limit_down_Channel이 아니면)
			k33_Channel--;												//Channel 1 빼기
			k33_help = String.format("%d번입니다.", k33_Channel);		//help를 "(Channel)번입니다."로 정의
		}
	}
}
