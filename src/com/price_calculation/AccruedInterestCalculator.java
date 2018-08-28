package com.price_calculation;

public class AccruedInterestCalculator {
	public static double calculate(Trade trade) {
		DateDiffCalculator d;
		switch(trade.bond.getDayCountConvention()) {
			case DayCountConvention.ACTUAL_BY_ACTUAL	:	d = new ActualByActual();
										break;
			case DayCountConvention.ACTUAL_BY_365		:	d = new ActualBy365();
										break;
			case DayCountConvention.ACTUAL_BY_360		:	d = new ActualBy360();
										break;
			case DayCountConvention.THIRTY_BY_360		:	d = new ThirtyBy360();
										break;	
		}
		
		long days = d.calculateDateDiff(trade.getPaymentDate(), trade.getSettlementDate());
		float basis = d.calculateBasis(trade.getFrequency(), trade.getSettlementDate());
		if(trade.getBond().geCoupon() != 0) {
			return((days/basis)*trade.getBond().getCoupon()*trade.getBond().getFaceValue()/trade.getBond().getFrequency());
		} else {
			return((days/basis)*trade.getBond().getDiscountedPrice());
		}
	}
}
