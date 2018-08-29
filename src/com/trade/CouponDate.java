package com.trade;

public class CouponDate {
	public int day, month;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public CouponDate(int day, int month) {
		super();
		this.day = day;
		this.month = month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
