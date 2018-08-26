package day_count_conventions;

import java.util.Date;
import java.sql.Timestamp;

public class Convention360 extends DayCountConvention{
	protected int dateDifferenceIn360() {
		return (to.getDay() - from.getDay() +
				30*(to.getMonth() - from.getMonth()) + 
				360*(to.getYear() - from.getYear()));
	}
	
	protected float fractionOfDays() {
		return (float)dateDifferenceIn360()/360;
	}
}
