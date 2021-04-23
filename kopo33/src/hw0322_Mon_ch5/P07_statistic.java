package hw0322_Mon_ch5;

public class P07_statistic {
	String name;
	double korean_score, english_score, math_score;
	
	public P07_statistic(String name, double korean_score, double english_score, double math_score) {
		this.name = name;
		this.korean_score = korean_score;
		this.english_score = english_score;
		this.math_score = math_score;
	}
	public String printStat() {
		String ret = "";
		ret = name + ", " + korean_score + ", " + english_score + ", " + math_score;
		return ret;
	}
}
