package first_att.implementation.readonly;

import first_att.interfaces.SetExample;

import java.util.Set;

/**
 * Created by korobov_a_e on 24.09.2022.
 */
public class ReadOnlySet<T> implements SetExample<T> {

    private final Set<T> original;

    public ReadOnlySet(Set<T> set) {
        original = set;
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
    public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public boolean add(T e) {
        throw new RuntimeException("You can't add elements in readonly set");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("You can't remove elements in readonly set");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in readonly list");
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
