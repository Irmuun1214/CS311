import java.util.*;

public class Lab2 {

    public static <K, V> Map<K, V> UtgaOnoolt() {
        Map<K, V> hashMap = new HashMap<>();
//        hashMap.put((K) "7js", (V) Integer.valueOf(17));
//        hashMap.put((K) "uthg", (V) Integer.valueOf(22));
//        hashMap.put((K) "dfss", (V) Integer.valueOf(33));
        return hashMap;
    }

    public static <K, V> V getElementByKey(Map<K, V> hashMap, K key) {
        return hashMap.get(key);
    }

    public static <K, V> void updateElementByKey(Map<K, V> hashMap, K key, V newValue) {
        hashMap.put(key, newValue);
    }

    public static <K, V> void removeElementByKey(Map<K, V> hashMap, K key) {
        hashMap.remove(key);
    }

    public static <K, V> boolean containsKey(Map<K, V> hashMap, K key) {
        return hashMap.containsKey(key);
    }

    public static <K, V> void Hevleh(Map<K, V> hashMap) {
        System.out.println("===========\n Утгууд:");
        for (Map.Entry<K, V> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Map hashmapiig uusgej utga ugnu
        Map<String, Integer> map = UtgaOnoolt();

        int choice;
        do {
            System.out.println("1. Мап-д нэмэх.");
            System.out.println("2. Mапаас key-ээр утгыг хайх.");
            System.out.println("3. Утгыг key-ээр шинэчлэх.");
            System.out.println("4. Утгыг key-ээр устгах.");
            System.out.println("5. Key утгатай эсэх.");
            System.out.println("6. Mапыг хэвлэх");
            System.out.println("0. Гарах\n");
            System.out.println("Сонголтоо оруулна уу:");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Мап-д нэмэх:");
//                  hashMap.put((K) "7js", (V) Integer.valueOf(17));
                    System.out.print("key: ");
                    String key = scanner.nextLine();
                    System.out.print("Утга: ");
                    int value = scanner.nextInt();
                    map.put(key, value);
                    break;
                case 2:
                    System.out.print("Хайх key: ");
                    String searchKey = scanner.nextLine();
                    Integer foundValue = getElementByKey(map, searchKey);
                    System.out.println(searchKey + "key утга: " + foundValue);
                    break;
                case 3:
                    System.out.print("Шинэчлэх Key: ");
                    String updateKey = scanner.nextLine();
                    System.out.print("Утга: ");
                    int updateValue = scanner.nextInt();
                    updateElementByKey(map, updateKey, updateValue);
                    break;
                case 4:
                    System.out.print("Устгах key: ");
                    String removeKey = scanner.nextLine();
                    removeElementByKey(map, removeKey);
                    break;
                case 5:
                    System.out.print("Шалгах Key оруулна уу: ");
                    String checkKey = scanner.nextLine();
                    boolean contains = containsKey(map, checkKey);
                    System.out.println("key нь утгатай эсэх: " + contains);
                    break;
                case 6:
                    System.out.println("Мап нь:");
                    Hevleh(map);
                    break;
                case 0:
                    System.out.println("Гарав.");
                    break;
                default:
                    System.out.println("Буруу тоо сонгосон байна.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
