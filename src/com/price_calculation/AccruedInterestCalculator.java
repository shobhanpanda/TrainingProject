package com.price_calculation;

import com.pojo.Trade;
import com.trade.DayCountConvention;

public class AccruedInterestCalculator {
	public static double calculate(Trade trade) {
		DateDiffCalculator d = null;
		switch(trade.getBond().getDayCountConvention()) {
			case ActualByActual     :	d = new ActualByActual();
										break;
			case ActualBy365		:	d = new ActualBy365();
										break;
			case ActualBy360		:	d = new ActualBy360();
										break;
			case ThirtyBy360		:	d = new ThirtyBy360();
										break;	
		}
		
		long days = d.calculateDateDiff(trade.getSettlementDate(), trade.getSettlementDate(), false);
		float basis = d.calculateBasis(trade.getSettlementDate());
		if(trade.getBond().getCouponRate() != 0) {
			return((days/basis)*trade.getBond().getCouponRate()*trade.getBond().getFaceValue()/trade.getBond().getFrequency());
		} else {
			return((days/basis)*trade.getBond().getCouponRate());
		}
	}
}
