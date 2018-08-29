package com.trade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class AllCouponDates {
	List<CouponDate> cd;
	
	public List<CouponDate> calculate(LocalDate issueDate, int frequency) {
		if(frequency == 0)
			return null;
		int periodInMonths = (int)12/frequency;
		
		List<Integer> monthList = new ArrayList<Integer>();
		int sum = 0;boolean flag = true;
		int month = issueDate.getMonthValue();
		monthList.add(month);
		
		for(int i=1;i<frequency;i++) {
			sum+=12/frequency;
			int value = month+sum;
			
			if(value>12) {
				value%=12;
				flag = false;
			}

			monthList.add(value);
		}
		
		monthList.sort(null);
		
		cd = new ArrayList<CouponDate>();
		Iterator it = monthList.iterator();
		int index = 0;
		while(it.hasNext()) {
			int tempMonth = (int) it.next();
			int tempDay = getDay(issueDate.getDayOfMonth(), tempMonth);
			CouponDate tempCD = new CouponDate(tempDay, tempMonth);
			cd.add(tempCD);
		}
		it = cd.iterator();
		while(it.hasNext()) {
			CouponDate tempCD = (CouponDate) it.next();
			System.out.println(tempCD.day + " " + tempCD.month);
		}
		return cd;
	}
	
	public int getDay(int day, int month) {
		if(month == 2) {
			if(day == 29 || day == 30 || day == 31)
				return 28;
			else
				return day;
		} else {
			if(month == 4 || month == 6 || month == 9 || month == 11) 
				if(day == 31)
					return 30;
				else
					return day;
			else
				return day;
		}
	}
}