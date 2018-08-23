package bond;

import java.sql.Timestamp;
import java.util.ArrayList;
import day_count_conventions.DayCountConvention;

public class Bond {
	private String isin;
	private int faceValue;
	private Coupon coupon;
	private Timestamp issue;
	private Timestamp maturity;
	private DayCountConvention dcc;
	private boolean callable, puttable;
	private int teePlus;
	ArrayList<Timestamp> callDates;
	ArrayList<Timestamp> putDates;
	ArrayList<Timestamp> couponDates;
	
	public Bond(String isin, 
			int faceValue, 
			Coupon coupon, 
			Timestamp issue, 
			Timestamp maturity,
			DayCountConvention dcc,  	
			boolean callable,
			boolean puttable,
			int teePlus,
			ArrayList<Timestamp> callDates,
			ArrayList<Timestamp> putDates) {
		this.isin = isin;
		this.faceValue = faceValue;
		this.coupon = coupon;
		this.issue = issue;
		this.maturity = maturity;
		this.dcc = dcc;
		this.callable = callable;
		this.puttable = puttable;
		this.callDates = callDates;
		this.putDates = putDates;
		couponDates = new ArrayList<Timestamp>();
		calculateCouponDates();
	}
	
	private void setCouponDates(long time) {
		int i =1;
		while(issue.getTime() + time*i < maturity.getTime()) {
			couponDates.add(new Timestamp(issue.getTime() + time*i));
			i++;
		}
		System.out.println(couponDates);
	}

	public ArrayList<Timestamp> getCouponDates() {
		return couponDates;
	} 
	
	private void calculateCouponDates() {
		if(coupon.getRate() == 0)
			couponDates = null;
		else {
			long time = (long)365*24*3600*1000;
			if(coupon.getFrequency() == Frequency.YEARLY) {
				setCouponDates(time);
			} else if(coupon.getFrequency() == Frequency.HALF_YEARLY) {
				setCouponDates((long)time/2);
			} else if(coupon.getFrequency() == Frequency.QUARTER_YEARLY) {
				setCouponDates(time/4);	
			}
		}
	}

	public int getTeePlus() {
		return teePlus;
	}

	public void setTeePlus(int teePlus) {
		this.teePlus = teePlus;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}

	public Timestamp getIssue() {
		return issue;
	}

	public void setIssue(Timestamp issue) {
		this.issue = issue;
	}

	public Timestamp getMaturity() {
		return maturity;
	}

	public void setMaturity(Timestamp maturity) {
		this.maturity = maturity;
	}

	public DayCountConvention getDcc() {
		return dcc;
	}

	public void setDcc(DayCountConvention dcc) {
		this.dcc = dcc;
	}

	public boolean isCallable() {
		return callable;
	}

	public void setCallable(boolean callable) {
		this.callable = callable;
	}

	public boolean isPuttable() {
		return puttable;
	}

	public void setPuttable(boolean puttable) {
		this.puttable = puttable;
	}

	public ArrayList<Timestamp> getCallDates() {
		return callDates;
	}

	public void setCallDates(ArrayList<Timestamp> callDates) {
		this.callDates = callDates;
	}

	public ArrayList<Timestamp> getPutDates() {
		return putDates;
	}

	public void setPutDates(ArrayList<Timestamp> putDates) {
		this.putDates = putDates;
	}
	
	
}
