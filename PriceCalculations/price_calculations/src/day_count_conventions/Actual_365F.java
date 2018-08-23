package day_count_conventions;

import java.io.IOException;
import java.sql.Timestamp;

public class Actual_365F extends ConventionActual {
	public float fractionOfDays() {
		float fraction = 0.0f;
		try {
			fraction = (float)super.numberOfDaysBetween(from, to)/365;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fraction;
	}
	
	public Actual_365F() {
		super();
	}
	
	public Actual_365F(Timestamp from, Timestamp to) {
		super(from, to);
	}
}