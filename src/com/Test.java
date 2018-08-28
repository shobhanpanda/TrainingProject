package com.pojo;
import java.time.LocalDate;
public class Test {

	public static void main(String[] args) {
		Bond bond = new Bond("1", 2.3, "xyz", 100, 4, 12, 2, 
				LocalDate.of(2012, 5, 1), 
				LocalDate.of(2019, 5, 1), 
				DayCountConv.ActualBy360);
		Trade trade = new Trade(bond, LocalDate.now(), TradeType.BUY, 1, 1, "abc");
		bond.setCouponPaymentDate();
		System.out.println(bond.getCouponPaymentDate());
		trade.setSettlementDate();
		System.out.println(trade.getSettlementDate());
	}

}
