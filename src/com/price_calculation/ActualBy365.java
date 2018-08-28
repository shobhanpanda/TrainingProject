package com.price_calculation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.price_calculation.DateDiffCalculator;

public class ActualBy365 implements DateDiffCalculator{

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate) {
		return(ChronoUnit.DAYS.between(paymentDate, settlementDate));
		
	}

	@Override
	public float calculateBasis(LocalDate settlementDate) {
		return(365);
	}

}
