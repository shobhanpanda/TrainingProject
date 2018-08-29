package com.trade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CouponDate> cd = new ArrayList<CouponDate>();
		cd.add(new CouponDate(28, 2));
		cd.add(new CouponDate(28, 5));
		cd.add(new CouponDate(28, 8));
		cd.add(new CouponDate(28, 11));
		int tPlus = 2, option = 0, year = 2018;
		
		java.util.Iterator<CouponDate> it =  cd.iterator();
		LocalDate localDate = LocalDate.now();
		LocalDate settlementDate = LocalDate.of(2018, 5,26);
		settlementDate.plusDays(tPlus);
		
		List<LocalDate> paymentDates = new ArrayList<LocalDate>();
		if(option == 0) {
			for (java.util.Iterator iterator = cd.iterator(); iterator.hasNext();) {
				CouponDate localDate2 = (CouponDate) iterator.next();				
				LocalDate tempDate = LocalDate.of(year, localDate2.month, localDate2.day);
				if(settlementDate.isBefore(tempDate)) {
					paymentDates.add(tempDate);
				}
			}
		}
		
		for (java.util.Iterator iterator = paymentDates.iterator(); iterator.hasNext();) {
			LocalDate localDate2 = (LocalDate) iterator.next();
			System.out.println(localDate2);
			
		}
	}
}
