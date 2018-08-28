package com.price_calculation;

import java.time.LocalDate;

import com.price_calculation.DateDiffCalculator;

public class ThirtyBy360 implements DateDiffCalculator{

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate) {
		
		long days = settlementDate.getDayOfMonth() - paymentDate.getDayOfMonth();
		long months = settlementDate.getMonthValue() - settlementDate.getMonthValue();
		long years = settlementDate.getYear() - settlementDate.getYear();
		
		return(years*360 + months*30 + days);
		
	}

	@Override
	public float calculateBasis(LocalDate tradedate) {
		return(360);
	}

}
