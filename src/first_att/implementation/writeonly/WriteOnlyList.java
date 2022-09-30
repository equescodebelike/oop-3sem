package first_att.implementation.writeonly;

import first_att.interfaces.ListExample;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class WriteOnlyList<T> implements ListExample<T> {

    private final List<T> original;

    public WriteOnlyList(List<T> list) {
        original = list;
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
    public T get(int index) {
        throw new RuntimeException("You can't get elements in write list");
    }

    @Override
    public void add(T e) {
        original.add(e);
    }

    @Override
    public void remove(int index) {
        original.remove(index);
    }

    @Override
    public int indexOf(Object o) { // allowed in writeonly?
        return original.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        original.sort(c);
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

}
