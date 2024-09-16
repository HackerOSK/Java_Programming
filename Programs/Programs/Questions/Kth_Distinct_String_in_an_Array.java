package Programs.Questions;

import java.util.HashMap;
import java.util.Hashtable;

public class Kth_Distinct_String_in_an_Array {
    public static void main(String[] args) {
        String arr[] = {"b","a","c","a"};

        int k = 2;
        Hashtable<String,Integer> map = new Hashtable<>();
        for(String n : arr)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        String ans="";
        for(String n : arr)
        {
            if(map.get(n)==1)
            {
                k--;
            }if(k==0)
        {
            ans = new String(n);
            break;
        }
        }

        System.out.println(ans);
        System.out.println(map);

    }
}
