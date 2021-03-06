package hw0427_Tue_ch7;

public class k33_ch7_03_구분자_필드추출 {		

	public static void main(String[] args) {	//메인함수
		String[] k33_oneRec = {					//문자열 배열 oneRec 정의
				"순번,상호명,소재지(도로명),연락처",
				"1,샤랄랄라,부산광역시 북구 금곡대로 469 농협하나로클럽 2층 (금곡동),070-7450-8460",
				"2,꼬마다락방,부산광역시 북구 구포시장길 48 3층 (구포동),051-338-5559",
				"3,아이점프 부산북구점,부산광역시 북구 낙동북로 736 유림노르웨이숲상가 401호 (구포동),070-8805-1188",
				"4,파리봉봉(화명점),부산광역시 북구 금곡대로303번길 2 시티타워 1201호 (화명동),051-363-0060",
				"5,더놀다 부산화명점,부산광역시 북구 화명대로 32 다운타운프라자 5층 502호 (화명동),051-363-3631",
				"6,아이점프 만덕점,부산광역시 북구 만덕3로16번길 11 4층(만덕동벽산라인훼미리타운),070-8252-3921",
				"7,키즈파크,부산광역시 북구 만덕대로 23 폴라렉스 5층 (덕천동), ",
				"8,디지털팡팡 화명점,부산광역시 북구 금곡대로 230 금용복합스포츠타운 6층 (화명동),051-365-7272",
				"9,주니어킹덤,부산광역시 북구 화명대로 17 목양프라자 4층,051-363-228"};
		String[] k33_field_name = k33_oneRec[0].split(",");					//field_name 배열을 oneRec[0]을 콤마 기준으로 나눈 것으로 정의
		for (int k33_i = 1; k33_i < k33_oneRec.length - 1; k33_i++) {		//반복문 : 정수형 변수 i는 1이고, oneRec길이 -1전까지 1씩 증가하며 반복
			String[] k33_field = k33_oneRec[k33_i].split(",");				//field_name 배열을 oneRec[i]을 콤마 기준으로 나눈 것으로 정의
			System.out.println("**************************************************************************************");	//문자열 출력
			for (int k33_j = 0; k33_j < k33_field_name.length; k33_j++) {						//반복문 : 정수형 변수 j는 0이고, j는 field_name길이 전까지 1씩 증가하며 반복
				System.out.printf(" %s : %s\n", k33_field_name[k33_j], k33_field[k33_j]);		//field_name[j]과 field[j]를 출력
			}
			System.out.println("**************************************************************************************");	//문자열 출력
		}
	}
}
