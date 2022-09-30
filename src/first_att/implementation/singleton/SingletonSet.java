package first_att.implementation.singleton;

import first_att.interfaces.SetExample;

import java.util.Comparator;

/**
 * Created by korobov_a_e on 24.09.2022.
 */
public class SingletonSet<T> implements SetExample<T> {

    private T value;

    public SingletonSet(T value) {
        this.value = value;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return value == o;
    }

    @Override
    public boolean add(T e) {
        throw new RuntimeException("You can't add elements in single set");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("You can't remove elements in single set");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in single set");
    }

    @Override
    public Object[] toArray() {
        return new Object[]{this.value};
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new RuntimeException("You can't sort elements in single set");
    }
}
