package hw0413_Tue_ch4;

public class k33_ch4_실습_01_if문 {
	/*
	 * if문
	 */
	public static void main(String[] args) {	//메인함수
		int k33_score = 70;			//정수형 변수 score를 70으로 정의
		
		if(k33_score > 60) {		//조건문 : score가 60 초과시
			System.out.println("합격입니다.");	//합격입니다. 출력
		}
		
		if(k33_score > 60)			//조건문 : score가 60 초과시
			System.out.println("합격입니다.");	//합격입니다. 출력
											//단일 조건문일 때 {} 생략 가능
		if(k33_score > 60) {		//조건문 : score가 60 초과시
			System.out.println("합격입니다.");	//합격입니다. 출력
		} else {					//그렇지 않으면 (score가 60초과하지 않으면)
			System.out.println("불합격입니다.");	//불합격입니다. 출력
		}
		
		int k33_num = 5;	//정수형 변수 num을 5로 정의
		
		if (k33_num > 0) {	//조건문 : num이 0 초과시
			System.out.println("양수입니다.");	//양수입니다. 출력
		} else if (k33_num < 0) {	//조건문 : num이 0 미만일 시
			System.out.println("음수입니다."); //음수입니다. 출력	
		} else {			//그렇지 않으면 (num이 0 초과가 아니거나 0 미만이 아니면)
			System.out.println("영입니다.");	//영입니다. 출력
		}
		
		if(k33_score >= 90) {	//조건문 : score가 90 이상일 시
			System.out.println("A등급");	//A등급 출력
		} else if (k33_score >= 80 && k33_score < 90) {	//조건문 : score가 80 이상이고 80 미만일 시
			System.out.println("B등급");	//B등급 출력
		} else if (k33_score >=70 && k33_score < 80) {	//조건문 : score가 70 이상이고 80 미만일 시
			System.out.println("C등급");	//C등급 출력
		} else {		//그렇지 않으면 (score가 70미만일 시)
			System.out.println("F등급");	//F등급 출력
		}	
	}

}
