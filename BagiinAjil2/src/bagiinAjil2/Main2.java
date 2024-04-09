package bagiinAjil2;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Hashtable;

public class Main2 {
    public static void main(String[] args) {
        int ehleh_on = 1978;
        int duusah_on = 1979;
        int butarhai_honog;
        

        DayOfWeek dayOfWeek;
        Hashtable<DayOfWeek, Integer>
        day_of_the_week = new Hashtable<DayOfWeek, Integer>();
        
        day_of_the_week.put(DayOfWeek.MONDAY, 1);
        day_of_the_week.put(DayOfWeek.TUESDAY, 2);
        day_of_the_week.put(DayOfWeek.WEDNESDAY, 3);
        day_of_the_week.put(DayOfWeek.THURSDAY, 4);
        day_of_the_week.put(DayOfWeek.FRIDAY, 5);
        day_of_the_week.put(DayOfWeek.SATURDAY, 6);
        day_of_the_week.put(DayOfWeek.SUNDAY, 7);


        
        LocalDate[] case1_ehleh_hugatsaa = new LocalDate[16];
        LocalDate[] case1_duusah_hugatsaa = new LocalDate[16];
        long[] case1_dund_sur = new long[12]; 
        long[] case1_ih_sur = new long[4]; 
        int[] buten_doloo_honog = new int[16];
        int[] hicheelleh_honog = new int[16];

        
 
        // Anhnii utguudaa zarlav
        

        // Hicheeliin ehleh duusah udruus jil bur niit heden honog bgag hagassain butensain orson
        for (int i = 0; i < 16; i++) {
            case1_ehleh_hugatsaa[i] = LocalDate.of(ehleh_on, 9, 1);
            case1_duusah_hugatsaa[i] = LocalDate.of(duusah_on, 6, 1);
            ehleh_on++;
            duusah_on++;
        }
        for (int i = 0; i < 12; i++) {
            case1_dund_sur[i] = ChronoUnit.DAYS.between(case1_ehleh_hugatsaa[i], case1_duusah_hugatsaa[i]);
        }
        for (int i = 0; i < 4; i++) {
            case1_ih_sur[i] = ChronoUnit.DAYS.between(case1_ehleh_hugatsaa[i+12], case1_duusah_hugatsaa[i+12]);
        }

        
        
        
        for (int i = 0; i < 12; i++) {
            dayOfWeek = case1_ehleh_hugatsaa[i].getDayOfWeek();

            butarhai_honog = 7-day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)>6){
                butarhai_honog =0;
            }
            dayOfWeek = case1_duusah_hugatsaa[i].getDayOfWeek();
//            System.out.println(dayOfWeek);
            butarhai_honog = butarhai_honog + 6 -day_of_the_week.get(dayOfWeek);

           buten_doloo_honog[i] = (int) (case1_dund_sur[i]-butarhai_honog)/7;
           
           hicheelleh_honog[i]=(buten_doloo_honog[i]*7)-(buten_doloo_honog[i]*1)+butarhai_honog;
           butarhai_honog =0;
 
        }// Dund surguulid niit heden doloo honog bga eseh
        
        
        for (int i = 0; i < 4; i++) {
            dayOfWeek = case1_ehleh_hugatsaa[i+12].getDayOfWeek();

            butarhai_honog = 6-day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)>=6){
                butarhai_honog =0;
            }
            dayOfWeek = case1_duusah_hugatsaa[i+12].getDayOfWeek();
            butarhai_honog = butarhai_honog + 6 -day_of_the_week.get(dayOfWeek);
            if(day_of_the_week.get(dayOfWeek)==7){
                butarhai_honog++;
            }
           buten_doloo_honog[i+12] = (int) (case1_ih_sur[i]-butarhai_honog)/7;

           hicheelleh_honog[i+12]=(buten_doloo_honog[i+12]*7)-(buten_doloo_honog[i+12]*1)+butarhai_honog;

           butarhai_honog =0;
        }// ih surguulid niit heden doloo honog bga eseh
        
        
        
        System.out.println("============================");
        for (int i = 0; i < 16; i++) {
            if(i<12){
            System.out.println("Анги " + (i+1) + " \nДолоо хоног: " +buten_doloo_honog[i]+ " \nСурсан өдөр:"+ hicheelleh_honog[i]);
            }else{
                System.out.println("Курс " + (i-11) + " \nДолоо хоног: " +buten_doloo_honog[i]+ " \nНийт өдөр:"+ hicheelleh_honog[i]);
            }
            System.out.println("============================");
        }// Dund ba IH surguu;iin medeeleliig hevlene
        
        
        
        long niit_honog=0;
        long niit_hugatsaa;
        long sonirholtoi_tsag=0;
        System.out.println("Дунд сургуулийн цаг");
        for(int i = 0; i<3; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
            sonirholtoi_tsag =sonirholtoi_tsag + buten_doloo_honog[i]*180;
            
        }//1-3 angi
        niit_hugatsaa = niit_honog*45*4;
        
        for(int i = 3; i<8; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
            sonirholtoi_tsag =sonirholtoi_tsag + buten_doloo_honog[i]*180;
            
        }//4-8 angi
        niit_hugatsaa = niit_honog*45*34/6;
        
        niit_honog=0;
        for(int i = 8; i<10; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
            sonirholtoi_tsag =sonirholtoi_tsag + buten_doloo_honog[i]*180;
        }//9-10
        niit_hugatsaa = niit_hugatsaa + niit_honog*45*6;
        System.out.println(niit_hugatsaa/60);

        niit_honog=0;
        niit_hugatsaa=0;



        System.out.println("Их сургуулийн цаг");
        for(int i = 10; i<15; i++){
            niit_honog =niit_honog + hicheelleh_honog[i];
        }
        niit_hugatsaa = niit_honog*270;
        System.out.println(niit_hugatsaa/60);
        System.out.println("Сонирхолтой цаг");
        System.out.println(sonirholtoi_tsag/60);
        System.out.println("Нийт хоног: "+niit_honog);
        System.out.println("Эзлэх хувь: "+(double)200/niit_honog);


    }
}
