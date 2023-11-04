// Jeremi Toroj 4.11.2023

import java.util.HashMap;
import java.util.Map;


public class MyMap <K, V> {
    private final Map<K, V> map = new HashMap<>();

    // associates the specified value with the specified key in this map
    public void put(K key, V value) {
        map.put(key, value);
    }

    // returns the value to which the specified key is mapped, or null if this map contains no mapping for the key
    public V get(K key) {
        return map.get(key);
    }

    // checks if the map contains the key
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }


    // entrySet() returns a Set view of the mappings contained in this map
    // removeIf() removes all of the elements of this collection that satisfy the given predicate
    // -> is a lambda expression
    public void acceptVisitor(Visitor<K, V> visitor) {
        map.entrySet().removeIf(entry -> visitor.shouldRemove(entry.getKey(), entry.getValue()));
    }

    // returns a string representation of the map
    @Override
    public String toString() {
        return map.toString();
    }
}
