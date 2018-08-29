package com.pojo;
import java.time.LocalDate;

enum TradeType{
	BUY,SELL;
}

public class Trade {
	

Bond bond;
	LocalDate tradeDate;
	LocalDate settlementDate;
	TradeType tradeType;
	double cleanPrice;
	double dirtyPrice;
	double yield;
	double accruedInterest;
	String counterParty;

	public Trade() {
		// TODO Auto-generated constructor stub
	}
	
	public Trade(Bond bond, LocalDate tradeDate, TradeType tradeType, double dirtyPrice,
			double yield, String counterParty) {
		super();
		this.bond = bond;
		this.tradeDate = tradeDate;
		this.settlementDate = tradeDate.plusDays(this.bond.gettPlus());
		this.tradeType = tradeType;
		this.dirtyPrice = dirtyPrice;
		this.yield = yield;
		this.counterParty = counterParty;
	
	}
	public Bond getBond() {
		return bond;
	}
	public void setBond(Bond bond) {
		this.bond = bond;
	}
	public LocalDate getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(LocalDate tradeDate) {
		this.tradeDate = tradeDate;
	}
	public LocalDate getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = tradeDate.plusDays(bond.gettPlus());
	}
	public TradeType getTradeType() {
		return tradeType;
	}
	public void setTradeType(TradeType tradeType) {
		this.tradeType = tradeType;
	}
	public double getCleanPrice() {
		return cleanPrice;
	}
	public void setCleanPrice(double cleanPrice) {
		this.cleanPrice = cleanPrice;
	}
	public double getDirtyPrice() {
		return dirtyPrice;
	}
	public void setDirtyPrice(double dirtyPrice) {
		this.dirtyPrice = dirtyPrice;
	}
	public double getYield() {
		return yield;
	}
	public void setYield(double yield) {
		this.yield = yield;
	}
	public double getAccruedInterest() {
		return accruedInterest;
	}
	public void setAccruedInterest(double accruedInterest) {
		this.accruedInterest = accruedInterest;
	}
	public String getCounterParty() {
		return counterParty;
	}
	public void setCounterParty(String counterParty) {
		this.counterParty = counterParty;
	}
	
	
	
	
}
