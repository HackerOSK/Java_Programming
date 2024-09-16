package Programs.Questions;


import java.util.*;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String freqString = FreqStr(strs[i]);
            if(map.containsKey(freqString))
            {
                map.get(freqString).add(strs[i]);
            }
            else
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(freqString,list);
            }
        }

        System.out.println(new ArrayList<>(map.values()));
    }

    private static String FreqStr(String str) {
        StringBuilder sb = new StringBuilder("");
        int[] alpha = new int[26];
        for(char c:str.toCharArray())
        {
            alpha[c-'a']++;
        }
        char c ='a';
        for(int a : alpha)
        {
            sb.append(c);
            sb.append(a);
            c++;
        }


        return sb.toString();
    }
}
