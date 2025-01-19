package com.entity;

public class Student {
	
	private int stud_id;
	private String stud_name;
	private int stud_age;
	private String stud_city;
	
	private Country con;
	
    public Student(){
		
    }

	
    public Student(int stud_id, String stud_name, int stud_age, String stud_city, Country con) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_age = stud_age;
		this.stud_city = stud_city;
		this.con=con;
	}
	
		
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getStud_age() {
		return stud_age;
	}
	public void setStud_age(int stud_age) {
		this.stud_age = stud_age;
	}
	public String getStud_city() {
		return stud_city;
	}
	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}


	public Country getCon() {
		return con;
	}
	
	public void setCon(Country con) {
		this.con = con;
	}


	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_age=" + stud_age + ", stud_city="
				+ stud_city + ", con=" + con + "]";
	}
	
	
}