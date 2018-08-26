package day_count_conventions;

import java.io.IOException;
import java.sql.Timestamp;

public class ConventionActual extends DayCountConvention {
	protected int numberOfDays;
	
	public ConventionActual() {
		numberOfDays = 0;
	}
	
	public ConventionActual(Timestamp from, Timestamp to) {
		this.from = from;
		this.to = to;
		
		try {
			numberOfDays = super.numberOfDaysBetween(from, to);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}