import java.util.*;

public class Lab1 {

	 // 1. 
    public static Map<String, Integer> UtgaOnoolt() {
        Map<String, Integer> hashMap = new HashMap<>();
        return hashMap;
    }

    // 2. 
    public static Integer getElementByKey(Map<String, Integer> hashMap, String key) {
        return hashMap.get(key);
    }

    // 3. 
    public static void updateElementByKey(Map<String, Integer> hashMap, String key, int newValue) {
        hashMap.put(key, newValue);
    }

    // 4. 
    public static void removeElementByKey(Map<String, Integer> hashMap, String key) {
        hashMap.remove(key);
    }

    // 5. 
    public static boolean containsKey(Map<String, Integer> hashMap, String key) {
        return hashMap.containsKey(key);
        
    }

    // 6. 
    public static void Hevleh(Map<String, Integer> hashMap) {
        System.out.println("===========\n Утгууд:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n");
    }

    
        
    public static void main(String[] args) {
       
    	// Map1 hashmapiig uusgej utga ugnu
        Map<String, Integer> Map1 = UtgaOnoolt();
        
        Hevleh(Map1);
        //7:18

        // Tugugiin keyg haruulna
        System.out.println("Tugu түлхүүр: " + getElementByKey(Map1, "Tugu"));

        // Irmuunii keyg 1 ees 15 ruu uurchilnu
        updateElementByKey(Map1, "7js", 15);

        // Eku utgatai keyg mapnaas ustgana
        removeElementByKey(Map1, "7js");

        // Eku gesen key bga esehiig shalgana
        System.out.println("EKu утгатай түлхүүр байгаа эсэх: " + containsKey(Map1, "uthg"));

        // Uurchlultuu hevlene
        Hevleh(Map1);

    }
}
