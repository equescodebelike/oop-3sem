package first_att.implementation.singleton;

import first_att.interfaces.ListExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class SingletonList<T> implements ListExample<T> {

    private final List<T> original;

    public SingletonList(T o) {
        original = new ArrayList<>();
        original.add(o);
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
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public T get(int index) {
        return original.get(index);
    }

    @Override
    public void add(T e) {
        try {
            throw new Exception("You can't add elements in single list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remove(int index) {
        try {
            throw new Exception("You can't remove elements in single list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
