package com.student.bean;

public class Student {

	private Integer id;//学生id　１
	private String name;//学生姓名 2
	private String birthday;//学生生年月日
	private double score;//学生成績 7
	private Integer myNumber;//学生成績 7
	private Integer age;//学生年齢 6
	private Integer classid;//住所
	private String aaa;//住所
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Integer getMyNumber() {
		return myNumber;
	}
	public void setMyNumber(Integer myNumber) {
		this.myNumber = myNumber;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	public String getAaa() {
		return aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birthday=" + birthday + ", score=" + score + ", myNumber="
				+ myNumber + ", age=" + age + ", classid=" + classid + ", aaa=" + aaa + "]";
	}


}
