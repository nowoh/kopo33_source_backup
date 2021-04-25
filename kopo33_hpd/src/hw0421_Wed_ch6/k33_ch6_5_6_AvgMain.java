package hw0421_Wed_ch6;

public class k33_ch6_5_6_AvgMain {
	/*
	 * 메소드 오버로딩
	 */
	public static void main(String[] args) {
		k33_ch6_5_5_ScoreAvg k33_sa = new k33_ch6_5_5_ScoreAvg();
		
		System.out.printf("%s\n", "3월 성적표");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%5s\n", "이름", "국어", "영어", "수학", "총점", "평균");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%7.1f\n\n", "폴리융", 100, 100, 100, k33_sa.k33_sum(100, 100, 100), k33_sa.k33_avg(100, 100, 100));
		
		System.out.printf("%s\n", "4월 성적표");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%3s%5s\n", "이름", "국어", "영어", "수학", "과학",  "총점", "평균");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%5d%7.1f\n\n", "폴리융", 100, 100, 100, 100, k33_sa.k33_sum(100, 100, 100, 100), k33_sa.k33_avg(100, 100, 100, 100));
		
		System.out.printf("%s\n", "5월 성적표");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%3s%3s%3s%3s%3s%3s%5s\n", "이름", "국어", "영어", "수학", "과학", "사회", "총점", "평균");
		System.out.printf("============================================\n");
		System.out.printf("%-4s%4d%5d%5d%5d%5d%5d%7.1f\n\n", "폴리융", 100, 100, 100, 100, 100, k33_sa.k33_sum(100, 100, 100, 100, 100), k33_sa.k33_avg(100, 100, 100, 100, 100));
		
	}

}
