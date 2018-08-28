package com.price_calculation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import com.price_calculation.DateDiffCalculator;

public class ActualByActual implements DateDiffCalculator {

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate, boolean maturityDate){
		return(ChronoUnit.DAYS.between(paymentDate, settlementDate));
	}

	@Override
	public float calculateBasis(LocalDate settlementDate) {
		return(settlementDate.lengthOfYear());
	}
	
}