package first_att.interfaces;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public interface SetExample<T> extends Iterator<T> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(T e);

    boolean remove(Object o);

    void clear();

}
