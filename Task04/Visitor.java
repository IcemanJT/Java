// Jeremi Toroj 4.11.2023

public interface Visitor<K, V> {
    boolean shouldRemove(K key, V value);
}

