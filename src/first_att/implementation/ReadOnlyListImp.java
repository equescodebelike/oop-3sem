package first_att.implementation;

import first_att.interfaces.ListExample;

import java.util.List;

public class ReadOnlyListImp<T> implements ListExample<T> {

    private final List<T> original;

    public ReadOnlyListImp(List<T> list) {
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
    public void remove(int index) {
        try {
            throw new Exception("You can't remove elements in readonly list");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void add(Object e) {
        try {
            throw new Exception("You can't add elements in readonly list");
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
