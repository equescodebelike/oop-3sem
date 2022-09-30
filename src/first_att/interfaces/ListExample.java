package first_att.interfaces;

import java.util.*;
import java.util.function.Consumer;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public interface ListExample<T> { // extends Iterator<T>, Comparable<T> { //Comparable or Comparator?
    // base commands
    // singleton one element
    // for all data sources
    // class implementation

    //java.list implementation?

    int size();

    boolean isEmpty();

    // boolean contains(Object o);

    // boolean containsAll(Collection<?> c);

    // boolean hasNext();

    // boolean hasPrevious();

    // T previous();

    // int nextIndex();

    // int previousIndex();

    // ListExample<T> iterator();

    // Object[] toArray();

    T get(int index);

    void add(T e);

    void remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    // String toString();

    // List<T> subList(int fromIndex, int toIndex);

    void sort(Comparator<? super T> c);

    // ListIterator<T> listIterator();

    Object[] toArray();
}
