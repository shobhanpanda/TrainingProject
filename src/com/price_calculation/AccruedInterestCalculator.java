package com.price_calculation;

public class AccruedInterestCalculator {
	public static double calculate(Trade trade) {
		DateDiffCalculator d;
		switch(trade.bond.getDayCountConvention()) {
			case ACTUAL_BY_ACTUAL	:	d = new ActualByActual();
										break;
			case ACTUAL_BY_365		:	d = new ActualBy365();
										break;
			case ACTUAL_BY_360		:	d = new ActualBy360();
										break;
			case THIRTY_BY_360		:	d = new ThirtyBy360();
										break;	
		}
		
		long days = d.calculateDateDiff(trade.getPaymentDate(), trade.getSettlementDate());
		float basis = d.calculateBasis(trade.getFrequency(), trade.getSettlementDate());
		return((days/basis)*trade.getBond().getCoupon()*trade.getBond().getFaceValue());
	}
}
