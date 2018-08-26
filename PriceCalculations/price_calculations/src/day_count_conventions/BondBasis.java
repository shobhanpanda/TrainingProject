package day_count_conventions;

import java.sql.Timestamp;
import java.util.Date;

public class BondBasis extends Convention360{

	public int numberOfDaysBetween(Timestamp from, Timestamp to) {
		if(from.getDay() == 31)
			from.setDate(30);
		if(from.getDay() == 30 && to.getDay() == 31)
			to.setDate(30);
		return dateDifferenceIn360();
	}
}