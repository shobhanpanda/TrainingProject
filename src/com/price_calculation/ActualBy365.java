package com.price_calculation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ActualBy365 implements DateDiffCalculator{

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate) {
		return(ChronoUnit.DAYS.between(paymentDate, settlementDate));
		
	}

	@Override
	public float calculateBasis(int frequency, LocalDate tradedate) {
		return(365);
	}

}
