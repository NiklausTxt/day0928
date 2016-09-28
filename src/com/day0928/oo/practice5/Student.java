package com.day0928.oo.practice5;

public class Student implements Comparable<Student> {
	private String name;
	private int score1;
	private int score2;
	private int score3;
	private int totalScore;

	public Student(String name, int score1, int score2, int score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		totalScore = score1 + score2 + score3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public int getScore3() {
		return score3;
	}

	public void setScore3(int score3) {
		this.score3 = score3;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3
				+ ", totalScore=" + totalScore + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.totalScore != o.totalScore) {
			return o.totalScore - this.totalScore;
		}else{
			return this.name.compareTo(o.name);
		}
	}

}
