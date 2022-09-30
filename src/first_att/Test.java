package first_att;

import first_att.implementation.empty.EmptyList;
import first_att.implementation.writeonly.WriteOnlyList;
import first_att.implementation.writeonly.WriteOnlyMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        //List examples
        /*  String[] s1 = new String[]{"s", "sdf"};
        ReadOnlyListArr<String[]> list = new ReadOnlyListArr<>(s1);
        System.out.println(list.size());
        System.out.println(list.get(1));
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        ReadOnlyListImp<Integer> list3 = new ReadOnlyListImp<>(list2);
        Collections.sort(list3);
        System.out.println(list3.size()); */
        //Set examples
        // EmptyList<String> list = new EmptyList<>();
        Map<Integer, Integer> ma = new HashMap<>();
        ma.put(1, 3);
        ma.put(0, 2);
        ma.put(100, 100);
        ma.put(34, 34);
        WriteOnlyMap<Integer, Integer> map = new WriteOnlyMap<>(ma);
        map.sort();
    }
}
