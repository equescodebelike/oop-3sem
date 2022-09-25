package first_att.implementation.empty;

import first_att.interfaces.ListExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class EmptyList<T> implements ListExample<T> {

    public EmptyList() {
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
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
        throw new RuntimeException("You can't add elements in empty list");
    }

    @Override
    public void remove(int index) {
        throw new RuntimeException("You can't remove elements in empty list");
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
