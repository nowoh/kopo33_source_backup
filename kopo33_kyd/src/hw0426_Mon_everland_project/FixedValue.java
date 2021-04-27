package hw0426_Mon_everland_project;

public class FixedValue {
	//나이별 가격
	final static int BABY_PRICE = 0, 
			ADULT_DAY_PRICE = 56000, ADULT_NIGHT_PRICE = 56000,
			TEEN_DAY_PRICE = 47000, TEEN_NIGHT_PRICE = 40000,
			CHILD_DAY_PRICE = 44000, CHILD_NIGHT_PRICE = 37000,
			OLD_DAY_PRICE = 44000, OLD_NIGHT_PRICE = 37000;
	
	//우대별 할인율
	final static double DISABLE_RATE = 0.6, MERIT_RATE = 0.5,
			MULTICHILD_RATE = 0.8, PREGNANT_RATE = 0.85;
	
	//나이에 따른 범위
	final static int MIN_BABY = 1, MIN_CHILD = 3, MIN_TEEN = 13, MIN_ADULT = 19,
			MAX_CHILD = 12, MAX_TEEN = 18, MAX_ADULT = 64;
	
	//최대, 최소 가능 주문량
	final static int MAX_COUNT = 10, MIN_COUNT = 1;
	
	//주민등록번호 분석
	final static long FULL_DIGIT = 10000000000000L, FULL_DIGIT_MIN = 10000000000L,
			SEVEN_DIGIT = 1000000L;

	final static int TWO_DIGIT = 100, ONE_DIGIT = 10,
			OLD_GENERATION = 1900, NEW_GENERATION = 2000, 
			MALE_OLD = 1, FEMALE_OLD = 2, MALE_NEW = 3, FEMALE_NEW = 4,
			BEFORE_BIRTH = 2, AFTER_BIRTH = 1;
	
	//나이에 따른 범위
	final static int BABY = 1, CHILD = 2, TEEN = 3, ADULT = 4, OLD = 5;
	
	//파일 저장 경로
	final static String SAVE_ROUTE = "C:\\Users\\howon\\eclipse-workspace\\kopo33_kyd\\src\\everland_project.csv";
	
	final static String ERROR_MSG = "다시 입력해주시기 바랍니다.";
}
