package Programs.Questions;

import java.lang.reflect.Array;
import java.util.*;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tttrre";
        HashMap<Character,Integer>freq=new HashMap<>();

        for(char ch : s.toCharArray())
        {
            if(freq.containsKey(ch))
            {
                freq.put(ch,freq.get(ch)+1);
            }
            else
            {
                freq.put(ch,1);
            }
        }
        List<Character> list = new ArrayList<>(freq.keySet());
//        It is use to sort the keys according to values
        Collections.sort(list,(a,b)->freq.get(b)-freq.get(a));
        System.out.println(list);
        StringBuilder sb = new StringBuilder("");

        for(char c : list)
        {
            for(int i = 0;i<freq.get(c);i++)
            {
                sb.append(c);
            }
        }

        System.out.println(sb);



    }
}
