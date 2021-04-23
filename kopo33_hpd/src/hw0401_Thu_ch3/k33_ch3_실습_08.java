package hw0401_Thu_ch3;

public class k33_ch3_실습_08 { //클래스 선언
	//
	//#8. 소비자가 세금 계산2
	//
	public static void main(String[] args) { //메인으로부터 프로그램 시작
		String[] k33_item = {"맛동산", "웨하스", "롯데샌드", "오땅", "사브레"};	//item 배열 정의
		int[] k33_price = {1000, 2000, 3000 ,2400, 1450};	//price 배열 정의
		int[] k33_amount = {10, 2, 1, 3, 5};	//amount 배열 정의
		double k33_tax_rate = 0.1;			//세율
		int k33_total_sum = 0;				//total_sum이라는 슛자형 변수 0으로 초기화
		
		System.out.printf("**************************************************\n");  //*출력
		System.out.printf("                구매한 과자들                     \n");		//"구매한 과자들" 출력
		System.out.printf("항  목      단  가       수 량          합 계   \n");				//항목 출력
		
		for (int k33_i = 0; k33_i < k33_item.length; k33_i++) {		//for loop문으로 item, price, amount, sum출력 
			int k33_sum = k33_price[k33_i] * k33_amount[k33_i];		//같은 배열 순서에 있는 price와 amount 곱해서 sum(합계가격) 정의
			k33_total_sum = k33_total_sum + k33_sum;				//반복문 돌아갈 때마다 합계가격 total_sum에 더해주기
			System.out.printf("%.5s	%7d		%2d	%9d\n", k33_item[k33_i], k33_price[k33_i], k33_amount[k33_i], k33_sum);
		}													//tab으로 줄 맞춰서 출력
		
		System.out.printf("**************************************************\n"); //*출력
		System.out.printf(" 	지불 금액 :    %20d\n", k33_total_sum);		//총 지불 금액 출력
	
		int k33_total_net_price = (int)(k33_total_sum/(1+k33_tax_rate));	//총 지불 금액에서 세전 금액 구하기
		System.out.printf(" 	과세 금액 :    %20d\n", k33_total_net_price);	//총 지불 금액의 세전 금액 출력
		int k33_tax = k33_total_sum - k33_total_net_price;					//총 지불 금액에서 세전 금액 빼서 세금 구하기
		System.out.printf(" 	세    금 :    %20d\n", k33_tax);				//세금 출력	
	}
}
