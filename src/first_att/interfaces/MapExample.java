package first_att.interfaces;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public interface MapExample<K, V> extends Iterator<K> { // generics?

    int size();

    boolean isEmpty();

    boolean containsKey(Object key);

    boolean containsValue(Object value);

    V get(Object key);

    V put(K key, V value);

    V remove(Object key);

    void clear();

    interface Entry<K, V> {
        K getKey();

        V getValue();

        V setValue(V value);

        boolean equals(Object o);
    }

}
