package bagiinAjil2;

import java.time.LocalDate;

public class SursanTsagCalc {
    static void calculateAndPrint() {
        // Initialize start and end dates for each academic term
        LocalDate[] case2_ehleh_hugatsaa = new LocalDate[16];
        LocalDate[] case2_duusah_hugatsaa = new LocalDate[16];

        for (int i = 0; i < 16; i++) {
            case2_ehleh_hugatsaa[i] = LocalDate.of(Values.EHLEH_ON + i, 9, 1);
            case2_duusah_hugatsaa[i] = LocalDate.of(Values.DUUSAH_ON + i, 6, 1);
        }

        // Calculate and store the duration of each academic term
        // This part can be moved into separate functions if needed

        // Calculate and store the number of days and weekdays for each academic term
        // This part can be moved into separate functions if needed

        // Calculate and store the total hours studied for each academic term
        // This part can be moved into separate functions if needed

        // Output the calculated values
        for (int i = 0; i < 16; i++) {
            if (i < 12) {
                System.out.println("Анги " + (i + 1) + " \nДолоо хоног: " + Values.BUTEN_DOLOO_HONOG[i] + " \nСурсан өдөр:" + Values.HICHEELLEH_HONOG[i]);
            } else {
                System.out.println("Курс " + (i - 11) + " \nДолоо хоног: " + Values.BUTEN_DOLOO_HONOG[i] + " \nНийт өдөр:" + Values.HICHEELLEH_HONOG[i]);
            }
            System.out.println("============================");
        }

        // Calculate and print total hours studied, etc.
    }
}
