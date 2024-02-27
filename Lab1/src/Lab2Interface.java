import java.util.Map;

public interface Lab2Interface<K, V> {
    Map<K, V> Uusgeh();

    V getElementByKey(Map<K, V> hashMap, K key);

    void updateElementByKey(Map<K, V> hashMap, K key, V newValue);

    void removeElementByKey(Map<K, V> hashMap, K key);

    boolean containsKey(Map<K, V> hashMap, K key);

    void Hevleh(Map<K, V> hashMap);
}
