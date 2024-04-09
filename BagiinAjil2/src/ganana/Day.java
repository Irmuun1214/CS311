package ganana;

import java.time.DayOfWeek;
import java.util.Hashtable;

public class Day {
	Hashtable<DayOfWeek, Integer>
    day_of_the_week = new Hashtable<DayOfWeek, Integer>();
    public Day() {
		day_of_the_week.put(DayOfWeek.MONDAY, 1);
	    day_of_the_week.put(DayOfWeek.TUESDAY, 2);
	    day_of_the_week.put(DayOfWeek.WEDNESDAY, 3);
	    day_of_the_week.put(DayOfWeek.THURSDAY, 4);
	    day_of_the_week.put(DayOfWeek.FRIDAY, 5);
	    day_of_the_week.put(DayOfWeek.SATURDAY, 6);
	    day_of_the_week.put(DayOfWeek.SUNDAY, 7);
	}
}
