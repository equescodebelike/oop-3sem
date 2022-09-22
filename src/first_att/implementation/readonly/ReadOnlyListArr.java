package first_att.implementation.readonly;

import first_att.interfaces.ListExample;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class ReadOnlyListArr<T> implements ListExample<T> {

    private int size = 0;

    // private static final int defaultCapacity = 10;

    private Object[] elements;

    public ReadOnlyListArr(Object[] c) {
        elements = new Object[c.length];
        for (int i = 0; i < c.length; i++) {
            elements[i] = c[i];
            size++;
        }
    }

   /* private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    } */

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size != 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public T next() {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (T) elements[index];
    }

    @Override
    public void add(T e) {
        try {
            throw new Exception("You can't add elements in readonly list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void remove(int index) {
        try {
            throw new Exception("You can't remove elements in readonly list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
