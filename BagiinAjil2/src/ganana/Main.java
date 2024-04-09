package ganana;
// 2024-04-08 10:31
// gnangnan
public class Main {
    public static void main(String[] args) {
        Data case1 = new Data();
        case1.set_ajiliin_honog(6);
        case1.set_angilal_too(4);
        case1.set_angilal_data();
        case1.set_dund_sur_ehleh_on(1978);
        
        Data case2 = new Data();
        case2.set_ajiliin_honog(5);
        case2.set_angilal_too(3);
        case2.set_angilal_data();
        case2.set_dund_sur_ehleh_on(2006);


        float dund_sur_sonirholtoi_hugatsaa = case1.get_dund_sur_sonirholtoi_hugatsaa();
        float dund_sur_suraltsah_tsag = case1.get_dund_sur_suraltsah_tsag();

        
        System.out.println("===================================================================================");
        System.out.println("Дунд сургуулийн нийт бүтэн 7 хоног: " + case1.get_dund_sur_buten_doloo_honog());
        System.out.println("Дунд сургуулийн нийт хичээллэсэн хоног: " + case1.get_dund_sur_hicheellesen_honog());
        System.out.println("Дунд сургуулийн сонирхолтой хичээлд зарцуулсан хугацаа: " + dund_sur_sonirholtoi_hugatsaa+" tsag");
        System.out.println("Дунд сургуулийн хичээлд зарцуулсан хугацаа: " + dund_sur_suraltsah_tsag+" tsag");
        
        System.out.println("Их сургуулийн нийт бүтэн 7 хоног: " + case1.ih_sur_buten_doloo_honog());
        System.out.println("Их сургуулийн нийт хичээллэсэн хоног: " + case1.ih_sur_hicheellesen_honog());
        System.out.println("Их сургуулийн хичээлд зарцуулсан хугацаа: " + case1.ih_sur_suraltsah_tsag()+" tsag");
        System.out.println("Их сургуулийн дадлагын эзлэх хувь: " + case1.ih_dadlagiin_ezleh_huvi()+" %");
        
        System.out.println("===================================================================================");
        System.out.println("Дунд сургуулийн нийт бүтэн 7 хоног: " + case2.get_dund_sur_buten_doloo_honog());
        System.out.println("Дунд сургуулийн нийт хичээллэсэн хоног: " + case2.get_dund_sur_hicheellesen_honog());
        System.out.println("Дунд сургуулийн сонирхолтой хичээлд зарцуулсан хугацаа: " + case2.get_dund_sur_sonirholtoi_hugatsaa()+" tsag");
        System.out.println("Дунд сургуулийн хичээлд зарцуулсан хугацаа: " + case2.get_dund_sur_suraltsah_tsag()+" tsag");
        
        System.out.println("Их сургуулийн нийт бүтэн 7 хоног: " + case2.ih_sur_buten_doloo_honog());
        System.out.println("Их сургуулийн нийт хичээллэсэн хоног: " + case2.ih_sur_hicheellesen_honog());
        System.out.println("Их сургуулийн хичээлд зарцуулсан хугацаа: " + case2.ih_sur_suraltsah_tsag()+" tsag");
        System.out.println("Их сургуулийн дадлагын эзлэх хувь: " + case2.ih_dadlagiin_ezleh_huvi()+" %");
        System.out.println("===================================================================================");
        float s=0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Дунд сургуулийн " + i + " ангийн бүтэн 7 хоног: " + case1.get_jiliin_7_honog(i));
            s=s+case1.get_jiliin_7_honog(i);
        }
        System.out.println("7 хоногийн нийлбэрэээ,"+s);
        
    }
}