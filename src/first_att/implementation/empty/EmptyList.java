package first_att.implementation.empty;

import first_att.interfaces.ListExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class EmptyList<T> implements ListExample<T> {

    // private final List<T> original;

    public EmptyList() {
        List<T> list = new ArrayList<>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
        return null;
    }

    @Override
    public void add(T e) {
        try {
            throw new Exception("You can't add elements in empty list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

}
