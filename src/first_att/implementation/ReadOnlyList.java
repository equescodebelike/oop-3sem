package first_att.implementation;

import first_att.interfaces.ListExample;

/**
 * Created by korobov_a_e on 10.09.2022.
 */
public class ReadOnlyList<T> implements ListExample<T> {


    @Override
    public T get(int index) {
        return null;
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
