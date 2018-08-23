package price_calculation;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

import bond.Frequency;
import bond_trade.BondTrade;
import time.TimeDifference;

public class PriceCalculation {
	private float price;
	
	public void price(BondTrade bondTrade) {
		if(bondTrade.getBond().getCoupon().getRate() == 0) {
			price = (float)bondTrade.getBond().getFaceValue()/(bondTrade.getYield());
		} else {
			Timestamp date2;
			int paymentDaysLeft = 0;
			date2 = bondTrade.getSettlementDate();
			
			ArrayList<Timestamp> ts = bondTrade.getBond().getCouponDates();
			Iterator<Timestamp> it = ts.iterator();
			while(it.hasNext()){
				Timestamp t = it.next();
				System.out.println(t);
				if(date2.before(t))
					paymentDaysLeft = bondTrade.getBond().getCouponDates().size() - bondTrade.getBond().getCouponDates().indexOf(t);
					break;
			}
			System.out.println(paymentDaysLeft);
			System.out.println(finalPriceCalculation(bondTrade, paymentDaysLeft));
		}
		
	}
	
	public float finalPriceCalculation(BondTrade bondTrade, int paymentDaysLeft) {
		float coupon = bondTrade.getBond().getCoupon().getRate();
		float yield = bondTrade.getYield();
		int faceValue = bondTrade.getBond().getFaceValue();
		Frequency frequency = bondTrade.getBond().getCoupon().getFrequency();
		switch(frequency) {
			case HALF_YEARLY:	coupon /= 2;
								yield /= 2;
								break;
			case QUARTER_YEARLY:coupon /= 4;
								yield /= 4;
								break;
			default:			break;
		}
		System.out.println(coupon*faceValue + " " + yield + " " + paymentDaysLeft);
		
		float decimal = (float) Math.pow(1+yield, paymentDaysLeft);
		float term1 = coupon*faceValue*(1/yield - 1/(decimal*yield));
		float term2 = faceValue/decimal;
		return term1+term2;
	}
}

