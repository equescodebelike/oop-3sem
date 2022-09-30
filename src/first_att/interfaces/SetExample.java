package first_att.interfaces;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public interface SetExample<T> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(T e);

    boolean remove(Object o);

    void clear();

    Object[] toArray();

    boolean equals(Object o);

    void sort(Comparator<? super T> c);

}
