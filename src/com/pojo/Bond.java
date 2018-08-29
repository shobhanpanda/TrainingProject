package com.pojo;
import java.time.LocalDate;
import com.trade.*;

//Call setCouponDate


public class Bond {
	String isin;
	double couponRate;
	String issuerName;
	int faceValue;
	int frequency;
	int tPlus;
	LocalDate issueDate;
	LocalDate maturityDate;
	DayCountConvention dayCountConvention;
	float tickSize;
	//	QuoteConv quoteConv;
//	ArrayList<LocalDate> couponPaymentDates;
	LocalDate couponPaymentDate;
	public Bond(String iSIN, double couponRate, String issuerName, int faceValue, int frequency, int tPlus, LocalDate issueDate,
			LocalDate maturityDate, DayCountConvention dayCountConvention, float tickSize) {
		super();
		this.isin = iSIN;
		this.couponRate = couponRate;
		this.issuerName = issuerName;
		this.faceValue = faceValue;
		this.frequency = frequency;
		this.tPlus = tPlus;
		this.issueDate = issueDate;
//		System.out.println("Issue date: "+issueDate);
		this.maturityDate = maturityDate;
		this.dayCountConvention = dayCountConvention;
		this.tickSize = tickSize;
	
	}
	public float getTickSize() {
		return tickSize;
	}
	public void setTickSize(float tickSize) {
		this.tickSize = tickSize;
	}
	public Bond() {
//		issueDate = LocalDate.of(2017, 1, 1);
//		maturityDate = LocalDate.of(2021, 1, 1);
//		frequency = 2;
		
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public double getCouponRate() {
		return couponRate;
	}
	public void setCouponRate(double couponRate) {
		this.couponRate = couponRate;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public int gettPlus() {
		return tPlus;
	}
	public void settPlus(int tPlus) {
		this.tPlus = tPlus;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}
	public DayCountConvention getDayCountConvention() {
		return dayCountConvention;
	}
	public void setDayCountConvention(DayCountConvention dayCountConvention) {
		this.dayCountConvention = dayCountConvention;
	}
	public LocalDate getCouponPaymentDate() {
		return couponPaymentDate;
	}
	public void setCouponPaymentDate() {
		this.couponPaymentDate = findLastCouponDate();
	}
	
	public LocalDate findLastCouponDate() {		
		
		LocalDate iDate=issueDate;
		LocalDate cDate=LocalDate.now();
		LocalDate newDate=iDate;
		LocalDate tempNewDate=newDate;
		
		if(frequency==0)
		{
			return tempNewDate;
		}
		
		int[] thirtyMonths={2,4,6,9,11};
		//int newDate=iDate.getDayOfMonth();
		int newDay=0;
		int newMonth=0;
		int newYear=0;
		
		while(cDate.isAfter(newDate))
		{
			tempNewDate=newDate;
//			System.out.println("temp new date : "+tempNewDate);
			newDay=iDate.getDayOfMonth();
			newMonth = (newDate.getMonthValue()+(12/frequency));
			newYear=newDate.getYear();
			if(newMonth>12)
			{
				newMonth%=12;
				newYear++;
				
			}
			
			for(int i=0;i<thirtyMonths.length;i++) {
				if(newMonth==thirtyMonths[i]) {
					if(newDay==31) {
						newDay=30;
					}	
				}
			}
			
			if(newMonth==2)
			{
				if(newDay>28)
				{
					newDay=28;
				}
				
				if(newDate.isLeapYear()&&newDay>28)
				{
					newDay=29;
				}
			}
			newDate=LocalDate.of(newYear, newMonth, newDay);	
		}	
		return tempNewDate;
	}
}
	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		LocalDate date;
//		String EXTRACT_TRADE_DATE = "SELECT * FROM TEST_DATE";
//		Statement statement = MyConnection.getMyConnection().createStatement();
//		ResultSet resultSet = statement.executeQuery(EXTRACT_TRADE_DATE);
//		while (resultSet.next()) {
//			
//			LocalDate localDate = resultSet.getDate(1).toLocalDate();
//			System.out.println(localDate);
//		}
//		Bond bond = new Bond();
//		System.out.println(bond);
//	}
	
	
	

