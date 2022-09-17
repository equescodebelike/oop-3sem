package first_att.implementation;

import first_att.interfaces.ListExample;

import java.util.Arrays;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class ReadOnlyList<T> implements ListExample<T> {

    private T e;

    private int size = 0;

    private static final int defaultCapacity = 10;

    private T[] elements = new T[defaultCapacity];

    public ReadOnlyList(T e) {
        elements[size] = new ReadOnlyList<>();
    }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
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
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
}
