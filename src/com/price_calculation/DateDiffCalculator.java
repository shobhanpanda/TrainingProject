package com.price_calculation;

import java.time.LocalDate;
import java.util.Date;

public interface DateDiffCalculator {
	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate);
	public float calculateBasis(LocalDate settlementDate);	
}