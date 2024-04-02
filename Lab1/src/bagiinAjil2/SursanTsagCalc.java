package bagiinAjil2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SursanTsagCalc {

    // Constants for session durations
    private static final int BagaSurguuli_1Tsag_Case1 = 45; // minutes
    private static final int DundSurguuli_1Tsag_Case1 = 45; // minutes
    private static final int Dund2Surguuli_1Tsag_Case1 = 45; // minutes
    
    private static final int DundSurguuli_1Tsag_Case2 = 30; // minutes
    private static final int Dund2Surguuli_1Tsag_Case2 = 35; // minutes
    
    private static final int DeedSurguuli_1Tsag = 90; // minutes

    // Constants for school system durations
    private static final int[] SurguuliinHicheelOrohTsag_Case1 = {3, 5, 2, 5}; // Junior High, Middle School, High School, University
    private static final int[] SurguuliinHicheelOrohTsag_Case2 = {0, 5, 7, 4}; // Junior High, Middle School, High School, University

    // Constants for days and sessions per week
    private static final int DoloonHonogtAjillahTsag_Case1 = 6;
    private static final int DoloonHonogtAjillahTsag_Case2 = 5;

    private static final int BagaSurguuliOrohTsag_Case1 = 4;
    private static final int DundSurguuliOrohTsagWeekly_Case1 = 4;
    private static final int Dund2SurguuliOrohTsag_Case1 = 6;

    private static final int DundSurguuliOrohTsag_Case2 = 4;
    private static final int Dund2SurguuliOrohTsag_Case2 = 6;

    private static final int DeedSurguuliOrohTsag = 3;

    public static void main(String[] args) {
        // Dates for the two scenarios
        LocalDate startDate_Case1 = LocalDate.of(1978, 9, 1);
        LocalDate endDate_Case1 = LocalDate.of(1993, 9, 1);
        LocalDate startDate_Case2 = LocalDate.of(2006, 9, 1);
        LocalDate endDate_Case2 = LocalDate.of(2022, 9, 1);
        
        // Calculate hours for each school in Case 1
        int totalHoursCase1 = 0;
        for (int i = 0; i < SurguuliinHicheelOrohTsag_Case1.length; i++) {
            int totalDays = (int) ChronoUnit.DAYS.between(startDate_Case1, endDate_Case1);
            int totalWeeks = totalDays / DoloonHonogtAjillahTsag_Case1;
            int sessionsPerWeek = 0;
            switch (i) {
                case 0:
                    sessionsPerWeek = BagaSurguuliOrohTsag_Case1;
                    break;
                case 1:
                    sessionsPerWeek = DundSurguuliOrohTsagWeekly_Case1;
                    break;
                case 2:
                    sessionsPerWeek = Dund2SurguuliOrohTsag_Case1;
                    break;
                case 3:
                    sessionsPerWeek = DeedSurguuliOrohTsag;
                    break;
            }
            totalHoursCase1 += totalWeeks * sessionsPerWeek * SurguuliinHicheelOrohTsag_Case1[i] * 45 / 60;
        }
        System.out.println("Total hours studied in Case 1: " + totalHoursCase1);

        // Calculate hours for each school in Case 2
        int totalHoursCase2 = 0;
        for (int i = 0; i < SurguuliinHicheelOrohTsag_Case2.length; i++) {
            int totalDays = (int) ChronoUnit.DAYS.between(startDate_Case2, endDate_Case2);
            int totalWeeks = totalDays / DoloonHonogtAjillahTsag_Case2;
            int sessionsPerWeek = 0;
            switch (i) {
                case 1:
                    sessionsPerWeek = DundSurguuliOrohTsag_Case2;
                    break;
                case 2:
                    sessionsPerWeek = Dund2SurguuliOrohTsag_Case2;
                    break;
                case 3:
                    sessionsPerWeek = DeedSurguuliOrohTsag;
                    break;
            }
            totalHoursCase2 += totalWeeks * sessionsPerWeek * SurguuliinHicheelOrohTsag_Case2[i] * 45 / 60;
        }
        System.out.println("Total hours studied in Case 2: " + totalHoursCase2);
    }
}
