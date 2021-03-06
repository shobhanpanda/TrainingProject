package com.price_calculation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.price_calculation.DateDiffCalculator;

public class ActualBy360 implements DateDiffCalculator {

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate, boolean maturityDate){
		
		return(ChronoUnit.DAYS.between(paymentDate, settlementDate));
	}

	@Override
	public float calculateBasis(LocalDate settlementDate) {
		return(360);
	}
}
