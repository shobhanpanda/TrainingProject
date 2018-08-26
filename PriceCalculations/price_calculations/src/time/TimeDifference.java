package time;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.temporal.ChronoUnit;

public class TimeDifference {
	public static long numberOfDaysBetween(Timestamp firstDate, Timestamp secondDate) throws IOException {
		    return ChronoUnit.DAYS.between(firstDate.toInstant(), secondDate.toInstant());
		}
}

