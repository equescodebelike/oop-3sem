package first_att.implementation.empty;

import first_att.interfaces.SetExample;

/**
 * Created by korobov_a_e on 24.09.2022.
 */
public class EmptySet<T> implements SetExample<T> {

    public EmptySet() {
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
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean add(T e) {
        throw new RuntimeException("You can't add elements in empty set");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("You can't remove elements in empty set");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in empty set");
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
