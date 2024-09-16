package Programs;

import java.util.*;

public class HashMapPrac {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.compute(arr[i], (key, value) -> (value == null) ? 1 : value + 1);
        }
        System.out.println(map);
        Set<Integer> values = new HashSet<>();
        for(int key : map.keySet())
        {
            values.add(map.get(key));
        }
        System.out.println(values);

        if(values.size()!=map.size())
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }


    }
}
