package bagiinAjil2;

import java.time.DayOfWeek;
import java.util.Hashtable;

public class Values {
	static final int EHLEH_ON = 2006;
    static final int DUUSAH_ON = 2007;
    static final int[] BUTEN_DOLOO_HONOG = new int[16];
    static final int[] HICHEELLEH_HONOG = new int[16];
    static final Hashtable<DayOfWeek, Integer> DAY_OF_THE_WEEK = new Hashtable<>();

    static {
        DAY_OF_THE_WEEK.put(DayOfWeek.MONDAY, 1);
        DAY_OF_THE_WEEK.put(DayOfWeek.TUESDAY, 2);
        DAY_OF_THE_WEEK.put(DayOfWeek.WEDNESDAY, 3);
        DAY_OF_THE_WEEK.put(DayOfWeek.THURSDAY, 4);
        DAY_OF_THE_WEEK.put(DayOfWeek.FRIDAY, 5);
        DAY_OF_THE_WEEK.put(DayOfWeek.SATURDAY, 6);
        DAY_OF_THE_WEEK.put(DayOfWeek.SUNDAY, 7);
    }
}
