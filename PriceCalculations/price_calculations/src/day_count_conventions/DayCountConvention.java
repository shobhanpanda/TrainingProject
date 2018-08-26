package day_count_conventions;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DayCountConvention {
	protected Timestamp from, to;
	
	protected int numberOfDaysBetween(Timestamp firstDate, Timestamp secondDate) throws IOException {
	    return Integer.parseInt(Long.toString(ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant())));
	}
}
