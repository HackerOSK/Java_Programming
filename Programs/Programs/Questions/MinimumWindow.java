package Programs.Questions;

import java.util.Collections;
import java.util.Hashtable;

public class MinimumWindow {
    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String str1 = "ABC";
        Hashtable<Character,Integer> hashtable = new Hashtable<>();
        for(int i=0;i<str.length();i++)
        {
            if(str1.indexOf(str.charAt(i))!=-1)
            {
                hashtable.put(str.charAt(i),i);
            }
        }

        System.out.println(hashtable);
//        int ans = Collections.max(hashtable)-Collections.min(hashtable);
    }
}
