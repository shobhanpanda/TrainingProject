package com.price_calculation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import com.price_calculation.DateDiffCalculator;

public class ActualByActual implements DateDiffCalculator {

	@Override
	public long calculateDateDiff(LocalDate paymentDate, LocalDate tradeDate){
		return(ChronoUnit.DAYS.between(paymentDate, tradeDate));
	}

	@Override
	public float calculateBasis(LocalDate tradeDate) {
		return(tradeDate.lengthOfYear());
	}
	
}