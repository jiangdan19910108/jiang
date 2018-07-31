package com.student.bean;

public class Teacher {

	private Integer id;//教師id　１
	private String name;//教師姓名 2
	private int age;//教師年齢 3
	private String  sex;//教師性別4


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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	public void setSex(int int1) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
