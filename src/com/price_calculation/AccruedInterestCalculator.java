package com.price_calculation;

import com.pojo.Trade;
import com.trade.DayCountConvention;

public class AccruedInterestCalculator {
	public static double calculate(Trade trade) {
		DateDiffCalculator d = null;
		DayCountConvention dc = DayCountConvention.ActualBy360;
		switch(dc) {
			case ActualByActual     :	d = new ActualByActual();
										break;
			case ActualBy365		:	d = new ActualBy365();
										break;
			case ActualBy360		:	d = new ActualBy360();
										break;
			case ThirtyBy360		:	d = new ThirtyBy360();
										break;	
		}
		
		long days = d.calculateDateDiff(trade.getBond().findLastCouponDate(), trade.getSettlementDate(), false);
		float basis = d.calculateBasis(trade.getSettlementDate());
		if(trade.getBond().getCouponRate() != 0) {
			return((days/basis)*trade.getBond().getCouponRate()*trade.getBond().getFaceValue());
		} else {
			return(((basis-days)/basis)*trade.getBond().getCouponRate());
		}
	}
}
