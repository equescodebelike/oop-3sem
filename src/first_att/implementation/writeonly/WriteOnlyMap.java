package first_att.implementation.writeonly;

import first_att.interfaces.MapExample;

import java.util.Map;

public class WriteOnlyMap<K, V> implements MapExample<K, V> {

    private final Map<K, V> original;

    public WriteOnlyMap(Map<K, V> map) {
        original = map;
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.size() != 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return original.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return original.containsValue(value);
    }

    @Override
    public V get(Object key) {
        throw new RuntimeException("You can't read elements in readonly map");
    }

    @Override
    public void put(K key, V value) {
        original.put(key, value);
    }

    @Override
    public void remove(Object key) {
        original.remove(key);
    }

    @Override
    public void clear() {
        original.clear();
    }
}
