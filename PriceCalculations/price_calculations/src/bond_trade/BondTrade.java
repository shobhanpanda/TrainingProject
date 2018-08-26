package bond_trade;

import java.sql.Timestamp;

import bond.Bond;

public class BondTrade {
	private Bond bond;
	private Timestamp tradeDate;
	private Timestamp settlementDate;
	private Trade trade;
	public Bond getBond() {
		return bond;
	}

	public void setBond(Bond bond) {
		this.bond = bond;
	}

	public Timestamp getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Timestamp tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Timestamp getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(Timestamp settlementDate) {
		this.settlementDate = settlementDate;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(Trade trade) {
		this.trade = trade;
	}

	public String getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}

	public float getYield() {
		return yield;
	}

	public void setYield(int yield) {
		this.yield = yield;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	private String counterparty;
	private float yield;
	private float price;
	
	public BondTrade(Bond bond, Timestamp tradeDate, Timestamp settlementDate, Trade trade, String counterparty,
			float yield, float price) {
		super();
		this.bond = bond;
		this.tradeDate = tradeDate;
		this.settlementDate = new Timestamp(24*3600*1000*bond.getTeePlus() + settlementDate.getTime());
		this.trade = trade;
		this.counterparty = counterparty;
		this.yield = yield;
		this.price = price;
	}
}
