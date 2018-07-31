package com.student.bean;

public class Student {

	private Integer id;//学生id　１
	private String name;//学生姓名 2
	private String birthday;//学生生年月日 3
	private int age;//学生年齢 4
	private int score;//学生成績 5
	private int classid;//学生クラス6
	private String  mynumber;//個人番号7
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	public String getMynumber() {
		return mynumber;
	}
	public void setMynumber(String mynumber) {
		this.mynumber = mynumber;
	}

}
