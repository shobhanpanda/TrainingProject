package price_calculation;

import java.sql.Timestamp;
import java.util.ArrayList;


import bond.Bond;
import bond.Coupon;
import bond.Frequency;
import bond_trade.BondTrade;
import bond_trade.Trade;
import day_count_conventions.Actual_365F;
import day_count_conventions.DayCountConvention;

public class Test {
	public static void main(String[] args) { 
		String isin = "US8HJDI28483"; 
		int faceValue = 1000;
		Coupon coupon = new Coupon(0.09f, Frequency.HALF_YEARLY);
		Timestamp issue = java.sql.Timestamp.valueOf("2018-07-25 10:10:10.0");
		Timestamp maturity = java.sql.Timestamp.valueOf("2028-07-25 10:10:10.0");
		DayCountConvention dcc = new Actual_365F();  	
		boolean callable = false;
		boolean puttable = false;
		int teePlus = 2;
		ArrayList<Timestamp> callDates = null;
		ArrayList<Timestamp> putDates = null;
		Bond b = new Bond(isin, faceValue, coupon, issue, maturity, dcc, callable, puttable, 2, null, null); 

		Timestamp tradeDate = java.sql.Timestamp.valueOf("2018-07-25 10:10:10.0");
		Timestamp settlementDate = java.sql.Timestamp.valueOf("2018-07-27 10:10:10.0");;
		Trade trade = Trade.BUY;
		
		BondTrade bt = new BondTrade(b, tradeDate, settlementDate, trade, "JP Morgan", 0.12f, 0);
		(new PriceCalculation()).price(bt);
	}
}

