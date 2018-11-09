package com.mittalvk.learning.labs.java8.secton3;

public class MyDate {
	
	int day,month,year;

	public MyDate() {
		// TODO Auto-generated constructor stub
	}

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	public void setDate(int m,int d,int y) {
		this.day=d;
		this.month=m;
		this.year=y;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
