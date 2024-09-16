package Programs.String;

import java.util.ArrayList;
import java.util.Arrays;

public class StringSorting {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>>ans = new ArrayList<>();
        String a[] = {"tan","box","tab","nat","bat"};
        ArrayList<String> mid = new ArrayList<>();
        for(String i : a)
        {
            char ch[] = i.toCharArray();
            Arrays.sort(ch);
            System.out.println(Arrays.toString(ch));
            mid.add(Arrays.toString(ch));
        }

        System.out.println(mid);
        for(int i=0;i<mid.size();i++)
        {
            ArrayList<String>li = new ArrayList<>();
            if(a[i]!="") {
                li.add(a[i]);
                for (int j = i + 1; j < mid.size(); j++) {
                    if (mid.get(i).compareTo(mid.get(j)) == 0) {
                        li.add(a[j]);
                        a[j] = "";
                    }
                }
                ans.add(li);
            }
        }

        System.out.println(ans);
    }
}
