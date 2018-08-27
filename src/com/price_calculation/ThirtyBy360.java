package com.price_calculation;

import java.time.LocalDate;

public class ThirtyBy360 implements DateDiffCalculator{

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate) {
		long days = settlementDate.getDayOfMonth() - paymentDate.getDayOfMonth();
		long months = settlementDate.getMonthValue() - settlementDate.getMonthValue();
		long years = settlementDate.getYear() - settlementDate.getYear();
		
		return(years*360 + months*30 + days);
		
	}

	@Override
	public float calculateBasis(int frequency, LocalDate tradedate) {
		return(360/frequency);
	}

}
